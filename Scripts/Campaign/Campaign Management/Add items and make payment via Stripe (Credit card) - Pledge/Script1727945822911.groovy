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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'amirgiver2@mailto.plus')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Our Organisations'))

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.setText(findTestObject('Page_giving.sgOur organisations/input_Search organisations_b2-SearchInput'), 'kill')

WebUI.sendKeys(findTestObject('Page_giving.sgOur organisations/input_Search organisations_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations - kill/div_Keep Inviting Love Library (KILL)(Updat_c29191'))

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/organisation/profile/d32d86ca-320e-4aca-8f59-99dd30476801')

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_Keep Inviting Love Library (KILL)/button_Donate'))

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_Keep Inviting Love Library (KILL)/div_50DonateDonate nowAdd to cartPledge'))

WebUI.click(findTestObject('Object Repository/Page_Keep Inviting Love Library (KILL)/button_Pledge'))

WebUI.setText(findTestObject('Object Repository/Page_Keep Inviting Love Library (KILL)/input__b2-b15-b21-Input_OtherAmount'), 
    '51')

WebUI.click(findTestObject('Object Repository/Page_Keep Inviting Love Library (KILL)/input_Pledge due date_form-control OSFillPa_d1aebf'))

WebUI.click(findTestObject('Object Repository/Page_Keep Inviting Love Library (KILL)/span_26'))

WebUI.setText(findTestObject('Object Repository/Page_Keep Inviting Love Library (KILL)/input_How did you learn about us_b2-b15-b21_1614c0'), 
    'tw')

WebUI.takeScreenshotAsCheckpoint('4', [])

WebUI.click(findTestObject('Object Repository/Page_Keep Inviting Love Library (KILL)/button_Pledge now'))

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Check out'))

WebUI.takeScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Add debit or credit card'))

WebUI.setText(findTestObject('Object Repository/Page_Test Account/input_Card information_cardNumber'), '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Page_Test Account/input_Card information_cardExpiry'), '05 / 29')

WebUI.setText(findTestObject('Object Repository/Page_Test Account/input_Card information_cardCvc'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Test Account/input_Cardholder name_billingName'), 'Success card non-3ds')

WebUI.takeScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_Test Account/div_Save card_SubmitButton-IconContainer'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_Default_b2-b7-l1-103_1-RadioGroup'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_Tax may be claimed only for tax-eligi_7e2994'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_Tax may be claimed only for tax-eligi_7e2994'))

WebUI.takeScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCheckout cart/button_Continue with Payment'))

WebUI.takeScreenshotAsCheckpoint('9')

