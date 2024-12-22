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

String encryptedPassword = 'hJxcABFZyq6YA1kwHae0pw=='

//WebUI.setEncryptedText(findTestObject(null), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Page_giving.sgLogin/a_Forgot password'))

WebUI.setText(findTestObject('Page_giving.sgForgot password/input_Email address_b3-Input_a_Email'), 'michaelscott@dundermifflin1.dk.dev')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.delay(30)

WebUI.click(findTestObject('Page_giving.sgForgot password/button_Reset my password'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_2597e1'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_007991'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_cc4d5d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_64e266'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_ce42df'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_dc5e0c'), 
    '1')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Page_giving.sgForgot password/button_Verify'))

WebUI.delay(30)

//WebUI.setEncryptedText(findTestObject('Page_giving.sgForgot password/input_Password_b3-Input_Password'), encryptedPassword)

WebUI.delay(30)

//WebUI.setEncryptedText(findTestObject('Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), 
//    encryptedPassword)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Page_giving.sgForgot password/button_Reset password'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Page_giving.sgForgot password/button_Login'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'michaelscott@dundermifflin1.dk.dev')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(30)

//WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), encryptedPassword)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/img'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Yes'))

WebUI.closeBrowser()

