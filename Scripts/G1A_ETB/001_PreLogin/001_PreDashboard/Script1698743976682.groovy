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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

//Mobile.startApplication('C:\\Maybank App\\app-uat-universal-release.apk', false)
def path = (RunConfiguration.getProjectDir() + '/apk_file/') + GlobalVariable.FileName

'Application Launched'
Mobile.startApplication(path, false)

Mobile.delay(5)

'Screenshot for the launched Application'
Mobile.takeScreenshot('Screenshots/001_PreLogin/001_PreDashboard/01_AppLaunch')

Mobile.takeScreenshot()

'Verifying text for the 1st slide'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.widget.TextView - Your enhanced experienceis here'), 
    'Your enhanced experience\nis here')

'Screenshot for the first slide'
Mobile.takeScreenshot('Screenshots/001_PreLogin/001_PreDashboard/02_FirstSlider')

Mobile.takeScreenshot()

'User taps on the next button present on the 2nd slide'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.view.ViewGroup'), 0)

'Verfying text for the second slide'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.widget.TextView - Your Maybank accounts at a glance'), 
    'Your Maybank accounts at a glance')

'Screenshot for the second slide'
Mobile.takeScreenshot('Screenshots/001_PreLogin/001_PreDashboard/03_SecondSlider')

Mobile.takeScreenshot()

'User taps on next button present in the 3rd slide'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.view.ViewGroup (1)'), 0)

'Verfying text for the third slide'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.widget.TextView - Pay  transfer on the go'), 
    'Pay & transfer on the go')

'Screenshot for the third slide'
Mobile.takeScreenshot('Screenshots/001_PreLogin/001_PreDashboard/04_ThirdSlider')

Mobile.takeScreenshot()

'User taps on next button present in the 4th slide'
Mobile.tap(findTestObject('001_PreLogin/001_PreDashboardSliders/android.view.ViewGroup'), 0)

'Verfying text for the 4th slide'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.widget.TextView - Customise your apps first screen'), 
    'Customise your app’s first screen')

'Screenshot for the 4th slide'
Mobile.takeScreenshot('Screenshots/001_PreLogin/001_PreDashboard/05_FourthSlider')

Mobile.takeScreenshot()

'User taps on next button present in the 5th slide'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.view.ViewGroup (2)'), 0)

'Verfying text for the 5th slide'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.widget.TextView - Customise your Quick Actions'), 
    'Customise your Quick Actions')

'Screenshot for the 5th slide'
Mobile.takeScreenshot('Screenshots/001_PreLogin/001_PreDashboard/06_FifthSlider')

Mobile.takeScreenshot()

'User taps on next button present in the 6th slide'
Mobile.tap(findTestObject('001_PreLogin/001_PreDashboardSliders/android.view.ViewGroup'), 0)

'Verfying text for Terms & Condition popup'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.widget.TextView - Terms  Conditions'), 
    'Terms & Conditions')

'Screenshot for Terms and Condition pop-up'
Mobile.takeScreenshot('Screenshots/001_PreLogin/001_PreDashboard/07_Terms&Condition')

Mobile.takeScreenshot()

'User taps on Agree button'
Mobile.tap(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.view.ViewGroup (3)'), 0)

'Verify text assuring user has navigated to the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/001_PreLogin/001_PreDashboardSliders/android.widget.TextView - Quick Actions'), 
    'Quick Actions')

Mobile.takeScreenshot('Screenshots/001_PreLogin/001_PreDashboard/08_DashboardLaunch')

Mobile.takeScreenshot()

