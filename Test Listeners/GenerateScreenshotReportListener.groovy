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

	// Calling function to generate report after each test case execution
    @AfterTestCase
    def afterTestCase(TestCaseContext testCaseContext) {
        println("Finished execution of Test Case: ${GlobalVariable.testCaseName}")

        try {
			
			// Function call to generate Word Document screenshot report (Disable any function call if report generation is not needed)
            GenerateWordScreenshotReport.generateWordReportsPerTestCase()
			
			// Function call to generate PDF screenshot report (Disable any function call if report generation is not needed)
			GeneratePdfScreenshotReport.generatePdfReportsPerTestCase()
			
        } catch (Exception e) {
            println("Error while generating Word report for test case ${GlobalVariable.testCaseName}")
            e.printStackTrace()
        }
    }
}