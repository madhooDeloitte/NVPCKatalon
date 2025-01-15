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

userEmail = 'michaelscott@dundermifflin.dk.dev'

userPassword = 'hJxcABFZyq4oD3Y625LFBg=='

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

'confirm on home page after accepting cookies'
WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.delay(3)

'confirm on SG60 donate now page'
WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.delay(3)

'confirm on choose donation amount page'
WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/a_Log in'))

WebUI.delay(3)

'confirm on signup page'
WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Back'))

if (WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/button_Back'), 10)) {
    WebUI.click(findTestObject('Page_giving.sgLogin/button_Back'))
}

WebUI.delay(3)

'confirm back to choose donation amount page'
WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), userEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), userPassword)

WebUI.delay(3)

'confirm input for login'
WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(3)

'confirm logged in and back to donation amount page'
WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Stories_b1-b5'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Logout'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_Yes'))

WebUI.closeBrowser()

