/*
 * Keyword: GeneratePdfScreenshotReport
 *
 * Purpose:
 * This keyword class is responsible for dynamically retrieving all screenshots taken during 
 * a test case execution and compiling them into a structured PDF document.
 *
 * What the PDF Report Contains:
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
 * - The generated PDF will be saved under the test suite folder with the filename:
 *   <testCaseName>_<executionTimestamp>.pdf
 *
 * Execution Flow:
 * 1. Capture the test case name from GlobalVariable
 * 2. Find the most recent execution folder under /Reports
 * 3. Traverse into the correct test suite folder and locate the 'keyes' screenshot folder
 * 4. Match all screenshot files that belong to the test case
 * 5. Use iTextPDF to build a report with:
 *    - Title
 *    - Screenshot label ("Screenshot X")
 *    - Corresponding description
 *    - Embedded and scaled image
 * 6. Save the resulting file in the appropriate test suite folder
 *
 * Notes:
 * - If no screenshots or descriptions are found for a test case, the report is skipped
 * - Requires `ScreenshotDescriptions` test data file to be configured correctly
 * - 'itextpdf-5.5.13.3.jar' is being used as additional library
 * - Can be integrated with a Test Listener to run automatically after specific test cases
 */
package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows


import com.kms.katalon.core.testdata.TestDataFactory
import internal.GlobalVariable
import java.io.File
import java.util.List
import java.util.ArrayList
import com.itextpdf.text.*
import com.itextpdf.text.pdf.PdfWriter
import javax.imageio.ImageIO
import java.awt.image.BufferedImage

public class GeneratePdfScreenshotReport {

	@Keyword
	static void generatePdfReportsPerTestCase() {

		String testCaseName = GlobalVariable.testCaseName ?: "UnknownTestCase"
		File reportsDir = new File("Reports/")

		// Step 1: Locate the most recent report folder
		File latestReportFolder = findLatestFolder(reportsDir)
		if (latestReportFolder == null) {
			println("No report folders found in Reports/")
			return
		}

		// Step 2: Find the test suite folder inside the latest report folder
		File testSuiteFolder = findTestSuiteFolder(latestReportFolder)
		if (testSuiteFolder == null) {
			println("No test suite folder found inside: ${latestReportFolder.getName()}")
			return
		}

		// Step 3: Locate the "keyes" folder
		File keyesFolder = findKeyesFolder(testSuiteFolder)
		if (keyesFolder == null) {
			println("Keyes folder not found in: ${testSuiteFolder.getName()}")
			return
		}

		// Step 4: Find matching screenshots for the test case
		File[] matchingScreenshots = findMatchingScreenshots(keyesFolder, testCaseName)
		if (matchingScreenshots.size() == 0) {
			println("No matching screenshots found for test case: ${testCaseName}")
			return
		}

		// Step 5: Prepare the PDF file
		String timeStamp = latestReportFolder.getName()
		File pdfFile = new File(testSuiteFolder, "${testCaseName}_${timeStamp}.pdf")

		// Step 6: Create and populate the PDF document
		try {
			createPdfDocument(pdfFile, matchingScreenshots, testCaseName)
		} catch (Exception e) {
			println("Error generating PDF report: ${e.message}")
			e.printStackTrace()
		}
	}

	// Finds the latest (most recently modified) folder in the Reports directory
	private static File findLatestFolder(File reportsDir) {
		return reportsDir.listFiles()
				?.findAll { it.isDirectory() }
				?.sort { -it.lastModified() }
				?.first()
	}

	// Finds the test suite folder inside the latest report folder
	private static File findTestSuiteFolder(File latestReportFolder) {
		return latestReportFolder.listFiles()
				?.findAll { it.isDirectory() }
				?.first()
	}

	/* Navigates into the test suite folder to find the inner timestamped folder, 
	 * then gets the "keyes" folder containing screenshots.
	 *  Path: Reports > Outer timestamp > Test suite > Inner timestamp > keyes
	 */
	private static File findKeyesFolder(File testSuiteFolder) {
		File latestFolder2 = testSuiteFolder.listFiles()
				?.findAll { it.isDirectory() }
				?.sort { -it.lastModified() }
				?.first()

		return latestFolder2 ? new File(latestFolder2, "keyes") : null
	}

	// Filters screenshots in the "keyes" folder that match the current test case name
	// Format expected: keyes-<testCaseName>_<number>.png
	private static File[] findMatchingScreenshots(File keyesFolder, String testCaseName) {
		return keyesFolder.listFiles().findAll { file ->
			file.name.startsWith("keyes-${testCaseName}_") && file.name.endsWith(".png")
		}
	}

	// Generates the PDF report using the matching screenshots
	private static void createPdfDocument(File pdfFile, File[] matchingScreenshots, String testCaseName) throws Exception {
		Document document = new Document(PageSize.A4)
		PdfWriter.getInstance(document, new FileOutputStream(pdfFile))
		document.open()

		// Add Title
		addTitleToPdf(document, testCaseName)

		// Add screenshots to PDF
		addScreenshotsToPdf(document, matchingScreenshots, testCaseName)

		// Close the document
		document.close()
		println("PDF generated: ${pdfFile.getAbsolutePath()}")
	}


	// Adds the title (test case name) at the top of the PDF
	private static void addTitleToPdf(Document document, String testCaseName) throws DocumentException {
		Font titleFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD)
		Paragraph title = new Paragraph("Test Case: ${testCaseName}", titleFont)
		title.setAlignment(Element.ALIGN_CENTER)
		title.setSpacingAfter(20)
		document.add(title)
	}


	// Adds sorted screenshots to the PDF with labels and descriptions from test data
	private static void addScreenshotsToPdf(Document document, File[] matchingScreenshots, String testCaseName) throws Exception {
		float maxWidth = 500f
		def descriptionsData = findTestData("Data Files/ScreenshotDescriptions")

		// Sort screenshots by extracted number from filename
		matchingScreenshots.sort { a, b ->
			extractScreenshotNumber(a.name) <=> extractScreenshotNumber(b.name)
		}

		int displayCounter = 1  // This is the counter to label Screenshot 1, 2, 3...
		for (File imgFile : matchingScreenshots) {
			int actualScreenshotNumber = extractScreenshotNumber(imgFile.name)  // This matches the correct description
			addScreenshotToPdf(document, imgFile, displayCounter, actualScreenshotNumber, descriptionsData, testCaseName, maxWidth)
			displayCounter++
		}
	}


	// Extracts screenshot number from filename (e.g., keyes-Test_3.png → 3)
	private static int extractScreenshotNumber(String fileName) {
		def matcher = fileName =~ /.*_(\d+)\.png$/
		return matcher.matches() ? matcher[0][1].toInteger() : -1
	}


	// Adds a screenshot, its label, and description to the PDF
	private static void addScreenshotToPdf(Document document, File imgFile, int displayCounter, int actualScreenshotNumber, def descriptionsData, String testCaseName, float maxWidth) throws Exception {
		Font labelFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD)
		Paragraph label = new Paragraph("Screenshot ${displayCounter}", labelFont)
		label.setSpacingBefore(10)
		label.setSpacingAfter(5)
		document.add(label)

		String description = findScreenshotDescription(descriptionsData, testCaseName, actualScreenshotNumber)
		Font descFont = new Font(Font.FontFamily.HELVETICA, 11, Font.ITALIC)
		Paragraph descPara = new Paragraph(description, descFont)
		descPara.setSpacingAfter(10)
		document.add(descPara)

		addImageToPdf(document, imgFile, maxWidth)
		document.newPage()
	}



	// Looks up the description for a specific test case and screenshot number in the test data
	private static String findScreenshotDescription(def descriptionsData, String testCaseName, int screenshotCount) {
		String description = ""
		for (int i = 1; i <= descriptionsData.getRowNumbers(); i++) {
			String dataTestCase = descriptionsData.getValue("TestCaseName", i)
			String dataScreenshotNum = descriptionsData.getValue("ScreenshotNumber", i)
			if (dataTestCase == testCaseName && dataScreenshotNum == screenshotCount.toString()) {
				description = descriptionsData.getValue("Description", i)
				break
			}
		}
		return description
	}

	// Reads and inserts an image into the PDF, scaling it if necessary
	private static void addImageToPdf(Document document, File imgFile, float maxWidth) throws Exception {

		BufferedImage bimg = ImageIO.read(imgFile)
		if (bimg == null) {
			println("Failed to read image: ${imgFile.name}")
			return
		}

		// Calculate scaled dimensions to fit the PDF
		int originalWidth = bimg.getWidth()
		int originalHeight = bimg.getHeight()
		float scaleRatio = originalWidth > maxWidth ? maxWidth / originalWidth : 1
		float scaledWidth = originalWidth * scaleRatio
		float scaledHeight = originalHeight * scaleRatio

		// Add the scaled image to the document
		try {
			Image image = Image.getInstance(imgFile.getAbsolutePath())
			image.scaleToFit(scaledWidth, scaledHeight)
			image.setAlignment(Element.ALIGN_CENTER)
			document.add(image)
		} catch (Exception e) {
			println("Error adding image to PDF: ${imgFile.name}")
			e.printStackTrace()
		}
	}
}