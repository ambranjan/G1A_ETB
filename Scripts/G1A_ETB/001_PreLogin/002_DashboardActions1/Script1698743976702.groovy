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

//Mobile.startExistingApplication('com.maybank2u.life.uat')
'User is on desktop'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.TextView - Quick Actions - Verify Quick Actions Text'), 
    'Quick Actions')

Mobile.delay(3)

'Screenshot when the user is on Desktop'
Mobile.takeScreenshot('Screenshots/001_PreLogin/002_DashboardActions1/01_QuickActionSectionOnDashboard')

Mobile.takeScreenshot()

'User swipes on the Quick Action elements'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.view.ViewGroup - Swipe Quick action items to second page'), 
    0)

'Uesr verifies if the element is swiped by checking the visibility of View All element'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.TextView - View All - Verify Element Text'), 
    'View All')

Mobile.delay(3)

'Screenshot after swiping the Quick Actions elements'
Mobile.takeScreenshot('Screenshots/001_PreLogin/002_DashboardActions1/02_Swipe_Quick_Actions')

Mobile.takeScreenshot()

'User taps on View All button'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.ImageView - Tap on ViewAll icon'), 
    0)

Mobile.delay(3)

'User verifies when the user navigated to ViewAll screen'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.TextView - Apply - VerifyApplyText'), 
    'Apply')

'Scrennshot afternuser gets inside view All screen'
Mobile.takeScreenshot('Screenshots/001_PreLogin/002_DashboardActions1/03_ViewAll_Screen')

Mobile.takeScreenshot()

Mobile.delay(3)

'User clicked on Apply icon'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.ImageView - Click on ApplyIcon'), 
    0)

Mobile.delay(3)

'Screenshot when the user navigated inside Apply '
Mobile.takeScreenshot('Screenshots/001_PreLogin/002_DashboardActions1/04_VerifyViewAll_Content')

Mobile.takeScreenshot()

'Verifying element Text when user navigated to Apply Screen'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.TextView - Global Access Account-i - Verify Text in tiles number 3'), 
    'Global Access Account-i')

'Verify element text for the G1A tile'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.TextView - A foreign currencyaccount with a globalmulti-currency card - Verify tile 3 text'), 
    'A foreign currency\naccount with a global\nmulti-currency card.')

'Screenshot when the user navigated inside Apply '
Mobile.takeScreenshot('Screenshots/001_PreLogin/002_DashboardActions1/04_VerifyViewAll_Content')

Mobile.takeScreenshot()

'User taps on G1A tile'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.TextView - A foreign currencyaccount with a globalmulti-currency card - Tap on tile 3'), 
    0)

Mobile.delay(3)

'Verify Element Text once the user navigates to Apply Now Screen'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.TextView - Global Access Account-i - VerifyElementText inside G1A'), 
    'Global Access Account-i')

'Screenshot of screen when user navigates to Apply Now screen for G1A'
Mobile.takeScreenshot('Screenshots/001_PreLogin/002_DashboardActions1/05_G1A_Apply_Now_Screen')

Mobile.takeScreenshot()

'User Taps on back icon present on the top left corner'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.ImageView - Tap back button'), 
    0)

Mobile.delay(3)

'Screenshot when th euser navigates back to the Apply screen'
Mobile.takeScreenshot('Screenshots/001_PreLogin/002_DashboardActions1/06_NavigateBackTo_Apply_Now_Screen')

Mobile.takeScreenshot()

'User taps on the home icon present on the bottom left of the screen'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/002_DashboardActions1/android.widget.ImageView - Tap on home from footerleft'), 
    0)

Mobile.delay(3)

'Screenshot of the screen when the user navigates back to the Dashboard'
Mobile.takeScreenshot('Screenshots/001_PreLogin/002_DashboardActions1/07_Navigate_To_Dashboard')

Mobile.takeScreenshot()

