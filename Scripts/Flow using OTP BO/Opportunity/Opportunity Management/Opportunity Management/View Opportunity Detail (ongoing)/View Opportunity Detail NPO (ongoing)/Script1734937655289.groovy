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

'test email\r\n'
String npoEmail = 'seantestsep252@mailto.plus'

'test opportunity name\r\n'
inpSearch = 'test ongoing npo'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

'\r\n'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

'\r\n'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

'\r\n'
WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), npoEmail)

'\r\n'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

'test enter password\r\n'
WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

'\r\n'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_3'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_4'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_5'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_6'), '1')

'\r\n'
WebUI.click(findTestObject('Page_giving.sgLogin/button_Verify'))

'\r\n'
WebUI.click(findTestObject('Page_giving.sg - admin Home/span_Opportunities'))

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/div_Filters'))

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/filterselectactiveopp'))

'kti_id settled'
WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/button_Apply'))

'opportunity name'
WebUI.setText(findTestObject('Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    inpSearch)

'press enter key'
WebUI.sendKeys(findTestObject('Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

// Get the current WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Store the current window handle (main tab)
String mainTabHandle = driver.getWindowHandle()

'click 3 dots of first opportunity in the list'
WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/div_TestNew1_icon-box'))

'clicked the view button\r\n'
WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/a_View'))

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

WebUI.takeScreenshotAsCheckpoint('1')

//WebUI.switchToWindowTitle('giving.sg : Opportunity detail - test ongoing npo')
'moving tab'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sgOpportunity detail - test_exp_5327a5/span_test_expired_npo'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sgOpportunity detail - test_exp_5327a5/span_Ronald McDonald House'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sgOpportunity detail - test_exp_5327a5/img_Ronald McDonald House_b2-b9-l1-119_0-b3_5e8f8f'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgOpportunity detail - test_exp_5327a5/span_Tue, Dec 24, 2024855 AM - 900 AM'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sgOpportunity detail - test_exp_5327a5/div_Supported causesAnimalsArts, culture an_58e42c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sgOpportunity detail - test_exp_5327a5/div_About the opportunityexpired opportunity npo'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sgOpportunity detail - test_exp_5327a5/div_Volunteer positionsvolunteer5 of 5 slot_50647d'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sgOpportunity detail - test_exp_5327a5/div_About the organisationThe Brighter Futu_f3b221'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sgOpportunity detail - test_exp_5327a5/div_Contact usAny queries Contact TestNew1 _f03c47'), 
    FailureHandling.STOP_ON_FAILURE)

