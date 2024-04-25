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

WebUI.navigateToUrl('https://giving.sg/')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/div_Individual giver'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Sign up with email'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Full name_b5-b3-Input_GiverName'), 
    'test giver name ')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Email_b5-b3-Input_Email'), 'testgiver3@mailto.plus')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Date of birth_form-control OSFillPare_d89c8e'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Continue_numInput cur-year'), 
    '1968')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Continue_numInput cur-year'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/span_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Password_b5-b3-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Confirm password_b5-b3-Input_ConfirmPassword'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Confirm password_b5-b3-IsConsent_Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue'))

WebUI.delay(40)

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_NRIC_b5-b5-Input_NRIC'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_NRIC_b5-b5-Input_NRIC'), 'S5888458H')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_(65)_b5-b5-Input_MobileNumber'), 
    '98796857')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_Choose one'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_Female'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_Choose one_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/span_EURASIAN'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Postal code_b5-b5-Input_PostalCode'), 
    '680680')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input__b5-b5-Input_FloorNumber'), '2')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Unit_b5-b5-Input_UnitNumber'), 
    '2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/span_Animal welfare'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/span_Animals'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/span_DisasterCrisis victims'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/span_Environmental protection and sustainability'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Foreign workers'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue_1_2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Business Development'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Event management'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Human Resource'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/span_Legal'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Medical and Health'))

