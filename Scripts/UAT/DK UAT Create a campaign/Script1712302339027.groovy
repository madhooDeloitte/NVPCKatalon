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

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'madhoo_giver@mailto.plus')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.sendKeys(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/div_Fundraise'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/span_National Volunteer  Philanthropy Centre'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Campaign name_b2-b4-Input_CampaignTitle'), 
    'test campaign creation 1')

WebUI.doubleClick(findTestObject('Object Repository/Page_giving.sgEdit campaign/button__btn btn-icon'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/textarea_Describe your campaign and the giv_319925'), 
    'test description')

WebUI.uploadFile(findTestObject('Page_giving.sgEdit campaign/label_Select file'), 'C:\\Users\\smadhoosudhan\\Downloads\\A_black_image.jpg')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/span_Community development'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/span_Social service and welfare'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Start date_form-control OSFillParent _904945'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/span_5'))

WebUI.click(findTestObject('Page_giving.sgEdit campaign/input_End date_form-control OSFillParent _904945'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/span_19'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Save  preview'))

WebUI.takeScreenshotAsCheckpoint('campaign creation as giver')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Submit for approval'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/div_Submitted for approval'))

WebUI.closeBrowser()

