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

'home url\r\n'
String envURL = 'https://dk.deloitte-sea.com/home'

'test email\r\n'
String giverEmail = 'member1@dk.dev'

'test email\r\n'
String adminEmail = 'DK_Finance_Admin_00_02@nvpc.dev'

'test email\r\n'
String stripeName = 'a'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

'main page'
WebUI.takeScreenshotAsCheckpoint('1')

'-'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), giverEmail)

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

'-'
WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

'after username and pass entered'
WebUI.takeScreenshotAsCheckpoint('2')

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(5)

'verify back to home page'
WebUI.takeScreenshotAsCheckpoint('3')

'need this'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.delay(5)

'verify on donate now page'
WebUI.takeScreenshotAsCheckpoint('4')

'need this'
WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_Checkout'))

WebUI.delay(3)

'verify items on checkout screen'
WebUI.takeScreenshotAsCheckpoint('5')

'- click grab pay'
WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_VisaMastercardAmex credit  debit card_e98b1d'))

'scroll to existing card'
WebUI.scrollToElement(findTestObject('Page_giving.sgCheckout cart/input_VisaMastercardAmex credit  debit card_e98b1d'), 
    0)

WebUI.delay(3)

'verify tax deduction and text'
WebUI.takeScreenshotAsCheckpoint('6')

'-'
WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Continue with Payment'))

'stripe enter name. may need manual'
WebUI.setText(findTestObject('Page_DK Development Env/input_stripe name'), stripeName)

'click donate button on stripe'
WebUI.click(findTestObject('Page_DK Development Env/div_SGD60.00_SubmitButton-IconContainer'))

WebUI.delay(3)

'verify on stripe page with info entered'
WebUI.takeScreenshotAsCheckpoint('7')

'click authorize test payment on stripe'
WebUI.click(findTestObject('Object Repository/Page_/a_Authorize Test Payment'))

WebUI.delay(15)

'verify donated thank you page'
WebUI.takeScreenshotAsCheckpoint('8')

'click profile'
WebUI.click(findTestObject('Page_giving.sgLogin/btn_profile logged in'))

'click logout\r\n'
WebUI.click(findTestObject('Page_giving.sgLogin/btn_profile logout'))

WebUI.delay(3)

'verify logout\r\n'
WebUI.takeScreenshotAsCheckpoint('9')

'are u sure'
WebUI.click(findTestObject('Page_giving.sgLogin/btn_are you sure'))

WebUI.click(findTestObject('Page_giving.sgLogin/btn_login after'))

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), adminEmail)

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

'-'
WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.delay(3)

'verify login to admin account'
WebUI.takeScreenshotAsCheckpoint('10')

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_834fd0'), '1')

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_a67e6b'), '1')

'-\r\n'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_138dc5'), '1')

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_0322ef'), '1')

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_acc042'), '1')

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_1714ca'), '1')

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Verify'))

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Home/a_Reports'))

WebUI.delay(3)

'verify on report page'
WebUI.takeScreenshotAsCheckpoint('11')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Reports/div_Select type'))

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Reports/div_Donation by period'))

'manually pick the dates you want to generate, click generate button and download the report to check TDR'
WebUI.comment('')

'for downloading the required payment transaction excel\r\n'
WebUI.delay(20)

