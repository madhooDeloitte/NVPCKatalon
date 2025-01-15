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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

'home url\r\n'
String envURL = 'https://dk.deloitte-sea.com/home'

'giver email\r\n\r\n'
String giverEmail = 'member1@dk.dev'

String charityName = '(DS) NPO 0001'

String stripeName = 'abc'

'test email\r\n'
String adminEmail = 'DK_Finance_Admin_00_02@nvpc.dev'

testQn = 'abc'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

'-'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('1 main page')

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/button_paymentLogIn'))

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), giverEmail)

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

'-'
WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('2 input login details')

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.delay(7)

WebUI.takeScreenshotAsCheckpoint('3 back to home page')

'-'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('4 donate page')

WebUI.setText(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/inp_charityName'), charityName)

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/button_searchCharity'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('5 verify search works')

// Get the current WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Store the current window handle (main tab)
String mainTabHandle = driver.getWindowHandle()

'click first charity'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/span_(DS) NPO 0001'))

// Wait for the new tab to open
WebUI.delay(2 // Adjust delay based on application behavior
    )

// Get all open window handles
Set<String> allWindowHandles = driver.getWindowHandles()

String newTabHandle = null

// Find the new tab handle
for (String handle : allWindowHandles) {
    if (!(handle.equals(mainTabHandle))) {
        newTabHandle = handle

        break
    }
}

// Switch to the new tab
if (newTabHandle != null) {
    driver.switchTo().window(newTabHandle)

    WebUI.comment('Switched to the new tab.')

    // Get the URL of the new tab
    String newTabURL = driver.getCurrentUrl()

    WebUI.comment('New tab URL: ' + newTabURL)
} else {
    WebUI.comment('No new tab was found.')
}

WebUI.delay(5)

'check tab moved to correct charity'
WebUI.takeScreenshotAsCheckpoint('5 check page moved')

'hover to click'
WebUI.mouseOver(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/span_Donatehover'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('6 check hover works')

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/button_Donate10'))

WebUI.setText(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/inp_testQnask'), testQn)

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('7 donate and input question')

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/button_Donatenowpopup'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('8 check giving cart')

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Check out'))

'scroll to grabpay'
WebUI.scrollToElement(findTestObject('Page_giving.sgCheckout cart/div_existingCardBox'), 0)

'- click grab pay'
WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_VisaMastercardAmex credit  debit card_e98b1d'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('9 verify credit card, grabpay, nets')

'-'
WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Continue with Payment'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('10 verify on stripe page')

'stripe enter name. may need manual'
WebUI.setText(findTestObject('Page_DK Development Env/input_stripe name'), stripeName)

'click donate button on stripe'
WebUI.click(findTestObject('Page_DK Development Env/div_SGD60.00_SubmitButton-IconContainer'))

'click authorize test payment on stripe'
WebUI.click(findTestObject('Object Repository/Page_/a_Authorize Test Payment'))

WebUI.delay(15)

WebUI.takeScreenshotAsCheckpoint('11 verify on thank you page')

'click profile'
WebUI.click(findTestObject('Page_giving.sgLogin/btn_profile logged in'))

'click logout\r\n'
WebUI.click(findTestObject('Page_giving.sgLogin/btn_profile logout'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('12 log out')

WebUI.click(findTestObject('Page_giving.sgLogin/btn_are you sure'))

'are u sure'
WebUI.click(findTestObject('Page_giving.sgLogin/btn_login after'))

'-'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), adminEmail)

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

'-'
WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('13 login again with admin')

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

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('14 OTP for admin')

'-'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Verify'))

WebUI.delay(7)

WebUI.takeScreenshotAsCheckpoint('15 after verify')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Home/a_Reports'))

WebUI.delay(5)

'verify on report page'
WebUI.takeScreenshotAsCheckpoint('16 verify report page')

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Reports/div_Select type'))

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sg - dk Reports/div_Donation by period'))

'manually pick the dates you want to generate, click generate button and download the report to check TDR'
WebUI.comment('')

