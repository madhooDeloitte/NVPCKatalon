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

userNRIC = 'S8102792G'

userPassword = 'tUM5ps8PP6KPbMdZX3AbAQ=='

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(5)

'verify on main page'
WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.delay(5)

'verify on donate now page'
WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.delay(5)

'verify on donation selection page\r\n'
WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/a_Log in'))

WebUI.delay(5)

'verify on login page'
WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Back'))

if (WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/button_Back'), 10)) {
    WebUI.click(findTestObject('Page_giving.sgLogin/button_Back'))
}

WebUI.delay(5)

'verify back to donation selection page'
WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Login with'))

WebUI.click(findTestObject('Page_Singpass login/button_Password login'))

WebUI.setText(findTestObject('Page_Singpass login/input_Password login_username'), userNRIC)

WebUI.setEncryptedText(findTestObject('Page_Singpass login/input__password'), userPassword)

WebUI.delay(5)

'verify singpass inputs\r\n'
WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Page_Singpass login/button_Log in'))

WebUI.delay(15)

'verify successful login\r\n'
WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/img'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/a_Logout'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_Yes'))

WebUI.closeBrowser()

