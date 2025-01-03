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
String cardNum = '4242 4242 4242 42424'

'test email\r\n'
String cardDate = '12 / 28'

'test email\r\n'
String cardDigit = '111'

'test email\r\n'
String cardName = 'a'

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

'need this'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

'need this'
WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

'?'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div__b2-b25-Input'))

'click other amount'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/body_iframe  srchttpswww.googletagmanager.c_d5a984'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/input__b2-Input_OtherAmount'), '1')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_Checkout'))

'verify items on checkout screen'
WebUI.takeScreenshotAsCheckpoint('3')

'click the visa/mastercard '
WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_OR_b2-b10-l1-538_0-RadioGroup'))

'-'
WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_tax_relief'))

'-'
WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Continue with Payment'))

'verify on stripe page'
WebUI.takeScreenshotAsCheckpoint('2')

'works for now'
WebUI.setText(findTestObject('Object Repository/Page_DK Development Env/input_Card information_cardNumber'), cardNum)

WebUI.setText(findTestObject('Object Repository/Page_DK Development Env/input_Card information_cardExpiry'), cardDate)

WebUI.setText(findTestObject('Object Repository/Page_DK Development Env/input_Card information_cardCvc'), cardDigit)

WebUI.setText(findTestObject('Page_DK Development Env/input_Cardholder name_billingName'), cardName)

WebUI.click(findTestObject('Object Repository/Page_DK Development Env/div_SGD60.00_SubmitButton-IconContainer'))

'verify donated thank you page'
WebUI.takeScreenshotAsCheckpoint('3')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgPayment status/a_Log in'))

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), adminEmail)

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

'-'
WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

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

'verify on report page'
WebUI.takeScreenshotAsCheckpoint('4')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Reports/div_Select type'))

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Reports/div_Donation by period'))

'manually pick the dates you want to generate, click generate button and download the report to check TDR'
WebUI.comment('')

