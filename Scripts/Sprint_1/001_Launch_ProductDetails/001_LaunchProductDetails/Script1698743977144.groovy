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

'Application Launched'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify First Slide Text'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/01_VerifyElementTextScreen_1- Your enhanced experienceis here'), 
    'Your enhanced experience\nis here')

'Take Screenshot for the first slide'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/01_First_Slide')

Mobile.takeScreenshot()

'User taps on Next button'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/02_FirstNextButton'), 0)

'Verify Second Slide Text'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/03_VerifyElementTextScreen_2 - Your Maybank accounts at a glance'), 
    'Your Maybank accounts at a glance')

'Take Screenshot for the second slide'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/02_Second_Slide')

Mobile.takeScreenshot()

'User taps on Next button'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/04SecondNextButton'), 0)

'Verify Third Slide Text'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/05_VerifyElementTextScreen3 - Pay  transfer on the go'), 
    'Pay & transfer on the go')

'Take Screenshot for the third slide'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/03_Third_Slide')

Mobile.takeScreenshot()

'User taps on Next button'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/05_ThirdNextButton'), 0)

'Verify Fourth Slide Text'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/06_VerifyElementTextScreen_4 - Customise your apps first screen'), 
    'Customise your app’s first screen')

'Take Screenshot for the fourth slide'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/04_Fourth_Slide')

Mobile.takeScreenshot()

'User taps on Next button'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/07_FourthNextButton'), 0)

'Verify Fifth Slide Text'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/08_VerifyElementTextScreen_5 - Customise your Quick Actions'), 
    'Customise your Quick Actions')

'Take Screenshot for the fifth slide'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/05_Fifth_Slide')

Mobile.takeScreenshot()

'User taps on Got it button'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/09_UserTapsOn_Got_It_Button'), 0)

'Verify Terms and Conditions pop-up Text'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/10_VerifyElementTextForScreen - Terms  Conditions'), 
    'Terms & Conditions')

'Take Screenshot for Terms and Conditions pop-up'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/06_Terms_and_Conditions')

Mobile.takeScreenshot()

'User taps on Agree button'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/11_UserTapsOnAgreeButton'), 0)

'Verify the text from the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/12_VerifyElementTextDashboardScreen- Quick Actions'), 
    'Quick Actions')

'Taks screenshot of the dashboard'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/07_Dashboard')

Mobile.takeScreenshot()

'User flips the quick actions area'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/13_UserFlipsTheQuickActionSectionToLeft'), 
    0)

'Verify quick Actions flip screen text'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/14_VerifyElementText - View All'), 
    'View All')

'Taks screenshot after fliping quick actions'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/08_User_Slide_to_ViewAll')

Mobile.takeScreenshot()

'User taps on View All button'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/15_UserTapsOnViewAll'), 0)

'Verify element Text once user navigated inside view all'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/16_VerifyElementText- Apply'), 
    'Apply')

'Take screenshot once user navigated inside view all'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/09_User_inside_ViewAll_Screen')

Mobile.takeScreenshot()

'User taps on Apply'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/17_UserTapsOnApply'), 0)

'Verify element Text once user navigated inside Apply'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/18_VerifyElementText- Apply'), 
    'Apply')

'Verify element Text once G1A is visible as third tile'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/19_VerifyElementTextFor_G1A_Tiles- Global Access Account-i'), 
    'Global Access Account-i')

'Take Sreenshot once the user able to view G1A'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/10_User_inside_Apply_Screen')

Mobile.takeScreenshot()

'User taps on G1A '
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/20_TapOnG1A - A foreign currencyaccount with a globalmulti-currency card'), 
    0)

'Verify Element Text once user nvigates inside G1A '
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/21_VerifyElementText- Global Access Account-i'), 
    'Global Access Account-i')

'Take Screenshot once user navigates inside G1A application'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/11_User_inside_G1A_Screen')

Mobile.takeScreenshot()

'User taps okn back button present on the top left corner'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/22_TapOnBackButton_TopLeft'), 0)

'Verify the text once user navigated to Apply screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/23_UserNavigatedBackTo - Apply'), 
    'Apply')

'Take Screenshot once user navigates to Apply screen'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/12_User_Navigated_Back_to_Apply_Screen')

Mobile.takeScreenshot()

'User taps on Home icon on the footer left'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/24_TapOnHome_BottomLeft'), 0)

'Take Screenshot once the user navigates to the Dashboard'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/13_User_Navigated_Back_to_Dashboard_Screen')

Mobile.takeScreenshot()

'User taps on the Apply icon present on the bottom right corner'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/25_TapOnApply)BottomRight'), 0)

'Verify element Text once user navigates to Apply screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/26_VerifyElementText - Apply_Screen'), 
    'Apply')

'Take Screenshot once user navigates to Apply screen'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/14_User_Navigated_to_Apply_Screen')

Mobile.takeScreenshot()

'User taps on G1A tile'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/27_TapOnG1ATile - A foreign currencyaccount with a globalmulti-currency card'), 
    0)

'Verify element Text once user navigates inside G1A'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/28_UserNavigatedInside - Global Access Account-i'), 
    'Global Access Account-i')

'Take Screenshot once user is on Apply Now screen'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/15_User_Navigated_to_G1A_Apply_Screen')

Mobile.takeScreenshot()

'User taps on Apply Now'
Mobile.tap(findTestObject('Object Repository/Sprint_1/001_Launch_ProductDetails/29_TapOnApplyNow'), 0)

'Takes Screenshot when the screen prompts user to emter MyKad number'
Mobile.takeScreenshot('Screenshots/Sprint 1/001_LaunchProductDetails/16_User_Navigated_to_MyKad_Enter_Screen')

Mobile.takeScreenshot()

