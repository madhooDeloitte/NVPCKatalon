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

String envURL = 'https://dk.deloitte-sea.com/home'

//email
String orgAdminEmail = 'rajeev@marriott.dk.dev'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgLogin/span_Log in with'), 0)

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), orgAdminEmail)

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgLogin/div_Verification'), 0)

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.delay(200)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_ac06e4'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_c0c54a'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_5a7989'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_bc9516'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_d41d1e'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_28d745'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgLogin/span_The OTP is expired. Please resend code'), 
    0)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Resend OTP'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_ac06e4'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_c0c54a'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_5a7989'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_bc9516'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_d41d1e'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_28d745'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.takeScreenshotAsCheckpoint('6')

