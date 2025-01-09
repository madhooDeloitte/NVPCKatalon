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

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), giverEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq4oD3Y625LFBg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/div_My activities'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/span_Fundraise'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), fundraiserName)

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/i_0 raised of  4,000_fa-solid fa-ellipsis-vertical'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/a_Edit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('4')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Confirm'), 10)) {
    WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Confirm'))
}

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/i_test2_icon fa fa-plus fa-1x'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Donation amount_b2-b2-b31-b14-Input_T_7bdb71'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Donation amount_b2-b2-b31-b14-Input_T_7bdb71'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Donation amount_b2-b2-b31-b14-Input_T_7bdb71'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/textarea_Impact statement (Optional)_b2-b2-_5ff537'), 
    'Attack')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'), 3)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('9')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2_3'), 3)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2_3'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'), 3)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('10')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/i__fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/a_Remove'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('11')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/label_donationtier'), 3)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Submit for approval'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('12')

WebUI.delay(30)

//Recaptcha

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm_1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('13')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Go to homepage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/div_My activities'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/span_Fundraise'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), fundraiserName)

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)
WebUI.takeScreenshotAsCheckpoint('14')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/span_Donate'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.setText(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    fundraiserName)

WebUI.sendKeys(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - giver fundraiser - n_468728/span_giver fundraiser - npo with ipc'))

WebUI.switchToWindowTitle('giving.sg : Campaign detail - giver fundraiser - npo with ipc')

//WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/div_Donate'))
WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgCampaign detail/span_Donate now_Tier'), 
    3)

WebUI.takeFullPageScreenshotAsCheckpoint('15')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), npoAdminEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), npoAdminPW)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('16')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_d79018'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_7486c3'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_bee238'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_57a46f'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_8c5c77'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_10ddaf'), '1')

WebUI.sendKeys(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_10ddaf'), Keys.chord(Keys.ENTER))

WebUI.delay(7)

WebUI.takeFullPageScreenshotAsCheckpoint('17')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Campaigns tab'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('18')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/span_menu items'), 3)

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/button_Fundraisers campaigns'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('19')

WebUI.delay(30)

//traverse to page with the campaign
//click on ellipsis
//click on review
WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('20')

WebUI.click(findTestObject('Page_giving.sg - admin Manage giver campaigns/a_Approve'))

WebUI.click(findTestObject('Page_giving.sg - admin Manage giver campaigns/button_Approve'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Manage giver campaigns/div_Campaigns'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('21')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Manage giver campaigns/i_Invoices_fa-solid fa-hand-holding-heart'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.click(findTestObject('Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), fundraiserName)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('22')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - 11311 sub campaign 1/div_11311 sub campaign 1Marriott Internatio_d711bb'))

WebUI.switchToWindowTitle(campaignWindowName)

WebUI.scrollToElement(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgCampaign detail/span_Donate now_Tier'),
	3)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('23')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/img'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - 11311 sub c_fd8e7a/button_Yes_1'))

WebUI.closeBrowser()

