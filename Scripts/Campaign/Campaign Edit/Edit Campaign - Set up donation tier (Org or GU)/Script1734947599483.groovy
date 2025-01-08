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

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), orgAdminEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), orgAdminPW)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_834fd0'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_a67e6b'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_138dc5'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_0322ef'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_acc042'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_1714ca'), '1')

WebUI.sendKeys(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_1714ca'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_giving.sg - admin Home/i_Audit log_fa-solid fa-hand-holding-heart'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.click(findTestObject('Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), mainCampaignName)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_giving.sgDonate - 11311 Main Campaign Test/div_11311 Main Campaign TestRonald McDonald_cccf51'))

WebUI.switchToWindowTitle('giving.sg : Campaign detail - 11311 Main Campaign Test')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Page_giving.sgCampaign detail - 11311 Main _24cbb8/i_Stories_fa-solid fa-chart-area'))

WebUI.click(findTestObject('Page_giving.sg - admin Home/a_Campaigns'))

WebUI.setText(findTestObject('Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), subCampaignName)

WebUI.sendKeys(findTestObject('Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/i_Emma Watsons_fa-solid fa-ellipsis-vertical'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/a_Edit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next_1'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Use donation tiers'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Confirm'),10)) {
	WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Confirm'))
	}
	
WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_tier 3_btn btn-icon'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b3-b1-b31-b13-Input_T_f2c879'), 
    '1')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b3-b1-b31-b13-Input_T_f2c879'), 
    '1000000')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b3-b1-b31-b13-Input_T_f2c879'),
	'10')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/div__icon-box'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b3-b1-b31-b13-Input_T_f2c879'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/textarea_Impact statement (Optional)_b3-b1-_1f3115'), 
    'attack')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next_1_2_3'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/label_donationtier'),
	3)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('9')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/div__icon-box'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/a_Remove'))

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Submit for approval'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('10')

WebUI.click(findTestObject('Page_giving.sg - admin Edit campaign/button_Confirm_1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('11')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Go to homepage'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('12')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/i_Stories_fa-solid fa-chart-area'))

WebUI.click(findTestObject('Page_giving.sg - admin Home/a_Campaigns'))

WebUI.setText(findTestObject('Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), subCampaignName)

WebUI.sendKeys(findTestObject('Page_giving.sg - admin Campaigns/input_Search campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/span_campaign title'))

WebUI.click(findTestObject('Page_giving.sg - admin Donation list/div_View your campaign'))

WebUI.switchToWindowTitle('giving.sg : Campaign detail - 11311 sub campaign 1')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('13')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/img_Stories_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/button_Yes'))

WebUI.click(findTestObject('Page_giving.sgLogout/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), npoAdminEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), npoAdminPW)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('14')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_d79018'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_7486c3'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_bee238'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_57a46f'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_8c5c77'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_10ddaf'), '1')

WebUI.sendKeys(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_10ddaf'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Campaigns tab'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('15')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sg - admin Home/a_SwitchGiverPortal'),
	3)

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/button_Fundraisers campaigns'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('16')

//traverse to page with the campaign

//click on ellipsis

//click on review


WebUI.delay(30)

WebUI.takeFullPageScreenshotAsCheckpoint('17')

WebUI.click(findTestObject('Page_giving.sg - admin Manage giver campaigns/a_Approve'))

WebUI.click(findTestObject('Page_giving.sg - admin Manage giver campaigns/button_Approve'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Manage giver campaigns/div_Campaigns'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('18')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Manage giver campaigns/i_Invoices_fa-solid fa-hand-holding-heart'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.click(findTestObject('Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), subCampaignName)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('19')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - 11311 sub campaign 1/div_11311 sub campaign 1Marriott Internatio_d711bb'))

WebUI.switchToWindowTitle('giving.sg : Campaign detail - 11311 sub campaign 1')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('20')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/img'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/button_Yes_1'))

WebUI.closeBrowser()

