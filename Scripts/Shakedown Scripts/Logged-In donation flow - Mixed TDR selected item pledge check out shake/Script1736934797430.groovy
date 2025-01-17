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
String giverEmail = 'member1@dk.dev'

'test email\r\n'
String adminEmail = 'DK_Finance_Admin_00_02@nvpc.dev'

'donation amount can be set'
String pledgeAmt = '200'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('1 main page')

'click donate page button'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.delay(3)

'on donate page'
WebUI.takeScreenshotAsCheckpoint('2 donate page')

'click campaigns tab'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('3 campaigns tab')

WebUI.click(findTestObject('Page_giving.sgDonate -/div_Tax-deductible'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('4 highlight tax-deductible')

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

'click donate now button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('6 page scrolled down')

'hover over first donate button'
WebUI.mouseOver(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_first donation tier'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('7 hover over first tier')

'click pledge button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_first pledge'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('8 open pledge menu')

'set pledge amount'
WebUI.setText(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/input_pledge amount'), pledgeAmt)

