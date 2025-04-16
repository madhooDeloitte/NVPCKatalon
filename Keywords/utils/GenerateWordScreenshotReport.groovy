package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.apache.poi.xwpf.usermodel.XWPFDocument
import org.apache.poi.xwpf.usermodel.XWPFParagraph
import org.apache.poi.xwpf.usermodel.XWPFRun
import org.apache.poi.xwpf.usermodel.XWPFTable
import org.apache.poi.xwpf.usermodel.XWPFTableRow
import org.apache.poi.xwpf.usermodel.XWPFTableCell
import com.kms.katalon.core.annotation.Keyword

import org.apache.poi.xwpf.usermodel.*
import javax.imageio.ImageIO
import java.awt.image.BufferedImage
import org.apache.poi.util.Units
import com.kms.katalon.core.testdata.TestData
import java.io.*
import internal.GlobalVariable

class GenerateWordScreenshotReport {

	@com.kms.katalon.core.annotation.Keyword
	def static generateWordReportsPerTestCase() {
		
		// Ensure test case name is available
		String testCaseName = GlobalVariable.testCaseName ?: "UnknownTestCase"

		// Define the path to the main reports directory
		String reportsFolder = "Reports/"
		File reportsDir = new File(reportsFolder)

		// Find the most recently modified folder inside the Reports directory (usually the latest test run)
		File latestFolder1 = reportsDir.listFiles()
				?.findAll { it.isDirectory() }
				?.sort { -it.lastModified() }
				?.first()

		if (latestFolder1 == null) {
			println("No report folders found inside Reports/")
			return
		}

		// Get the test suite folder inside the latestFolder1
		File[] testSuiteFolders = latestFolder1.listFiles()?.findAll { it.isDirectory() }
		if (testSuiteFolders == null || testSuiteFolders.length == 0) {
			println("No test suite folder found inside: " + latestFolder1.getName())
			return
		}
		File testSuiteFolder = testSuiteFolders[0] // Assuming only one test suite folder exists

		// Get the latest autonamed subfolder inside testSuiteFolder
		File latestFolder2 = testSuiteFolder.listFiles()
				?.findAll { it.isDirectory() }
				?.sort { -it.lastModified() }
				?.first()
		if (latestFolder2 == null) {
			println("No subfolder found inside test suite: " + testSuiteFolder.getName())
			return
		}

		// Locate the 'keyes' folder where screenshots are stored
		File keyesFolder = new File(latestFolder2, "keyes")

		if (!keyesFolder.exists()) {
			println("Keyes folder not found in: " + latestFolder2.getName())
			return
		}

		println("Found keyes folder: " + keyesFolder.getAbsolutePath())

		// Collect screenshots for the current test case based on filename pattern
		// Format expected: keyes-<testCaseName>_<number>.png
		File[] imageFiles = keyesFolder.listFiles({ file ->
			file.name.endsWith(".png") && file.name.contains(testCaseName)
		} as FileFilter)
		
		if (imageFiles.length == 0) {
			println("No matching screenshots found for test case: " + testCaseName)
			return
		}
		
		println("Total screenshots found: " + imageFiles.size())

		// Define the output Word file name with timestamp and test case name
		// Example: Log in as Giver using email_20250416_012639.docx 
		String timeStamp = latestFolder1.getName()
		File wordFile = new File(testSuiteFolder, "${testCaseName}_${timeStamp}.docx")

		// Create Word document
		XWPFDocument document = new XWPFDocument()
		FileOutputStream out = new FileOutputStream(wordFile)

		// Add document title with test case name
		XWPFParagraph intro = document.createParagraph()
		XWPFRun introRun = intro.createRun()
		introRun.setBold(true)
		introRun.setFontSize(14)
		introRun.setText("Test Case: ${testCaseName}")

		// Load the descriptions from the test data
		def descriptionsData = findTestData('Data Files/ScreenshotDescriptions')

		// Max width for images (to avoid overflow in document)
		int screenshotCount = 1
		int maxWidth = 500  // Max image width in pixels

		// Loop through each screenshot
		for (File imgFile : imageFiles) {
			println("Adding image to Word: " + imgFile.name)

			// Add label (e.g., Screenshot 1)
			XWPFParagraph labelParagraph = document.createParagraph()
			XWPFRun labelRun = labelParagraph.createRun()
			labelRun.setBold(true)
			labelRun.setFontSize(12)
			labelRun.setText("Screenshot " + screenshotCount)

			// Retrieve description from test data for current screenshot
			String description = ""
			for (int i = 1; i <= descriptionsData.getRowNumbers(); i++) {
				String dataTestCaseName = descriptionsData.getValue("TestCaseName", i)
				String dataScreenshotNumber = descriptionsData.getValue("ScreenshotNumber", i)

				if (dataTestCaseName == testCaseName && dataScreenshotNumber == screenshotCount.toString()) {
					description = descriptionsData.getValue("Description", i)
					break
				}
			}

			// Add description to the document
			XWPFParagraph descriptionParagraph = document.createParagraph()
			XWPFRun descriptionRun = descriptionParagraph.createRun()
			descriptionRun.setItalic(true)
			descriptionRun.setText(description)

			// Read and scale the image while maintaining aspect ratio
			BufferedImage bimg = ImageIO.read(imgFile)
			if (bimg == null) {
				println("❌ Failed to read image: " + imgFile.name)
				continue
			}
			
			int originalWidth = bimg.getWidth()
			int originalHeight = bimg.getHeight()

			// Calculate scaled size with aspect ratio preserved
			int scaledWidth = originalWidth
			int scaledHeight = originalHeight
			
			if (originalWidth > maxWidth) {
				double scaleRatio = (double) maxWidth / originalWidth
				scaledWidth = maxWidth
				scaledHeight = (int) (originalHeight * scaleRatio)
			}

			// Add image to document
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

			// Add page break after each screenshot (except the last one)
			if (screenshotCount < imageFiles.length) {
				imgRun.addBreak(BreakType.PAGE)
			}

			screenshotCount++
		}

		// Save Word file
		document.write(out)
		out.close()
		document.close()

		println("Word file created: " + wordFile.getAbsolutePath())
	}
}
