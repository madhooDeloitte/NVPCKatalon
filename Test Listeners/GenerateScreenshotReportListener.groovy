/*
 * Test Listener: GenerateScreenshotReportListener
 * 
 * Purpose:
 * This Test Listener automates the capture of test case names and the generation of 
 * execution reports (including screenshots) for selected test cases. At the end of 
 * each relevant test case, it invokes functions to compile screenshots into both 
 * Word and PDF documents.
 * 
 * Key Functionality:
 * - @BeforeTestCase: Captures the test case name at runtime and stores it in a 
 *   global variable for use during reporting.
 * 
 * - @AfterTestCase: Checks whether the executed test case is in the list of 
 *   target test cases that require screenshot reports. If it is, calls custom 
 *   utility classes to generate reports:
 *      • GenerateWordScreenshotReport.generateWordReportsPerTestCase()
 *      • GeneratePdfScreenshotReport.generatePdfReportsPerTestCase()
 * 
 * Notes:
 * - The list `targetTestCases` should be updated as needed to include test cases 
 *   where screenshot documentation is required.
 * - Commented alternative implementation is available to enable reporting for 
 *   *every* test case instead of only selected ones.
 * - Utility classes must be implemented correctly for this listener to work as expected.
 * 
 */

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.util.KeywordUtil
import utils.GenerateWordScreenshotReport
import utils.GeneratePdfScreenshotReport

class GenerateScreenshotReportListener {
	
	// Capture test case name for each execution
    @BeforeTestCase
    def beforeTestCase(TestCaseContext testCaseContext) {
        String testCaseId = testCaseContext.getTestCaseId()
        String testCaseName = testCaseId.substring(testCaseId.lastIndexOf("/") + 1)
        GlobalVariable.testCaseName = testCaseName

        println("Captured Test Case Name: ${testCaseName}")
    }
	
	// Call function to generate screenshot report for specific test case
	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
		String testCaseName = GlobalVariable.testCaseName
		println("Finished execution of Test Case: ${testCaseName}")

		// Only run for specific test cases that wants to have screenshots report generated
		List<String> targetTestCases = [ 'Register for Giver account with email',
			'Log in as Giver (Singpass)', 'Log in as Giver using email', 'Log in as NPO Admin using email']

		if (targetTestCases.contains(testCaseName)) {
			try {
				println("Generating screenshot reports for ${testCaseName}...")

				GenerateWordScreenshotReport.generateWordReportsPerTestCase()
				GeneratePdfScreenshotReport.generatePdfReportsPerTestCase()

			} catch (Exception e) {
				println("Error while generating reports for test case ${testCaseName}")
				e.printStackTrace()
			}
		} else {
			println("Skipping report generation for ${testCaseName}")
		}
	}

// 	//Calling function to generate report after each test case execution
//	//Use this version if want to generate screenshot across all test cases after each execution
//	//Remarks: Only if all test cases contains steps to take screenshot
//
//    @AfterTestCase
//    def afterTestCase(TestCaseContext testCaseContext) {
//        println("Finished execution of Test Case: ${GlobalVariable.testCaseName}")
//
//        try {
//			
//			// Function call to generate Word Document screenshot report (Disable any function call if report generation is not needed)
//            GenerateWordScreenshotReport.generateWordReportsPerTestCase()
//			
//			// Function call to generate PDF screenshot report (Disable any function call if report generation is not needed)
//			GeneratePdfScreenshotReport.generatePdfReportsPerTestCase()
//			
//        } catch (Exception e) {
//            println("Error while generating Word report for test case ${GlobalVariable.testCaseName}")
//            e.printStackTrace()
//        }
//    }
//	
	
}