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
import com.kms.katalon.util.CryptoUtil as CryptoUtil

String originalText1 = 'mismatch1'

String encryptedPassword = CryptoUtil.encode(CryptoUtil.getDefault(originalText1))

String originalText2 = 'mismatch2'

String encryptedConfirmPassword = CryptoUtil.encode(CryptoUtil.getDefault(originalText2))

//String encryptedPassword = 'hJxcABFZyq6YA1kwHae0pw=='
'Input email. update this email password in confluence'
String userEmail = 'member8@dk.dev'

'update this password each time'
String workingPass1 = 'Deloitte@234'

'update this password each time and update confluence after running script'
String workingPass2 = 'Deloitte@234'

WebUI.openBrowser('')

//WebUI.setEncryptedText(findTestObject(null), 'hJxcABFZyq6YA1kwHae0pw==')
WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('1 main page')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('2 login screen')

WebUI.click(findTestObject('Page_giving.sgLogin/a_Forgot password'))

WebUI.setText(findTestObject('Page_giving.sgForgot password/input_Email address_b3-Input_a_Email'), userEmail)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('3 recovery email input')

WebUI.click(findTestObject('Page_giving.sgForgot password/button_Reset my password'))

//Check for OTP sent to email
//If the email entered does not exist in the system, OTP will not be sent to the email
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

WebUI.takeFullPageScreenshotAsCheckpoint('4 OTP input')

WebUI.click(findTestObject('Page_giving.sgForgot password/button_Verify'))

'pass: Mismatched!1'
WebUI.setEncryptedText(findTestObject('Page_giving.sgForgot password/input_Password_b3-Input_Password'), '1sUQgUd+60S9+w7ahbk61g==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_hidden password'))

'pass: Mismatched!2'
WebUI.setEncryptedText(findTestObject('Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), 
    '1sUQgUd+60SaX7gQMCjwjw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_hidden confirm password'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('5 fail reset inputs')

WebUI.click(findTestObject('Page_giving.sgForgot password/button_Reset password'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('6 reset mismatch error')

WebUI.sendKeys(findTestObject('Page_giving.sgForgot password/input_Password_b3-Input_Password'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Page_giving.sgForgot password/input_Password_b3-Input_Password'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), Keys.chord(
        Keys.BACK_SPACE))

'pass: Deloitte@345'
WebUI.setEncryptedText(findTestObject('Page_giving.sgForgot password/input_Password_b3-Input_Password'), 'hJxcABFZyq6NRXe0zEmvlg==')

'pass: Deloitte@345'
WebUI.setEncryptedText(findTestObject('Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), 
    'hJxcABFZyq6NRXe0zEmvlg==')

//WebUI.setEncryptedText(findTestObject('Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), 
//    encryptedPassword)
WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('7 input working pass')

WebUI.click(findTestObject('Page_giving.sgForgot password/button_Reset password'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('8 password reset page')

WebUI.click(findTestObject('Page_giving.sgForgot password/button_Login'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), userEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

'pass: Deloitte@345'
WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6NRXe0zEmvlg==')

//WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), encryptedPassword)
WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('9 reset inputs')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(7)

WebUI.takeFullPageScreenshotAsCheckpoint('10 logged in main page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/img'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Yes'))

WebUI.closeBrowser()

