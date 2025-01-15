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
fullName = 'abrahamslee'

'change this every run or go into admin accnt and delete used account'
emailName = 'abes@gmail.com'

'NRIC for signup'
NRICname = 'S9812345A'

'mobile number for signup'
inpMobile = '91234567'

'postal code for signup'
inpPostal = '018956'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

'verify main menu\r\n'
WebUI.takeScreenshotAsCheckpoint('1 main menu')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.delay(3)

'verify donate now page\r\n'
WebUI.takeScreenshotAsCheckpoint('2 donate now page')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.delay(3)

'verify sign in banner\r\n'
WebUI.takeScreenshotAsCheckpoint('3 verify sign up banner')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/a_Sign up'))

WebUI.delay(3)

'verify on sign-up page'
WebUI.takeScreenshotAsCheckpoint('4 verify sign up page')

WebUI.click(findTestObject('Page_giving.sgSign up now/button_exit signup'))

WebUI.delay(3)

'verify back to original page (does not go to donation selection)'
WebUI.takeScreenshotAsCheckpoint('5 verify back button to main page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.delay(3)

'verify donate now page'
WebUI.takeScreenshotAsCheckpoint('6 donate now page')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.delay(3)

'verify donation selection page\r\n\r\n'
WebUI.takeScreenshotAsCheckpoint('7 donation selection page')

WebUI.click(findTestObject('Page_giving.sgSign up now/button_giving home sign up banner'))

WebUI.delay(3)

'verify on choose giver page\r\n'
WebUI.takeScreenshotAsCheckpoint('8 choose giver type page')

WebUI.click(findTestObject('Page_giving.sgSign up now/button_giver signup'))

WebUI.delay(3)

'verify on create account page'
WebUI.takeScreenshotAsCheckpoint('9 account creation page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Sign up with email'))

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Full name_b5-b3-Input_GiverName'), fullName)

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Email_b5-b3-Input_Email'), emailName)

'click date box'
WebUI.click(findTestObject('Page_giving.sgSign up now/inp_signup dob'), FailureHandling.STOP_ON_FAILURE)

'click first date available\r\n'
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Date of birth'))

'Change this to change password\r\n'
WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Password_b5-b3-Input_Password'), 'r6H/uPCyCbShd/Hiw/HUdA==')

WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Confirm password_b5-b3-Input_ConfirmPassword'), 
    'r6H/uPCyCbShd/Hiw/HUdA==')

WebUI.click(findTestObject('Page_giving.sgSign up now/chk_confirm checkbox'))

WebUI.delay(3)

'verify signup filled'
WebUI.takeScreenshotAsCheckpoint('10 signup inputs filled')

WebUI.click(findTestObject('Page_giving.sgSign up now/button_continue finish signup'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '2')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '3')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '4')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '5')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '6')

WebUI.delay(3)

'verify otp filled'
WebUI.takeScreenshotAsCheckpoint('11 signup otp filled')

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
WebUI.takeScreenshotAsCheckpoint('12 signup inputs')

WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Continue_1'))

WebUI.delay(3)

'verify interest page\r\n'
WebUI.takeScreenshotAsCheckpoint('13 interest page')

'skip interest'
WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Skip'))

WebUI.delay(3)

'verify skills page\r\n'
WebUI.takeScreenshotAsCheckpoint('14 skills page')

'skip skills'
WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Skip'))

WebUI.delay(5)

'verify thank you for sign up page'
WebUI.takeScreenshotAsCheckpoint('15 thank you for signup')

WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_start your giving'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), emailName)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'r6H/uPCyCbShd/Hiw/HUdA==')

WebUI.delay(3)

'verify login works\r\n'
WebUI.takeScreenshotAsCheckpoint('16 verify login details')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(5)

'verify logged in on home page\r\n'
WebUI.takeScreenshotAsCheckpoint('17 logged in homepage')

