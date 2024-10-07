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

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050 (2)/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050 (2)/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (2)/input_Email address_b3-b9-Input_EmailAddress'), 
    'seanGUtogether1@mailto.plus')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (2)/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin (2)/input_Password_b3-b9-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (2)/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (2)/input_If the account exists, you will recei_834fd0'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (2)/input_If the account exists, you will recei_a67e6b'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (2)/input_If the account exists, you will recei_138dc5'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (2)/input_If the account exists, you will recei_0322ef'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (2)/input_If the account exists, you will recei_acc042'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (2)/input_If the account exists, you will recei_1714ca'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (2)/button_Verify'))

WebUI.click(findTestObject('AdminMenuItems/a_Opportunities'))

WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/div_Filters'))

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/input_Active_Checkbox'))

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/input_One_time_radio'))

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/button_Apply'))

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/i_First_Opportunity_action'))

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/a_Duplicate'))

WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Opportunity name_b2-b1-b4-Input_Oppor_ac3d47'), 
    'dupe Collab Opp')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/textarea_OppDesc'), 'qqqa')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_URLOpportunity'), 'dupe-Collab-Opp2')

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/label_Select file'), 'C:\\Users\\aahmedmahir\\Downloads\\cattt.jpg')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Next'))

WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Causes 2 Chips/a_Causes Chip 3'))

WebUI.click(findTestObject('Causes 2 Chips/a_Causes Chip 4'))

WebUI.click(findTestObject('Page_giving.sgEdit opportunity (1)/a_SuitableFor Chip 2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Next_1'))

WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Page_giving.sgEdit opportunity (1)/i_Add schedule'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/div_Please select'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/div_One day before'))

WebUI.click(findTestObject('Page_giving.sg - admin Create opportunity (1)/a_PhysicalOn-site volunteering with time and venue'))

WebUI.click(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Postal code_b2-b6-Input_PostalCode'))

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Postal code_b2-b6-Input_PostalCode'), 
    '569933')

WebUI.delay(3)

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Building name_b2-b6-Input_BuildingName'), 
    'mew')

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input__b2-b6-Input_Floor'), '1')

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Unit_b2-b6-Input_UnitNumber'), '2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Next_1_2'))

WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Page_giving.sgEdit opportunity (1)/i_Add position'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Position title_b2-b1-b7-Input_PositionTitle'), 
    'cat')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Position title_b2-b1-b7-Input_PositionTitle'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/textarea_Let potential volunteers know what_58814e'), 
    'c')

WebUI.click(findTestObject('Page_giving.sgEdit opportunity (1)/a_ShowMoreInfo'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/div_Select'))

WebUI.click(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Search preferred skills'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Search preferred skills'), 'account')

WebUI.sendKeys(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Search preferred skills'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_(optional)_b2-b1-b7-Input_OtherResponses'), 
    'aaa')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/textarea_Is there any other information vol_fffd39'), 
    'a')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Turn on auto-approval_b2-b1-b7-AutoAp_fadfb2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Auto-approve a volunteer when they me_334b32'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Minimum age is met_b2-b1-b7-b20-l1-42_9a34d6'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Required skills is met_b2-b1-b7-b20-l_d747f1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Gender is female_b2-b1-b7-b20-l1-421__9c2e78'))

WebUI.click(findTestObject('Age picker/a_Add age'))

WebUI.click(findTestObject('Age picker/a_Add age'))

WebUI.click(findTestObject('Age picker/a_Add age'))

WebUI.click(findTestObject('Age picker/a_Minus Age'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/Required skills/input_check box Required skills 1'))

WebUI.click(findTestObject('Page_giving.sgEdit opportunity (1)/Required skills/input_check box Required skills 2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Add position'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Next_1_2_3'))

WebUI.takeFullPageScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Not available_b2-b1-b8-l3-478_0-l3-47_610509'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_cat_b2-b1-b8-l3-478_0-l3-479_0-l3-480_d46518'), 
    '12')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Next_1_2_3_4'))

WebUI.takeFullPageScreenshotAsCheckpoint('9')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Select which information you require__63a523'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Contact number_b2-b1-b9-Gender_Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_Gender_b2-b1-b9-Dob_Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_View members_b2-b1-b9-Switch_PrivateO_f37f99'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/input_View members_b2-b1-b9-Switch_PrivateO_f37f99'))

WebUI.click(findTestObject('Page_giving.sgEdit opportunity (1)/div_PointOfContactDropdown'))

WebUI.click(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Search point of contact'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Search point of contact'), 'a')

WebUI.sendKeys(findTestObject('Page_giving.sg - admin Create opportunity (1)/input_Search point of contact'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Publish'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit opportunity (1)/button_Return to opportunity list'))

WebUI.takeFullPageScreenshotAsCheckpoint('10')

