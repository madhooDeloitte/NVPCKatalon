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

'full name for sign up'
fullName = 'shaker'

'change this every run or go into admin accnt and delete used account'
emailName = 'shake@down.com'

'NRIC for signup'
NRICname = 'S9912345A'

'mobile number for signup'
inpMobile = '91234567'

'postal code for signup'
inpPostal = '018956'

'Change password on step 23, 24'
WebUI.comment('')

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

'verify main menu\r\n'
WebUI.takeScreenshotAsCheckpoint('1 main menu')

WebUI.click(findTestObject('Page_giving.sgSign up now/button_giving home sign up banner'))

WebUI.delay(3)

'verify on choose giver page\r\n'
WebUI.takeScreenshotAsCheckpoint('2 choose giver type page')

WebUI.click(findTestObject('Page_giving.sgSign up now/button_giver signup'))

WebUI.delay(3)

'verify on create account page'
WebUI.takeScreenshotAsCheckpoint('3 account creation page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Sign up with email'))

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Full name_b5-b3-Input_GiverName'), fullName)

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Email_b5-b3-Input_Email'), emailName)

'click date box'
WebUI.click(findTestObject('Page_giving.sgSign up now/inp_signup dob'), FailureHandling.STOP_ON_FAILURE)

'click first date available\r\n'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Date of birth'))

'Input password\r\n'
WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Password_b5-b3-Input_Password'), 'r6H/uPCyCbShd/Hiw/HUdA==')

WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Confirm password_b5-b3-Input_ConfirmPassword'), 
    'r6H/uPCyCbShd/Hiw/HUdA==')

WebUI.click(findTestObject('Page_giving.sgSign up now/chk_confirm checkbox'))

WebUI.delay(3)

'verify signup filled'
WebUI.takeScreenshotAsCheckpoint('4 signup inputs filled')

WebUI.click(findTestObject('Page_giving.sgSign up now/button_continue finish signup'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '2')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '3')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '4')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '5')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '6')

WebUI.delay(3)

'verify otp filled'
WebUI.takeScreenshotAsCheckpoint('5 signup otp filled')

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgLogin/button_Verify'))

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_NRIC_b5-b5-Input_NRIC'), NRICname)

'mobile number'
WebUI.setText(findTestObject('Page_giving.sgSign up now/inp_mobile number'), inpMobile)

WebUI.click(findTestObject('Page_giving.sgSign up now/button_sex dropdown'))

'choose male sex. change xpath div[3] to div[2] for female'
WebUI.click(findTestObject('Page_giving.sgSign up now/button_sex dropdown male'))

WebUI.click(findTestObject('Page_giving.sgSign up now/button_ethnicity dropdown'))

'choose ethnicity'
WebUI.click(findTestObject('Page_giving.sgSign up now/button_ethnicity dropdown chi'))

'set postal'
WebUI.setText(findTestObject('Page_giving.sgSign up now/inp_postal code'), inpPostal)

WebUI.delay(3)

'verify sign in bannerverify enter nric'
WebUI.takeScreenshotAsCheckpoint('6 signup inputs')

WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Continue_1'))

WebUI.delay(3)

'verify interest page\r\n'
WebUI.takeScreenshotAsCheckpoint('7 interest page')

'skip interest'
WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Skip'))

WebUI.delay(3)

'verify skills page\r\n'
WebUI.takeScreenshotAsCheckpoint('8 skills page')

WebUI.click(findTestObject('Page_giving.sgSign up now/button_exit signup'))

WebUI.delay(3)

'exiting signup'
WebUI.takeScreenshotAsCheckpoint('9 exit to main page')

WebUI.delay(3)

WebUI.closeBrowser()

