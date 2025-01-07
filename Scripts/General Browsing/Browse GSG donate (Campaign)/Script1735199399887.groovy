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

String giverEmail = 'michaelscott@dundermifflin.dk.dev'

String giverPassword = 'hJxcABFZyq4oD3Y625LFBg=='

String charityNameWithoutDefaultLogo = 'Singapore Gymnastics'

String charityNameWithDefaultLogo = 'AMP Singapore'

String campaignNameWithoutDefaultLogo = 'Bring back becks memory for kidney cancer 1'

String campaignNameWithDefaultLogo = 'Alternative Stable State : New Era Ecosystems'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.deloitte-sea.com/home')

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/button_Accept all'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/a_Log in'))

WebUI.setText(findTestObject('Page_giving.sgLogin/input_Email address_b3-b9-Input_EmailAddress'), giverEmail)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.setEncryptedText(findTestObject('Page_giving.sgLogin/input_Password_b3-b9-Input_Password'), giverPassword)

WebUI.click(findTestObject('Page_giving.sgLogin/button_Log in'))

WebUI.click(findTestObject('Page_giving.sgWelcome to Giving.sg  The one_022050/span_Donate'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('1')

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), charityNameWithoutDefaultLogo)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('2')

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), charityNameWithDefaultLogo)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('3')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate/button_CAMPAIGNS'))

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), campaignNameWithoutDefaultLogo)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('4')

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), campaignNameWithDefaultLogo)

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('5')

WebUI.setText(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), ' ')

WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(findTestObject('Page_giving.sgDonate/input_Search charities or campaigns_b2-SearchInput'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('6')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Causes'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('7')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Donate todayTransform lives and communi_c5c151'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Tax-deductible'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('8')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Tax-deductible'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Campaign type'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('9')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Campaign type'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/label_Under-served'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('10')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/label_Under-served'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Popularity'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('11')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Relevance_dropdown-background-window'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Causes'))


// Click on 3 random options

//WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/span_Adults_checkbox-icon'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/span_Animal welfare_checkbox-icon'))
//
//WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/span_Animals_checkbox-icon'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('12')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/header_CHARITIESCAMPAIGNS'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Campaign type'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/input_All_b2-b9-RadioGroup2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/article_Filter byCauses3                   _63a362'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Campaign type'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/input_Public_b2-b9-RadioGroup2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/article_Filter byCauses3                   _63a362_1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('13')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Campaign type'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/input_Campaign type_b2-b9-RadioGroup2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/article_Filter byCauses3                   _63a362_1_2'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Tax-deductible'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('14')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Tax-deductible'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/label_Under-served'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('15')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/label_Under-served'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/span_Clear all'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('16')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgDonate -/input_Search charities or campaigns_b2-SearchInput'), 
    'Youxx')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgDonate -/input_Search charities or campaigns_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('17')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgDonate -/input_Search charities or campaigns_b2-SearchInput'), 
    'Yuoth')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgDonate -/input_Search charities or campaigns_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('18')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgDonate -/input_Search charities or campaigns_b2-SearchInput'), 
    'Youth')

WebUI.sendKeys(findTestObject('Object Repository/Page_giving.sgDonate -/input_Search charities or campaigns_b2-SearchInput'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('19')

WebUI.setText(findTestObject('Object Repository/Page_giving.sgDonate -/input_Search charities or campaigns_b2-SearchInput'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Popularity'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('20')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Relevance_dropdown-background-window'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Popularity'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Latest'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('21')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Popularity'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Ending soon'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('22')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Popularity'))
WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Reaching goals'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('23')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Popularity'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Bookmarks'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('24')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Popularity'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/div_Sort Relevance'))

WebUI.delay(3)

WebUI.takeFullPageScreenshotAsCheckpoint('25')

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/img_Stories_b1-b5-AvatarImage_Url'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_giving.sgDonate -/button_Yes'))

WebUI.closeBrowser()

