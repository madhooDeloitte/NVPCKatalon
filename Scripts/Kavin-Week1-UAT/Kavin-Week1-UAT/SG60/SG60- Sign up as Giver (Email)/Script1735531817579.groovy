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

WebUI.navigateToUrl('https://dk.deloitte-sea.com/')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/a_Sign up'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/a_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/a_Individual giverDonate, fundraise, and vo_e0b666'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Sign up with email'))

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Full name_b5-b3-Input_GiverName'), 'Ferrero Rocher')

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Email_b5-b3-Input_Email'), 'frocher@dk.dev')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Date of birth_form-control OSFillPare_aaf11f'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Date of birth_form-control OSFillPare_aaf11f'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/signUpDate'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Password_b5-b3-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/i_Password_icon fa fa-eye fa-1x'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Confirm password_b5-b3-Input_ConfirmPassword'), 
    '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/i_Confirm password_icon fa fa-eye fa-1x'))

WebUI.click(findTestObject('Page_giving.sgGiver linking account/input_Confirm password_b5-b3-IsConsent_Checkbox'))

WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_An OTP has been sent to the email add_50c1c8'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_An OTP has been sent to the email add_747b5b'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_An OTP has been sent to the email add_94a906'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_An OTP has been sent to the email add_3c6129'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_An OTP has been sent to the email add_0844e5'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_An OTP has been sent to the email add_6c0a23'), 
    '6')

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_NRIC_b5-b5-Input_NRIC'), 'S9912345A')

WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Skip_Interests'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Skip_Skills'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'frocher@dk.dev')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

