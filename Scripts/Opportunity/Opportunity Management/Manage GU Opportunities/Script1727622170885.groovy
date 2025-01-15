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

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all (1)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'seanGUtogether1@mailto.plus')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_834fd0'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_a67e6b'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_138dc5'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_0322ef'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_acc042'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_1714ca'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (3)/button_Verify'))

WebUI.click(findTestObject('AdminMenuItems/a_Opportunities'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    'Cancel Opp Tied to NPO')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/i_Sean Tay VM_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/a_View'))

'Nav to admin page back\r\n'
WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    'draft')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/i_Sean Tay VM_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/a_Delete'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    'Cancel Opp not Tied to NPO')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/i_Sean Tay VM_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/a_Cancel opportunity'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/textarea_Cancellation reason_b2-b40-TextAre_c3b679'), 
    'a')

WebUI.click(findTestObject('Page_giving.sg - admin Home (7)/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    'Cancel Opp Tied to NPO')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/i_Sean Tay VM_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/a_Cancel opportunity'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/textarea_Cancellation reason_b2-b40-TextAre_c3b679'), 
    'w')

WebUI.click(findTestObject('Page_giving.sg - admin Home (7)/button_Confirm'))

