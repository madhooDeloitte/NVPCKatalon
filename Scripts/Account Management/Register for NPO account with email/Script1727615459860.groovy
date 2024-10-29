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

String envURL = 'http://uat.giving.sg'

//Charity name
String charityName = 'Supernova NPO 1'

//Public Enquiry number
String publicEnquiryNumber = '88884444'

//UEN
String uen = '230800483M'

//PostalCode
String postalCode = '018956'

//Bank account number
String bankAccountNumber = '1234567890'

//Bank code
String bankCode = '7375'

//Branch code
String branchCode = '001'

//Swift code
String swiftCode = 'UOVBSGSG'

//File path
String filePath = 'C:\\Users\\smadhoosudhan\\Downloads\\Katalon\\Test data\\Direct Credit Authorisation Form.pdf'

//NPO Admin Name
String npoAdminName = 'Supernova NPO 1 Admin'

//NPO Admin Email
String npoAdminEmail = 'supernova_npo1@mailto.plus'

//ops admin email
String opsAdminEmail = 'ops-admin-1-dkuat@mailto.plus'

//DK Finance Admin Email
String dkFinanceAdminEmail = 'DK_Finance_Admin_00_02@nvpc.dev'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/a_Registered charityIf you are an NPO or a _60997d'))

WebUI.click(findTestObject('Page_giving.sgSign up now/a_DownloadDCA'))

WebUI.click(findTestObject('Page_giving.sgSign up now/button_I understand_DCA'))

WebUI.click(findTestObject('Page_giving.sgSign up now/button_Sign up with email'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Organisation name_b4-b2-Input_CharityName'), 
    charityName)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_(65)_b4-b2-Input_PublicEnquiryNumber'), 
    publicEnquiryNumber)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_UEN_b4-b2-Input_UEN'), uen)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Postal code_b4-b2-Input_PostalCode'), 
    postalCode)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Next'))

WebUI.click(findTestObject('Page_giving.sgCharity registration/dropdownBank'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_UOB'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Bank account number_b4-b3-Input_Accou_8cb671'), 
    bankAccountNumber)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Bank code_b4-b3-Input_BankCode'), 
    bankCode)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Branch code_b4-b3-Input_BranchCode'), 
    branchCode)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Swift code_b4-b3-Input_SwiftCode'), 
    swiftCode)

WebUI.uploadFile(findTestObject('Page_giving.sgOrganisation registration/label_Upload file Input'), filePath)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Do you have a valid IPC status_b4-b3-_52578c'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/input_IPC_StartDate'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/span_18'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/dropdownSectorIndustry'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_MCCY'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/dropdownSectorIndustry'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/div_Animals'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/a_Arts, culture and heritage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/a_Adults'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/a_Animal welfare'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Full name_b4-b5-Input_FullName'), 
    npoAdminName)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Work email_b4-b5-Input_Email'), 
    npoAdminEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Password_b4-b5-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgCharity registration/input_Confirm password_b4-b5-Input_ConfirmPassword'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCharity registration/button_Go to homepage'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address'), opsAdminEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_3'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_4'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_6'), '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Home/Notification Icon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgNotifications/b_BobTheNPO'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration review/div_bobnpogmail.com_icon-box'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration review/a_View'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration preview/button_Download PDF'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration preview/button_Advance'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration preview/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration review/div_Finance Review27'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration review/img'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration review/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration review/button_Yes'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address'), dkFinanceAdminEmail)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_5'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Home/Notification Icon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgNotifications/b_BobTheNPO'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration review/div_bobnpogmail.com_icon-box_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration review/a_View'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration preview/button_Download PDF'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration preview/button_Approve'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration preview/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk NPO registration review/a_Organisations'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Organisations/img'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Organisations/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Organisations/button_Yes'))

WebUI.closeBrowser()

