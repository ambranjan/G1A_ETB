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
//Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/01_VerifyElementText- Account'), 
//   'Account')
'Screenshot for the screen when user is on Dashboard'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/01_VerifyElementText- Account')

Mobile.takeScreenshot()

'User taps on Logout button present on the top right corner'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/1.1_LogOut_Button_TopRight'), 0)

Mobile.delay(2)

'User verifies the screen once user gets logged out'
Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/1.2_VerifyElementText - Youve successfully logged out. Come back soon'), 
    'You’ve successfully logged out. Come back soon!')

'Screenshot for the screen when user logs out'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/01.1_After_Logout')

Mobile.takeScreenshot()

'User taps Back to Dashboard button'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/1.3_BackToDashboard'), 0)

'Screenshot for the screen when user navigates back to dashboard'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/01.2_NavigatingToDashboard')

Mobile.takeScreenshot()

'User taps on Login button'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/1.4_TapOnLoginButton'), 0)

Mobile.delay(5)

'User verifies the screen once navigated to Enter 6 digit pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/03_VerifyElementText - Enter your 6-digit PIN'), 
    'Enter your 6-digit PIN')

'Screenshot when user is on Enter 6 digit pin screen screen'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/02_VerifyElementText- Enter your 6-digit PIN')

Mobile.takeScreenshot()

Mobile.delay(5)

'User taps on Forget pin'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/04_Click_On_Forget_Pin_Text- Forgot PIN'), 0)

Mobile.delay(3)

'User verifies the screen once reached to Enter your password screen'
Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/05_VerifyElementText - Enter your password'), 
    'Enter your password')

'Screenshot when user is on enter password screen'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/03_VerifyElementText- Enter your password')

Mobile.takeScreenshot()

'User enters password'
Mobile.setText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/06_SetPassword - M2U password'), 'Pass@135', 
    0)

Mobile.delay(3)

'User hides the keyboard'
Mobile.hideKeyboard()

Mobile.delay(2)

'Screenshot when user hides the keyboard'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/04_PasswordEntered')

Mobile.takeScreenshot()

'User taps on continue button'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/07_Click_Continue_Button_For_The_Pin'), 0)

Mobile.delay(3)

'User verifies the screen once reached to "Create your Pin" screen'
Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/08_CreateNewPin - Create your PIN for the app'), 
    'Create your PIN for the app')

'Screenshot when user is on "Create your Pin" screen'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/05_CreatePinScreen')

Mobile.takeScreenshot()

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'Screenshot when user enters 6 digit pin'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/06_Entered_CreatePinScreen')

Mobile.takeScreenshot()

'User taps on confirm button'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/10_Tap_Confirmation_After_Entering_Pin'), 0)

Mobile.delay(5)

'User verifies the screen once reached to Confirm Pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/11_VerifyElementText - Confirm your new 6-digit PIN'), 
    'Confirm your new 6-digit PIN')

'Screenshot when user is on Confirm Pin screen'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/07_Confirm_PinScreen')

Mobile.takeScreenshot()

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'User taps 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

Mobile.delay(2)

'Screenshot when user enters 6 digit pin'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/08_Confirm_Entered_Pin')

Mobile.takeScreenshot()

'User taps on confirm button'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/12_Click_Confirm_Button_For_Confirming_Pin'), 
    0)

Mobile.delay(5)

//Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/13_VerifyElementText - Secure2u activation in progress'), 
//    'Secure2u activation in progress')
'Screenshot when user is on Secure2u screen for confirmation'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/08.1_UserNavigates_To_Secure2UScreen')

Mobile.takeScreenshot()

'User taps on Approve'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/Secure2U_Approve'), 0)

Mobile.delay(3)

'Screenshot when New pin reset is successful'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/08.2_NewPinReset_Successfully')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/PasswordResetDone'), 0)

Mobile.delay(3)

//Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/09_Secure2u activation in progress')
//Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/14_Click_On_BackToHomeButton'), 0)
//Mobile.delay(3)
//Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/15_VerifyElementText_On_Dashboard - Personal Current Account'), 
//    'Personal Current Account')
'Screenshot when user navigates to dashboard'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/10_Dashboard')

Mobile.takeScreenshot()

'User taps on Logout button on the top right corner'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/1.1_LogOut_Button_TopRight'), 0)

Mobile.delay(2)

'User verifies the screen once successfully logged out'
Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/1.2_VerifyElementText - Youve successfully logged out. Come back soon'), 
    'You’ve successfully logged out. Come back soon!')

'Screenshot when user is logged out'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/11_After_Logout')

Mobile.takeScreenshot()

'User taps on Back to dashboard'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/1.3_BackToDashboard'), 0)

'Screenshot when user is on Dashboard'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/12_BackToDashboard')

Mobile.takeScreenshot()

'User taps on Login button'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/1.4_TapOnLoginButton'), 0)

Mobile.delay(5)

'User verifies the screen once reached to enter your 6 digit pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/03_VerifyElementText - Enter your 6-digit PIN'), 
    'Enter your 6-digit PIN')

'Screenshot when user is on pin enter screen'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/13_VerifyElementText- Enter your 6-digit PIN')

Mobile.takeScreenshot()

/*
 * Mobile.tap(findTestObject('002_PostLogin/001_ViewAccount/
 * LogoutButton_TopRight'), 0)
 * 
 * Mobile.delay(3)
 * 
 * Mobile.verifyElementText(findTestObject('Object
 * Repository/002_PostLogin/001_ViewAccount/17_LogOutScreen - Youve successfully
 * logged out. Come back soon'), 'You’ve successfully logged out. Come back
 * soon!')
 * 
 * Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/11_Youve
 * successfully logged out')
 * 
 * Mobile.tap(findTestObject('Object
 * Repository/002_PostLogin/001_ViewAccount/18_ClickOn_Back_To_Dashboard'), 0)
 * 
 * Mobile.delay(2)
 * 
 * Mobile.tap(findTestObject('002_PostLogin/001_ViewAccount/EyeIcon'), 0)
 * 
 * Mobile.delay(2)
 * 
 * Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/
 * 12_Eye_Button_To_Hide_Amount')
 * 
 * Mobile.tap(findTestObject('002_PostLogin/001_ViewAccount/EyeIcon'), 0)
 */
Mobile.delay(2)

/*
 * Mobile.verifyElementText(findTestObject('Object
 * Repository/002_PostLogin/001_ViewAccount/21_Entering_Six_Digit_Pin - Enter
 * your 6-digit PIN'), 'Enter your 6-digit PIN')
 * 
 * Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/13_Enter
 * your 6-digit PIN')
 * 
 * Mobile.takeScreenshot()
 */
'Tap on 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'Tap on 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'Tap on 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'Tap on 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'Tap on 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

'Tap on 1'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/09_Tap 1 - 1'), 0)

Mobile.delay(5)

'User taps on eye icon to view the amount'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/TapOnEyeButton'), 0)

Mobile.delay(2)

'User verifies the screen once Amount appears'
Mobile.verifyElementText(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/22_User_Redirected_To_Dashboard - Personal Current Account'), 
    'Personal Current Account')

'Screenshot when amount appears on the screen'
Mobile.takeScreenshot('Screenshots/002_PostLogin/001_ViewAccount/14_Dashboard')

Mobile.takeScreenshot()

