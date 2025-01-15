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

String orgAdminEmail = 'rajeev@marriott.dk.dev'

String orgAdminPW = 'hJxcABFZyq6YA1kwHae0pw=='

String npoAdminEmail = 'linda@rhmc.dk.dev'

String npoAdminPW = 'hJxcABFZyq6YA1kwHae0pw=='

String subCampaignName = '11311 sub campaign 1'

String mainCampaignName = '11311 Main Campaign Test'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('1 main page')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), orgAdminEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), orgAdminPW)

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('2 login inputs')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_834fd0'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_a67e6b'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_138dc5'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_0322ef'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_acc042'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_1714ca'), '1')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('3 OTP inputs')

WebUI.sendKeys(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_1714ca'), Keys.chord(Keys.ENTER))

WebUI.delay(7)

WebUI.takeScreenshotAsCheckpoint('4 back to main page')

WebUI.click(findTestObject('Page_giving.sg - admin Home/i_Audit log_fa-solid fa-hand-holding-heart'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('5 switch giver portal')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('6 donate page')

WebUI.click(findTestObject('Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('7 campaigns page')

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), mainCampaignName)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('8 search campaign results')

WebUI.click(findTestObject('Page_giving.sgDonate - 11311 Main Campaign Test/div_11311 Main Campaign TestRonald McDonald_cccf51'))

WebUI.switchToWindowTitle('giving.sg : Campaign detail - 11311 Main Campaign Test')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('9 campaign tab switch')

WebUI.click(findTestObject('Page_giving.sgCampaign detail - 11311 Main _24cbb8/i_Stories_fa-solid fa-chart-area'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('10 view graph')

WebUI.click(findTestObject('Page_giving.sg - admin Home/a_Campaigns'))

WebUI.setText(findTestObject('Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), subCampaignName)

WebUI.sendKeys(findTestObject('Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('11 next campaign search')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/i_Emma Watsons_fa-solid fa-ellipsis-vertical'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('12 new campaign selected')

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/a_Edit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('13 edit campaign')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next_1'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next_1_2'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('14 continue edit campaign')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Use donation tiers'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Confirm'), 10)) {
    WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Confirm'))
}

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('15 donation tiers')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_tier 3_btn btn-icon'))

'input $1 '
WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b3-b1-b31-b13-Input_T_f2c879'), 
    '1')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('16 input $1 error')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b3-b1-b31-b13-Input_T_f2c879'), 
    '1000000')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('17 input $100000 error')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b3-b1-b31-b13-Input_T_f2c879'), 
    '10')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('18 blacklist input')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/div__icon-box'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b3-b1-b31-b13-Input_T_f2c879'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/textarea_Impact statement (Optional)_b3-b1-_1f3115'), 
    'attack')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next_1_2_3'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/label_donationtier'), 3)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('19 blacklist error msg')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/div__icon-box'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('20 removal of campaign')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/a_Remove'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next_1_2_3'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('21 submit changes for approval')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Submit for approval'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('22 confirm changes')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm_1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('23 changes confirmed')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Go to homepage'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('24 home page')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/i_Stories_fa-solid fa-chart-area'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('25 campaigns tab')

WebUI.click(findTestObject('Page_giving.sg - admin Home/a_Campaigns'))

WebUI.setText(findTestObject('Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), subCampaignName)

WebUI.sendKeys(findTestObject('Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('26 campaign search results')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/span_campaign title'))

WebUI.click(findTestObject('Page_giving.sg - admin Donation list/div_View your campaign'))

WebUI.switchToWindowTitle('giving.sg : Campaign detail - 11311 sub campaign 1')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('27 verify campaign new tab')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/img_Stories_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/div_Logout'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('28 logout ')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/button_Yes'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('29 logged out')

WebUI.click(findTestObject('Page_giving.sgLogout/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), npoAdminEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), npoAdminPW)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('30 log in admin')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_d79018'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_7486c3'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_bee238'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_57a46f'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_8c5c77'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_10ddaf'), '1')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('31 NPO admin OTP input')

WebUI.sendKeys(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_10ddaf'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Campaigns tab'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('32 admin campaign tab')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sg - admin Home/a_SwitchGiverPortal'), 3)

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/button_Fundraisers campaigns'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('33 fundaraisers tab')

//traverse to page with the campaign
//click on ellipsis
//click on review
'manual step: click more options and then review for 11311 sub camp 1'
WebUI.delay(30)

WebUI.takeFullPageScreenshotAsCheckpoint('34 select review for campaign')

WebUI.click(findTestObject('Page_giving.sg - admin Manage giver campaigns/a_Approve'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('35 confirm approval popup')

WebUI.click(findTestObject('Page_giving.sg - admin Manage giver campaigns/button_Approve'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Manage giver campaigns/div_Campaigns'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('36 campaigns tab ')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Manage giver campaigns/i_Invoices_fa-solid fa-hand-holding-heart'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('37 giver portal')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('38 donate page')

WebUI.click(findTestObject('Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), subCampaignName)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('39 campaign search results')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - 11311 sub campaign 1/div_11311 sub campaign 1Marriott Internatio_d711bb'))

WebUI.switchToWindowTitle('giving.sg : Campaign detail - 11311 sub campaign 1')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('40 donate using NPO account')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/img'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/button_Yes_1'))

WebUI.closeBrowser()

