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

String envURL = 'https://dk.deloitte-sea.com/home'

//Giver name
String giverName = 'BobGiver1'

//giver email
String giverEmail = 'bobgiver1@gmail.com'

//NRIC
String NRIC = 'S4930168E'

//Mobile number
String mobileNumber = '88884444'

//postal code
String postalCode = '018956'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/GiverSignUpBanner'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Sign up with email'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Full name_b5-b3-Input_GiverName'), 
    giverName)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Email_b5-b3-Input_Email'), giverEmail)

WebUI.click(findTestObject('Page_giving.sgGiver linking account/input_CalenderDate'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/span_19'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Password_b5-b3-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Confirm password_b5-b3-Input_ConfirmPassword'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Confirm password_b5-b3-IsConsent_Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_3'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_4'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_5'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_6'), '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Verify'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_NRIC_b5-b5-Input_NRIC'), NRIC)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_(65)_b5-b5-Input_MobileNumber'), 
    mobileNumber)

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_ChooseSex'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_Male'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_ChooseEthnicity'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_CHINESE'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Postal code_b5-b5-Input_PostalCode'), 
    postalCode)

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Adults'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Animal welfare'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Animals'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Arts, culture and heritage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Caregivers'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue_1_2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Accounting and finance'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Start your giving journey'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address'), giverEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.closeBrowser()

