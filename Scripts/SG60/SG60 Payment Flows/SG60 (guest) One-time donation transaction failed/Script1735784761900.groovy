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
String giverName = 'robin'

'test email\r\n'
String giverEmail = 'hood@gmail.com'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

'-'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

'-'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

'-'
WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

'-'
WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_Checkout'))

'verify SG60 payment page'
WebUI.takeScreenshotAsCheckpoint('1')

'- click visa/mastercard'
WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_Pay with_b2-b10-l1-515_0-RadioGroup'))

'-'
WebUI.setText(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_Full name_b2-Input_GiverName'), giverName)

'-'
WebUI.setText(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_Email_b2-Input_Email'), giverEmail)

'-'
WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Continue with Payment'))

'verify on stripe page'
WebUI.takeScreenshotAsCheckpoint('2')

WebUI.mouseOver(findTestObject('Page_DK Development Env/span_giving sg logo'))

'click back button works for now'
WebUI.click(findTestObject('Page_DK Development Env/svg_Back_InlineSVG Icon Header-backArrow mr_54644a'), FailureHandling.STOP_ON_FAILURE)

'verify retry transaction page'
WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgPayment status/button_Retry transaction'))

'verify donation selection page'
WebUI.takeScreenshotAsCheckpoint('4')

