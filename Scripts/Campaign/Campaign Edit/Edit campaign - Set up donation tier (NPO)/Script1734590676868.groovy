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

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('1 main page')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'emma@kill-charity.com')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('2 NPO login input')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_834fd0'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_a67e6b'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_138dc5'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_0322ef'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_acc042'), '1')

WebUI.setText(findTestObject('Page_giving.sgLogin/input_If the account exists, you will recei_1714ca'), '1')

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('OTP input')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Verify'))

WebUI.delay(7)

WebUI.takeScreenshotAsCheckpoint('4 back to main page')

WebUI.click(findTestObject('Page_giving.sg - admin Home/span_Campaigns'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('5 campaigns page')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/tbl_Campaign - Status'))

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/i_Emma Watsons_fa-solid fa-ellipsis-vertical'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('6 view more actions button')

WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/a_Edit'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('7 editting campaign')

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgEdit campaign/button_Next_1_2'))

WebUI.takeFullPageScreenshotAsCheckpoint('8 describe campaign page')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/i_Remove_icon fa fa-plus fa-1x'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('9 chose edit')

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b2-b28-b14-Input_TierAmount'), 
    '2135')

WebUI.takeFullPageScreenshotAsCheckpoint('10 add donation tier ')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('11 confirm add')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/i__fa-solid fa-ellipsis-vertical'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('12 chose edit')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/input_Donation amount_b2-b28-b14-Input_TierAmount'), 
    '2316')

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('13 edit amount')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Confirm'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('14 confirm edit')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/i__fa-solid fa-ellipsis-vertical_1'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('15 chose edit')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/a_Remove'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('16 confirm removal')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Next_1_2_3'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('17 proceed to publish')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Publish'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('18 confirm publish')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Confirm_1'))

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('19 back to page')

WebUI.click(findTestObject('Object Repository/Page_giving.sg - admin Edit campaign/button_Return to campaign list'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('20 campaigns main page')

//WebUI.takeFullPageScreenshotAsCheckpoint('12')
WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/i_Emma Watsons_fa-solid fa-ellipsis-vertical'))

//WebUI.takeFullPageScreenshotAsCheckpoint('13')
WebUI.click(findTestObject('Page_giving.sg - admin Campaigns/a_View'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('21 view campaign')

campaignTitle = WebUI.getText(findTestObject('Object Repository/Page_giving.sg - admin Campaigns/span_campaign title'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('22 search campaign')

WebUI.switchToWindowTitle('giving.sg : Campaign detail - ' + campaignTitle)

WebUI.scrollToElement(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgCampaign detail/textarea_DonationTiers'), 
    3)

WebUI.delay(4)

WebUI.takeFullPageScreenshotAsCheckpoint('23 see edits ')

//WebUI.click(findTestObject('Page_giving.sgCampaign detail - testing whitespace/div_2,315'))
WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/img_Stories_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCampaign detail - giver fundr_e71de0/button_Yes'))

WebUI.closeBrowser()

