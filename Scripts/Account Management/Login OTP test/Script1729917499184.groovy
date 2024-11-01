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
import groovy.json.JsonSlurper as JsonSlurper
import java.net.HttpURLConnection as HttpURLConnection
import java.net.URL as URL

// Replace this with your temporary email
String tempEmail = 'npo_partnerships_test@mailto.plus'

WebUI.openBrowser('https://dk.deloitte-sea.com/auth/login')

//WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg/button_Accept all'))
WebUI.verifyElementPresent(findTestObject('Page_giving.sgLogin/span_Log in with'), 0)

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address'), tempEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password'), 'hJxcABFZyq7W3jN/JokDdw==')

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

// Attempt to fetch OTP every 5 seconds for a total of 30 seconds
String otpCode = null

for (int i = 0; i < 6; i++) {
    // 6 attempts: 5 seconds x 6 = 30 seconds
    otpCode = getOTPFromEmail(tempEmail)

    if (otpCode != null) {
        WebUI.comment('OTP found: ' + otpCode)

        break
    }
    
    WebUI.comment('Waiting for OTP... attempt (i + 1)')

    WebUI.delay(5 // Wait for 5 seconds before the next attempt
        )
}

if (otpCode != null) {
    // Split the OTP into individual digits
    char[] otpDigits = otpCode.toCharArray()

    // Set each OTP digit in its respective input field
    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), (otpDigits[0]).toString())

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), (otpDigits[1]).toString())

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), (otpDigits[2]).toString())

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), (otpDigits[3]).toString())

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), (otpDigits[4]).toString())

    WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), (otpDigits[5]).toString())

    // Complete login
    WebUI.click(findTestObject('Page_Login/button_Login'))
} else {
    WebUI.comment('OTP not found within the time limit.')
}

//WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_1'), '1')
//WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_2'), '1')
//WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_3'), '1')
//WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_4'), '1')
//WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_5'), '1')
//WebUI.setText(findTestObject('Page_giving.sgLogin/OTP/input_OTP_6'), '1')
WebUI.click(findTestObject('Page_giving.sgLogin/button_Verify'))

WebUI.verifyElementPresent(findTestObject('Page_giving.sg - admin Home/btn_SwitchGiverPortal'), 0 // Log the full URL for debugging
    ) // Send GET request to Temp Mail Plus API to fetch the latest email

def sendGetRequest(String apiUrl) {
    URL url = new URL(apiUrl)

    HttpURLConnection connection = ((url.openConnection()) as HttpURLConnection)

    connection.setRequestMethod('GET')

    int responseCode = connection.getResponseCode()

    if (responseCode == HttpURLConnection.HTTP_OK) {
        InputStream responseStream = connection.getInputStream()

        return responseStream.text
    } else {
        WebUI.comment('GET request failed. Response Code: ' + responseCode)

        return null
    }
}

String getOTPFromEmail(String tempEmail) {
    String apiUrl = "https://tempmail.plus/api/emails?email=$tempEmail&limit=1"

    WebUI.comment('Requesting OTP from URL: ' + apiUrl)

    String responseText = sendGetRequest(apiUrl)

    if ((responseText == null) || responseText.isEmpty()) {
        WebUI.comment('No response or empty response from the Temp Mail API')

        return null
    }
    
    JsonSlurper jsonParser = new JsonSlurper()

    try {
        def jsonResponse = jsonParser.parseText(responseText)

        if (jsonResponse.emails.size() > 0) {
            def email = jsonResponse.emails[0]

            String subject = email.subject

            String body = email.body

            if (subject == 'Your OTP — Login to Giving.sg') {
                def otpMatcher = body =~ 'Your OTP for email verification is (\\d{6})'

                if (otpMatcher.find()) {
                    return otpMatcher.group(1)
                }
            }
        } else {
            WebUI.comment('No emails found in the Temp Mail inbox.')
        }
    }
    catch (Exception e) {
        WebUI.comment('Error parsing JSON response: ' + e.message)
    } 
    
    return null
}

