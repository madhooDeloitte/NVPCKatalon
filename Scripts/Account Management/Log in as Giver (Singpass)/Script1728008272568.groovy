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

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Singpass'))

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.navigateToUrl('https://stg-auth.singpass.gov.sg/main')

WebUI.click(findTestObject('Object Repository/Page_Singpass login/button_Password login'))

WebUI.setText(findTestObject('Object Repository/Page_Singpass login/input_Password login_username'), 'S8102792G')

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Singpass login/input__password'), 'tUM5ps8PP6KPbMdZX3AbAQ==')

WebUI.click(findTestObject('Object Repository/Page_Singpass login/button_Log in'))

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.closeBrowser()

