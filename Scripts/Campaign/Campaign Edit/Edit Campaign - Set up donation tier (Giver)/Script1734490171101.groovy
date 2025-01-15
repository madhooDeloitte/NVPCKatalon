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

String envURL = 'https://dk.deloitte-sea.com/home'

String giverEmail = 'michaelscott@dundermifflin.dk.dev'

String fundraiserName = 'giver fundraiser - npo with ipc'

String npoAdminEmail = 'linda@rhmc.dk.dev'

String npoAdminPW = 'hJxcABFZyq6YA1kwHae0pw=='

String campaignWindowName = 'giving.sg : Campaign detail - giver fundraiser - npo with ipc'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('1 main page')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), giverEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq4oD3Y625LFBg==')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('2 giver login input')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(7)

WebUI.takeScreenshotAsCheckpoint('3 back to main page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/div_ProfileIcon'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('4 my activities tab')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/div_My activities'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('5 my activities page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/span_Fundraise'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('6 fundraisers tab')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), fundraiserName)

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('7 search sub campaign')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/i_0 raised of  4,000_fa-solid fa-ellipsis-vertical'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('8 click to edit')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/a_Edit'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('9 fundraiser edit page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'))

WebUI.delay(3)

'1.7 edit campaign tiers'
WebUI.takeScreenshotAsCheckpoint('10 donation tiers')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Confirm'), 10)) {
    WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Confirm'))
}

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/i_test2_icon fa fa-plus fa-1x'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Donation amount_b2-b2-b31-b14-Input_T_7bdb71'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('11 donation $1 fail')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Donation amount_b2-b2-b31-b14-Input_T_7bdb71'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('12 donation $100001 fail')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Donation amount_b2-b2-b31-b14-Input_T_7bdb71'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/textarea_Impact statement (Optional)_b2-b2-_5ff537'), 
    'Attack')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2_3'), 3)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('13 blacklisted word error')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/i__fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/a_Remove'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('14 remove')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/label_donationtier'), 3)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('15 use donation tiers')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2_3'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('16 submit for approval')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Submit for approval'))

WebUI.delay(20)

'click after the capcha'
WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm_1'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('17 post capcha')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Go to homepage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/div_ProfileIcon'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('18 return to activities')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/div_My activities'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/span_Fundraise'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), fundraiserName)

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('19 search for fundraiser again')

//WebUI.takeScreenshot('11')
//WebUI.takeFullPageScreenshotAsCheckpoint('11')
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/span_Donate'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('20 verify changes are not live')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.setText(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    fundraiserName)

WebUI.sendKeys(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('21 search fundraiser')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - giver fundraiser - n_468728/span_giver fundraiser - npo with ipc'))

WebUI.switchToWindowTitle('giving.sg : Campaign detail - giver fundraiser - npo with ipc')

//WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/div_Donate'))
WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now_Tier'), 
    3)

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('22 donation tiers')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/div_Logout'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('23 logout giver')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), npoAdminEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), npoAdminPW)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('24 login npo admin')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_d79018'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_7486c3'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_bee238'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_57a46f'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_8c5c77'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_10ddaf'), '1')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('25 npo OTP inputs')

WebUI.sendKeys(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_10ddaf'), Keys.chord(Keys.ENTER))

WebUI.delay(7)

WebUI.takeFullPageScreenshotAsCheckpoint('26 admin homepage')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Campaigns tab'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('27 campaigns tab')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/span_menu items'), 3)

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/button_Fundraisers campaigns'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('28 fundraiser campaign')

'choose the campaign used by the 3 dots'
WebUI.delay(20)

'choose the review option to be brought to another tab'
WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('29 select the more option')

WebUI.click(findTestObject('Page_giving.sg - admin Manage giver campaigns/a_Approve'))

WebUI.click(findTestObject('Page_giving.sg - admin Manage giver campaigns/button_Approve'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('30 approval of campaign')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Manage giver campaigns/div_Campaigns'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('31 campaigns tab')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Manage giver campaigns/i_Invoices_fa-solid fa-hand-holding-heart'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('32 invoices tab')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.click(findTestObject('Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('33 campaigns tab')

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), fundraiserName)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('34 campaign search')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - 11311 sub campaign 1/div_11311 sub campaign 1Marriott Internatio_d711bb'))

WebUI.switchToWindowTitle(campaignWindowName)

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('35 check campaign tab')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/img'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/button_Yes_1'))

WebUI.closeBrowser()

