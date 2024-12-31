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

WebUI.navigateToUrl('https://dk.deloitte-sea.com/')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'elizabeth@marriott330.com')

WebUI.click(findTestObject('null'))

WebUI.setEncryptedText(findTestObject('null'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_c8c0c6'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_f01607'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_5cf610'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_a193f6'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_8059f5'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_fe0d50'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/a_Create campaign'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_SCAPE CO. LTD'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Campaign name_b3-b4-Input_CampaignTitle'), 
    '2')

WebUI.doubleClick(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button__btn btn-icon'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/textarea_Describe your campaign and the giv_ddfda1'), 
    '2')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_Arts, culture and heritage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Start date_form-control OSFillParent _904945'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/span_23'))

WebUI.click(findTestObject('Page_giving.sgEdit campaign/input_End_Test_2'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/span_31'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Next_1_2'))

