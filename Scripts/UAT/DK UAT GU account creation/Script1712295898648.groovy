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

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/div_Groundup'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/button_Sign up with email'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Groundup name_b4-b2-Input_GUName'), 
    'Test groundup 5')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_(65)_b4-b2-Input_PublicEnquiryNumber'), 
    '68686868')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Is Groundup a part of a parent organisation_b4-b2-Switch1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/span_Overseas Singaporean Unit, MCCY'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Website URL_b4-b2-Input_Website'), 
    'testwebsite.com')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Make Groundup private_b4-b2-Switch2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Full name_b4-b3-Input_FullName'), 
    'test gu name')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Work email_b4-b3-Input_Email'), 
    'testgu@org.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Password_b4-b3-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgOrganisation registration/input_Confirm password_b4-b3-Input_ConfirmPassword'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOrganisation registration/div_We are reviewing your application, you _d5361c'))

WebUI.closeBrowser()

