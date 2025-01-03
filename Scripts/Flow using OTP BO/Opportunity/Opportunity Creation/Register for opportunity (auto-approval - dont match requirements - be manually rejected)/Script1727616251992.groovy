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

//giver email
String giverEmail = 'member3@dk.dev'

//input search opportunity
String inputSearchOpp = 'youth at'

//Opp Page name
String oppPageName = 'giving.sg : Opportunity detail - Youth at-risk - Opp by KILL'

//npo email
String npoEmail = 'emma@kill-charity.com'

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address'), giverEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Volunteer'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), inputSearchOpp)

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer - Youth at/span_Youth at-risk - Opp by KILL'))

WebUI.switchToWindowTitle(oppPageName)

WebUI.click(findTestObject('Page_giving.sgOpportunity detail Buttons/button_I want to volunteer'))

WebUI.click(findTestObject('Page_giving.sgOpportunity detail Buttons/button_Volunteer for this'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgRegister for opportunity/input_Human resource_b2-b3-ConsentGiven_Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgRegister for opportunity/button_Register'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgRegister for opportunity/button_Browse more opportunities'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer/img_Stories_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer/button_Yes'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address'), npoEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '2')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '3')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '4')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '5')

WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '6')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Page_giving.sg - dk Home/Notification Icon'))

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/span_Youth at-risk - Opp by KILL'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of volunteers/div_Volunteers'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of volunteers/div_Auto-approval_icon-box'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of volunteers/a_Review'))

WebUI.click(findTestObject('Page_giving.sg - admin Collaboration/img_Invoices_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Create Campaign as Org/Page_giving.sgDonate/div_Logout'))

WebUI.click(findTestObject('Page_giving.sg - admin Home/button_Yes'))

WebUI.closeBrowser()

