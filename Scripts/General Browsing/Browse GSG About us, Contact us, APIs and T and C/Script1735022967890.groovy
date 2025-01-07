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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'michaelscott@dundermifflin.dk.dev')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq4oD3Y625LFBg==')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_About'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgAbout/a_What is Giving.sg'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgAbout/img_About_b1-b1-GivingSGLogoWhite'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Contact us'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Object Repository/Page_giving.sgContact us/a_Contact'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/Page_giving.sgContact us/img_About_b1-b1-GivingSGLogoWhite'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_APIs'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Object Repository/Page_giving.sgAPIs/a_Terms of use'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sgPolicies/a_Privacy policy'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('8')

// Get the current WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

// Store the current window handle (main tab)
String mainTabHandle = driver.getWindowHandle()

WebUI.click(findTestObject('Object Repository/Page_giving.sgPolicies/span_General Terms of Use'))

//WebUI.switchToWindowIndex(3)

WebUI.delay(3)

//WebUI.switchToWindowTitle('General Terms of Use')

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
}

//WebUI.delay(40)

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('9')

WebUI.switchToWindowTitle('giving.sg : Policies')

// Get the current WebDriver instance
driver = DriverFactory.getWebDriver()

// Store the current window handle (main tab)
mainTabHandle = driver.getWindowHandle()

WebUI.click(findTestObject('Object Repository/Page_giving.sgPolicies/span_For Donors  Volunteers'))

//WebUI.switchToWindowIndex(3)

WebUI.delay(3)

//WebUI.switchToWindowTitle('General Terms of Use')

allWindowHandles = driver.getWindowHandles()

newTabHandle = null

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
}

//WebUI.switchToWindowTitle('For Donors & Volunteers')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('10')

WebUI.switchToWindowTitle('giving.sg : Policies')

// Get the current WebDriver instance
driver = DriverFactory.getWebDriver()

// Store the current window handle (main tab)
mainTabHandle = driver.getWindowHandle()

WebUI.click(findTestObject('Object Repository/Page_giving.sgPolicies/span_For Fundraisers'))

//WebUI.switchToWindowIndex(3)

WebUI.delay(3)

//WebUI.switchToWindowTitle('General Terms of Use')

allWindowHandles = driver.getWindowHandles()

newTabHandle = null

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
}

//WebUI.switchToWindowTitle('For Fundraisers')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('12')

WebUI.switchToWindowTitle('giving.sg : Policies')

// Get the current WebDriver instance
driver = DriverFactory.getWebDriver()

// Store the current window handle (main tab)
mainTabHandle = driver.getWindowHandle()

WebUI.click(findTestObject('Object Repository/Page_giving.sgPolicies/span_For Registered Charities, Organisation_8fa5d7'))

//WebUI.switchToWindowIndex(3)

WebUI.delay(3)

//WebUI.switchToWindowTitle('General Terms of Use')

allWindowHandles = driver.getWindowHandles()

newTabHandle = null

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
}

//WebUI.switchToWindowTitle('For Registered Charities, Organisation')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('13')

WebUI.switchToWindowTitle('giving.sg : Policies')

// Get the current WebDriver instance
driver = DriverFactory.getWebDriver()

// Store the current window handle (main tab)
mainTabHandle = driver.getWindowHandle()

WebUI.click(findTestObject('Object Repository/Page_giving.sgPolicies/span_Privacy Policy'))

//WebUI.switchToWindowIndex(3)

WebUI.delay(3)

//WebUI.switchToWindowTitle('General Terms of Use')

allWindowHandles = driver.getWindowHandles()

newTabHandle = null

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
}

//WebUI.switchToWindowTitle('Privacy Policy')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('14')

WebUI.switchToWindowTitle('giving.sg : Policies')

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('15')

WebUI.click(findTestObject('Object Repository/Page_giving.sgPolicies/div_Stories_b1-b5'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgPolicies/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgPolicies/button_Yes'))

WebUI.closeBrowser()

