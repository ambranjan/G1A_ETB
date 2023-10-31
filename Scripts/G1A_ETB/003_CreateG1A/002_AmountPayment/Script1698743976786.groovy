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
'User verifies the screen once reached to Amount Transfer Screen'
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/01_GetElementText_UserIsOnAmountTransferScreen - Transfer from'), 
    'Transfer from')

'Screenshot when user is on Amount Transfer screen'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/01_User_On_TransferFrom_Screen')

Mobile.takeScreenshot()

'User taps on RM 50 to edit the amount'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/02_ClickOnAmount - RM 50.00'), 0)

Mobile.delay(3)

'User verifies the text present on the amount edit screen regarding the min amount to be entered'
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/03_VerifyElementText_Declaration- The minimum top up amount is RM 50.00'), 
    'The minimum top up amount is RM 50.00')

'Screenshot for the text present on the amount edit screen regarding the min amount to be entered'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/02_User_On_AmoutEdit_Screen')

Mobile.takeScreenshot()

'User changes the amount to RM 5'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/04_Tap_DeleteKey_To_Make_The_Amount_RM5'), 
    0)

Mobile.delay(3)

'Screenshot when user changes the amount to RM 5'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/03_User_Makes_The_Amount_RM_5')

Mobile.takeScreenshot()

'User taps on OK but user unable to proceed'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/05_UserClicksOn_OK_Nothing_Happens'), 0)

'Screenshot when user tap on OK and unable to proceed'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/04_Nothing_Happens_When_User_Proceeds')

'User taps on 0 once'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/06_UserClicksON_Zero_Once'), 0)

'user taps on 0 twice'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/07_UserClicksOn_Zero_Twice'), 0)

'user taps on 0 throce to make the amount RM 5000'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/08_UserClicks on zero_ToMakeTheAmount_5000'), 
    0)

'Screenshot when user make the amount RM 5000'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/05_User_Makes_The_Amount_RM_5000')

Mobile.takeScreenshot()

'User taps on ok/check button to proceed with entered amount'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/09_UserClicks_OkCheck_ToContinue'), 0)

Mobile.delay(3)

'Screenshot when amount displayed for payment is RM 5000'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/06_Displayed_Amount_Is_RM_5000')

Mobile.takeScreenshot()

'User taps on Pay now'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/10_UserTapsOnPayNow'), 0)

'Screenshot when user gets insufficient amount error'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/07_Error_Displays_Insufficient_Amount')

Mobile.takeScreenshot()

'User taps on Amount to change the amount'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/11_UserClicksOnAmount_ToChange'), 0)

Mobile.delay(3)

'Screenshot when user is on edit amount screen'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/08_Clicks_Amount_To_Edit')

Mobile.takeScreenshot()

'User taps on delete once'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/12_TapDeleteOnce'), 0)

'User taps on delete twice'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/13_TapDeleteTwice_To_Make_TheAmount_50'), 
    0)

'Screenshot when user makes the amount RM 50'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/09_User_Makes_The_Amount_RM_50')

Mobile.takeScreenshot()

'User taps on OK for RM 50 amount'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/14_ClickOn_Ok'), 0)

Mobile.delay(5)

'Screenshot when amount to be paid is displayed as RM 50'
Mobile.takeScreenshot('Screenshots/003_CreateG1A/002_Amount_Payment/10_Displayed_Amount_Is_RM_50')

Mobile.takeScreenshot()

'User taps on Pay Now button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/15_Tap_On_PayNowButton'), 0)

Mobile.delay(5)

//Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/16_OTPwillbesent_ForTAC - One Time Password'), 'One Time Password')
//Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4087279449074935945.png')
//Mobile.tap(findTestObject('Object Repository/003_Create_G1A/002_AmountPayment/17_ClickOnConfirm'), 0)
'User Navigates to Secure2u Payment'
Mobile.takeScreenshot('Object Repository/003_Create_G1A/002_AmountPayment/15.1_UserNavigates_To_Secure2UScreen')

Mobile.takeScreenshot()

'User taps on Approve button'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/Secure2U_Approve'), 0)

Mobile.delay(3)

'Screenshot when Payment is done'
Mobile.takeScreenshot('Object Repository/003_Create_G1A/002_AmountPayment/15.2_NewPinReset_Successfully')

Mobile.takeScreenshot()

'User taps on Done once the payment is done'
Mobile.tap(findTestObject('Object Repository/002_PostLogin/001_ViewAccount/PasswordResetDone'), 0)

Mobile.delay(3)

