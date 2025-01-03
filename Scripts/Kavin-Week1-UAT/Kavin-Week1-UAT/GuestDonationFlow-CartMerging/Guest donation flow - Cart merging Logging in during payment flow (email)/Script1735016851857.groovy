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

TestObject donationBoxTier = findTestObject('Page_(DS) NPO 0001/donationBoxTier')

WebUI.comment('Found the donation box. Next step is hover!')

//
WebUI.waitForElementVisible(donationBoxTier, 10)

//
WebUI.waitForElementClickable(donationBoxTier, 10)

//
WebUI.mouseOver(donationBoxTier)

TestObject addToCartButton = findTestObject('Object Repository/Page_(DS) NPO 0001/button_Add to cart_TieredDonation')

//WebUI.waitForElementVisible(addToCartButton, 10)
//WebUI.waitForElementClickable(addToCartButton, 10)
//
//WebUI.click(addToCartButton)
//WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/div_I want to donate to (DS) NPO 0001Donati_3ceecc'))
WebUI.setText(findTestObject('Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-13_f08c15'), 'test')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

//WebUI.switchToWindowTitle('(DS) NPO 0001')
//donationBoxTier = findTestObject('Page_(DS) NPO 0001/donationBoxTier')
WebUI.comment('Hovering over the donation box for the second time')

WebUI.waitForElementVisible(donationBoxTier, 10)

//
WebUI.waitForElementClickable(donationBoxTier, 10)

WebUI.scrollToElement(donationBoxTier, 10)

WebUI.mouseOver(donationBoxTier)

////Second iteration in clicking the add to cart button 
////TestObject addToCartButton2 = findTestObject('Object Repository/Page_(DS) NPO 0001/button_Add to cart_TieredDonation')
//WebUI.takeScreenshot()
//
//WebUI.waitForElementVisible(addToCartButton, 10)
//
//if (WebUI.verifyElementVisible(addToCartButton)) {
//    WebUI.comment('Add to cart button  is visible')
//} else {
//    WebUI.comment('Add to cart button is not visible')
//}
//
//WebUI.waitForElementVisible(addToCartButton, 10)
//
//WebUI.waitForElementClickable(addToCartButton, 10)
//WebUI.click(addToCartButton)  //--> This clicking button has issues. Script seems to run with after commenting <-- // 
////////////////////////////////////////////////////////////////////////////////////////
WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/div_I want to donate to (DS) NPO 0001Donati_3ceecc_1'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_Make this a recurring donation'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input__b2-b15-b20-Checkbox1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Monthly'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_31'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-28_c9f2fb'), 
    'test')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

//WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge'))
WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_31_1'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b21-l1-45_26415b'), 
    'test')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Pledge now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Enjoy tax benefits with your donations _40356b'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Log in'))

WebUI.verifyElementText(findTestObject('Page_giving.sgLogin/span_Log in with'), 'Log in with')

WebUI.click(findTestObject('Page_giving.sgLogin/div_Back'))

WebUI.click(findTestObject('Page_giving.sgLogin/button_Back'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Giving cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'member1@dk.dev')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Giving cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/profileAvatar'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_/img'))

WebUI.click(findTestObject('Object Repository/Page_/button_Home'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

//////////////////------test code---------////////////////////////
//
//WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), '(DS) NPO 0001')
//
//WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/span_(DS) NPO 0001'))
//
//WebUI.switchToWindowTitle('(DS) NPO 0001')
//////////////////------test code---------////////////////////////
WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), '(DS) NPO 0001')

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Page_giving.sgDonate - (DS) NPO 0001/span_(DS) NPO 0001'))
WebUI.switchToWindowTitle('(DS) NPO 0001')

WebUI.waitForElementVisible(donationBoxTier, 10)

//
WebUI.waitForElementClickable(donationBoxTier, 10)

//
WebUI.mouseOver(donationBoxTier)

//TestObject addToCartButton = findTestObject('Object Repository/Page_(DS) NPO 0001/button_Add to cart_TieredDonation')

WebUI.click(addToCartButton)

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-30_1b4cca'), 
    'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_TieredDonation'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input__b2-b15-b20-Checkbox1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/a_Monthly'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_31'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-46_8da4fa'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/div_Add to cart'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_25_1_2_3'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/div_I want to donate to (DS) NPO 0001Donati_718a26'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b21-l1-62_a26b93'), 
    'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Pledge now'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_(DS) NPO 0001_b2-b11-l3-768_0-l3-769__f4bdee'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_You are not eligible for tax-deduction _101149'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/span_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Back'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Giving cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/span_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'member1@dk.dev')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Giving cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/profileAvatar'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Logout_1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_/button_Home'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/div_Donate'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), '(DS) NPO 0001')

WebUI.click(findTestObject('Page_giving.sgDonate/button_Search charities or campaigns_btn bt_5e785d'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate - (DS) NPO 0001/span_(DS) NPO 0001_1_2'))

WebUI.switchToWindowTitle('(DS) NPO 0001')

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_CustomDonation'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-14_fa1ede'), 
    'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Add to cart_CustomDonation'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/div_I want to donate to (DS) NPO 0001Donati_3ceecc_1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input__b2-b15-b20-Checkbox1'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Monthly'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/input_Set an end date for when the recurrin_a6ccf3'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_31_1'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b20-l1-29_b6f5dd'), 
    'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Add to cart'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/button_Pledge'))

WebUI.click(findTestObject('Page_(DS) NPO 0001/div_December'))

WebUI.click(findTestObject('Object Repository/Page_(DS) NPO 0001/span_25_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Page_(DS) NPO 0001/input_Test question to ask_b2-b15-b21-l1-46_e94ed7'), 
    'TEST')

WebUI.click(findTestObject('Page_(DS) NPO 0001/span_Pledge now'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_giving.sgCheckout cart/span_1'), '1')

WebUI.verifyElementText(findTestObject('Page_giving.sgCheckout cart/div_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_giving.sgCheckout cart/span_1_1'), '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_(DS) NPO 0001_b2-b11-l3-607_0-l3-608__5ce46a'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Check out'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Payment Details'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Enjoy tax benefits with your donations _40356b_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Back'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Payment Details'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), 'member1@dk.dev')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), '963D2jXv1kXHYewulAqKlg==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.rightClick(findTestObject('Object Repository/Page_giving.sgCheckout cart/div_Payment Details'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/label_Pay with'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgCheckout cart/label_Pay with'), 0)

WebUI.click(findTestObject('Object Repository/Page_giving.sgCheckout cart/input_OR_b2-b10-l1-104_0-RadioGroup'))

WebUI.click(findTestObject('Page_giving.sgCheckout cart/button_Continue with Payment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DK Development Env/svg_Stripe'), 0)

WebUI.click(findTestObject('Object Repository/Page_DK Development Env/div_SGD10.00_SubmitButton-IconContainer'))

WebUI.click(findTestObject('Object Repository/Page_DK Development Env/button_Complete'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_giving.sgPayment status/span_Completed'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_giving.sgPayment status/span_Completed'), 'Completed')

