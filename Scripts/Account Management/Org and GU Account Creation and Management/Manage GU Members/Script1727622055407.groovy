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

//email
String guEmail = 'seantayGUmarriott@mailto.plus'

//FilePath
String filePath = 'C:\\Users\\aahmedmahir\\Downloads\\BulkUpload_MembersInvite.xlsx'

//giver email
String giverEmail = 'amirgiver1@mailto.plus'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050 (5)/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050 (5)/a_Log in'))

//WebUI.delay(100)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_Email address_b3-b9-Input_EmailAddress'), 
    guEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (3)/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin (3)/input_Password_b3-b9-Input_Password'), 
    'hJxcABFZyq6YA1kwHae0pw==')

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

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home (6)/a_Members'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Active (0)'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Pending Acceptance0'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Invite member'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Download template'))

WebUI.uploadFile(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/label_Upload file'), filePath)

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Send invite'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_View batch upload'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/i_Success_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/a_View'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/img'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of giver members/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogout (3)/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin (5)/input_Email address_b3-b9-Input_EmailAddress'), 
    giverEmail)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (5)/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin (5)/input_Password_b3-b9-Input_Password'), 
    'hJxcABFZyq4ozL+lET5U4g==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin (5)/button_Log in'))

WebUI.click(findTestObject('Page_giving.sg - admin Home (1)/a_99 - Copy'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050 (7)/div_Stories_b1-b3-b1-Icon_WIthCount'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgNotifications (2)/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/a_Membership'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/button_Accept'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050 (7)/div_Stories_b1-b3-b1-Icon_WIthCount'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSettings/a_Logout'))

