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

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address'), 'npo_partnerships_test@mailto.plus')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '2')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '3')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '4')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '6')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '5')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/span_Campaigns'))

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/button_Create campaign'))

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/input__CampaignTitle'), '[AT] Create campaign as NPO (with IPC) 2')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_AddCampaignGoal'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/textarea_Describe your campaign and the giv_319925'), 
    'This is a great campaign')

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/label_Select file'), 'C:\\Users\\smadhoosudhan\\Downloads\\Stock Images\\beach volleyball.jpg')

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin Create new campaign/label_Select file'), 'C:\\Users\\smadhoosudhan\\Downloads\\Stock Images\\running.jpg')

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

WebUI.setText(findTestObject('Page_giving.sg - admin Create new campaign/textarea_Description'), 'We appreciate your giving nature')

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

WebUI.takeScreenshotAsCheckpoint('11')

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.click(findTestObject('Page_giving.sg - admin Create new campaign/button_Return to campaign list'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('12')

