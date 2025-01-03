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

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'michaelscott@dundermifflin.dk.dev')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq4oD3Y625LFBg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div__b2-RadioButton9'))
WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_Checkout'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_OR_b2-b10-l1-538_0-RadioGroup'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Continue with Payment'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/Page_DK Development Env/svg_Back_InlineSVG Icon Header-backArrow mr_54644a'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Object Repository/Page_giving.sgPayment status/button_Retry transaction'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Stories_b1-b5'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Logout'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_Yes'))

WebUI.closeBrowser()

