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

WebUI.navigateToUrl('https://giving.sg/')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.scrollToElement(findTestObject('Page_giving.sgDonate/First Div_Donate page'), 0)

WebUI.takeScreenshotAsCheckpoint('Campaign Listing')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/First Div_Donate page'))

WebUI.takeScreenshotAsCheckpoint('Campaign Page')

WebUI.click(findTestObject('Page_giving.sgDonate/span_Volunteer'))

WebUI.scrollToElement(findTestObject('Page_giving.sgVolunteer/First Div_Volunteer Page - edited'), 0)

WebUI.takeScreenshotAsCheckpoint('Volunteer Listings')

WebUI.click(findTestObject('Page_giving.sgVolunteer/First Div_Volunteer Page - edited'))

WebUI.takeScreenshotAsCheckpoint('Volunteer Page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOpportunity detail - Test aut_016037/span_Our organisations'))

WebUI.scrollToElement(findTestObject('Page_giving.sgOur organisations/img_Explore_b2-l3-931_0-b22-b1-ContentImage'), 0)

WebUI.takeScreenshotAsCheckpoint('Charity Listing')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/img_Explore_b2-l3-931_0-b22-b1-ContentImage'))

WebUI.takeScreenshotAsCheckpoint('Charity Page')

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/span_Our organisations'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/span_ORGANISATION (531)'))

WebUI.scrollToElement(findTestObject('Page_giving.sgOur organisations/img_Explore_b2-l5-1285_0-b30-b1-ContentImage'), 0)

WebUI.takeScreenshotAsCheckpoint('Org Listings')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/img_Explore_b2-l5-1285_0-b30-b1-ContentImage'))

WebUI.takeScreenshotAsCheckpoint('Org Page')

WebUI.click(findTestObject('Object Repository/Page_1Fiesta/span_Our organisations'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/span_GROUNDUP (300)'))

WebUI.scrollToElement(findTestObject('Page_giving.sgOur organisations/span_SCHomeRun Summer Solstice'), 0)

WebUI.takeScreenshotAsCheckpoint('GU Listings')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/span_SCHomeRun Summer Solstice'))

WebUI.takeScreenshotAsCheckpoint('GU Page')

