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
String inputSearch = 'test'

//organistion URL
String organisationURL = 'https://dk.deloitte-sea.com/organisation/profile/a99f0ba9-b4ee-41fa-a8e7-7fa63d7a4558'

//input amount 
String inputAmount = '10'

//Dedication message
String dedicationMessage = 'test'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), giverEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Our organisations'))

WebUI.setText(findTestObject('Page_giving.sgOur organisations/input_Search organisations_b2-SearchInput'), inputSearch)

WebUI.sendKeys(findTestObject('Page_giving.sgOur organisations/input_Search organisations_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations - test/span_test'))

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl(organisationURL)

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Page_giving.sgOur organisations/button_Donate_EG_page'))

WebUI.mouseOver(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now_Tier_Org'))

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now_Tier_Org'))

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.setText(findTestObject('Object Repository/Page_test/input__b2-b15-b20-Input_OtherAmount'), inputAmount)

WebUI.click(findTestObject('Object Repository/Page_test/input__b2-b15-b20-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Page_test/a_Monthly'))

WebUI.click(findTestObject('Object Repository/Page_test/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Object Repository/Page_test/span_31'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_test/a_Add dedication message or name'))

WebUI.setText(findTestObject('Object Repository/Page_test/textarea_Dedication messagename_b2-b15-b20-_5b5de8'), dedicationMessage)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now_PopUp'))

WebUI.takeScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Check out'))

WebUI.takeScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Continue with Payment'))

WebUI.takeScreenshotAsCheckpoint('8')

