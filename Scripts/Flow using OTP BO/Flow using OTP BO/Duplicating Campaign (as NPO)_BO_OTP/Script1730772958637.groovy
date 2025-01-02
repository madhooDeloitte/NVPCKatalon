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

String envURL = 'https://dk.deloitte-sea.com/home'

String envOTPURL = 'https://dk.deloitte-sea.com/NVPC_Notification_BO/OTPListScreen'

//NPO Email
String npoEmail = 'emma@kill-charity.com'

//Input search
String inputSearch1 = 'test'

String inputSearch2 = 'test'

String inputSearch3 = 'test'

//Campaign Titles
String campaignTitle1 = 'Duplicate Active Local Campaign 1'

String campaignTitle2 = 'Duplicate Active Foreign Campaign 1'

String campaignTitle3 = 'Duplicate Active Private Campaign 1'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address'), npoEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

String envOTPURL = 'https://dk.deloitte-sea.com/NVPC_Notification_BO/OTPListScreen'

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

WebUI.delay(40)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_Campaigns'))

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/input_Search campaigns_b2-SearchInput'), inputSearch1)

WebUI.sendKeys(findTestObject('Page_giving.sg - admin Create new campaign/input_Search campaigns_b2-SearchInput'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_SortStatus'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/i_ViewMore_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Duplicate'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input__CampaignTitle'), campaignTitle1)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Start date'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_27'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_End date'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_30'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save  preview'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Publish campaign'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.takeFullPageScreenshotAsCheckpoint('Duplicated Active Local Campaign')

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/input_Search campaigns_b2-SearchInput'), inputSearch2)

WebUI.sendKeys(findTestObject('Page_giving.sg - admin Create new campaign/input_Search campaigns_b2-SearchInput'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_SortStatus'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/i_ViewMore_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Duplicate'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input__CampaignTitle'), campaignTitle2)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Start date'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_27'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_End date'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_30'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Foreign'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save  preview'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Publish campaign'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.takeFullPageScreenshotAsCheckpoint('Duplicated Active Foreign Campaign 1')

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/input_Search campaigns_b2-SearchInput'), inputSearch3)

WebUI.sendKeys(findTestObject('Page_giving.sg - admin Create new campaign/input_Search campaigns_b2-SearchInput'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_SortStatus'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/i_ViewMore_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Duplicate'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input__CampaignTitle'), campaignTitle3)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Start date'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_27'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_End date'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_30'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/input_Switch_Private'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save  preview'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Publish campaign'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.takeFullPageScreenshotAsCheckpoint('Duplicated Active Private Campaign 1')
