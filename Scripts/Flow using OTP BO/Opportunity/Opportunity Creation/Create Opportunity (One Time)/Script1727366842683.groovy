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

String envURL = 'https://dk.deloitte-sea.com/'

//NPO email
String npoEmail = 'seantogetherone@mailto.plus'

//Opportunity name
String oppName = 'miaw'

//Opportunity description
String oppDesc = 'testing'

//Opportunity URL
String oppURL = 'miaw11'

//Image file path
String filePath = 'C:\\Users\\aahmedmahir\\Downloads\\cattt.jpg'

//postal code
String postalCode = '569933'

//Building name
String buildingName = 'building'

//Position title
String positionTitle = 'helper'

String positionDesc = 'helping'

//input search skills
String inputSearchSkills = 'account'

//Input other response
String inputOtherResponse = 'testing response'

String inputOtherInfo = 'testing info'

//Input position count
String inputPositionCount = '12'

//Input point of contact
String inputSearchContact = 'a'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), npoEmail)

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create Opportunity/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '1')

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('AdminMenuItems/a_Opportunities'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sgEdit opportunity/button_Create Opportunity'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next'))

WebUI.setText(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Opportunity name_b2-b1-b4-Input_Oppor_ac3d47'), 
    oppName)

WebUI.setText(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/textarea_OppDesc'), oppDesc)

WebUI.setText(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_URLOpportunity'), 
    oppURL)

WebUI.uploadFile(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/label_Select file'), 
    filePath)

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/a_Causes Chip 1'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sgEdit opportunity/a_Causes Chip 2'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/a_SuitableFor Chip 1'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next_1_2'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sgEdit opportunity/div_One_time_radio'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sgEdit opportunity/i_Add schedule'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Add'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Update'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/div_Please select'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/div_One day before'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sg - admin Create opportunity/a_PhysicalOn-site volunteering with time and venue'))

WebUI.click(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Postal code_b2-b6-Input_PostalCode'))

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Postal code_b2-b6-Input_PostalCode'), 
    postalCode)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Building name_b2-b6-Input_BuildingName'), 
    buildingName)

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input__b2-b6-Input_Floor'), '1')

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Unit_b2-b6-Input_UnitNumber'), '2')

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next_1_2_3'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sgEdit opportunity/i_Add position'))

WebUI.setText(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Position title_b2-b1-b7-Input_PositionTitle'), 
    positionTitle)

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Position title_b2-b1-b7-Input_PositionTitle'))

WebUI.setText(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/textarea_Let potential volunteers know what_58814e'), 
    positionDesc)

WebUI.click(findTestObject('Create Opportunity/Page_giving.sgEdit opportunity/a_ShowMoreInfo'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/div_Select'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sg - admin Create opportunity/input_Search preferred skills'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Opportunity/Page_giving.sg - admin Create opportunity/input_Search preferred skills'), 
    inputSearchSkills)

WebUI.sendKeys(findTestObject('Create Opportunity/Page_giving.sg - admin Create opportunity/input_Search preferred skills'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_(optional)_b2-b1-b7-Input_OtherResponses'), 
    inputOtherResponse)

WebUI.setText(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/textarea_Is there any other information vol_fffd39'), 
    inputOtherInfo)

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Turn on auto-approval_b2-b1-b7-AutoAp_fadfb2'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Auto-approve a volunteer when they me_334b32'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Minimum age is met_b2-b1-b7-b20-l1-42_9a34d6'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Required skills is met_b2-b1-b7-b20-l_d747f1'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Gender is female_b2-b1-b7-b20-l1-421__9c2e78'))

WebUI.click(findTestObject('Age picker/a_Add age'))

WebUI.click(findTestObject('Age picker/a_Add age'))

WebUI.click(findTestObject('Age picker/a_Add age'))

WebUI.click(findTestObject('Age picker/a_Minus Age'))

WebUI.click(findTestObject('Page_giving.sgEdit opportunity (1)/Required skills/input_check box Required skills 1'))

WebUI.click(findTestObject('Page_giving.sgEdit opportunity (1)/Required skills/input_check box Required skills 2'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Add position'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Not available_b2-b1-b8-l3-478_0-l3-47_610509'))

WebUI.setText(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_cat_b2-b1-b8-l3-478_0-l3-479_0-l3-480_d46518'), 
    inputPositionCount)

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Next_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Select which information you require__63a523'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Contact number_b2-b1-b9-Gender_Checkbox'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_Gender_b2-b1-b9-Dob_Checkbox'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_View members_b2-b1-b9-Switch_PrivateO_f37f99'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/input_View members_b2-b1-b9-Switch_PrivateO_f37f99'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sgEdit opportunity/div_PointOfContactDropdown'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sg - admin Create opportunity/input_Search point of contact'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Opportunity/Page_giving.sg - admin Create opportunity/input_Search point of contact'), 
    inputSearchContact)

WebUI.sendKeys(findTestObject('Create Opportunity/Page_giving.sg - admin Create opportunity/input_Search point of contact'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Publish'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Create Opportunity/Page_giving.sgEdit opportunity/button_Return to opportunity list'))
