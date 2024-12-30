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

WebUI.navigateToUrl('uat.giving.sg')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'madhoo_giver@mailto.plus')

WebUI.click(findTestObject('null'))

WebUI.setEncryptedText(findTestObject('null'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('span_Fundraise'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/div_Select'))

WebUI.click(findTestObject('span_Test NPO with IPC'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Campaign name_b2-b4-Input_CampaignTitle'), 
    'NPO suspension test')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/i__icon fa fa-plus fa-1x'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/textarea_Describe your campaign and the giv_319925'), 
    'no please dont suspend me!')

WebUI.uploadFile(findTestObject('Page_giving.sgEdit campaign/label_Select file'), 'C:\\Users\\smadhoosudhan\\Downloads\\npo image for suspension.jpg')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/span_Arts, culture and heritage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/div_Start date_b2-b20-b3-Icon'))

WebUI.click(findTestObject('Page_giving.sgEdit campaign/input_Start date_form-control OSFillParent _904945'))

WebUI.click(findTestObject('Page_giving.sgEdit campaign/span_19'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_giving.sgEdit campaign/input_End_Test'))

WebUI.click(findTestObject('Page_giving.sgEdit campaign/span_5'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2'))

