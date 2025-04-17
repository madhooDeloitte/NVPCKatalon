/*
 * Main usage of this keyword is 
 * To generate unique email address based on each user type
 * e.g. Giver, Org, GU, NPO
 * 
 * Format used: <userType>_<timestamp>@testdata.com
 * Example: Giver_20250416_130515@testdata.com
 */
package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.text.SimpleDateFormat

import internal.GlobalVariable

public class EmailGenerator {

	@Keyword
	def static String generateEmail(String userType) {
		// Format: yyyyMMddHHmmss (no separator between date & time)
		def timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
		return "${userType}_${timestamp}@testdata.com"
	}
}
