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
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/01_UserOnDashboard')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/02_Tap_On_Apply_Button'), 0)
Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/03_GetElementText - Global Access Account-i'), 
    'Global Access Account-i')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/02_ApplyScreen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/04_Tap_On_G1A_Tile'), 0)
Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/05_GetElementText_Of_ApplyPage- Global Access Account-i'), 
    'Global Access Account-i')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/03_ApplyNow_Screen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/06_Tap_On_ApplyNow_Button'), 
    0)
Mobile.delay(10)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/07_GetElementText- MyKad number'), 
    'MyKad number')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/04_My_Kad_Screen')

Mobile.setText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/08_SetText_MyKadNumber'), 
    '980112105212', 0)
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/05_AfterEntering_KadID')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/09_ClickOnContinue_After_KadNumber'), 
    0)
Mobile.delay(5)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/10_VerifyElementText- Log in to your Maybank2U account to continue'), 
    'Log in to your Maybank2U account to continue')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/06_LogInMaybank_Request')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/11_ClickOnContinue_To_Login'), 
    0)
Mobile.delay(5)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/12_GetElementText- Please enter your username'), 
    'Please enter your username')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/07_Redirected_To_Login_Screen')

Mobile.setText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/13_SetText_UserName'), 'testasb103', 
    0)
Mobile.delay(2)
Mobile.hideKeyboard()
Mobile.delay(2)
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/08_Username_Entered')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/14_TapOnContinue_afterUserName'), 
    0)
Mobile.delay(5)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/15_VerifyUserName- Is this your security phrase'), 
    'Is this your security phrase?')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/09_Confirm_Username_Screen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/16_Click_YestitsMine'), 0)
Mobile.delay(5)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/17_VerifyElementText - Enter your password'), 
    'Enter your password')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/10_Enter_Password_Screen')

Mobile.setText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/18_SetText_Password'), 'Pass@135', 
    0)
Mobile.hideKeyboard()
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/11_Password_Entered')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/19_ClickOnContinue_afterPassword'), 
    0)
Mobile.delay(5)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/20_VerifyElementText - Create your PIN for the app'), 
    'Create your PIN for the app')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/12_Pin_Creation_Screen')
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/21_Tap_On_The_Pin_for_Creation'), 
    0)
Mobile.delay(2)
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/13_PinEntered')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/22_TapOn_Check_To_Create_Pin'), 
    0)
Mobile.delay(5)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/23_VerifyElementText- Confirm your 6-digit PIN'), 
    'Confirm your 6-digit PIN')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/13_PinConfirmation_Screen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/24_Tap_On_The_Pin_For_Confirmation'), 
    0)
Mobile.delay(2)
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/14_Pin_Confirmed')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/25_Tap_On_Check_To_Confirm_Pin'), 
    0)
Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/26_VerifyElementText - Enable biometric ID for instant access'), 
    'Enable biometric ID for instant access')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/15_BiometricID_Screen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/27_TapOnSetupLater- Set Up Later'), 
    0)
Mobile.delay(3)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/28_VerifyElementText - Verify Number'), 
    'Verify Number')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/16_Verify_NumberForThe_OTP_ToBe_Sent')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/29_Tap_On_Yes_Proceed'), 0)
Mobile.delay(3)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/30_EnterOTP - One Time Password'), 
    'One Time Password')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/17_EnterOTP_Screen')
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/31_Tap_On_Otp'), 0)
Mobile.delay(2)
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/18_After_Entering_OTP')
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/32_TapOnConfirmCheckTOProceed_WithOTP'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/33_VerifyElementText - How would you like us to address you'), 
    'How would you like us to address you?')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/19_UserName_ToAddress')

Mobile.setText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/34_SetText_AndroidTest - Enter your name'), 
    'AndroidTest', 0)
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/20_After_Providing_User_Name')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/35_ClickOnContinue'), 0)
Mobile.delay(4)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/36_VerifyElementText - Set Primary Account'), 
    'Set Primary Account')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/21_AccountSelection_Screen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/37_SelectPersonalCurrentAccount - 5140 1303 8412'), 
    0)
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/22_AfterSelectingPersonalCurrentAccount')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/38_TapOnNext_ToProceed'), 0)
Mobile.delay(4)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/39_VerifyElementText - Are you a new Maybank customer'), 
    'Are you a new Maybank customer?')
Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/22_Skip_Question_Asking_ExistingMaybankCustomer')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/40_ClickOnSkip - Skip'), 0)
Mobile.delay(4)
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/41_VerifyElementText - Set Up Successful'), 
    'Set Up Successful')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/23_SetupSuccessful')


Mobile.tap(findTestObject('Object Repository/003_Create_G1A/005_ExistingCustomer_NewTo_MAE/42_Activating - Activate Secure2u'), 
    0)
Mobile.delay(4)
//---------------------------------------------------------------------------------------

//Code Starts for Step 1 of Step 4

//Step 1 of 4
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/07_GetElementText_UserIsOn - Step 1 of 4'), 'Step 1 of 4')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/24_User_On_Step_1')

Mobile.swipe(0, 300, 0, 0)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/08_CityVisibleAfterScroll'), 'City')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/25_Scroll_Screen_On_Step_1')

Mobile.setText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/09_SetText_KualaLumpur'), 'Kual Lumpur', 0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/26_After_Entering_City_Name_On_Step_1')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/10_TapOnNextButton_Fron_Step_1'), 0)

Mobile.delay(8)

//Step 2 of 4
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/11_GetElementText_User_Is_On - Step 2 of 4'), 'Step 2 of 4')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/27_User_On_Step_2')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/12_TapOnNextButton_From_Step_2'), 0)

Mobile.delay(10)

//Step 3 of 4
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/13_GetElementText_UserIsOn- Step 3 of 4'), 'Step 3 of 4')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/28_User_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/14_Tap_On_State_Dropdown'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/29_SetState_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/15_Set_KualaLumpur - Done'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/16_Tap_On_Districe_Dropdown'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/30_SetDistrict_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/17_Select_KualaLumpur'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/18_Click_Done_For_District_KualaLumpur'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/19_Tap_On_Branch_Dropdown'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/31_SetBranch_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/20_Select_Done_For_KualaLumpur'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/32_AfterEnteringDetails_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/21_Clcik_On_Next_Button_For_Step3_to_Step4'), 0)

Mobile.delay(3)

//Step 4 of 4
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/22_VerifyElementText_UserIsOn - Step 4 of 4'), 'Step 4 of 4')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/33_User_is_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/23_ClickOnNext_ToGoFurther'), 0)

Mobile.delay(5)

//Card Delivery Address
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/24_VerifyElementText - Debit Card Delivery Details'),
	'Debit Card Delivery Details')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/34_DebitCard_DeliveryDetails')

Mobile.swipe(0, 300, 0, 0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/35_Scroll_To_Terms&Conditions')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/25_SelectRadioButton- I have read and agree Terms  Conditions'),
	0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/36_Agree_To_Terms&Conditions')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/26_ClickOnNextButtonFromAddressScreen'), 0)

Mobile.delay(5)

//Declaration
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/27_VerifyElementText - Declaration'), 'Declaration')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/37_Declaration_Screen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/28_AcceptDeclaration- Yes, I expressly agree to be contacted'),
	0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/38_Agree_To_Declaration')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/29_ClickAgreeAndConfirm'), 0)

Mobile.delay(5)

//Details Confirmation
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/30_VerifyElementText_FinalDetails- Please confirm the details below'),
	'Please confirm the details below')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/39_Details_Confirmation')

Mobile.swipe(0, 600, 0, 0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/005_ExistingCustomer_NewTo_MAE/40_Details_Confirmation_Scroll_Down')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/31_ClickOnConfirmButton'), 0)

Mobile.delay(5)

