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

WebUI.setText(findTestObject('null'), 'ross@3rdgen.gu')

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

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/i_Campaigns_fa-solid fa-hand-holding-heart'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/img_Tax-deductible_b2-l3-285_0-b26-b1-ContentImage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - Approved Campaign/button_Fundraise for this'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Campaign name_b2-b4-Input_CampaignTitle'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button__btn btn-icon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_Start date_form-control OSFillParent _904945'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/span_27'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/input_View members_b2-b28-Switch_Private2'))

WebUI.closeBrowser()

