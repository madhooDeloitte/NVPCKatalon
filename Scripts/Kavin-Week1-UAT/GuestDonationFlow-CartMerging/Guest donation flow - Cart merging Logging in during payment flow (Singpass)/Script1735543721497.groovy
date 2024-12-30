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

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), '(DS) NPO 0001')

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/span_(DS) NPO 0001'))

WebUI.switchToWindowTitle('(DS) NPO 0001')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_TieredDonation'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-13_f08c15'), 'test')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_TieredDonation'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input__b2-b15-b20-Checkbox1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Monthly'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_27'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-28_c9f2fb'), 'test')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/div_December'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_27_1'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b21-l1-45_26415b'), 'test')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_You are currently not logged in. When y_a6311a'), 
    0)

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgLogin/div_Log in with'), 0)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Back'))

WebUI.click(findTestObject('Page_giving.sgLogin/div_Back'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Login with'))

WebUI.click(findTestObject('Page_Singpass login/button_Password login'))

WebUI.setText(findTestObject('Page_Singpass login/input_Password login_username'), 'S8102792G')

WebUI.setEncryptedText(findTestObject('Page_Singpass login/input__password'), 'tUM5ps8PP6KPbMdZX3AbAQ==')

WebUI.sendKeys(findTestObject('Page_Singpass login/input__password'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgCheckout cart/div_Giving cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/img'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/div_Logout'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Yes'))

WebUI.click(findTestObject('Page_giving.sgLogout/button_Log in'))

WebUI.click(findTestObject('Page_giving.sgLogin/div_Back'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Donate'))

WebUI.setText(findTestObject('Object Repository/Page_giving.sgDonate - (DS) NPO 0001/input_Search charities or campaigns_b2-SearchInput'), 
    '(DS) NPO 0001')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgDonate - (DS) NPO 0001/input_Search charities or campaigns_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/span_(DS) NPO 0001_1'))

WebUI.switchToWindowTitle('(DS) NPO 0001')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-13_f08c15'), 'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Make this a recurring donation'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input__b2-b15-b20-Checkbox1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Monthly'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_27_1_2_3'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-13_f08c15'), 'test')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_27_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b21-l1-62_e999b4'), 
    'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge now'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_(DS) NPO 0001_b2-b11-l3-764_0-l3-765__a61625'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgCheckout cart/div_You are not eligible for tax-deduction _101149'), 
    0)

WebUI.click(findTestObject('Page_giving.sgCheckout cart/span_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.click(findTestObject('Page_giving.sgLogin/div_Back'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgCheckout cart/div_Giving cart'), 0)

WebUI.click(findTestObject('Page_giving.sgCheckout cart/span_Log in'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Login with'))

WebUI.click(findTestObject('Page_Singpass login/button_Password login'))

WebUI.setText(findTestObject('Page_Singpass login/input_Password login_username'), 'S8102792G')

WebUI.setEncryptedText(findTestObject('Page_Singpass login/input__password'), 'pZi1gTruG2ZUVJx/8rRtfA==')

WebUI.sendKeys(findTestObject('Page_Singpass login/input__password'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_Singpass login/input_Password login_username'), 'S8102792G')

WebUI.setEncryptedText(findTestObject('Page_Singpass login/input__password'), 'tUM5ps8PP6KPbMdZX3AbAQ==')

WebUI.click(findTestObject('Page_Singpass login/b_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgCheckout cart/div_Giving cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/img'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/div_Logout'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogout/div_Home'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/div_Donate'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), '(DS) NPO 0001')

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/span_(DS) NPO 0001_1'))

WebUI.switchToWindowTitle('(DS) NPO 0001')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-13_f08c15'), 'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-28_c9f2fb'), 'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/input__b2-b15-b20-Checkbox1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Monthly'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_27_1_2_3_4_5'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_27_1_2_3_4_5_6'))

WebUI.setText(findTestObject('Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b21-l1-45_26415b'), 'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/span_One-time'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/span_Pledge'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/span_Recurring'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_One-time1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_(DS) NPO 0001_b2-b11-l3-596_0-l3-597__d961c6'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Check out'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_You are currently not logged in. When y_dd6408'), 
    0)

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.click(findTestObject('Page_giving.sgLogin/div_Back'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgCheckout cart/div_Payment Details'), 0)

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Login with'))

WebUI.click(findTestObject('Page_Singpass login/button_Password login'))

WebUI.setText(findTestObject('Page_Singpass login/input_Password login_username'), 'S8102792G')

WebUI.setEncryptedText(findTestObject('Page_Singpass login/input__password'), 'tUM5ps8PP6KPbMdZX3AbAQ==')

WebUI.sendKeys(findTestObject('Page_Singpass login/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_Pay with_b2-b10-l1-104_0-RadioGroup'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Continue with Payment'))


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

