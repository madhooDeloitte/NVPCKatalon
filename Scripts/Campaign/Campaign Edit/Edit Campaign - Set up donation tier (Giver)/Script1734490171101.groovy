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

//WebUI.takeScreenshot('1')
//
//WebUI.takeFullPageScreenshotAsCheckpoint('1')
//WebUI.takeElementScreenshotAsCheckpoint('1', findTestObject('Object Repository/Page_giving.sgGiver activities/span_Fundraise'))
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/i_0 raised of  4,000_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/a_Edit'))

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'))

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/i_test2_icon fa fa-plus fa-1x'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Donation amount_b2-b2-b31-b14-Input_T_7bdb71'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Donation amount_b2-b2-b31-b14-Input_T_7bdb71'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Donation amount_b2-b2-b31-b14-Input_T_7bdb71'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/textarea_Impact statement (Optional)_b2-b2-_5ff537'), 
    'Attack')

WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2_3'),
	3)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'), 
    3)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/i__fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/a_Remove'))

WebUI.takeFullPageScreenshotAsCheckpoint('8')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgEdit campaign/label_donationtier'),
	3)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Use donation tiers'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Submit for approval'))

WebUI.takeFullPageScreenshotAsCheckpoint('9')

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Confirm_1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('10')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Go to homepage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/div_My activities'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/span_Fundraise'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), fundraiserName)

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgGiver activities/input_Search activity_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

//WebUI.takeScreenshot('11')
//WebUI.takeFullPageScreenshotAsCheckpoint('11')
WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver activities/span_Donate'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.setText(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    fundraiserName)

WebUI.sendKeys(findTestObject('Object Repository/Create sub campaign as org/Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - giver fundraiser - n_468728/span_giver fundraiser - npo with ipc'))

WebUI.switchToWindowTitle('giving.sg : Campaign detail - giver fundraiser - npo with ipc')

//WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/div_Donate'))

WebUI.scrollToElement(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now_Tier'),3)
WebUI.takeFullPageScreenshotAsCheckpoint('12')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/button_Yes'))

WebUI.closeBrowser()

