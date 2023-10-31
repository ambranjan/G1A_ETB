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

Mobile.startExistingApplication('com.maybank2u.life.uat')
Mobile.delay(5)

'Verify that user is on the Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/01_VerifyElementText - Log In Now'), 'Log In Now')

'Screenshot of the screen when the user is on the Dashboard'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/01_Dashboard')

Mobile.takeScreenshot()

'User taps on Login'
Mobile.tap(findTestObject('Object Repository/004_Login/02_Click - Log In Now'), 0)

Mobile.delay(5)

'User verifies the text once the option for the Existing user and New user appears on the screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/03_VerifyElementText of Screen 2 - Lets Get Started'), 
    'Let\'s Get Started!')

Mobile.verifyElementText(findTestObject('Object Repository/004_Login/04_VerifyElementText - Existing M2UMAE user Log in here'), 
    'Existing M2U/MAE user? Log in here')

Mobile.delay(3)

'Screenshot for the "Let\'s Get Started" screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/02_Existing M2UMAE user Log in here')

Mobile.takeScreenshot()

'User taps on the Existing to Maybank tile'
Mobile.tap(findTestObject('Object Repository/004_Login/05_ClickOnTile - Existing M2UMAE user Log in here'), 0)

Mobile.delay(5)

'VerifyElementText when user navigates to Enter username screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/06_VerifyElementText - Please enter your username'), 
    'Please enter your username')

'User enters the username'
Mobile.setText(findTestObject('Object Repository/004_Login/07_Entered_Username'), 'testasb103', 0)

'The mobile Keyboard is hidden'
Mobile.hideKeyboard()

Mobile.delay(5)

'Screenshot for the screen after username is entered'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/03_Entered_Username')

Mobile.takeScreenshot()

'User taps on continue button'
Mobile.tap(findTestObject('Object Repository/004_Login/08_Username_ContinueButton'), 0)

Mobile.delay(5)

'User verifies the screen once reached to Security Phrase Screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/09_UsernameSecurity_phrase - Is this your security phrase'), 
    'Is this your security phrase?')

'Screenshot for the screen when user is on security phrase screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/04_Confirm_Username')

Mobile.takeScreenshot()

'User taps on Confirm button'
Mobile.tap(findTestObject('Object Repository/004_Login/10_Click_On_Confirmation - Yes its mine'), 0)

Mobile.delay(5)

'User verifies the screen once reached to enter password screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/11_VerifyElementText - Enter your password'), 'Enter your password')

'Screenshot for the screen when user is on enter password screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/05_Enter_your_password')

Mobile.takeScreenshot()

'User enters password'
Mobile.setText(findTestObject('Object Repository/004_Login/12_Entered_Password'), 'Pass@135', 0)

'Keyboard is hidden'
Mobile.hideKeyboard()

Mobile.delay(5)

'Screenshot for the screen when user enters password'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/06_Entered_password')

Mobile.takeScreenshot()

'User taps on continue button after entering password'
Mobile.tap(findTestObject('Object Repository/004_Login/13_Password_Continue_Button'), 0)

Mobile.delay(5)

'User verifies the screen once reached to Create pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/14_VerifyElementText- Create your PIN for the app'), 
    'Create your PIN for the app')

'Screenshot for the screen when user is on create pin screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/07_Create your PIN for the app')

Mobile.takeScreenshot()

//Get Text from the screen (111111)
'System reads the pin'
Mobile.getText(findTestObject('Object Repository/004_Login/15_Create_Pin_Get_Text - Your PIN no. is 111111'), 0)

//Storing the pin inside a variable
def otpText = Mobile.getText(findTestObject('Object Repository/004_Login/15_Create_Pin_Get_Text - Your PIN no. is 111111'), 
    0)

//Applying the read pin from keyboard
otpText = otpText.replace('Your PIN no. is ', '')

def otpArr = otpText.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr.length; i++) {
    if ((otpArr[i]) == '1') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
    } else if ((otpArr[i]) == '2') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
    } else if ((otpArr[i]) == '3') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
    } else if ((otpArr[i]) == '4') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
    } else if ((otpArr[i]) == '5') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
    } else if ((otpArr[i]) == '6') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
    } else if ((otpArr[i]) == '7') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
    } else if ((otpArr[i]) == '8') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
    } else if ((otpArr[i]) == '9') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
    } else if ((otpArr[i]) == '0') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
    }
}

'Screenshot for the screen when user entered pin for create pin screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/08_Entered PIN for the app')

Mobile.takeScreenshot()

'User taps on confirm button'
Mobile.tap(findTestObject('Object Repository/004_Login/16_Tap_on_Confirm_button_For_Create_Pin'), 0)

Mobile.delay(5)

'User verifies the screen once reached to Confirm pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/17_VerifyElementText - Confirm your 6-digit PIN'), 
    'Confirm your 6-digit PIN')

'Screenshot for the screen when user is on confirm pin screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/09_Enter Confirm PIN for the app')

Mobile.takeScreenshot()

'Ststem reads the confirm pin'
Mobile.getText(findTestObject('Object Repository/004_Login/18_Confirm_Pin_Set_Text - Your PIN no. is 111111'), 0)

//storing the pin inside a variable
def otpText2 = Mobile.getText(findTestObject('Object Repository/004_Login/18_Confirm_Pin_Set_Text - Your PIN no. is 111111'), 
    0)

//Applying the read pin
otpText2 = otpText2.replace('Your PIN no. is ', '')

def otpArr2 = otpText2.toCharArray()

'Pin entered for Confirm pin'
for (def i = 0; i < otpArr2.length; i++) {
    if ((otpArr2[i]) == '1') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
    } else if ((otpArr2[i]) == '2') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
    } else if ((otpArr2[i]) == '3') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
    } else if ((otpArr2[i]) == '4') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
    } else if ((otpArr2[i]) == '5') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
    } else if ((otpArr2[i]) == '6') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
    } else if ((otpArr2[i]) == '7') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
    } else if ((otpArr2[i]) == '8') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
    } else if ((otpArr2[i]) == '9') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
    } else if ((otpArr2[i]) == '0') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
    }
}

'Screenshot for the screen when user entered confirm pin'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/10_Confirm PIN entered for the app')

Mobile.takeScreenshot()

'User taps on confirm button from confirm pin screen'
Mobile.tap(findTestObject('Object Repository/004_Login/19_Tap_on_Confirm_button_for_Confirm_Pin'), 0)

Mobile.delay(5)

'User verifies the screen once reached Biometric Enable/Disable screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/20_VerifyElementText - Enable biometric ID for instant access'), 
    'Enable biometric ID for instant access')

'Screenshot for the screen when user is on Fingerprint Enable/Disable screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/11_Enable biometric ID for instant access')

Mobile.takeScreenshot()

'User taps on set up later button'
Mobile.tap(findTestObject('Object Repository/004_Login/21_Tap_On - Set Up Later'), 0)

Mobile.delay(5)

'User verifies the screen once reached to verify number screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/22_VerifyElementText_for_otp_Shoot - Verify Number'), 
    'Verify Number')

'Screenshot for the screen when user is on verify number screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/12_VerifyMobileNumber')

Mobile.takeScreenshot()

'User taps on proceed button'
Mobile.tap(findTestObject('Object Repository/004_Login/23_Click_On_Yes_Proceed_Button'), 0)

Mobile.delay(5)

'User verifies the screen once reached to OTP screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/24_VerifyElementText - One Time Password'), 'One Time Password')

'Screenshot for the screen when user is on OTP screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/13_FirstOTP')

Mobile.takeScreenshot()

Mobile.delay(5)

//Get OTP from the screen
'User enters OTP'
Mobile.tap(findTestObject('004_Login/OTP-Field'), 0)

Mobile.delay(3)

/*
 * Mobile.getText(findTestObject('Object Repository/004_Login/25_Read_otp - Your
 * OTP no. is 654622'), 0)
 * 
 * //storing the otp inside a variable def otpText3 =
 * Mobile.getText(findTestObject('Object Repository/004_Login/25_Read_otp - Your
 * OTP no. is 654622'), 0)
 * 
 * //Applying the OTP otpText3 = otpText3.replace('Your OTP no. is ', '')
 * 
 * def otpArr3 = otpText3.toCharArray()
 * 
 * for (def i = 0; i < otpArr3.length; i++) { if ((otpArr3[i]) == '1') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0) }
 * else if ((otpArr3[i]) == '2') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/2 button'), 0) } else if ((otpArr3[i]) == '3') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0) }
 * else if ((otpArr3[i]) == '4') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/4 button'), 0) } else if ((otpArr3[i]) == '5') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0) }
 * else if ((otpArr3[i]) == '6') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/6 button'), 0) } else if ((otpArr3[i]) == '7') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0) }
 * else if ((otpArr3[i]) == '8') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/8 button'), 0) } else if ((otpArr3[i]) == '9') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0) }
 * else if ((otpArr3[i]) == '0') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/0 button'), 0) } }
 */
'Screenshot for the screen after user inputs OTP'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/14_ConfirmFirstOTP')

Mobile.takeScreenshot()

'User taps on confirm button for OTP screen'
Mobile.tap(findTestObject('004_Login/OTP_ConfirmTion_CheckIcon'), 0)

Mobile.delay(5)

'User verifies the screen once reached to "How would you like us to address" screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/29_VerifyElementText - How would you like us to address you'), 
    'How would you like us to address you?')

'Screenshot for the screen when user is on "How would you like us to address" screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/15_address you')

Mobile.takeScreenshot()

'User enters name as Android Test'
Mobile.setText(findTestObject('Object Repository/004_Login/28_Enter_Name_For_System_To_Address - AndroidTest'), 'AndroidTest', 
    0)

'Screenshot for the screen when user enters name of the user'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/16_Name_Entered_To_address you')

Mobile.takeScreenshot()

'User taps on continue button after entering name'
Mobile.tap(findTestObject('Object Repository/004_Login/29_Click_Continue_After_Entering_Name'), 0)

Mobile.delay(5)

'User verifies the screen once reached to select primary account screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/30_VerifyElementText - Set Primary Account'), 'Set Primary Account')

'Screenshot for the screen when user is on set primary account screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/17_Set Primary Account')

Mobile.takeScreenshot()

'User taps on Personal current account tile to select'
Mobile.tap(findTestObject('Object Repository/004_Login/31_Tap_To_Select - Personal Current Account'), 0)

Mobile.delay(5)

'Screenshot for the screen when user selects personal current account'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/18_Select Primary Account')

Mobile.takeScreenshot()

'User taps on Next after selecting the personal current account'
Mobile.tap(findTestObject('Object Repository/004_Login/32_Click_On_Next_To_Proceed_With_Selected_Account'), 0)

Mobile.delay(5)

'User verifies the screen once reached to screen asking if the user is existing Maybank customer'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/33_VerifyElementText - Are you a new Maybank customer'), 
    'Are you a new Maybank customer?')

'Screenshot for the screen when user is on screen asking if the user is existing Maybank customer'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/19_Are you a new Maybank customer')

Mobile.takeScreenshot()

'User tasp on skip'
Mobile.tap(findTestObject('Object Repository/004_Login/34_Click_On - Skip'), 0)

Mobile.delay(5)

'User verifies the screen once reached to setup sucessful screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/35_VerifyElementText - Set Up Successful'), 'Set Up Successful')

'Screenshot for the screen when user is on setup successful screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/20_Set Up Successful')

Mobile.takeScreenshot()

'User taps on Secure2u button for initiating Secure2u activation process'
Mobile.tap(findTestObject('Object Repository/004_Login/36_Click_On_Secure2u'), 0)

Mobile.delay(5)

'User verifies the screen once reached to screen Secure2u Activation screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/37_VerifyElementText_inside_Secure2u_Screen - Activate Secure2u to approve transactions safely and quickly with a single tap'), 
    'Activate Secure2u to approve transactions safely and quickly with a single tap.')

'Screenshot for the screen when user is on screen secure2u activation'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/21_Activate Secure2u')

Mobile.takeScreenshot()

'User taps on Proceed'
Mobile.tap(findTestObject('Object Repository/004_Login/38_Clickon_Proceed_Button_For_Secure2u'), 0)

Mobile.delay(5)

'User verifies the screen once reached to mobile number confirmation screen for OTP'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/39_Confirming_OTP_mobile_No - One Time Password'), 
    'One Time Password')

'Screenshot once user is on mobile number confirmation screen for OTP'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/22_Confirming_OTP_mobile_No')

Mobile.takeScreenshot()

'User taps on Confirm button to send OTP'
Mobile.tap(findTestObject('Object Repository/004_Login/40_TapConfirm_Button_To_Send_OTP'), 0)

Mobile.delay(5)

'User verifies the screen once reached to OTP screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/41_VerifyElementText_for_Secure2u_Otp - One Time Password'), 
    'One Time Password')

'Screenshot for the screen when user is on OTP screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/23_OTP_Screen')

Mobile.takeScreenshot()

Mobile.delay(5)

//Get OTP
'User enters OTP'
Mobile.tap(findTestObject('004_Login/OTP-Field'), 0)

Mobile.delay(3)

/*
 * Mobile.getText(findTestObject('Object Repository/004_Login/42_Read_The_OTP -
 * Your OTP no. is 656640'), 0)
 * 
 * //storing the otp inside a variable def otpText4 =
 * Mobile.getText(findTestObject('Object Repository/004_Login/42_Read_The_OTP -
 * Your OTP no. is 656640'), 0)
 * 
 * //Applying the read otp otpText4 = otpText4.replace('Your PIN no. is ', '')
 * 
 * def otpArr4 = otpText4.toCharArray()
 * 
 * for (def i = 0; i < otpArr4.length; i++) { if ((otpArr4[i]) == '1') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0) }
 * else if ((otpArr4[i]) == '2') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/2 button'), 0) } else if ((otpArr4[i]) == '3') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0) }
 * else if ((otpArr4[i]) == '4') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/4 button'), 0) } else if ((otpArr4[i]) == '5') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0) }
 * else if ((otpArr4[i]) == '6') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/6 button'), 0) } else if ((otpArr4[i]) == '7') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0) }
 * else if ((otpArr4[i]) == '8') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/8 button'), 0) } else if ((otpArr4[i]) == '9') {
 * Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0) }
 * else if ((otpArr4[i]) == '0') { Mobile.tap(findTestObject('Object
 * Repository/OTP buttons/0 button'), 0) } }
 */
'Screenshot for the screen after OTP is entered'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/24_Second_OTP')

Mobile.takeScreenshot()

'User taps on confirm check button after entering OTP'
Mobile.tap(findTestObject('004_Login/OTPCheckButton2'), 0)

Mobile.delay(5)

'User verifies the screen once reached to Enter your ID screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/44_VerifyElementText - Enter your ID number'), 'Enter your ID number')

'Screenshot for the screen when user is on Enter your ID screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/25_MyKad_Screen')

Mobile.takeScreenshot()

'User enter MyKad ID'
Mobile.setText(findTestObject('Object Repository/004_Login/45_SetText - Your ID number'), '980112105212', 0)

'User hides keyboard'
Mobile.hideKeyboard()

Mobile.delay(5)

'Screenshot for the screen when user enters MyKad ID'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/26_MyKad_number')

Mobile.takeScreenshot()

'User taps on confirm button after entering MyKad ID'
Mobile.tap(findTestObject('Object Repository/004_Login/46_Click_On_Continue_Button_After_Entering_MyKad_Number'), 0)

Mobile.delay(5)

'User verifies the screen once reached to Device Name screen'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/47_VerifyElementText - Device Name'), 'Device Name')

'Screenshot for the screen when user is on Device Name screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/27_Device Name')

Mobile.takeScreenshot()

'User taps on Confirm Device name screen'
Mobile.tap(findTestObject('Object Repository/004_Login/48_Click_On_Continue_to_Confirm_Device_Name'), 0)

Mobile.delay(5)

//Mobile.verifyElementText(findTestObject('Object Repository/004_Login/49_GetElementText_AccountCreationStatus- Secure2u activation in progress'), 'Secure2u activation in progress')
'Screenshot for the screen when user is on secure2u activation screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/27_Secure2u activation in progress')

Mobile.takeScreenshot()

'User taps on continue button at the login last'
Mobile.tap(findTestObject('004_Login/LastContinueButton'), 0)

Mobile.delay(5)

'User verifies the screen once reached to Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/004_Login/51_VerifyElementText_For_Dashboard - Quick Actions'), 
    'Quick Actions')

'Screenshot for the screen when user is on Dashboard screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/28_DashboardImage')

Mobile.takeScreenshot()

