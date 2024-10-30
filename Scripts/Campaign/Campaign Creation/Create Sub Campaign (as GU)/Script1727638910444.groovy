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

String envURL='https://dk.deloitte-sea.com/'

//GU email
String guEmail='skydownGU@mailto.plus'

//input Search fundraising
String inputSearchFundraising='kill'

//Search input 1
String inputSearch1 = 'testing approved campaign'

//Campaign title 1
String campaignTitle1='[AT] Sub-campaign as GU 1-1'

//Campaign description
String campaignDescription='TEST'

//Campaign image file path
String imageFilePath1 ='C:\\Users\\smadhoosudhan\\Downloads\\Stock Images\\running.jpg'
String imageFilePath2 ='C:\\Users\\smadhoosudhan\\Downloads\\Stock Images\\beach volleyball.jpg'

//home URL
String homeURL='https://dk.deloitte-sea.com/home'

//Search input 2
String inputSearch2 = '20240906 Update Campaign Goal'

//Campaign title 2
String campaignTitle2='[AT] Sub-campaign as GU 2-1'

//Search input 3
String inputSearch3 = '(DS) Campaign 0005'

//Campaign title 3
String campaignTitle3 ='[AT] Sub-campaign as GU 3-1'

//Search input 4
String inputSearch4 = '[AT] - Subcampaign test - Foreign campaign'

//Campaign title 4
String campaignTitle4 ='[AT] Sub-campaign as GU 4-1'

//npo email
String npoEmail = 'emma@kill-charity.com'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 
    guEmail)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Verify'))

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sg - admin Home/a_Audit log_icon-box'))

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgDonate/button_CAMPAIGNS_active'), 0)

WebUI.setText(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    inputSearch1)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/button_Search charities or campaigns_btn bt_5e785d'))

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.verifyElementText(findTestObject('Create sub campaign as org/Page_giving.sgDonate - testing approved campaign/div_Listing page_1st campaign_tax-deductible'), 
    'Tax-deductible')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate - testing approved campaign/div_Listing page_1st campaign'))

WebUI.switchToWindowIndex('1')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgCampaign detail - testing app_5c23c1/button_Fundraise for this'))

WebUI.takeScreenshotAsCheckpoint('6')

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign-verify text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/input_Campaign name_b3-b4-Input_CampaignTitle'), 
    campaignTitle1)

WebUI.setText(findTestObject('CampaignGoals/input__CampaignGoals'), '')

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Plus'))

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Minus'))

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Minus'))

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign-verify text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign'), 
    campaignDescription)

WebUI.takeScreenshotAsCheckpoint('7')

WebUI.verifyElementHasAttribute(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/inp_CampaignURL_autopopulated'), 
    'value', 0)

WebUI.executeJavaScript('alert(\'Please verify sub-campaign goal cannot exceed main campaign goal at this step.\');', null)

WebUI.delay(5)

WebUI.executeJavaScript('alert(\'Please rearrange images of campaign at this step.\');')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/label_Select file'), imageFilePath1 )

WebUI.uploadFile(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/label_Select file'), imageFilePath2 )

WebUI.takeScreenshotAsCheckpoint('8')

WebUI.executeJavaScript('alert(\'Please click view more action button and preview the youtube embedded link at this step.\');', 
    null)

WebUI.delay(15)

WebUI.takeScreenshotAsCheckpoint('9')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.takeScreenshotAsCheckpoint('10')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1'))

WebUI.takeScreenshotAsCheckpoint('11')

WebUI.verifyElementHasAttribute(findTestObject('Page_giving.sgEdit campaign/input_End date'), 'value', 0)

WebUI.executeJavaScript('alert(\'Please input relevant start/end date at this step.\');', null)

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('12')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1_2'))

WebUI.takeScreenshotAsCheckpoint('13')

WebUI.verifyElementText(findTestObject(null), 'The minimum amount claimable for tax deduction is set at ')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Save  preview'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('14')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/i_mobile preview'))

WebUI.takeScreenshotAsCheckpoint('15')

WebUI.scrollToElement(findTestObject('Page_giving.sgEdit campaign/span_About the campaign'), 0)

WebUI.takeScreenshotAsCheckpoint('16')

WebUI.scrollToElement(findTestObject('Page_giving.sgEdit campaign/span_Contact us'), 0)

WebUI.takeScreenshotAsCheckpoint('17')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/i_web preview'))

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Return to creation'))

WebUI.takeScreenshotAsCheckpoint('18')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Submit for approval'))

WebUI.takeScreenshotAsCheckpoint('19')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('20')

WebUI.navigateToUrl(homeURL)

WebUI.takeScreenshotAsCheckpoint('21')

WebUI.executeJavaScript('alert(\'Section 2 - fundraising to non-TDR campaign (NPO has IPC) at this step.\');', null)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.takeScreenshotAsCheckpoint('22')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgDonate/button_CAMPAIGNS_active'), 0)

WebUI.setText(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    inputSearch2)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/button_Search charities or campaigns_btn bt_5e785d'))

WebUI.takeScreenshotAsCheckpoint('23')

WebUI.verifyElementNotPresent(findTestObject('Create sub campaign as org/Page_giving.sgDonate - testing approved campaign/div_Listing page_1st campaign_tax-deductible'), 
    0)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate - testing approved campaign/div_Listing page_1st campaign'))

WebUI.switchToWindowIndex('2')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('24')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgCampaign detail - testing app_5c23c1/button_Fundraise for this'))

WebUI.takeScreenshotAsCheckpoint('25')

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign-verify text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/input_Campaign name_b3-b4-Input_CampaignTitle'), 
    campaignTitle2)

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Plus'))

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Minus'))

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Minus'))

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign-verify text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign'), 
    campaignDescription)

WebUI.takeScreenshotAsCheckpoint('26')

WebUI.verifyElementHasAttribute(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/inp_CampaignURL_autopopulated'), 
    'value', 0)

WebUI.executeJavaScript('alert(\'Please verify sub-campaign goal cannot exceed main campaign goal at this step.\');', null)

WebUI.delay(5)

WebUI.executeJavaScript('alert(\'Please rearrange images of campaign at this step.\');')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/label_Select file'), imageFilePath1 )

WebUI.uploadFile(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/label_Select file'), imageFilePath2 )

WebUI.takeScreenshotAsCheckpoint('27')

WebUI.executeJavaScript('alert(\'Please click view more action button and preview the youtube embedded link at this step.\');', 
    null)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.takeScreenshotAsCheckpoint('28')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1'))

WebUI.takeScreenshotAsCheckpoint('29')

WebUI.verifyElementHasAttribute(findTestObject('Page_giving.sgEdit campaign/input_End date'), 'value', 0)

WebUI.executeJavaScript('alert(\'Please input relevant start/end date at this step.\');', null)

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('30')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1_2'))

WebUI.takeScreenshotAsCheckpoint('31')

WebUI.verifyElementPresent(findTestObject('Page_giving.sgEdit campaign/div_Tax deduction not allowed'), 0)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Save  preview'))

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('32')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/i_mobile preview'))

WebUI.takeScreenshotAsCheckpoint('33')

WebUI.scrollToElement(findTestObject('Page_giving.sgEdit campaign/span_About the campaign'), 0)

WebUI.takeScreenshotAsCheckpoint('34')

WebUI.scrollToElement(findTestObject('Page_giving.sgEdit campaign/span_Contact us'), 0)

WebUI.takeScreenshotAsCheckpoint('35')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/i_web preview'))

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Return to creation'))

WebUI.takeScreenshotAsCheckpoint('36')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Submit for approval'))

WebUI.takeScreenshotAsCheckpoint('37')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.takeScreenshotAsCheckpoint('38')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Go to homepage'))

WebUI.navigateToUrl(homeURL)

WebUI.takeScreenshotAsCheckpoint('39')

WebUI.executeJavaScript('alert(\'Section 2 - NPO without IPC - fundraise at this step.\');', null)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.takeScreenshotAsCheckpoint('40')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgDonate/button_CAMPAIGNS_active'), 0)

WebUI.setText(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    inputSearch3)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/button_Search charities or campaigns_btn bt_5e785d'))

WebUI.takeScreenshotAsCheckpoint('41')

WebUI.verifyElementNotPresent(findTestObject('Create sub campaign as org/Page_giving.sgDonate - testing approved campaign/div_Listing page_1st campaign_tax-deductible'), 
    0)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate - testing approved campaign/div_Listing page_1st campaign'))

WebUI.switchToWindowIndex('3')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('42')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgCampaign detail - testing app_5c23c1/button_Fundraise for this'))

WebUI.takeScreenshotAsCheckpoint('43')

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign-verify text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/input_Campaign name_b3-b4-Input_CampaignTitle'), 
    campaignTitle3)

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Plus'))

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Minus'))

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Minus'))

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign-verify text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign'), 
    campaignDescription)

WebUI.takeScreenshotAsCheckpoint('44')

WebUI.verifyElementHasAttribute(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/inp_CampaignURL_autopopulated'), 
    'value', 0)

WebUI.executeJavaScript('alert(\'Please verify sub-campaign goal cannot exceed main campaign goal at this step.\');', null)

WebUI.delay(5)

WebUI.executeJavaScript('alert(\'Please rearrange images of campaign at this step.\');')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/label_Select file'), imageFilePath1 )

WebUI.uploadFile(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/label_Select file'), imageFilePath2 )

WebUI.takeScreenshotAsCheckpoint('45')

WebUI.executeJavaScript('alert(\'Please click view more action button and preview the youtube embedded link at this step.\');', 
    null)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.takeScreenshotAsCheckpoint('46')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1'))

WebUI.takeScreenshotAsCheckpoint('47')

WebUI.verifyElementHasAttribute(findTestObject('Page_giving.sgEdit campaign/input_End date'), 'value', 0)

WebUI.executeJavaScript('alert(\'Please input relevant start/end date at this step.\');', null)

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('48')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1_2'))

WebUI.takeScreenshotAsCheckpoint('49')

WebUI.verifyElementPresent(findTestObject('Page_giving.sgEdit campaign/div_Tax deduction not allowed'), 0)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Save  preview'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('50')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/i_mobile preview'))

WebUI.takeScreenshotAsCheckpoint('51')

WebUI.scrollToElement(findTestObject('Page_giving.sgEdit campaign/span_About the campaign'), 0)

WebUI.takeScreenshotAsCheckpoint('52')

WebUI.scrollToElement(findTestObject('Page_giving.sgEdit campaign/span_Contact us'), 0)

WebUI.takeScreenshotAsCheckpoint('53')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/i_web preview'))

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Return to creation'))

WebUI.takeScreenshotAsCheckpoint('54')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Submit for approval'))

WebUI.takeScreenshotAsCheckpoint('')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.takeScreenshotAsCheckpoint('55')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Go to homepage'))

WebUI.navigateToUrl(homeURL)

WebUI.takeScreenshotAsCheckpoint('56')

WebUI.executeJavaScript('alert(\'Section 2 - Foreign campaign - fundraise at this step.\');', null)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.takeScreenshotAsCheckpoint('57')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgDonate/button_CAMPAIGNS_active'), 0)

WebUI.setText(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    inputSearch4)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/button_Search charities or campaigns_btn bt_5e785d'))

WebUI.takeScreenshotAsCheckpoint('58')

WebUI.verifyElementNotPresent(findTestObject('Create sub campaign as org/Page_giving.sgDonate - testing approved campaign/div_Listing page_1st campaign_tax-deductible'), 
    0)

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate - testing approved campaign/div_Listing page_1st campaign'))

WebUI.switchToWindowIndex('4')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('59')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgCampaign detail - testing app_5c23c1/button_Fundraise for this'))

WebUI.takeScreenshotAsCheckpoint('60')

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign-verify text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/input_Campaign name_b3-b4-Input_CampaignTitle'), 
    campaignTitle4)

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Plus'))

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Minus'))

WebUI.click(findTestObject('CampaignGoals/button__btn btn-icon - Minus'))

WebUI.verifyElementPresent(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign-verify text'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/textarea_Describe your campaign'), 
    campaignDescription)

WebUI.takeScreenshotAsCheckpoint('61')

WebUI.verifyElementHasAttribute(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/inp_CampaignURL_autopopulated'), 
    'value', 0)

WebUI.executeJavaScript('alert(\'Please verify sub-campaign goal cannot exceed main campaign goal at this step.\');', null)

WebUI.delay(5)

WebUI.executeJavaScript('alert(\'Please rearrange images of campaign at this step.\');')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/label_Select file'), imageFilePath1 )

WebUI.uploadFile(findTestObject('Create sub campaign as org/Page_giving.sgEdit campaign/label_Select file'), imageFilePath2 )

WebUI.takeScreenshotAsCheckpoint('62')

WebUI.executeJavaScript('alert(\'Please click view more action button and preview the youtube embedded link at this step.\');', 
    null)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.takeScreenshotAsCheckpoint('63')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1'))

WebUI.takeScreenshotAsCheckpoint('64')

WebUI.verifyElementHasAttribute(findTestObject('Page_giving.sgEdit campaign/input_End date'), 'value', 0)

WebUI.takeScreenshotAsCheckpoint('65')

WebUI.executeJavaScript('alert(\'Please verify that only the "Local" campaign type option is shown at this step.\');', null)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Create new campaign/button_Next_1_2'))

WebUI.takeScreenshotAsCheckpoint('66')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Save  preview'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('67')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/i_mobile preview'))

WebUI.takeScreenshotAsCheckpoint('68')

WebUI.scrollToElement(findTestObject('Page_giving.sgEdit campaign/span_About the campaign'), 0)

WebUI.takeScreenshotAsCheckpoint('69')

WebUI.scrollToElement(findTestObject('Page_giving.sgEdit campaign/span_Contact us'), 0)

WebUI.takeScreenshotAsCheckpoint('70')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/i_web preview'))

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Return to creation'))

WebUI.takeScreenshotAsCheckpoint('71')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Submit for approval'))

WebUI.takeScreenshotAsCheckpoint('72')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.takeScreenshotAsCheckpoint('73')

WebUI.click(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgEdit campaign/button_Go to homepage'))

WebUI.navigateToUrl(homeURL)

WebUI.takeScreenshotAsCheckpoint('74')

WebUI.click(findTestObject('Page_giving.sg - admin Home/a_SwitchToAdminPortal'))

WebUI.click(findTestObject('Page_giving.sg - admin Home/span_Campaigns'))

WebUI.delay(2)

WebUI.takeScreenshotAsCheckpoint('75')

WebUI.executeJavaScript('alert(\'Please verify that the submitted sub campaigns are in the table and has status “Pending Approval” at this step.\');', 
    null)

WebUI.delay(5)

WebUI.executeJavaScript('alert(\'Section 2B - Verify created campaigns as NPO at this step.\');', null)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Campaigns/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Campaigns/a_Logout'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Campaigns/button_Yes'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogout/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress (1)'), 
    npoEmail)

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Log in (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/input_Password_b3-b9-Input_Password (1)'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.takeScreenshotAsCheckpoint('76')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Log in (1)'))

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.setText(findTestObject('null'), 
    '1')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgLogin/button_Verify (1)'))

WebUI.takeScreenshotAsCheckpoint('77')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Home/NotificationBell'))

WebUI.takeScreenshotAsCheckpoint('78')

WebUI.click(findTestObject('AdminMenuItems/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Campaigns/button_Fundraisers campaigns'))

WebUI.takeScreenshotAsCheckpoint('79')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/div_1st campaign request'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/a_Approve'))

WebUI.takeScreenshotAsCheckpoint('80')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/button_Approve'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/button_Campaigns'))

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sg - admin Campaigns/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/a_Logout'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sg - admin Manage giver campaigns/button_Yes'))

