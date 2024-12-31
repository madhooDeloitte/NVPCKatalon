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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

String inputSearch = '(DS) NPO 0001'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), inputSearch)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Create Campaign as Org/Page_giving.sgDonate - npo/span_CharityName'))

WebUI.switchToWindowTitle('(DS) NPO 0001')

TestObject donationBox = findTestObject('Page_(DS) NPO 0001/hoverDonationBox')

//WebDriver driver = DriverFactory.getWebDriver()
//
//String donationBoxXpath = "//div[@id='b2-b15-b13-Action']"
//
//WebElement donationBoxElement = driver.findElement(By.xpath(donationBoxXpath))
//
//WebUI.executeJavaScript("arguments[0].scrollIntoView(true);", Arrays.asList(donationBox))
WebUI.comment('Found the donation box. Next step is hover!')

//
WebUI.waitForElementVisible(donationBox, 10)

//
WebUI.waitForElementClickable(donationBox, 10)

//
WebUI.mouseOver(donationBox)

//// Now, click on the donation box
//WebUI.click(donationBox)
WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_CustomDonation'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input__b2-b15-b20-Input_OtherAmount'), '10001')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

WebUI.waitForElementVisible(findTestObject('Page_(DS) NPO 0001/span_Donation amount should not exceed 10,000'), 10)

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Donation amount should not exceed 10,_269761'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/a_Monthly'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/i_Set an end date for when the recurring wi_35c395'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/div_December'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_31'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_Add to cart'))

WebUI.verifyElementText(findTestObject('Page_(DS) NPO 0001/span_Donation amount should not exceed 10,000'), 'Donation amount should not exceed $10,000')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Cancel'))

WebUI.scrollToElement(donationBox, 5)

WebUI.waitForElementVisible(donationBox, 10)

WebUI.waitForElementClickable(donationBox, 10)

WebUI.mouseOver(donationBox)

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input__b2-b15-b21-Input_OtherAmount'), '10001')

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/div_Pledge due date_b2-b15-b21-b7-b1-Icon'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/i_Pledge due date_icon fa fa-calendar fa-1x'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_31_1'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b21-l1-15_c019da'), 
    'test')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Pledge now'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Cancel'))

WebUI.scrollToElement(donationBox, 5)

WebUI.waitForElementVisible(donationBox, 10)

WebUI.waitForElementClickable(donationBox, 10)

WebUI.mouseOver(donationBox)

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input__b2-b15-Input_OtherAmount'), '1000')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_CustomDonation'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-15_7b1d18'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_Add to cart'))

WebUI.mouseOver(donationBox)

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input__b2-b15-Input_OtherAmount'), '1000')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_CustomDonation'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Donation amount should not exceed 10,_269761'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Monthly'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/div_Set an end date for when the recurring _68041e'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/i_Set an end date for when the recurring wi_35c395'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_31_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-31_41cd3b'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/button_Add to cart_1_2'))

WebUI.mouseOver(donationBox)

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge_1'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input__b2-b15-b21-Input_OtherAmount'), '1000')

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/div_Pledge due date_b2-b15-b21-b7-b1-Icon'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/div_Pledge due date_b2-b15-b21-b7-Icon'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/i_Pledge due date_icon fa fa-calendar fa-1x'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_31_1_2_3'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b21-l1-47_db2abe'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/button_Pledge now'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/div_test_icon-box'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/a_Edit'))

WebUI.setText(findTestObject('Page_giving.sgCheckout cart/input__b2-b11-b14-Input_OtherAmount'), '10001')

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Save changes'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Cancel'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/spanPledge'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/div_test_icon-box_2'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/a_Edit_1'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgCheckout cart/input__b2-b13-b14-Input_OtherAmount'), '10001')

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Save changes'))

//WebUI.verifyElementText(findTestObject('Page_giving.sgCheckout cart/span_Donation amount should not exceed 10,000_1'), 'Donation amount should not exceed $10,000')
WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Cancel_1'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/span_Recurring1'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/div_test_icon-box_3'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/a_Edit_1_2'))

WebUI.setText(findTestObject('Page_giving.sgCheckout cart/input__b2-b15-b14-Input_OtherAmount'), '10001')

WebUI.click(findTestObject('Page_giving.sgCheckout cart/span_Save changes'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Cancel_1_2'))

