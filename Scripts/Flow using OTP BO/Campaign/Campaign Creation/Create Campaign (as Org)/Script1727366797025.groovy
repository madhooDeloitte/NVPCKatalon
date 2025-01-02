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

//ORG email
String orgEmail = 'rajeev@marriott.dk.dev'

//input Search fundraising
String inputSearchFundraising = 'kill'

//Campaign title
String campaignTitle = '[AT] Create campaign as Org 1'

//Campaign description
String campaignDescription = 'TEST'

//Campaign image file path
String imageFilePath = 'C:\\Users\\smadhoosudhan\\Downloads\\Stock Images\\beach volleyball.jpg'

//Home URL
String homeURL = 'https://dk.deloitte-sea.com/home'

//NPO email
String npoEmail = 'emma@kill-charity.com'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 
    orgEmail)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '1')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('AdminMenuItems/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Campaigns/button_Create campaign'))

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sg - admin Create new campaign/div_FundraisingDropdown'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Campaign as Org/Page_giving.sg - admin Create new campaign/input_Search Fundraising'), 
    inputSearchFundraising)

WebUI.sendKeys(findTestObject('Create Campaign as Org/Page_giving.sg - admin Create new campaign/input_Search Fundraising'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/input_Campaign name_b3-b4-Input_CampaignTitle'), 
    campaignTitle)

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_CampaignGoals_Plus'))

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_CampaignGoals_Plus'))

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_CampaignGoals_Plus'))

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_CampaignGoals_Minus'))

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/textarea_Describe your campaign and the giv_ddfda1'), 
    campaignDescription)

WebUI.verifyElementHasAttribute(findTestObject('Create Campaign as Org/Page_giving.sg - admin Create new campaign/inp_CampaignURL'), 
    'value', 0)

WebUI.uploadFile(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/label_Select file'), 
<<<<<<< Updated upstream
    'C:\\Users\\assaravanan\\OneDrive - Deloitte (O365D)\\Pictures\\Example4.jpg')
=======
    imageFilePath)
>>>>>>> Stashed changes

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sgEdit opportunity/a_Causes Chip 1'))

WebUI.click(findTestObject('Create Opportunity/Page_giving.sgEdit opportunity/a_Causes Chip 2'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1'))

WebUI.executeJavaScript('alert(\'Please perform manual checks at this step.\');', null)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/input_Start date_form-control OSFillParent _904945'))

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/span_30'))

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sg - admin Create new campaign/input_End date_form-control OSFillParent _904945'))

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/span_30'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Submit for approval'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Go to homepage'))

WebUI.navigateToUrl(homeURL)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgWelcome to Giving.sg  The one_022050/a_AdminView-GraphIcon'))

WebUI.click(findTestObject('AdminMenuItems/a_Campaigns'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Campaigns/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Campaigns/a_Logout'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Campaigns/button_Yes'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogout/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress (1)'), 
    npoEmail)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Log in (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/input_Password_b3-b9-Input_Password (1)'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Log in (1)'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '1')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Verify (1)'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Home/NotificationBell'))

WebUI.click(findTestObject('AdminMenuItems/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Campaigns/button_Fundraisers campaigns'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/div_1st campaign request'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/a_Approve'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/button_Approve'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/button_Campaigns'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/div_Invoices_b1-b5'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/a_Logout'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/button_Yes'))
