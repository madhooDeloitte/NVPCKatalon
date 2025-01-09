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

envURL = 'https://dk.deloitte-sea.com/'

fullName = 'zebadeb'

emailName = 'zzeb@zeb.com'

NRICname = 'S9912345A'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_DONATE NOW'))

'verify sign in banner\r\n'
WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/a_Sign up'))

'verify on sign-up page'
WebUI.takeScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Page_giving.sgSign up now/button_exit signup'))

'verify back to original page (does not go to donation selection)'
WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.click(findTestObject('Page_giving.sgSign up now/button_giving home sign up banner'))

WebUI.click(findTestObject('Page_giving.sgSign up now/button_giver signup'))

'verify on create account page'
WebUI.takeScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Sign up with email'))

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Full name_b5-b3-Input_GiverName'), fullName)

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Email_b5-b3-Input_Email'), emailName)

'click date box'
WebUI.click(findTestObject('Page_giving.sgSign up now/inp_signup dob'), FailureHandling.STOP_ON_FAILURE)

'click first date available\r\n'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Date of birth'))

'password\r\n'
WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Password_b5-b3-Input_Password'), 'r6H/uPCyCbShd/Hiw/HUdA==')

WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Confirm password_b5-b3-Input_ConfirmPassword'), 
    'r6H/uPCyCbShd/Hiw/HUdA==')

WebUI.click(findTestObject('Page_giving.sgSign up now/chk_confirm checkbox'))

WebUI.click(findTestObject('Page_giving.sgSign up now/button_continue finish signup'))

'verify user at OTP page\r\n'
WebUI.takeScreenshotAsCheckpoint('5')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '2')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '3')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '4')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '5')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '6')

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgLogin/button_Verify'))

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_NRIC_b5-b5-Input_NRIC'), NRICname)

WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Continue_1'))

'skip interest'
WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Skip'))

'skip skills'
WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Skip'))

'verify thank you for sign up page'
WebUI.takeScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_start your giving'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), emailName)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'r6H/uPCyCbShd/Hiw/HUdA==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

'verify on donation selection page\r\n'
WebUI.takeScreenshotAsCheckpoint('7')

