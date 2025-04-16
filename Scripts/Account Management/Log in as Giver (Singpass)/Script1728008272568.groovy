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
import utils.GenerateWordScreenshotReport

String envURL = 'https://uat.giving.sg'

//Singpass URL
String singpassURL = 'https://stg-auth.singpass.gov.sg/main'

//Singpass username 
String singpassUsername = 'S8102792G'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Log in as Giver (Singpass)_1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Log in as Giver (Singpass)_2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Singpass'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Log in as Giver (Singpass)_3')

WebUI.navigateToUrl(singpassURL)

WebUI.click(findTestObject('Object Repository/Page_Singpass login/button_Password login'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Log in as Giver (Singpass)_4')

WebUI.setText(findTestObject('Object Repository/Page_Singpass login/input_Password login_username'), singpassUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Singpass login/input__password'), 'tUM5ps8PP6KPbMdZX3AbAQ==')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Log in as Giver (Singpass)_5')

WebUI.click(findTestObject('Object Repository/Page_Singpass login/button_Log in'))

WebUI.delay(7)

WebUI.takeScreenshotAsCheckpoint('Log in as Giver (Singpass)_6')

GenerateWordScreenshotReport.generateWordReport()