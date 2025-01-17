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

'not needed for shakedown'
String giverEmail = 'michaelscott@dundermifflin.dk.dev'

'not needed for shakedown'
String giverPassword = 'hJxcABFZyq4oD3Y625LFBg=='

String opportunityNameWithDefaultLogo = 'Test Shift Slot Increase'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.delay(3)

'verify landing page'
WebUI.takeScreenshotAsCheckpoint('1 main page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgWelcome to Giving.sg  The one_022050/span_Volunteer'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('1')
WebUI.setText(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), opportunityNameWithDefaultLogo)

WebUI.delay(3)

'1.4 verify on volunteer page and can input'
WebUI.takeScreenshotAsCheckpoint('2 volunteer page')

WebUI.sendKeys(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

'1.5 verify default image is shown'
WebUI.takeScreenshotAsCheckpoint('3 volunteer search results')

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('2')
WebUI.setText(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), ' ')

WebUI.sendKeys(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

'2.3 verify back to default, verify pills exist'
WebUI.takeScreenshotAsCheckpoint('4 back to default')

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('3')
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_All filters'))

WebUI.delay(2)

'2.8 verify filter all pill works'
WebUI.takeScreenshotAsCheckpoint('5 filter pill works')

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('4')
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/i_All filters_icon fa fa-times fa-1x'))

WebUI.delay(2)

WebUI.takeScreenshotAsCheckpoint('6 back to default')

WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Causes'))

WebUI.delay(2)

'verify causes pill works'
WebUI.takeScreenshotAsCheckpoint('7 causes pill works')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Available period'))

WebUI.delay(2)

'verify available period pill works'
WebUI.takeScreenshotAsCheckpoint('8 availability pill works')

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('6')
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/label_Under-served'))

WebUI.delay(2)

'verify underserved'
WebUI.takeScreenshotAsCheckpoint('9 underserved pill works')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('7')
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/label_Under-served'))

'2.11 choose causes filter and select any number of options'
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Causes'))

'can change last div to select different checkbox'
WebUI.click(findTestObject('Page_giving.sgDonate -/button_causes animal vol'))

WebUI.delay(3)

'verify animal related charities shown and causes pill highlighted with 1'
WebUI.takeScreenshotAsCheckpoint('10 verify animal causes')

//WebUI.delay(20)
//click on 3 options
//WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/span__checkbox-icon'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/span_Animals_checkbox-icon'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/span_Arts, culture and heritage_checkbox-icon'))
//WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Filter byAll filtersCauses3            _b5d92b'))
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('8')
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Available period'))

'manual: can click the wanted dates'
WebUI.delay(15)

'verify all pills are selected and specific dates are selected'
WebUI.takeScreenshotAsCheckpoint('11 availability works')

WebUI.click(findTestObject('Page_giving.sgDonate/span_Clear all'))

WebUI.delay(3)

'verify all cleared'
WebUI.takeScreenshotAsCheckpoint('12 filters cleared')

//pick 2 dates
//WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/span_1'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/span_31'))
//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('9')
//clear dates
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_All filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_All_b2-b8-RadioGroup1'))

WebUI.delay(3)

'verify opportunity type public clicked'
WebUI.takeScreenshotAsCheckpoint('13 public opportunity clicked')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/button_Apply'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('10')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'verify change in opportunities'
WebUI.takeScreenshotAsCheckpoint('14 verify changes in opportunities')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_All filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_Public_b2-b8-RadioGroup1'))

WebUI.delay(3)

'verify private opportunity type selected'
WebUI.takeScreenshotAsCheckpoint('15 private opportunity clicked')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/button_Apply'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('11')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'verify changes in opportunities'
WebUI.takeScreenshotAsCheckpoint('16 verify opportunity changes')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_All filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_Opportunity type_b2-b8-RadioGroup1'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_All_b2-b8-RadioGroup2'))

WebUI.delay(3)

'verify location physical clicked'
WebUI.takeScreenshotAsCheckpoint('17 physical location clicked')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/button_Apply'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('12')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'verify changes in opportunities'
WebUI.takeScreenshotAsCheckpoint('18 verify changes in opportunity')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_All filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_Suitable for_b2-b8-b24-l1-315_0-Checkbox'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_Location_b2-b8-RadioGroup2'))

WebUI.delay(3)

'verify first timers clicked'
WebUI.takeScreenshotAsCheckpoint('19 first timers clicked')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/button_Apply'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('13')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'verify changes in opportunities '
WebUI.takeScreenshotAsCheckpoint('20 verify changes in opportunity')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_All filters'))

'change change by editting div in xpath'
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/a_Accounting and finance'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_Suitable for_b2-b8-b24-l1-315_0-Checkbox'))

'change by editting div in xpath'
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/a_Arts and music'))

WebUI.delay(3)

'verify accouting/finance & Arts/music clicked'
WebUI.takeScreenshotAsCheckpoint('21 accounting and arts selected')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/button_Apply'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('14')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'verify changes in opportunities'
WebUI.takeScreenshotAsCheckpoint('22 verify changes in opportunity')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_All filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/a_Accounting and finance'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/a_Arts and music'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_Partner opportunities_b2-b8-b30-l1-32_1b993f'))

WebUI.delay(3)

'verify volunteer gov sg partner opportunities selected'
WebUI.takeScreenshotAsCheckpoint('23 gov sg partner selected')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/button_Apply'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('15')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'verify changes in opporunity page'
WebUI.takeScreenshotAsCheckpoint('24 verify changes in opportunity')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_All filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_Partner opportunities_b2-b8-b30-l1-32_26f295'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_Others_b2-b8-TaxDeductibleCheckbox3'))

WebUI.delay(3)

'verify underserved clicked'
WebUI.takeScreenshotAsCheckpoint('25 underserved clicked')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/button_Apply'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('16')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'verify on opportunities page'
WebUI.takeScreenshotAsCheckpoint('26 verify opportunity changes')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_All filters'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/input_Others_b2-b8-TaxDeductibleCheckbox3'))

WebUI.delay(3)

'verify all filters cleared'
WebUI.takeScreenshotAsCheckpoint('27 all filters cleared')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/button_Apply'))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('17')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'verify opportunities page back to default'
WebUI.takeScreenshotAsCheckpoint('28 default opportunities page')

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/span_Clear all'))

'3.3 enter Youxx into the search bar\r\n'
WebUI.setText(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), 'Youxx')

WebUI.sendKeys(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), Keys.chord(Keys.ENTER))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('18')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'3.5 verify search results of Youxx'
WebUI.takeScreenshotAsCheckpoint('29 verify Youxx results')

WebUI.setText(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), 'Yuoth')

WebUI.sendKeys(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), Keys.chord(Keys.ENTER))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('19')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'3.9 verify search results of Yuoth\r\n'
WebUI.takeScreenshotAsCheckpoint('30 verify Yuoth results')

WebUI.setText(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), 'Youth')

WebUI.sendKeys(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), Keys.chord(Keys.ENTER))

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('20')
WebUI.scrollToElement(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Be a volunteerVolunteerism is an enthra_d71757'), 
    3)

WebUI.delay(3)

'3.13 verify search results of Youth'
WebUI.takeScreenshotAsCheckpoint('31 verify Youth results')

WebUI.setText(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), ' ')

WebUI.sendKeys(findTestObject('Page_giving.sgVolunteer/input_Search opportunities_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Sort Latest'))

WebUI.delay(3)

'verify sort button clicked'
WebUI.takeScreenshotAsCheckpoint('32 sort button clicked')

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('21')
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Sort Registration ending soon'))

WebUI.delay(3)

'4.6 verify sorted by registration ending\r\n'
WebUI.takeScreenshotAsCheckpoint('33 verify sorted by registration ending')

//WebUI.delay(3)
//
//WebUI.takeFullPageScreenshotAsCheckpoint('22')
WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Sort Latest'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgVolunteer -/div_Sort Bookmarks'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('35 sort relevance')

WebUI.closeBrowser()

