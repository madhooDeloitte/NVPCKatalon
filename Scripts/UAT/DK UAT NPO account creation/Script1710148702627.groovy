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

WebUI.navigateToUrl('https://uat.giving.sg/home')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject(null))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/div_Registered charity'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/div_Download form'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/button_I understand'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/button_Sign up with email'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Organisation name_b4-b2-Input_CharityName'), 
    'test name 13')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_(65)_b4-b2-Input_PublicEnquiryNumber'), 
    '98573829')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_UEN_b4-b2-Input_UEN'), '20198335A')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Postal code_b4-b2-Input_PostalCode'), 
    '680680')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input__b4-b2-Input_Floor'), '02')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Unit_b4-b2-Input_Unit'), '02')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_-'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_POSBDBS'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Bank account number_b4-b3-Input_Accou_8cb671'), 
    '125574850')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Bank code_b4-b3-Input_BankCode'), 
    '7171')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Branch code_b4-b3-Input_BranchCode'), 
    '095')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Swift code_b4-b3-Input_SwiftCode'), 
    'DBSSSGSG')

WebUI.uploadFile(findTestObject('FileUpload/Page_giving.sgCharity registration/label_Upload file'), 'C:\\Users\\smadhoosudhan\\Downloads\\DirectCreditAuthorisationForm.pdf')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_DirectCreditAuthorisationForm.pdf'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Do you have a valid IPC status_b4-b3-_52578c'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/input_IPC issue date_form-control OSFillPar_396fb7'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/input_IPC issue date_form-control OSFillPar_396fb7'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_31'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Next'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_-'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_MCCY'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_-'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_Other overseas causes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/a_Arts, culture and heritage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_DisasterCrisis victims'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_Elderly'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Full name_b4-b5-Input_FullName'), 
    'test name 12')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Work email_b4-b5-Input_Email'), 
    'test@uat.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Password_b4-b5-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Confirm password_b4-b5-Input_ConfirmPassword'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_Thank you for registering with us'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Go to homepage'))

WebUI.closeBrowser()

