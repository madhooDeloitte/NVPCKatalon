 //previous script (contains error some elements/object cannot be clicked et):
// import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
//import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling as FailureHandling
//import com.kms.katalon.core.testcase.TestCase as TestCase
//import com.kms.katalon.core.testdata.TestData as TestData
//import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
//import com.kms.katalon.core.testobject.TestObject as TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import internal.GlobalVariable as GlobalVariable
//import org.openqa.selenium.Keys as Keys
//
//String envURL = 'https://dk.deloitte-sea.com/home'
//
////Giver name
//String giverName = 'BobGiver1'
//
////giver email
//String giverEmail = 'bobgiver1@gmail.com'
//
////NRIC
//String NRIC = 'S4930168E'
//
////Mobile number
//String mobileNumber = '88884444'
//
////postal code
//String postalCode = '018956'
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(envURL)
//
//WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/button_Accept all'))
//
//WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Sign up'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/GiverSignUpBanner'))
//
////WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Sign up with email'))
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Full name_b5-b3-Input_GiverName'), 
//    giverName)
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Email_b5-b3-Input_Email'), giverEmail)
//
//WebUI.click(findTestObject('Page_giving.sgGiver linking account/input_CalenderDate'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/span_19'))
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Password_b5-b3-Input_Password'), 
//    'hJxcABFZyq6YA1kwHae0pw==')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Confirm password_b5-b3-Input_ConfirmPassword'), 
//    'hJxcABFZyq6YA1kwHae0pw==')
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Confirm password_b5-b3-IsConsent_Checkbox'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue'))
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_1'), '1')
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_2'), '1')
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_3'), '1')
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_4'), '1')
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_5'), '1')
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_6'), '1')
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Verify'))
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_NRIC_b5-b5-Input_NRIC'), NRIC)
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_(65)_b5-b5-Input_MobileNumber'), 
//    mobileNumber)
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_ChooseSex'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_Male'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_ChooseEthnicity'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/div_CHINESE'))
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_Postal code_b5-b5-Input_PostalCode'), 
//    postalCode)
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue_1'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Adults'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Animal welfare'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Animals'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Arts, culture and heritage'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Caregivers'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue_1_2'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/a_Accounting and finance'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Continue_1_2_3'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Start your giving journey'))
//
//WebUI.setText(findTestObject('Object Repository/Page_giving.sgLogin/input_Email address'), giverEmail)
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_giving.sgLogin/input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgLogin/button_Log in'))
//
//WebUI.closeBrowser()
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.util.UUID as UUID
import java.util.Random as Random
import java.text.SimpleDateFormat as SimpleDateFormat
import utils.EmailGenerator as EmailGenerator

def timestamp = new SimpleDateFormat('yyyyMMddHHmmss').format(new Date())

String envURL = 'https://dk.deloitte-sea.com/home'

// Generate giver fullname <Test Giver datetime>
String giverName = 'Test Giver ' + timestamp

// Generate giver email <giver_datetime@testdata.com>
String giverEmail = EmailGenerator.generateEmail('Giver')

// Generate random valid NRIC
String NRIC = generateValidNRIC()

// Generate random valid Singapore Mobile Number (starts with 8 or 9)
String startDigit = new Random().nextBoolean() ? '8' : '9'

String mobileNumber = startDigit + (1000000 + new Random().nextInt(9000000)).toString()

// Generate random valid Singapore Postcode (6 digits)
String postalCode = (100000 + new Random().nextInt(900000)).toString()

println('Generated name: ' + giverName)

println('Generated email: ' + giverEmail)

println('Generated nric: ' + NRIC)

println('Generated mobile number: ' + mobileNumber)

println('Generated postcode: ' + postalCode)

WebUI.openBrowser('')

WebUI.navigateToUrl(envURL)

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/a_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgSign up now/GiverSignUpBanner'))

WebUI.click(findTestObject('Page_giving.sgGiver linking account/a_Sign up with email'))

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Email_b5-b3-Input_Email'), giverEmail)

TestObject continueBtn = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//button[contains(text(), \'Continue\')]')

WebUI.click(continueBtn)

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_3'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_4'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_5'), '1')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgGiver linking account/input_OTP_6'), '1')

WebUI.click(findTestObject('Object Repository/Page_giving.sgGiver linking account/button_Verify'))

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_Full name_b5-b5-Input_FullName'), giverName)

WebUI.setText(findTestObject('Page_giving.sgGiver linking account/input_NRIC  FIN_b5-b5-Input_NRIC'), NRIC)

// manual input for date piker
WebUI.delay(20)

//String js = """
//  var input = document.querySelector('input.input');
//  if (input && input._flatpickr) {
//    input._flatpickr.setDate('15-04-1999', true);  // dd-mm-yyyy
//  }
//"""
//WebUI.executeJavaScript(js, null)
WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Password_b5-b5-Input_Password'), 'hJxcABFZyq6YA1kwHae0pw==')

WebUI.setEncryptedText(findTestObject('Page_giving.sgGiver linking account/input_Confirm password_b5-b5-Input_ConfirmPassword'), 
    'hJxcABFZyq6YA1kwHae0pw==')

WebUI.click(findTestObject('Page_giving.sgGiver linking account/input_Confirm password_b5-b5-Checkbox_IsConsent'))

WebUI.click(findTestObject('Page_giving.sgGiver linking account/button_Sign up'))

WebUI.delay(3)

// Create dynamic TestObject for success message
TestObject dynamicObj = new TestObject()
dynamicObj.addProperty("xpath", ConditionType.EQUALS, "//div[contains(text(), 'Thank you for signing up')]")

// Use waitForElementVisible instead of verifyElementVisible with timeout
boolean isNextPage = WebUI.waitForElementVisible(dynamicObj, 5, FailureHandling.OPTIONAL)

String reportsDir = RunConfiguration.getReportFolder()

if (isNextPage) {
    println('Form was valid. Registration successful.')
    WebUI.takeScreenshot("${reportsDir}/keyes/keyes-${GlobalVariable.testCaseName}_1.png")
} else {
    println('Form was invalid. Staying on current page.')
    WebUI.takeScreenshot("${reportsDir}/keyes/keyes-${GlobalVariable.testCaseName}_2.png")
}

//WebUI.closeBrowser( // Function to select any month
//    // Optional: click to open the month picker first, if needed
//    ) // adjust if there's a toggle
//// Create dynamic TestObject for the month name

String generateValidNRIC() {
    def random = new Random()

    String prefix = random.nextBoolean() ? 'S' : 'T'

    String digits = (1000000 + random.nextInt(9000000)).toString()

    int[] weights = [2, 7, 6, 5, 4, 3, 2]

    int total = 0

    for (int i = 0; i < 7; i++) {
        total += (Character.getNumericValue(digits.charAt(i)) * (weights[i]))
    }
    
    if (prefix == 'T') {
        total += 4
    }
    
    int remainder = total % 11

    List<String> checksumMap = ['J', 'Z', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A']

    String suffix = checksumMap[remainder]

    return (prefix + digits) + suffix
}

