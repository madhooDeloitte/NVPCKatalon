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

<<<<<<< HEAD
//WebUI.navigateToUrl('https://dk.deloitte-sea.com/sg60share/donate')
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgLogin/div_SG60Share'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/img_Support our local community_b2-b1-b2-l1_59d4b3'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_60'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_605x12 months'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_10'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_25'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_25'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_50'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Other amount'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div__b2-RadioButton7'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/textarea_Leave an encouraging message (opti_06f4b0'), 
    'Good Morning Attack ')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/span_The use of attack is not allowed'), 
    'The use of \'attack\' is not allowed.')

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Log in or sign up with Singpass to Be a_6a57d7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Give 60 for SG60 in the form of a 5 don_c1aa88'), 
    0)

WebUI.closeBrowser()
=======
WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_SG60 SHARE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/img_Support our local community_b2-b1-b2-l1_59d4b3'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_60'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_605x12 months'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_10'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_25'), '$ 25')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_25'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_50'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Other amount'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div__b2-RadioButton7'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/textarea_Leave an encouraging message (opti_06f4b0'), 
    'Good Morning Attack ')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/span_The use of attack is not allowed'), 
    'The use of \'attack\' is not allowed.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Log in or sign up with Singpass to Be a_6a57d7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/div_Give 60 for SG60 in the form of a 5 don_c1aa88'), 
    0)


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
>>>>>>> branch 'UATSG60' of https://github.com/madhooDeloitte/NVPCKatalon

