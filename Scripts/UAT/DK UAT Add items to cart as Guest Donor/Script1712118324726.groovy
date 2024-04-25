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

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/div b2-l3-283_4-b26'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCampaign detail - subcamp gu 3/input__b2-b1-b30-Input_OtherAmount2'), 
    '20')

WebUI.mouseOver(findTestObject('Page_giving.sgCampaign detail - subcamp gu 3/button_Donate now'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - subcamp gu 3/button_Donate now'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - subcamp gu 3/a_Add dedication message'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCampaign detail - subcamp gu 3/textarea_Dedication message_b2-b4-TextArea__e92e06'), 
    'hi')

not_run: WebUI.setText(findTestObject('Object Repository/Page_giving.sgCampaign detail - subcamp gu 3/textarea_h'), 'hi')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - subcamp gu 3/span_Donate now'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/span_Our organisations'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOur organisations/div_b2-l3-804_3-b22'))

WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/input__b2-b15-Input_OtherAmount'), '20')

WebUI.mouseOver(findTestObject('Page_PerformanceTesting003/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/input__b2-b15-b20-Checkbox1'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/span_4'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/a_Yearly'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/a_Add dedication message'))

WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_Dedication message_b2-b15-b20-Text_875de2'), 
    'recurring')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_r'), 're')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_re'), 'rec')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_rec'), 'recu')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_recu'), 'recur')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_recur'), 'recurr')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_recurr'), 'recurri')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_recurri'), 'recurrin')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_recurrin'), 'recurring')

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/span_Add to cart'))

WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/input__b2-b15-Input_OtherAmount'), '20')

WebUI.mouseOver(findTestObject('Page_PerformanceTesting003/button_Pledge'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/button_Pledge'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/span_4'))

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/a_Add dedication message'))

WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_Dedication message_b2-b15-b21-Text_0f253a'), 
    'pledge')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_'), ';p')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_p'), ';pl')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_pl'), ';p')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_p'), ';')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_'), '')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_Dedication message_b2-b15-b21-Text_0f253a'), 
    'p')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_p_1'), 'pl')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_pl_1'), 'ple')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_ple'), 'pled')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_pled'), 'pledg')

not_run: WebUI.setText(findTestObject('Object Repository/Page_PerformanceTesting003/textarea_pledg'), 'pledge')

WebUI.click(findTestObject('Object Repository/Page_PerformanceTesting003/span_Pledge now'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Check out'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Make your giving journey countIf you wa_7b7b55'))

