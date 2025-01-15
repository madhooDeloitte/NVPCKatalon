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

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050 (5)/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050 (5)/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_Email address_b3-b9-Input_EmailAddress'), 
    'raseena-sa@gu.test')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (3)/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_Password_b3-b9-Input_Password'), 
    'hJxcABFZyq4oD3Y625LFBg==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (3)/button_Log in'))

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

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home (4)/img_Audit log_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home (4)/a_Public profile'))

WebUI.switchToWindowTitle('Raseena GU stand alone')

WebUI.click(findTestObject('Object Repository/Page_Raseena GU stand alone/img_Stories_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_Raseena GU stand alone/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Raseena GU stand alone/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogout (2)/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (3)/a_Forgot password'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Email address_b3-Input_a_Email'), 
    'raseena-sa@gu.test')

'CAPTCHA\r\n'
WebUI.delay(40)

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Reset my password'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_340166'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_153211'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_f6405a'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_846875'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_eadc08'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_4518da'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Verify'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Password_b3-Input_Password'), 
    'hJxcABFZyq4ozL+lET5U4g==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/i_Password_icon fa fa-eye fa-1x'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), 
    'hJxcABFZyq4ozL+lET5U4g==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/i_Confirm password_icon fa fa-eye fa-1x'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Reset password'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_Email address_b3-b9-Input_EmailAddress'), 
    'raseena-sa@gu.test')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (3)/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_Password_b3-b9-Input_Password'), 
    'hJxcABFZyq4ozL+lET5U4g==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (3)/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_a8e91a'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_cc2451'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_2e40a8'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_7148bd'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_7ea493'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_If the account exists, you will recei_20d1c7'), 
    '6')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (3)/button_Verify'))

