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

WebUI.navigateToUrl('https://uat.giving.sg/')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Sign up (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/div_If you are an NPO or a registered chari_594028'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/div_Download form (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/button_I understand (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/button_Sign up with email (1)'))

WebUI.setText(findTestObject('Page_giving.sgCharity registration/input_Organisation name_b4-b2-Input_CharityName (1)'), 
    'NPO Katalon Test ')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_(65)_b4-b2-Input_PublicEnquiryNumber (1)'), 
    '93607896')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_UEN_b4-b2-Input_UEN (1)'), '20195682A')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Website URL_b4-b2-Input_Website'), 
    'testurl.com')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Postal code_b4-b2-Input_PostalCode (1)'), 
    '680680')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input__b4-b2-Input_Floor (1)'), '2')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Unit_b4-b2-Input_Unit (1)'), '2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Next (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_- (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_POSBDBS (1)'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Bank account number_b4-b3-Input_Accou_8cb671 (1)'), 
    '125567890')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Bank code_b4-b3-Input_BankCode (1)'), 
    '7171')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Branch code_b4-b3-Input_BranchCode (1)'), 
    '095')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Swift code_b4-b3-Input_SwiftCode (1)'), 
    'DBSSSSGX')

WebUI.uploadFile(findTestObject('FileUpload/Page_giving.sgCharity registration/label_Upload file'), 'C:\\Users\\smadhoosudhan\\Downloads\\DirectCreditAuthorisationForm.pdf')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Do you have a valid IPC status_b4-b3-_52578c (1)'))

WebUI.click(findTestObject('Page_giving.sgCharity registration/div_IPC issue date_b4-b3-b17-b1-Icon'))

String newStartDate = '2024-04-01'

WebUI.modifyObjectProperty(findTestObject('Page_giving.sgCharity registration/div_IPC issue date_b4-b3-b17-b1-Icon - Copy'), 
    'value', 'equals', newStartDate, true)

String newEndDate = '2024-04-30'

WebUI.modifyObjectProperty(findTestObject('Page_giving.sgCharity registration/div_IPC end date_b4-b3-b20-b1-Icon - Copy'), 
    'value', 'equals', newEndDate, true)

WebUI.click(findTestObject('Page_giving.sgCharity registration/div_IPC end date_b4-b3-b20-b1-Icon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Next (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_- (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_MCCY (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_- (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_Overseas humanitarian aid'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_Animals'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_Animal welfare (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_Foreign workers'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Next (1)'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Full name_b4-b5-Input_FullName (1)'), 
    'Test name')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Work email_b4-b5-Input_Email (1)'), 
    'test@uat.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Password_b4-b5-Input_Password (1)'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Confirm password_b4-b5-Input_ConfirmPassword (1)'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_Password_b4-b5-b17-b1-b1-Icon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/i_Password_icon fa fa-eye fa-1x'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Confirm password_b4-b5-Input_ConfirmPassword (1)'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Submit (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Confirm (1)'))

