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

inpSearch = 'Action for Aids Singapore'

inpFuzzy = 'Youxx'

inpPrefix = 'Yuoth'

inpScoring = 'Youth'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('1 main page')

'click donate button on home page'
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.delay(3)

'verify user directed to "Donate today" page'
WebUI.takeScreenshotAsCheckpoint('2 donate page')

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), inpSearch)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

'scroll down to see results'
WebUI.scrollToElement(findTestObject('Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 3)

WebUI.delay(3)

'verify search results match + default GSG logo displayed when no image available'
WebUI.takeScreenshotAsCheckpoint('3 default logo displayed')

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), '')

WebUI.delay(3)

'verify filter pills present and positions and clear all button'
WebUI.takeScreenshotAsCheckpoint('4 verify filter pills present')

'click cause button'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/div_Causes'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('5 verify causes button works')

'click clear all button to reset\r\n'
WebUI.click(findTestObject('Page_giving.sgDonate/span_Clear all'))

'click tax deductible\r\n'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/label_Tax-deductible'))

'click sort button'
WebUI.click(findTestObject('Page_giving.sgDonate/div_Sort Name A to Z'))

WebUI.delay(3)

'check pills were clicked'
WebUI.takeScreenshotAsCheckpoint('6 pills all clicked')

'click sort A to Z'
WebUI.click(findTestObject('Page_giving.sgDonate/div_Sort A to Z option'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('7 sort pill works')

'click clear all button to reset\r\n'
WebUI.click(findTestObject('Page_giving.sgDonate/span_Clear all'))

'Verify Clear all button present'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgDonate/span_Clear all'), 0)

'scroll down to see results'
WebUI.scrollToElement(findTestObject('Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 3)

WebUI.delay(3)

'Verify order of charities'
WebUI.takeScreenshotAsCheckpoint('8 verify sorted')

WebUI.scrollToElement(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), 1)

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/div_Causes'))

'can change last div to select different checkbox'
WebUI.click(findTestObject('Page_giving.sgDonate -/button_animals box'))

'scroll down to see results'
WebUI.scrollToElement(findTestObject('Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 3)

WebUI.delay(3)

'verify animal related charities shown and causes pill highlighted with 1'
WebUI.takeScreenshotAsCheckpoint('9 verify animal related results')

'click tax deductible'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/label_Tax-deductible'))

WebUI.delay(3)

'verify tax deductible charities'
WebUI.takeScreenshotAsCheckpoint('10 verify tax deductible results')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/span_Clear all'))

WebUI.delay(3)

'verify filters reset and pills not highlighted, verify A-Z'
WebUI.takeScreenshotAsCheckpoint('11 verify A-Z sorted')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), inpFuzzy)

'click search icon\r\n'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - Youxx/i_Search charities or campaigns_icon fa fa-_62f74a'))

'scroll down to see results'
WebUI.scrollToElement(findTestObject('Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 3)

WebUI.delay(3)

'screenshot of fuzzy search'
WebUI.takeScreenshotAsCheckpoint('12 Youxx search results')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - Youxx/div_Donate todayTransform lives and communi_c5c151'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgDonate - Youxx/input_Search charities or campaigns_b2-SearchInput'), 
    inpPrefix)

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - Youxx/i_Search charities or campaigns_icon fa fa-_62f74a'))

WebUI.delay(3)

'screenshot of prefix search'
WebUI.takeScreenshotAsCheckpoint('13 Yuoth search')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - Yuoth/div_Donate todayTransform lives and communi_c5c151'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgDonate - Yuoth/input_Search charities or campaigns_b2-SearchInput'), 
    inpScoring)

WebUI.click(findTestObject('Page_giving.sgDonate - Youxx/i_Search charities or campaigns_icon fa fa-_62f74a'))

WebUI.delay(3)

'screenshot of "youth" search. not sure how opensearch score is done\r\n'
WebUI.takeScreenshotAsCheckpoint('14 Youth search')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/span_Clear all'))

WebUI.delay(3)

'verify sorted A-Z'
WebUI.takeScreenshotAsCheckpoint('15 sorted A-Z')

'click sort button'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/div_Sort Name A to Z'))

WebUI.delay(3)

'verify 3 options for sort'
WebUI.takeScreenshotAsCheckpoint('16 verify sort options')

'click Z-A option in sort button'
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/div_Sort Name Z to A'))

WebUI.delay(3)

'verify sorted Z-A'
WebUI.takeScreenshotAsCheckpoint('17 sorted Z-A')

WebUI.closeBrowser()

