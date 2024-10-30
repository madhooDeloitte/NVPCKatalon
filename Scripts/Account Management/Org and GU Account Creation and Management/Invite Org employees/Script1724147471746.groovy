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

String envURL = 'https://uat.giving.sg'

//org email
String orgEmail = 'ethanorg1@mailto.plus'

//employee name
String employeeName = 'Test Employee 3'

//employee email
String employeeEmail = 'testemployee3@dk.uat'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), orgEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_ac06e4'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_c0c54a'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_5a7989'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_bc9516'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_d41d1e'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_28d745'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/a_Employees'))

//WebUI.verifyTextPresent("Employees", false, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Employees/th_Employee'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Employees/th_Role'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Employees/th_Status'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Employees/th_Last login'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Employees/i_Nil_fa-solid fa-ellipsis-vertical'), 
    0)

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Employees/button_Invite employee'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Employees/input_Employee name_b2-b18-Input_Name'), 
    employeeName)

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Employees/input_Email address_b2-b18-Input_Email'), 
    employeeEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Employees/input_Role_b2-b18-b5-l1-224_0-Checkbox'))

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Employees/button_Send invite'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Employees/div_Invitation sent'), 0)

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.verifyElementText(findTestObject('Object Repository/Page_giving.sg - admin Employees/span_testemployee2dk.uat'), employeeEmail)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Employees/span_Pending'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Employees/i_Nil_fa-solid fa-ellipsis-vertical'))

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Employees/a_Manage roles'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Employees/span_Change roles for Test Employee 2'), 
    0)

WebUI.verifyElementClickable(findTestObject('Page_giving.sg - admin Employees/span_ORG Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Page_giving.sg - admin Employees/span_ORG Developer'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Page_giving.sg - admin Employees/span_ORG Campaign Manager'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Page_giving.sg - admin Employees/span_ORG Volunteer Manager'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Page_giving.sg - admin Employees/span_ORG Campaign Manager'))

WebUI.takeScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Employees/button_Save changes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Employees/div_Roles updated successfully'), 
    0)

WebUI.takeScreenshotAsCheckpoint('7')

WebUI.verifyElementText(findTestObject('Object Repository/Page_giving.sg - admin Employees/span_ORG Admin, ORG Campaign Manager'), 
    ' ORG Admin, ORG Campaign Manager')

