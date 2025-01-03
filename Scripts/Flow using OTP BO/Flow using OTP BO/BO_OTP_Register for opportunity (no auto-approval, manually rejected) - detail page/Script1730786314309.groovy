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

String envURL = 'https://dk.deloitte-sea.com/'

String envOTPURL = 'https://dk.deloitte-sea.com/NVPC_Notification_BO/OTPListScreen'

//giver email
String giverEmail = 'member3@dk.dev'

//input search opportunity
String inputSearchOpp = 'Save Koala'

//Opp Page name
String oppPageName = 'giving.sg : Opportunity detail - Save Koala'

//npo email
String npoEmail = 'emma@kill-charity.com'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address'), giverEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/span_Volunteer'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), inputSearchOpp)

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer - Save Koala/span_Save Koala'))

WebUI.switchToWindowTitle(oppPageName)

WebUI.click(findTestObject('Object Repository/Page_giving.sgOpportunity detail - Save Koala/button_I want to volunteer'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgOpportunity detail - Save Koala/button_Volunteer for this'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgRegister for opportunity/input_Human resource_b2-b3-ConsentGiven_Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgRegister for opportunity/button_Register'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgRegister for opportunity/button_Back to home'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/img_Stories_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address'), npoEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Log in Email'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Log in Email'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(envOTPURL)

WebUI.delay(5)

// Define XPath strings for email and OTP in the first row
String emailFirstRowXPath = '/html/body/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[4]/table/tbody/tr[1]/td[1]/span'

String otpFirstRowXPath = '/html/body/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[4]/table/tbody/tr[1]/td[3]/span'

String emailSecondRowXPath = '/html/body/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[4]/table/tbody/tr[2]/td[1]/span'

String otpSecondRowXPath = '/html/body/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div/div[4]/table/tbody/tr[2]/td[3]/span'

// Create TestObject for email and OTP dynamically - from first row of table
TestObject emailObj = new TestObject().addProperty('xpath', ConditionType.EQUALS, emailFirstRowXPath)

TestObject otpObj = new TestObject().addProperty('xpath', ConditionType.EQUALS, otpFirstRowXPath)

String otpEmailCheck = '' //define globally

String otpCheck = '' //define globally

try {
    // Retrieve the text for email and OTP
    otpEmailCheck = WebUI.getText(emailObj)

    otpCheck = WebUI.getText(otpObj)

    if (otpEmailCheck != userEmail) {
        // if not found in first row, look for OTP in second row
        emailObj = new TestObject().addProperty('xpath', ConditionType.EQUALS, emailSecondRowXPath)

        otpObj = new TestObject().addProperty('xpath', ConditionType.EQUALS, otpSecondRowXPath)

        otpEmailCheck = WebUI.getText(emailObj)

        otpCheck = WebUI.getText(otpObj)
    }
    
    // Log the email and OTP values
    WebUI.comment('Found OTP Email: ' + otpEmailCheck)

    WebUI.comment('Found OTP: ' + otpCheck)
}
catch (Exception e) {
    WebUI.comment('An error occurred: ' + e.getMessage())
} 

WebUI.switchToWindowIndex(currentWindow)

if (otpCheck != null) {
    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), otpCheck[0])

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), otpCheck[1])

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), otpCheck[2])

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), otpCheck[3])

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), otpCheck[4])

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), otpCheck[5])
} else {
    WebUI.comment('OTP not found in time.')
}

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Page_giving.sg - dk Home/Notification Icon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgNotifications/a_Save Koala'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of volunteers/i_Manual Approval_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of volunteers/a_View registration'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Review registered op_fe240b/button_Reject'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Review registered op_fe240b/textarea_Rejection reason_b2-TextArea_RejectReason'), 
    'R')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Review registered op_fe240b/button_Reject'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of volunteers/img_Invoices_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of volunteers/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of volunteers/button_Yes'))

WebUI.closeBrowser()

