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

WebUI.navigateToUrl('https://uat.giving.sg/home')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject(null))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now (1)/div_Registered charity'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now (1)/div_Download form'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now (1)/button_I understand'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now (1)/button_Sign up with email'))

WebUI.setText(findTestObject('null'), 
    'test name 13')

WebUI.setText(findTestObject('null'), 
    '98573829')

WebUI.setText(findTestObject('null'), '20198335A')

WebUI.setText(findTestObject('null'), 
    '680680')

WebUI.setText(findTestObject('null'), '02')

WebUI.setText(findTestObject('null'), '02')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    '125574850')

WebUI.setText(findTestObject('null'), 
    '7171')

WebUI.setText(findTestObject('null'), 
    '095')

WebUI.setText(findTestObject('null'), 
    'DBSSSGSG')

WebUI.uploadFile(findTestObject('FileUpload/Page_giving.sgCharity registration/label_Upload file'), 'C:\\Users\\smadhoosudhan\\Downloads\\DirectCreditAuthorisationForm.pdf')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.acceptAlert()

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'test name 12')

WebUI.setText(findTestObject('null'), 
    'test@uat.com')

WebUI.setEncryptedText(findTestObject('null'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('null'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

