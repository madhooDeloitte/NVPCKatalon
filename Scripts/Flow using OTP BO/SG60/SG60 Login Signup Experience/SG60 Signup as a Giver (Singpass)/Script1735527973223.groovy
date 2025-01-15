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

String envURL = 'https://uat.giving.sg'

//Singpass URL
String singpassURL = 'https://stg-auth.singpass.gov.sg/main'

//Singpass username 
String singpassUsername = 'S8102792G'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

'need ktl-id'
WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

'need ktl-id'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Log in or sign up with Singpass to Be a_6a57d7'), 
    0)

'need ktl-id'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/a_sign up with Singpass'))

'click sign upwith Singpass btn'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Sign up with'))

'assume works. from prev script'
WebUI.click(findTestObject('Page_Singpass login/button_Password login'))

WebUI.setText(findTestObject('Page_Singpass login/input_Password login_username'), singpassUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Singpass login/input__password'), 'tUM5ps8PP6KPbMdZX3AbAQ==')

