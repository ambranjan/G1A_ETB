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
'User verifies the screen once reached to Secure2uScreen'
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/004_Secure2U/01_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Screenshot when user is on Secure2U screen'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/004_Secure2U/01_UserIsOnSecure2uScreen')
Mobile.takeScreenshot()

'User taps on Approve'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/004_Secure2U/02_Tap_On_Approve'), 0)

Mobile.delay(2)

'Screenshot when user Approves payment'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/004_Secure2U/02_UserApprovedPayment')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/004_Secure2U/03_Tap_On_Done'), 0)

Mobile.delay(2)

'Screenshot when user taps on Done once the payment is made'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/004_Secure2U/03_UserTapOnDoneAfter_Secure2PaymentDone')
Mobile.takeScreenshot()

'User taps on Home icon on the footer left to navigate to the dashboard'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/004_Secure2U/04_Tap_OnHome_Icon_to_Reach_Dashboard'), 0)

Mobile.delay(2)

