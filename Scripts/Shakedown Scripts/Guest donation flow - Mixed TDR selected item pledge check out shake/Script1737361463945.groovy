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

'donation amount can be set for TDR'
String pledgeTDR = '500'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

'-'
WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('1 main page')

'click donate page button'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.delay(3)

'1.3 on donate page'
WebUI.takeScreenshotAsCheckpoint('2 donate page')

'click campaigns tab'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.delay(3)

'non TDR'
WebUI.takeScreenshotAsCheckpoint('3 campaigns tab')

// Get the current WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Store the current window handle (main tab)
String mainTabHandle = driver.getWindowHandle()

'click first charity non tdr'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_first charity'))

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
WebUI.takeScreenshotAsCheckpoint('4 check page moved')

'click donate now button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('5 page scrolled down')

'hover over first donate button'
WebUI.mouseOver(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_first donation tier'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('6 hover over first tier')

'1.7 click pledge button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_first pledge'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('7 open pledge menu')

'set pledge amount'
WebUI.setText(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/input_pledge amount'), pledgeAmt)

'click pledge due date'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/inp_pledge due date'), FailureHandling.STOP_ON_FAILURE)

'click last date in the date picker, can be changed by changing last div'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_last date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('8 confirm pledge inputs')

'1.8 click pledge now button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_donatenow1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Confirm 1 item in cart'
WebUI.takeScreenshotAsCheckpoint('9 checkout screen')

'click donate page button'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.delay(3)

'1.10 on donate page'
WebUI.takeScreenshotAsCheckpoint('10 confirm donate page')

'click campaigns tab'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.delay(3)

'non TDR'
WebUI.takeScreenshotAsCheckpoint('11 campaigns page')

'click second charity non tdr'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_second charity'))

'switch to new tab'
WebUI.switchToWindowIndex(2)

WebUI.delay(5)

'check tab moved to correct charity'
WebUI.takeScreenshotAsCheckpoint('12 second campaign clicked')

'click donate now button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('13 scroll to donations')

'hover over first donate button'
WebUI.mouseOver(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_first donation tier'))

'click pledge button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_first pledge'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('14 open donation popup')

'set pledge amount'
WebUI.setText(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/input_pledge amount'), pledgeAmt)

'click pledge due date'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/inp_pledge due date'), FailureHandling.STOP_ON_FAILURE)

'click last date in the date picker, can be changed by changing last div'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_last date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('15 confirm inputs')

'click pledge now button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_donatenow1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'confirm 2 items in cart'
WebUI.takeScreenshotAsCheckpoint('16 checkout screen')

'click donate page button'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.delay(3)

'1.12 on donate page'
WebUI.takeScreenshotAsCheckpoint('17 donate page')

'1.13 click campaigns tab'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('18 campaigns page ')

WebUI.click(findTestObject('Page_giving.sgDonate -/div_Tax-deductible'))

WebUI.delay(3)

'1.14 TDR campaigns'
WebUI.takeScreenshotAsCheckpoint('19 tax deductible')

'first campaign click'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_first charity'))

'switch to new tab'
WebUI.switchToWindowIndex(3)

WebUI.delay(5)

'check tab moved to correct charity'
WebUI.takeScreenshotAsCheckpoint('20 page moved')

'1.15 click donate now button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('21 scrolled to donations')

'hover over first donate button'
WebUI.mouseOver(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_first donation tier'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('22 mouse over donation')

'1.16 click pledge button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_first pledge'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('23 open pledge popup')

'set pledge amount'
WebUI.setText(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/input_pledge amount'), pledgeTDR)

'click pledge due date'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/inp_pledge due date'), FailureHandling.STOP_ON_FAILURE)

'click last date in the date picker, can be changed by changing last div'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_last date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'1.17 check all inputs'
WebUI.takeScreenshotAsCheckpoint('24 confirm pledge inputs')

'1.18 click pledge now button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_donatenow1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'confirm 3 items in cart'
WebUI.takeScreenshotAsCheckpoint('25 checkout screens')

'click donate page button'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.delay(3)

'on donate page'
WebUI.takeScreenshotAsCheckpoint('26 donate page')

'1.19 second TDR item to cart '
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('27 campaign tab')

WebUI.click(findTestObject('Page_giving.sgDonate -/div_Tax-deductible'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('28 tax deductible')

'click second charity non tdr'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_second charity'))

'switch to new tab'
WebUI.switchToWindowIndex(4)

WebUI.delay(5)

'check tab moved to correct charity'
WebUI.takeScreenshotAsCheckpoint('29 page moved to 4th campaign')

'click donate now button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_Donate now'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('30 page scrolled to donations')

'hover over first donate button'
WebUI.mouseOver(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_first donation tier'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('31 hover over donations')

'click pledge button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_first pledge'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('32 open pledge popup')

'set pledge amount'
WebUI.setText(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/input_pledge amount'), pledgeTDR)

'click pledge due date'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/inp_pledge due date'), FailureHandling.STOP_ON_FAILURE)

'click last date in the date picker, can be changed by changing last div'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_last date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('33 confirm pledge inputs')

'click pledge now button'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/button_donatenow1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'confirm 4 items in cart, verify tax benefits banner'
WebUI.takeScreenshotAsCheckpoint('34 checkout screen ')

'click pledge tab'
WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_cart pledge tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'screenshot first item and yellow banner copywriting'
WebUI.takeScreenshotAsCheckpoint('35 checkout pledge')

WebUI.scrollToElement(findTestObject('Create Campaign as Org/Page_giving.sgCampaign detail/span_first cart item'), 0)

WebUI.delay(3)

'screenshot other items to check amount'
WebUI.takeScreenshotAsCheckpoint('36 checkout camp scrolled')

