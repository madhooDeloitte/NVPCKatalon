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

//org email
String orgEmail = 'ethanorg1@mailto.plus'

//admin public URL
String adminPublicURL = 'https://dk.deloitte-sea.com/admin/public'

//switch admin URL
String switchAdminURL = 'https://dk.deloitte-sea.com/admin/switchadmin'

//logout URL
String logoutURL = 'https://dk.deloitte-sea.com/auth/logout'

//gu email
String guEmail = 'ethangu2@mailto.plus'

//home URL
String homeURL = 'https://dk.deloitte-sea.com/home'

//login RUL
String loginURL = 'https://dk.deloitte-sea.com/auth/login'

//rejection text
String rejectionText = 'test'

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

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/div_Audit log_b1-b5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin Home/div_Public profilePartnership applicationsS_1678b8'), 
    0)

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/a_Public profile'))

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl(adminPublicURL)

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.navigateToUrl(switchAdminURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/a_4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgNotifications/div_Notifications'), 0)

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgNotifications/div_A new application, Groundup, has been r_2589f3'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgNotifications/b_Groundup'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Groundup registration review'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/button_Review'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/button_Registered'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/th_Groundup name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/th_Groundup admin'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/th_Date submitted'), 
    0)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/i_Ethan Org 1_fa-solid fa-ellipsis-vertical'), 
//   0)
//WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/i_Ethan Org 1_fa-solid fa-ellipsis-vertical'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/td_PreviewApproveReject'), 
    0)

WebUI.takeScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Ethan Org 1_icon-box'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sg - admin GU application list/a_Preview_1'))

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/a_Preview'))

WebUI.takeScreenshotAsCheckpoint('6')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/div_Registration review'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/div_General information'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/div_Account details'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/div_General information_1'))

'3.12 Verify that the user is automatically scrolled to General Information section'
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/div_Account details_1'))

'3.12 Verify that the user is automatically scrolled to Account Details section'
WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('7')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/button_Approve'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/button_Approve'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/div_Confirm Groundup registration approval'), 
    0)

WebUI.takeScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/button_Yes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Groundup registration has been approved'), 
    0)

WebUI.takeScreenshotAsCheckpoint('9')

'3.17 Verify that the user is redirected back to the "To review" page\r\n3.22 Verify that the approved GU is no longer under the "To review" section'
WebUI.delay(10)

//WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/i_Ethan Org 1_fa-solid fa-ellipsis-vertical_1'))
WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Ethan Org 1_icon-box'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sg - admin GU application list/a_Approve'))

WebUI.takeScreenshotAsCheckpoint('11')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/a_Approve'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Confirm Groundup registration approval'), 
    0)

WebUI.takeScreenshotAsCheckpoint('12')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/button_No'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/button_Registered'))

'3.23 Verify that the recently approved GU is on the list'
WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('13')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Audit log_b1-b5'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/button_Yes'))

WebUI.navigateToUrl(logoutURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogout/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'),  guEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_c8c0c6'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_f01607'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_5cf610'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_a193f6'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_8059f5'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_fe0d50'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.takeScreenshotAsCheckpoint('14')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/div_Audit log_b1-b5'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogout/button_Log in'))

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

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/a_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgNotifications/b_Groundup'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Ethan Org 1_icon-box'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_giving.sg - admin GU application list/a_Reject'))

WebUI.takeScreenshotAsCheckpoint('15')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/a_Reject'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Reject registration'), 
    0)

WebUI.takeScreenshotAsCheckpoint('16')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Ethan Org 1_icon-box'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/a_Preview_1_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/button_Reject'), 
    0)

WebUI.takeScreenshotAsCheckpoint('17')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/button_Reject'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/div_Reject registration'), 
    0)

WebUI.takeScreenshotAsCheckpoint('18')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/button_Reject'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/span_Reject reason is mandatory'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/textarea_Rejection reason_b2-TextArea_Rejec_b75d45'), 
    rejectionText)

WebUI.takeScreenshotAsCheckpoint('19')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application detail/button_Reject'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin GU application list/div_Review successful. Rejection sent'), 
    0)

WebUI.takeScreenshotAsCheckpoint('20')

'3.35 Verify that the user is redirected back to the "To Review" page\r\n3.40 Verify that the rejected GU is no longer under the "To Review" section'
WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin GU application list/button_Registered'))

WebUI.takeScreenshotAsCheckpoint('21')

'3.41 Verify that the recently rejected GU is not on the list'
WebUI.delay(0)

WebUI.click(findTestObject('Page_giving.sg - admin Home/div_Audit log_b1-b5'))

WebUI.click(findTestObject('Page_giving.sg - admin Home/a_Logout'))

WebUI.click(findTestObject('Page_giving.sg - admin Home/button_Yes'))

WebUI.click(findTestObject('Page_giving.sgLogout/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), guEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgLogin/div_Invalid username or password'), 0)

WebUI.delay(10)

WebUI.navigateToUrl(homeURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.navigateToUrl(loginURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/a_Forgot password'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Email address_b3-Input_a_Email'), orgEmail)

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('22')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Reset my password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgForgot password/div_Verification'), 0)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_ef9bb1'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_097a1c'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_bab0a8'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_29d5ba'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_f9cf9b'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgForgot password/input_If the account exists, you will recei_c37bcb'), 
    '1')

WebUI.takeScreenshotAsCheckpoint('23')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Verify'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgForgot password/div_Set new password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Password_b3-Input_Password'), 
    'I8onnkjXMSsLWFAaetrTJg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), 
    'I8onnkjXMSsLWFAaetrTJg==')

WebUI.takeScreenshotAsCheckpoint('24')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Reset password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgForgot password/div_Password must not match the last 3 used_998917'), 
    0)

WebUI.takeScreenshotAsCheckpoint('25')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Password_b3-Input_Password'), 
    'hJxcABFZyq4UmjzjoWinXA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), 
    'hJxcABFZyq4UmjzjoWinXA==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Reset password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgForgot password/span_Please ensure your password meets the _526471'), 
    0)

WebUI.takeScreenshotAsCheckpoint('26')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Password_b3-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgForgot password/input_Confirm password_b3-Input_ConfirmPassword'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/i_Password_icon fa fa-eye fa-1x'))

WebUI.takeScreenshotAsCheckpoint('27')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Reset password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgForgot password/div_Reset password'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgForgot password/div_Your password was changed successfully._928c57'), 
    0)

WebUI.takeScreenshotAsCheckpoint('28')

WebUI.click(findTestObject('Object Repository/Page_giving.sgForgot password/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), orgEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.takeScreenshotAsCheckpoint('29')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_8e3268'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_673311'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_5ce967'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_73a537'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_8c0832'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_If the account exists, you will recei_cbed31'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.takeScreenshotAsCheckpoint('30')

