import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one-stop platform for you to donate, volunteer or fundraise. - Giving.sg/button_Accept all'))

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('null'))

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now (1)/a_OrganisationBond your workforce together _a50e8c'))

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now (1)/a_Download form'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now (1)/button_I understand'))

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now (1)/button_Sign up with email'))

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.setText(findTestObject('null'), 
    'My organisation')

WebUI.takeScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    '68686868')

WebUI.setText(findTestObject('null'), '201910539A')

WebUI.setText(findTestObject('null'), 
    'www.google.com')

WebUI.setText(findTestObject('null'), 
    '358980')

WebUI.setText(findTestObject('null'), '2')

WebUI.setText(findTestObject('null'), '2')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.takeScreenshot('C:\\Users\\smadhoosudhan\\Downloads\\Katalon\\Register for Org Account7.jpg')

WebUI.takeScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('null'))

WebUI.uploadFile(findTestObject('null'), 'C:\\Users\\smadhoosudhan\\Downloads\\Registered Organisation Letter of Authorisation Form.pdf')

WebUI.takeScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'Katalon tester 1')

WebUI.setText(findTestObject('null'), 'katalontest@mailto.plus')

WebUI.setText(findTestObject('null'), 'Deloitte@123')

WebUI.setText(findTestObject('null'), 
    'Deloitte@123')

WebUI.takeScreenshotAsCheckpoint('9')

