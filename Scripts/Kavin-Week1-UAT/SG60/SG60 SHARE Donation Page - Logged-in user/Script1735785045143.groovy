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

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'member1@dk.dev')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Page_giving.sgLogin/div_SG60Share'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Receive a 250 tax relief in your tax re_3f4c40'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_giving.sgSG60 SHARE/div_60'), 0)

WebUI.verifyElementPresent(findTestObject('Page_giving.sgSG60 SHARE/div_605X12 months LoggedIn'), 0)

WebUI.verifyElementPresent(findTestObject('Page_giving.sgSG60 SHARE/div_10'), 0)

WebUI.verifyElementPresent(findTestObject('Page_giving.sgSG60 SHARE/div_25'), 0)

WebUI.verifyElementPresent(findTestObject('Page_giving.sgSG60 SHARE/div_50'), 0)

WebUI.verifyElementPresent(findTestObject('Page_giving.sgSG60 SHARE/div_Other amount'), 0)

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/div__b2-RadioButton7'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/span_I want to make this a monthly recurrin_fe3c5f'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/textarea_Leave an encouraging message (opti_06f4b0'), 
    'Good Morning Attack ')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_Checkout'))

WebUI.verifyElementText(findTestObject('Page_giving.sgSG60 SHARE/span_The use of attack is not allowed'), 'The use of \'attack\' is not allowed.')

WebUI.takeScreenshot()

WebUI.closeBrowser()

