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

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address'), 'emma@kill-charity.com')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '2')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '3')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '4')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '5')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '6')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_Campaigns'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/tbl_Campaign - Ongoing'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/tbl_Campaign - Ongoing'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_History'))

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/tbl_Campaign - History'))

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/tbl_Campaign - History'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Campaigns'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), 
    'test')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/div_Filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/div_Latest'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/div_Ending soon'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/input_Start date'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/span_1'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/input_End date'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/span_30 - js'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/input_All_b2-RadioGroup1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/input_Rejected_b2-b23-l1-159_4-Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/div_Filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Clear all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/i_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/a_End'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/div_Emma Watsons_icon-box_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/a_Delete'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Cancel'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), 
    'test')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/span_testing approved campaign name'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Donation list/div_View your campaign'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Donation list/span_Reports'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/div_Select type'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/div_Donation by period'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/input_Date range_form-control OSFillParent _76fc0c'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/span_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/span_26'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/button_Generate report'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/a_Download'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/div_Select type'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/div_Donation by campaign'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/div_Select a campaign'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/span_KILL all hate against animals'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/button_Generate report'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/a_Download'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/img_Invoices_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Reports/button_Yes'))

WebUI.closeBrowser()

