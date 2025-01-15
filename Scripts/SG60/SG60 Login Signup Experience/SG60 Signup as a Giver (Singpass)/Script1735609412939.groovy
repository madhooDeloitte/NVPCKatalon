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

'home url\r\n'
String envURL = 'https://dk.deloitte-sea.com/home'

//Singpass username 
String singpassUsername = 'S9812353I'

'change email name before/after every run\r\n'
sg60singpassEmail = 'sg60singpasssignup13@gmail.com'

'Need to go into dk nvpc users and delete the email account of chosen NRIC if not will not work'
WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

'verify on main page'
WebUI.takeScreenshotAsCheckpoint('1')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.delay(3)

'verify on donate now song'
WebUI.takeScreenshotAsCheckpoint('2')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.delay(3)

'6) verify donation selection page banner'
WebUI.takeScreenshotAsCheckpoint('3')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/a_sign up with Singpass'))

WebUI.delay(10)

'9) verify user is redirected to create account page'
WebUI.takeScreenshotAsCheckpoint('4')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Sign up with_1'))

WebUI.delay(10)

'11) verify singpass login page'
WebUI.takeScreenshotAsCheckpoint('5')

'-'
WebUI.click(findTestObject('Object Repository/Page_Singpass login/button_Password login'))

'-'
WebUI.setText(findTestObject('Object Repository/Page_Singpass login/input_Password login_username'), singpassUsername)

'-'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Singpass login/input__password'), 'tUM5ps8PP6KPbMdZX3AbAQ==')

WebUI.delay(3)

'verify inputs for login'
WebUI.takeScreenshotAsCheckpoint('6')

'-'
WebUI.click(findTestObject('Object Repository/Page_Singpass login/button_Log in'))

WebUI.delay(10)

'14) verify are you existing user page\r\n'
WebUI.takeScreenshotAsCheckpoint('7')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgLink account/button_No, Im not'))

WebUI.delay(3)

'15) verify create account modal'
WebUI.takeScreenshotAsCheckpoint('8')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgLink account/button_Create an account'))

WebUI.delay(3)

'16) verify singpass retrieval page'
WebUI.takeScreenshotAsCheckpoint('9')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_I agree'))

WebUI.delay(3)

'17) verify general information page'
WebUI.takeScreenshotAsCheckpoint('10')

//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_Exit_b4-b2-b3-b1-Wizard'))
'-'
WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Email_b4-b2-b3-Input_Email'), 
    sg60singpassEmail)

//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_Exit_b4-b2-b3-b1-Wizard'))
'-'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_This is optional. Provide a password _87406f'), 
    'r6H/uPCyCbShd/Hiw/HUdA==')

//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/i_This is optional. Provide a password if y_021f43'))
'-'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Confirm password_b4-b2-b3-Input_Confi_638ad2'), 
    'r6H/uPCyCbShd/Hiw/HUdA==')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Confirm password_b4-b2-b3-IsConsent_Checkbox'))

WebUI.delay(3)

'verify inputs for account'
WebUI.takeScreenshotAsCheckpoint('11')

'-'
WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_continue(2)'))

'-\r\n'
WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

'-'
WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_2'), '1')

'-'
WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_3'), '1')

'-'
WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_4'), '1')

'-'
WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_5'), '1')

'-'
WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_6'), '1')

WebUI.delay(3)

'verify OTP submitted'
WebUI.takeScreenshotAsCheckpoint('12')

'-'
WebUI.click(findTestObject('Create Opportunity/Page_giving.sgLogin/button_Verify'))

WebUI.delay(5)

'24) verify at user information page'
WebUI.takeScreenshotAsCheckpoint('13')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue_1_2'))

WebUI.delay(3)

'verify interest page'
WebUI.takeScreenshotAsCheckpoint('14')

'- interest skip'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Skip'))

WebUI.delay(3)

'verify skills page'
WebUI.takeScreenshotAsCheckpoint('15')

'- skill skip'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Skip_1'))

WebUI.delay(5)

'30) verify thank you for signing up page'
WebUI.takeScreenshotAsCheckpoint('16')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Log in'))

WebUI.delay(3)

'33) verify at login page'
WebUI.takeScreenshotAsCheckpoint('17')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Sign up with_1'))

'- singpass password login btn'
WebUI.click(findTestObject('Object Repository/Page_Singpass login/button_Password login'))

'-'
WebUI.setText(findTestObject('Object Repository/Page_Singpass login/input_Password login_username'), singpassUsername)

'-'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Singpass login/input__password'), 'tUM5ps8PP6KPbMdZX3AbAQ==')

WebUI.delay(3)

'34) verify singpass login page'
WebUI.takeScreenshotAsCheckpoint('18')

'-'
WebUI.click(findTestObject('Object Repository/Page_Singpass login/button_Log in'))

WebUI.delay(15)

'38) verify donation selection page'
WebUI.takeScreenshotAsCheckpoint('19')

