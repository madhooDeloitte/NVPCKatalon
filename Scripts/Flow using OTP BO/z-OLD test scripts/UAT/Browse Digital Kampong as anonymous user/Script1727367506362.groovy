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

WebUI.navigateToUrl('https://uat.giving.sg/')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgDonate/div_Test No TDR No FundraisingCommunity Bui_f936cf'), 
    0)

WebUI.takeScreenshotAsCheckpoint('Campaign listing', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/div_Test No TDR No FundraisingCommunity Bui_f936cf'))

not_run: WebUI.scrollToElement(findTestObject('Page_giving.sgCampaign detail - Test No TDR_40e518/span_Supported causes'), 
    0)

WebUI.takeScreenshotAsCheckpoint('Campaign Page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - Test No TDR_40e518/span_Volunteer'))

not_run: WebUI.scrollToElement(findTestObject('null'), 
    0)

WebUI.click(findTestObject('null'))

not_run: WebUI.scrollToElement(findTestObject('Page_giving.sgOpportunity detail - Editing _65f98a/div_Supported causesAdultsAnimal welfareChi_f5f972'), 
    0)

WebUI.takeScreenshotAsCheckpoint('Volunteering Page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOpportunity detail - Editing _65f98a/span_Our organisations'))

not_run: WebUI.scrollToElement(findTestObject('Page_giving.sgOur organisations/div_Explore525 charities'), 0)

WebUI.takeScreenshotAsCheckpoint('Charities Listing')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/div_PerformanceTesting003AnimalsEducationCo_d6c9e2'))

not_run: WebUI.scrollToElement(findTestObject('Page_PerformanceTesting003/div_AnimalsCommunity developmentEducationEn_600b55'), 
    0)

WebUI.takeScreenshotAsCheckpoint('Charity Page')

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/a_Our organisations'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/span_ORGANISATION (533)'))

not_run: WebUI.scrollToElement(findTestObject('Page_giving.sgOur organisations/div_Explore533 organisations'), 0)

WebUI.takeScreenshotAsCheckpoint('Organizations listing')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/img_Explore_b2-l5-1881_0-b30-b1-ContentImage'))

not_run: WebUI.scrollToElement(findTestObject('Page_1Fiesta/div_Contact person'), 0)

WebUI.takeScreenshotAsCheckpoint('Organization Page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/div_Registered organisationsSearch for any _7f3f99'))

not_run: WebUI.scrollToElement(findTestObject('Page_giving.sgOur organisations/div_Explore302 groundups'), 0)

WebUI.takeScreenshotAsCheckpoint('GUs listing')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/div_Registered organisationsSearch for any _7f3f99'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/img_Explore_b2-l7-2222_0-b37-b1-ContentImage'))

not_run: WebUI.scrollToElement(findTestObject('Page_SCHomeRun Summer Solstice/div_Contact person'), 0)

WebUI.takeScreenshotAsCheckpoint('GU Page')

