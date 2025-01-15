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

String userEmail = 'member1@dk.dev'

String userPassword = '963D2jXv1kXHYewulAqKlg=='

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

'verify home page'
WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.delay(3)

'verify login page'
WebUI.takeScreenshotAsCheckpoint('2')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), userEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), userPassword)

WebUI.delay(3)

'verify login page with details to login'
WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(10)

'verify logged in\r\n'
WebUI.takeScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.delay(3)

'verify donate now page'
WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/div_605x12 months'))

WebUI.delay(3)

'verify $5x12 option selected\r\n'
WebUI.takeScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_Checkout'))

WebUI.delay(3)

'verify the payment screen '
WebUI.takeScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Visa ending in 3184'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_Visa ending in 0341_b2-b8-l1-537_3-Ra_8a24a0'))

WebUI.delay(5)

'verify 3184 card selected\r\n'
WebUI.takeScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Continue with Payment'))

//WebUI.switchToFrame(findTestObject('Object Repository/Page_giving.sgCheckout cart/iframe_About___privateStripeFrame5632'), 
//    10)
//
//WebUI.switchToFrame(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_3DS iFrame'), 10)
//WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Fail'))
'Manual step: click the fail option on the stripe pop up.'
WebUI.delay(30)

'verify on failed transaction page'
WebUI.takeScreenshotAsCheckpoint('9')

//Select "Fail"
WebUI.click(findTestObject('Page_giving.sgPayment status/button_Retry transaction'))

WebUI.delay(10)

'verify back at donation selection page'
WebUI.takeScreenshotAsCheckpoint('10')

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/img_Stories_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/a_Logout'))

WebUI.click(findTestObject('Page_giving.sgSG60 SHARE/button_Yes'))

WebUI.closeBrowser()

