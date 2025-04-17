 /*
 * Keyword: generateWordReportsPerTestCase
 *
 * Purpose:
 * This keyword class is responsible for dynamically retrieving all screenshots taken during
 * a test case execution and compiling them into a structured Word document.
 *
 * What the Word Document Report Contains:
 * 1. Test case name as the report title
 * 2. All screenshots related to the executed test case
 * 3. Descriptions for each screenshot, retrieved from test data (Data Files/ScreenshotDescriptions)
 *
 * Screenshot Source:
 * - Screenshots are pulled from the original 'keyes' folder located in the following path:
 *   Reports > [outer timestamp] > [test suite name] > [inner timestamp] > keyes
 * - Each screenshot file must follow the naming convention: keyes-<testCaseName>_<screenshotNumber>.png
 *
 * File Naming Format:
 * - The generated Word will be saved under the test suite folder with the filename:
 *   <testCaseName>_<executionTimestamp>.docx
 *
 * Flow:
 * 1. Capture the test case name from GlobalVariable
 * 2. Find the most recent execution folder under /Reports
 * 3. Traverse into the correct test suite folder and locate the 'keyes' screenshot folder
 * 4. Screenshots are filtered based on the test case name, matching the naming convention 'keyes-<testCaseName>_<number>.png'.
 * 5. For each screenshot, the following information is included in the Word document:
 *    - The screenshot number (e.g., Screenshot 1, Screenshot 2, etc.)
 *    - The description of the screenshot from the 'ScreenshotDescriptions' data file.
 *    - The image itself, scaled appropriately to fit within the document layout.
 * 6. The Word document is saved in the test suite folder.
 *
 * Notes:
 * - If no matching screenshots are found for a test case, no report will be created
 * - Relies on the ScreenshotDescriptions test data file to include:
 *     * TestCaseName (string)
 *     * ScreenshotNumber (string or integer)
 *     * Description (string)
 * - Requires Apache POI libraries for DOCX generation
 * - Designed to be integrated with a Test Listener for automatic post-test reporting
 */
package utils

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import org.apache.poi.xwpf.usermodel.*
import javax.imageio.ImageIO
import java.awt.image.BufferedImage
import org.apache.poi.util.Units
import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable

class GenerateWordScreenshotReport {

	@Keyword
	def static generateWordReportsPerTestCase() {

		// 1. Get test case name from GlobalVariable
		String testCaseName = GlobalVariable.testCaseName ?: "UnknownTestCase"

		// 2. Locate the Reports directory and get the latest outer timestamp folder
		String reportsFolder = "Reports/"
		File reportsDir = new File(reportsFolder)

		File latestFolder1 = reportsDir.listFiles()
				?.findAll { it.isDirectory() }
				?.sort { -it.lastModified() }
				?.first()

		if (latestFolder1 == null) {
			println("No report folders found inside Reports/")
			return
		}

		// 3. Locate the test suite folder inside the latest outer folder
		File[] testSuiteFolders = latestFolder1.listFiles()?.findAll { it.isDirectory() }
		if (!testSuiteFolders) {
			println("No test suite folder found inside: " + latestFolder1.getName())
			return
		}
		File testSuiteFolder = testSuiteFolders[0] // Assuming only one suite folder

		// 4. Locate the inner timestamp folder (latest)
		File latestFolder2 = testSuiteFolder.listFiles()
				?.findAll { it.isDirectory() }
				?.sort { -it.lastModified() }
				?.first()

		if (latestFolder2 == null) {
			println("No subfolder found inside test suite: " + testSuiteFolder.getName())
			return
		}

		// 5. Locate the 'keyes' folder containing screenshots
		File keyesFolder = new File(latestFolder2, "keyes")
		if (!keyesFolder.exists()) {
			println("Keyes folder not found in: " + latestFolder2.getName())
			return
		}
		println("Found keyes folder: " + keyesFolder.getAbsolutePath())

		// 6. Filter screenshots related to the current test case
		File[] imageFiles = keyesFolder.listFiles({ file ->
			file.name.endsWith(".png") && file.name.contains(testCaseName)
		} as FileFilter)

		if (!imageFiles || imageFiles.length == 0) {
			println("No matching screenshots found for test case: " + testCaseName)
			return
		}

		// Sort screenshots by filename for consistent order in the document
		imageFiles = imageFiles.sort { a, b -> a.name <=> b.name }
		println("Total screenshots found: " + imageFiles.size())

		// 7. Prepare Word output document
		String timeStamp = latestFolder1.getName()
		File wordFile = new File(testSuiteFolder, "${testCaseName}_${timeStamp}.docx")

		XWPFDocument document = new XWPFDocument()
		FileOutputStream out = new FileOutputStream(wordFile)

		// Add title with test case name
		XWPFParagraph intro = document.createParagraph()
		XWPFRun introRun = intro.createRun()
		introRun.setBold(true)
		introRun.setFontSize(14)
		introRun.setText("Test Case: ${testCaseName}")

		// 8. Load screenshot descriptions from test data
		def descriptionsData = findTestData('Data Files/ScreenshotDescriptions')

		// 9. Add screenshots with labels and descriptions
		int screenshotCount = 1
		int maxWidth = 500 // in pixels

		for (File imgFile : imageFiles) {
			println("Adding image to Word: " + imgFile.name)

			// Label paragraph (e.g., Screenshot 1, 2, 3...)
			XWPFParagraph labelParagraph = document.createParagraph()
			XWPFRun labelRun = labelParagraph.createRun()
			labelRun.setBold(true)
			labelRun.setFontSize(12)
			labelRun.setText("Screenshot " + screenshotCount)

			// Extract <screenshotNumber> from filename (e.g., keyes-Test_3.png → 3)
			def matcher = (imgFile.name =~ /.*_(\d+)\.png/)
			String actualScreenshotNumber = matcher ? matcher[0][1] : ""

			// Match screenshot description based on test case name and actual number
			String description = ""
			for (int i = 1; i <= descriptionsData.getRowNumbers(); i++) {
				String dataTestCaseName = descriptionsData.getValue("TestCaseName", i)
				String dataScreenshotNumber = descriptionsData.getValue("ScreenshotNumber", i)

				if (dataTestCaseName == testCaseName && dataScreenshotNumber == actualScreenshotNumber) {
					description = descriptionsData.getValue("Description", i)
					break
				}
			}

			// Description paragraph
			XWPFParagraph descriptionParagraph = document.createParagraph()
			XWPFRun descriptionRun = descriptionParagraph.createRun()
			descriptionRun.setItalic(true)
			descriptionRun.setText(description)

			// Read and scale image
			BufferedImage bimg = ImageIO.read(imgFile)
			if (bimg == null) {
				println("Failed to read image: " + imgFile.name)
				continue
			}

			int originalWidth = bimg.getWidth()
			int originalHeight = bimg.getHeight()
			int scaledWidth = originalWidth
			int scaledHeight = originalHeight

			if (originalWidth > maxWidth) {
				double scaleRatio = (double) maxWidth / originalWidth
				scaledWidth = maxWidth
				scaledHeight = (int) (originalHeight * scaleRatio)
			}

			// Add image
			XWPFParagraph imgParagraph = document.createParagraph()
			XWPFRun imgRun = imgParagraph.createRun()
			try {
				InputStream inputStream = new FileInputStream(imgFile)
				imgRun.addPicture(inputStream, XWPFDocument.PICTURE_TYPE_PNG, imgFile.name,
						Units.toEMU(scaledWidth), Units.toEMU(scaledHeight))
				inputStream.close()
			} catch (Exception e) {
				println("Error adding image to Word: " + imgFile.name)
				e.printStackTrace()
				continue
			}

			// Page break (except after the last screenshot)
			if (screenshotCount < imageFiles.length) {
				imgRun.addBreak(BreakType.PAGE)
			}

			screenshotCount++
		}

		// 10. Save document
		document.write(out)
		out.close()
		document.close()

		println("Word file created: " + wordFile.getAbsolutePath())
	}
}
