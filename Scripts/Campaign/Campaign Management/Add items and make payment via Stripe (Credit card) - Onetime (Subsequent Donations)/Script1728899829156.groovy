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

//Giver email
String giverEmail = 'member3@dk.dev'

//Input search
String inputSearch = 'npo'

//Campaign Page Name
String campaignPageName = 'giving.sg : Campaign detail - npo without ipc'

//Dedication message
String dedicationMessage = 'test'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), giverEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Donate'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), inputSearch)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgDonate - npo/span_npo without ipc'))

WebUI.switchToWindowTitle(campaignPageName)

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now _Main'))

WebUI.mouseOver(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now_Tier'))

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now_Tier'))

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/a_Add dedication message or name'))

WebUI.setText(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/textarea_AddDedicationMessage'), dedicationMessage)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now_PopUp'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Check out'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgCheckout cart/input_OR_b2-b9-l1-448_0-RadioGroup'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgCheckout cart/input_QR payment_b2-SaveCardFuture'))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgCheckout cart/input_QR payment_b2-SaveCardFuture'))

WebUI.takeScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgCheckout cart/button_Continue with Payment'))

WebUI.takeScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_Test Account/div_SGD10.00_SubmitButton-IconContainer'))

WebUI.takeScreenshotAsCheckpoint('8')

