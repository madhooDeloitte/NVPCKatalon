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

String envURL = 'https://uat.giving.sg'

'test email\r\n'
String giverEmail = 'member1@dk.dev'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'member1@dk.dev')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div__b2-b25-Input'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/body_iframe  srchttpswww.googletagmanager.c_d5a984'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/input__b2-Input_OtherAmount'), '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_Checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Youre donating1 for SG60 SHARE'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/img_SG60 SHARE_OSFillParent'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Do you want to claim tax reliefAbout cl_d8d738'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Tax relief may be claimed only for elig_af06bc'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/span_Tax-deductible (for logged in users)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_OR_b2-b10-l1-538_0-RadioGroup'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Continue with Payment'))

WebUI.click(findTestObject('Object Repository/Page_DK Development Env/div_Change'))

WebUI.click(findTestObject('Object Repository/Page_DK Development Env/input_Keep using  3184_cardNumber'))

WebUI.click(findTestObject('Object Repository/Page_DK Development Env/input_Keep using  3184_cardExpiry'))

WebUI.click(findTestObject('Object Repository/Page_DK Development Env/input_Keep using  3184_cardCvc'))

WebUI.click(findTestObject('Object Repository/Page_DK Development Env/input_Cardholder name_billingName'))

