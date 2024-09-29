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

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/a_OrganisationBond your workforce together _a50e8c'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/a_DownloadLOA'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/button_I understand_LOA'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/button_Sign up with email'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Organisation name_b4-b2-Input_OrgName'), 
    'BobOrg')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/dropdown'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/div_Government Body'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_(65)_b4-b2-Input_PublicEnquiryNumber'), 
    '88884444')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_UEN_b4-b2-Input_UEN'), '201912345D')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Postal code_b4-b2-Input_PostalCode'), 
    '018956')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input__b4-b2-Input_Floor'), '3')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Unit_b4-b2-Input_Unit'), '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/EmployeeChips/a_11-50 employees'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Make Organisation private_b4-b2-Switch1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/button_Next'))

WebUI.uploadFile(findTestObject('Page_giving.sgOrganisation registration/label_Upload file Input'), 'C:\\Users\\assaravanan\\OneDrive - Deloitte (O365D)\\Documents\\Free_Test_Data_1MB_PDF.pdf')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Full name_b4-b4-Input_FullName'), 
    'BobTheBuilder')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Work email_b4-b4-Input_Email'), 
    'bob@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Password_b4-b4-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Confirm password_b4-b4-Input_ConfirmPassword'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.closeBrowser()

