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

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address'), 'emma@kill-charity.com')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_2'), '2')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_3'), '3')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_4'), '4')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_5'), '5')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/OTP/input_OTP_6'), '6')

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/span_Opportunities'))

WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities'), 
    'test')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/div_Filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/div_Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/span_Ending soon'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_All_b2-RadioGroup1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Virtual-RadioGroup2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_OneTime-RadioGroup3'))

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/input_Active-Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/button_Apply'))

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/div_Filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/button_Clear all'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/th_sortOppTitle'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/th_sortOppTitle'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/button_History'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/div_Filters'))

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/input_Ended_Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/div_Filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/button_Clear all'))

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/th_sortOppTitle - History'))

WebUI.click(findTestObject('Page_giving.sg - admin List of opportunities/th_sortOppTitle - History'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/button_Opportunities'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities'), 
    'kill')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/i_Emma Watsons_fa-solid fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/a_View'))

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/volunteer/opportunity/youth-atrisk--opp-by-kill')

WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Object Repository/Page_giving.sgOpportunity detail - Youth at_dac8c7/i_Stories_fa-solid fa-chart-area'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Home/span_Opportunities'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities'), 
    'kill')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/input_Search opportunities'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/i_Emma Watsons_fa-solid fa-ellipsis-vertical_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/a_Cancel opportunity'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/textarea_tes'), 'test')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/span_Youth at-risk - Opp by KILL'))

WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of volunteers/button_Return to opportunities'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin List of opportunities/button_Collaborations'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Collaboration/i_rajeevmarriott.dk.dev_fa-solid fa-ellipsi_9d30d0'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Collaboration/a_View request'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Review opportunities/button_Return to listing'))

WebUI.click(findTestObject('Page_giving.sg - admin Collaboration/i_rajeevmarriott.dk.dev_fa-solid fa-ellipsi_9d30d0'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Collaboration/a_Reject'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Collaboration/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Collaboration/img_Invoices_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Collaboration/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Collaboration/button_Yes'))

WebUI.closeBrowser()

