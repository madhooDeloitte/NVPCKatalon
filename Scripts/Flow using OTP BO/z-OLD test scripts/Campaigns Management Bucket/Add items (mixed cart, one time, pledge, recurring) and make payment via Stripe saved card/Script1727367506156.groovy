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

WebUI.setText(findTestObject('null'), 'member2@dk.dev')

WebUI.click(findTestObject('null'))

WebUI.setEncryptedText(findTestObject('null'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/img_Tax-deductible_b2-l3-285_0-b26-b1-ContentImage'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - Approved Campaign/button_Donate now'))

WebUI.mouseOver(findTestObject('Page_giving.sgCampaign detail - Approved Campaign/button_Add to cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - Approved Campaign/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - Approved Campaign/a_Add dedication message'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCampaign detail - Approved Campaign/textarea_Dedication message_b2-b4-TextArea__e92e06'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - Approved Campaign/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - Approved Campaign/i_Log out_icon fa fa-shopping-cart fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Check out'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_OR_b2-b11-l1-921_0-RadioGroup'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_QR payment_b2-SaveCardFuture'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Make payment'))

