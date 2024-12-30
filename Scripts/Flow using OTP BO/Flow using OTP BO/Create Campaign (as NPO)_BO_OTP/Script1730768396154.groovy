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

//NPO email
String npoEmail = 'npo_partnerships_test@mailto.plus'

//Campaign title 
String campaignTitle1 = '[AT] Create campaign as NPO (with IPC) 1-4'

String campaignTitle2 = '[AT] Create campaign as NPO (with IPC) - TDR off 1'

String campaignTitle3 = '[AT] Create campaign as NPO (with IPC) Foreign 1'

String campaignTitle4 = '[AT] Create campaign as NPO - Private 1'

String campaignTitle5 = '[AT] Create campaign as NPO (without IPC) 1'

//Campaign description
String campaignDescription = 'This is a great campaign'

//Campaign image file path
String imageFilePath1 = 'C:\\Users\\smadhoosudhan\\Downloads\\Stock Images\\running.jpg'

String imageFilePath2 = 'C:\\Users\\smadhoosudhan\\Downloads\\Stock Images\\beach volleyball.jpg'

//Donation tier and description
String donationTier = '500'

String donationTierDesc = 'We appreciate your giving nature'

//Certificate Permit Number
String certificatePermitNumber = '0018/2023'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address'), npoEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password'), 'hJxcABFZyq7W3jN/JokDdw==')

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

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

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_Campaigns'))

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Create campaign'))

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input__CampaignTitle'), campaignTitle1)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/textarea_Describe your campaign and the giv_319925'), 
    campaignDescription)

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/label_Select file'), imageFilePath1)

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/label_Select file'), imageFilePath2)

WebUI.executeJavaScript('alert(\'Please verify re-arrangement of images and youtube link at this step.\');', null)

WebUI.delay(35)

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/Tags/a_Adults'))

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.executeJavaScript('alert(\'Please input start/end date at this step.\');', null)

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.takeScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_AddDonationTier'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Donation-Input_TierAmount'), 
    '500')

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/textarea_Description'), donationTierDesc)

WebUI.takeScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Confirm'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.takeScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Local'))

WebUI.takeScreenshotAsCheckpoint('8-1')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Back'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Back'))

WebUI.executeJavaScript('alert(\'Please input start/end date at this step.\');', null)

WebUI.delay(10)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Tax deduction is applicable'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_Edit TDR amount'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Allow others to fundraise'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Set_up_mandatory_questions'))

WebUI.takeScreenshotAsCheckpoint('9')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save  preview'))

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('10')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Publish campaign'))

WebUI.takeScreenshotAsCheckpoint('Created campaign - NPO with IPC')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.executeJavaScript('alert(\'Creating campaign without TDR.\');', null)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Create campaign'))

WebUI.takeScreenshotAsCheckpoint('11')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input__CampaignTitle'), campaignTitle2)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/textarea_Describe your campaign and the giv_319925'), 
    campaignDescription)

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/label_Select file'), imageFilePath1)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.takeScreenshotAsCheckpoint('12')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/Tags/a_Adults'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.takeScreenshotAsCheckpoint('13')

WebUI.executeJavaScript('alert(\'Please input start/end date at this step.\');', null)

WebUI.delay(10)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.takeScreenshotAsCheckpoint('14')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_AddDonationTier'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Donation-Input_TierAmount'), 
    donationTier)

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/textarea_Description'), donationTierDesc)

WebUI.takeScreenshotAsCheckpoint('15')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Confirm'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Local'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Allow others to fundraise'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Set_up_mandatory_questions'))

WebUI.takeScreenshotAsCheckpoint('16')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save  preview'))

WebUI.takeScreenshotAsCheckpoint('17')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Publish campaign'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.takeScreenshotAsCheckpoint('Created Campaign 1 (NPO with IPC) - TDR off')

WebUI.executeJavaScript('alert(\'Creating foreign campaign.\');', null)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Create campaign'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input__CampaignTitle'), campaignTitle3)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/textarea_Describe your campaign and the giv_319925'), 
    campaignDescription)

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/label_Select file'), imageFilePath1)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/Tags/a_Adults'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.executeJavaScript('alert(\'Please input start/end date at this step.\');', null)

WebUI.delay(10)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_AddDonationTier'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Donation-Input_TierAmount'), 
    donationTier)

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/textarea_Description'), donationTierDesc)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Confirm'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Foreign'))

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/input_CertificatePermitNumber'), certificatePermitNumber)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Tax deduction is applicable'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_Edit TDR amount'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Allow others to fundraise'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Set_up_mandatory_questions'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save  preview'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Publish campaign'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.takeScreenshotAsCheckpoint('Created Campaign 1 (NPO with IPC) - Foreign')

WebUI.executeJavaScript('alert(\'Creating private campaign.\');', null)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Create campaign'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input__CampaignTitle'), campaignTitle4)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/textarea_Describe your campaign and the giv_319925'), 
    campaignDescription)

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/label_Select file'), imageFilePath1)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/Tags/a_Adults'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.executeJavaScript('alert(\'Please input start/end date at this step.\');', null)

WebUI.delay(10)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_AddDonationTier'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Donation-Input_TierAmount'), 
    donationTier)

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/textarea_Description'), donationTierDesc)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Confirm'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Local'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/input_Switch_Private'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save  preview'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Publish campaign'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.takeScreenshotAsCheckpoint('Created campaign 1 (Private)')

WebUI.executeJavaScript('alert(\'Creating campaign (NPO without IPC).\');', null)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Create campaign'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input__CampaignTitle'), campaignTitle5)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/textarea_Describe your campaign and the giv_319925'), 
    campaignDescription)

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/label_Select file'), imageFilePath1)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/Tags/a_Adults'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.executeJavaScript('alert(\'Please input start/end date at this step.\');', null)

WebUI.delay(10)

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_AddDonationTier'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input_Donation-Input_TierAmount'), 
    donationTier)

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/textarea_Description'), donationTierDesc)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Confirm'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Next'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Local'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/button_Save  preview'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Publish campaign'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.takeScreenshotAsCheckpoint('Created campaign 1 (NPO without IPC)')

