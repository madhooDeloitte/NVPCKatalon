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

String userEmail = 'linda@rhmc.dk.dev'

String userPassword = 'hJxcABFZyq6YA1kwHae0pw=='

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_SG60 SHARE'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_DONATE NOW'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/a_Log in'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), userEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.delay(3)

'check input of details'
WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_834fd0'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_a67e6b'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_138dc5'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_0322ef'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_acc042'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_1714ca'), '1')

WebUI.delay(3)

'check input of otp'
WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.sendKeys(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_1714ca'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

'verify back to home page'
WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_DONATE NOW'), 3)

WebUI.delay(3)

'verify campaign landing page'
WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/img_Stories_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSG60 SHARE/button_Yes'))

WebUI.closeBrowser()

