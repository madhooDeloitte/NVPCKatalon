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

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'ethanorg1@mailto.plus')

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

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/a_Members'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/div_Members'), 
    0)

WebUI.takeScreenshotAsCheckpoint('1')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Last login'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/i_hannahbarbarahotmail.com_fa-solid fa-elli_0e818a'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Pending Acceptance5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Invited on'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/i_member3dk.dev_fa-solid fa-ellipsis-vertical'), 
    0)

WebUI.takeScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Invite member'))

WebUI.takeScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Download template'))

WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/label_Upload file'), 'C:\\Users\\smadhoosudhan\\Downloads\\Katalon\\Test data\\BulkUpload_MembersInvite.xlsx')

WebUI.verifyElementText(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/span_BulkUpload_MembersInvite.xlsx'), 
    'BulkUpload_MembersInvite.xlsx')

WebUI.takeScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Send invite'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/div_Invitation sent'), 
    0)

WebUI.takeScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_View batch upload'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/div_Batch upload'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Batch sequence'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Status'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Invite sent'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Pending response'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Existing member'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Failed'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Processed on'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/i_hannahbarbarahotmail.com_fa-solid fa-elli_0e818a'), 
    0)

WebUI.takeScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/div_FirstBatchItem_ViewMoreActionsBtn'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Status'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Error'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/th_Processed on'), 
    0)

WebUI.takeScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/div_Audit log_b1-b5'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/button_Yes'))

WebUI.navigateToUrl('https://dk.deloitte-sea.com/auth/logout')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogout/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'ATmanagemember1@mailto.plus')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq4oD3Y625LFBg==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_2'))

WebUI.takeScreenshotAsCheckpoint('9')

WebUI.click(findTestObject('Object Repository/Page_giving.sgNotifications/a_View the invite'))

WebUI.navigateToUrl('https://dk.deloitte-sea.com/giver/settings/membership')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSettings/div_Membership'), 0)

WebUI.takeScreenshotAsCheckpoint('10')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/button_Accept'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSettings/div_Accept membership invite'), 0)

WebUI.takeScreenshotAsCheckpoint('11')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/button_Yes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSettings/div_Membership accepted'), 0)

WebUI.takeScreenshotAsCheckpoint('12')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/div_ProfileIcon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/button_Yes_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogout/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'ATmanagemember2@mailto.plus')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/a_2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgNotifications/a_View the invite'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/button_Decline'))

WebUI.takeScreenshotAsCheckpoint('13')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/button_Yes_1_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgSettings/div_Membership declined'), 0)

WebUI.takeScreenshotAsCheckpoint('14')

