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

envURL = 'https://dk.deloitte-sea.com/home'

'test email\r\n'
String charityName = '(DS) NPO 0001'

testQn = 'abc'

giverName = 'abc'

giverEmail = 'abc@a.com'

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
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

'-'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.setText(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/inp_charityName'), charityName)

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/button_searchCharity'))

WebUI.delay(5)

'check searched charity and results'
WebUI.takeScreenshotAsCheckpoint('1')

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

'check tab moved'
WebUI.takeScreenshotAsCheckpoint('2')

'hover to click'
WebUI.mouseOver(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/span_Donatehover'))

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/button_Donate10'))

WebUI.setText(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/inp_testQnask'), testQn)

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/button_Donatenowpopup'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Check out'))

WebUI.delay(5)

'check credit, grab, enet'
WebUI.takeScreenshotAsCheckpoint('3')

'- click visa/mastercard'
WebUI.click(findTestObject('Page_giving.sgCheckout cart/input_Pay with_b2-b10-l1-515_0-RadioGroup'))

WebUI.setText(findTestObject('Page_giving.sgCheckout cart/input_Full name_b2-Input_GiverName'), giverName)

WebUI.setText(findTestObject('Page_giving.sgCheckout cart/input_Email_b2-Input_Email'), giverEmail)

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Continue with Payment'))

WebUI.delay(3)

'verify on stripe page'
WebUI.takeScreenshotAsCheckpoint('4')

'works for now'
WebUI.setText(findTestObject('Page_DK Development Env/input_Card information_cardNumber'), cardNum)

WebUI.setText(findTestObject('Page_DK Development Env/input_Card information_cardExpiry'), cardDate)

WebUI.setText(findTestObject('Page_DK Development Env/input_Card information_cardCvc'), cardDigit)

WebUI.setText(findTestObject('Page_DK Development Env/input_Cardholder name_billingName'), cardName)

WebUI.click(findTestObject('Page_DK Development Env/div_SGD60.00_SubmitButton-IconContainer'))

WebUI.delay(30)

'verify donated thank you page'
WebUI.takeScreenshotAsCheckpoint('5')

