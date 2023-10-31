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
'Verify user is on the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/004_DashboardActions3/android.widget.TextView - Quick Actions'), 
    'Quick Actions')

'User taps on the Apply button present on the footer right of the screen'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/004_DashboardActions3/android.widget.ImageView - Apply button in the footer'), 
    0)

'User verifies by element text when successfully navigated to Apply screen'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/004_DashboardActions3/android.widget.TextView - Global Access Account-i'), 
    'Global Access Account-i')

'Screenshot when user navigates to the Apply details screen'
Mobile.takeScreenshot('Screenshots/001_PreLogin/003_DashboardActions2/01_UserNavigatesTo_ApplyDetails_Screen')

Mobile.takeScreenshot()

'User taps on the Global Access Account - i on the screen which is the third tile'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/004_DashboardActions3/android.widget.TextView - Tap on G1A creation tile'), 
    0)

Mobile.delay(5)

'Screenshot when the user navigated to Apply Now Screen for G1A'
Mobile.takeScreenshot('Screenshots/001_PreLogin/003_DashboardActions2/02_UserNavigatesTo_G1A_ApplyNow_Screen')

Mobile.takeScreenshot()

'User taps on the back icon present on the top left of the screen'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/004_DashboardActions3/android.widget.ImageView - Back Button Top Left'), 
    0)

Mobile.delay(2)

'Screenshot when the user navigated to the Apply details screen'
Mobile.takeScreenshot('Screenshots/001_PreLogin/003_DashboardActions2/03_UserNavigatesBackTo_ApplyDetails_Screen')

Mobile.takeScreenshot()

'User taps on the home icon present in the footer left of the screen'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/004_DashboardActions3/android.widget.ImageView - Home button tap'), 
    0)

Mobile.delay(2)

'Screenshot when the user navigates to the Dashboard'
Mobile.takeScreenshot('Screenshots/001_PreLogin/003_DashboardActions2/04_UserNavigatesBackTo_Dashboard_Screen')

Mobile.takeScreenshot()

