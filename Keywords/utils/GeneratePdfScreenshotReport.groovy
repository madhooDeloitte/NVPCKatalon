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


//public class GeneratePdfScreenshotReport {
//	@Keyword
//	static void generatePdfReportsPerTestCase() {
//		String testCaseName = GlobalVariable.testCaseName ?: "UnknownTestCase"
//		File reportsDir = new File("Reports/")
//
//		File latestFolder1 = reportsDir.listFiles()
//				?.findAll { it.isDirectory() }
//				?.sort { -it.lastModified() }
//				?.first()
//
//		if (latestFolder1 == null) {
//			println("❌ No report folders found in Reports/")
//			return
//		}
//
//		File testSuiteFolder = latestFolder1.listFiles()
//				?.findAll { it.isDirectory() }
//				?.first()
//
//		if (testSuiteFolder == null) {
//			println("❌ No test suite folder found inside: ${latestFolder1.getName()}")
//			return
//		}
//
//		File latestFolder2 = testSuiteFolder.listFiles()
//				?.findAll { it.isDirectory() }
//				?.sort { -it.lastModified() }
//				?.first()
//
//		if (latestFolder2 == null) {
//			println("❌ No subfolder found inside test suite: ${testSuiteFolder.getName()}")
//			return
//		}
//
//		File keyesFolder = new File(latestFolder2, "keyes")
//		if (!keyesFolder.exists()) {
//			println("❌ Keyes folder not found in: ${latestFolder2.getName()}")
//			return
//		}
//
//		// ✅ Filter images that match: keyes-<testCaseName>_<number>.png
//		File[] matchingScreenshots = keyesFolder.listFiles().findAll { file ->
//			file.name.startsWith("keyes-${testCaseName}_") && file.name.endsWith(".png")
//		}
//
//		if (matchingScreenshots.size() == 0) {
//			println("❌ No matching screenshots found for test case: ${testCaseName}")
//			return
//		}
//
//		// Load test data
//		def descriptionsData = findTestData("Data Files/ScreenshotDescriptions")
//		String timeStamp = latestFolder1.getName()
//		File pdfFile = new File(testSuiteFolder, "${testCaseName}_${timeStamp}.pdf")
//
//		// Create PDF document
//		Document document = new Document(PageSize.A4)
//		PdfWriter.getInstance(document, new FileOutputStream(pdfFile))
//		document.open()
//
//		Font titleFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD)
//		Paragraph title = new Paragraph("Test Case: ${testCaseName}", titleFont)
//		title.setAlignment(Element.ALIGN_CENTER)
//		title.setSpacingAfter(20)
//		document.add(title)
//
//		int screenshotCount = 1
//		float maxWidth = 500f
//
//		for (File imgFile : matchingScreenshots) {
//			// Add label
//			Font labelFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD)
//			Paragraph label = new Paragraph("Screenshot ${screenshotCount}", labelFont)
//			label.setSpacingBefore(10)
//			label.setSpacingAfter(5)
//			document.add(label)
//
//			// Add description
//			String description = ""
//			for (int i = 1; i <= descriptionsData.getRowNumbers(); i++) {
//				String dataTestCase = descriptionsData.getValue("TestCaseName", i)
//				String dataScreenshotNum = descriptionsData.getValue("ScreenshotNumber", i)
//				if (dataTestCase == testCaseName && dataScreenshotNum == screenshotCount.toString()) {
//					description = descriptionsData.getValue("Description", i)
//					break
//				}
//			}
//
//			Font descFont = new Font(Font.FontFamily.HELVETICA, 11, Font.ITALIC)
//			Paragraph descPara = new Paragraph(description, descFont)
//			descPara.setSpacingAfter(10)
//			document.add(descPara)
//
//			// Read image size
//			BufferedImage bimg = ImageIO.read(imgFile)
//			if (bimg == null) {
//				println("❌ Failed to read image: ${imgFile.name}")
//				continue
//			}
//			int originalWidth = bimg.getWidth()
//			int originalHeight = bimg.getHeight()
//			float scaledWidth = originalWidth
//			float scaledHeight = originalHeight
//			if (originalWidth > maxWidth) {
//				float scaleRatio = maxWidth / originalWidth
//				scaledWidth = maxWidth
//				scaledHeight = originalHeight * scaleRatio
//			}
//
//			// Add image
//			try {
//				Image image = Image.getInstance(imgFile.getAbsolutePath())
//				image.scaleToFit(scaledWidth, scaledHeight)
//				image.setAlignment(Element.ALIGN_CENTER)
//				document.add(image)
//			} catch (Exception e) {
//				println("❌ Error adding image to PDF: ${imgFile.name}")
//				e.printStackTrace()
//				continue
//			}
//
//			// Page break
//			if (screenshotCount < matchingScreenshots.size()) {
//				document.newPage()
//			}
//
//			screenshotCount++
//		}
//
//		document.close()
//		println("✅ PDF generated: ${pdfFile.getAbsolutePath()}")
//	}
//}


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

	/* 
	 Navigates into the test suite folder to find the inner timestamped folder, 
	 then gets the "keyes" folder containing screenshots.
	 Path: Reports > Outer timestamp > Test suite > Inner timestamp > keyes
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

	// Loops through the screenshot files and adds each one to the PDF
	private static void addScreenshotsToPdf(Document document, File[] matchingScreenshots, String testCaseName) throws Exception {
		int screenshotCount = 1
		float maxWidth = 500f
		def descriptionsData = findTestData("Data Files/ScreenshotDescriptions")

		for (File imgFile : matchingScreenshots) {
			addScreenshotToPdf(document, imgFile, screenshotCount, descriptionsData, testCaseName, maxWidth)
			screenshotCount++
		}
	}

	
	// Adds a screenshot, its label, and description to the PDF document
	private static void addScreenshotToPdf(Document document, File imgFile, int screenshotCount, def descriptionsData, String testCaseName, float maxWidth) throws Exception {
		
		// Label above the screenshot (e.g., "Screenshot 1")
		Font labelFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD)
		Paragraph label = new Paragraph("Screenshot ${screenshotCount}", labelFont)
		label.setSpacingBefore(10)
		label.setSpacingAfter(5)
		document.add(label)

		// Fetch and add description from test data
		String description = findScreenshotDescription(descriptionsData, testCaseName, screenshotCount)
		Font descFont = new Font(Font.FontFamily.HELVETICA, 11, Font.ITALIC)
		Paragraph descPara = new Paragraph(description, descFont)
		descPara.setSpacingAfter(10)
		document.add(descPara)

		// Add the actual screenshot image
		addImageToPdf(document, imgFile, maxWidth)

		// Insert page break if there are more screenshots
		if (screenshotCount < descriptionsData.getRowNumbers()) {
			document.newPage()
		}
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