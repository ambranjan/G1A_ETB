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

//Dashboard
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/01_GetElementText_Dashboard- Quick Actions'), 'Quick Actions')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/01_Dashboard')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/02_Click_On_Apply_Button_BottomRight'), 0)

Mobile.delay(5)

//Apply Screen
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/03_GetElementText_Third_Tile_Is_For_G1A- Global Access Account-i'), 
    'Global Access Account-i')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/02_Apply_Screen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/04_ClickOn_G1A_ThirdTile'), 0)

Mobile.delay(5)

//G1A Apply screen
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/05_GetElementText - ApplyPage - Global Access Account-i'), 
    'Global Access Account-i')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/03_ApplyScreen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/06_Click_On_ApplyNowButton'), 0)

Mobile.delay(10)

//Password Enter Screen

/*
 * Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/
 * 04_Enter_Password_Screen')
 * 
 * Mobile.setText(findTestObject('003_Create_G1A/001_Apply_For_G1A/android.
 * widget.EditText - M2U password send text'), 'Pass@135', 0)
 * 
 * Mobile.hideKeyboard()
 * 
 * Mobile.delay(5)
 * 
 * Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/
 * 05_Entered_Password_Screen')
 * 
 * Mobile.tap(findTestObject('003_Create_G1A/001_Apply_For_G1A/android.view.
 * ViewGroup - Click on Continue to land on step 1'), 0)
 * 
 * Mobile.delay(5)
 */

//Step 1 of 4
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/07_GetElementText_UserIsOn - Step 1 of 4'), 'Step 1 of 4')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/06_User_On_Step_1')

Mobile.swipe(0, 300, 0, 0)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/08_CityVisibleAfterScroll'), 'City')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/07_Scroll_Screen_On_Step_1')

Mobile.setText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/09_SetText_KualaLumpur'), 'Kual Lumpur', 0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/08_After_Entering_City_Name_On_Step_1')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/10_TapOnNextButton_Fron_Step_1'), 0)

Mobile.delay(8)

//Step 2 of 4
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/11_GetElementText_User_Is_On - Step 2 of 4'), 'Step 2 of 4')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/09_User_On_Step_2')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/12_TapOnNextButton_From_Step_2'), 0)

Mobile.delay(10)

//Step 3 of 4
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/13_GetElementText_UserIsOn- Step 3 of 4'), 'Step 3 of 4')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/10_User_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/14_Tap_On_State_Dropdown'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/11_SetState_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/15_Set_KualaLumpur - Done'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/16_Tap_On_Districe_Dropdown'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/12_SetDistrict_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/17_Select_KualaLumpur'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/18_Click_Done_For_District_KualaLumpur'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/19_Tap_On_Branch_Dropdown'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/13_SetBranch_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/20_Select_Done_For_KualaLumpur'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/14_AfterEnteringDetails_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/21_Clcik_On_Next_Button_For_Step3_to_Step4'), 0)

Mobile.delay(3)

//Step 4 of 4
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/22_VerifyElementText_UserIsOn - Step 4 of 4'), 'Step 4 of 4')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/15_User_is_On_Step_3')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/23_ClickOnNext_ToGoFurther'), 0)

Mobile.delay(5)

//Card Delivery Address
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/24_VerifyElementText - Debit Card Delivery Details'), 
    'Debit Card Delivery Details')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/16_DebitCard_DeliveryDetails')

Mobile.swipe(0, 300, 0, 0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/17_Scroll_To_Terms&Conditions')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/25_SelectRadioButton- I have read and agree Terms  Conditions'), 
    0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/18_Agree_To_Terms&Conditions')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/26_ClickOnNextButtonFromAddressScreen'), 0)

Mobile.delay(5)

//Declaration
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/27_VerifyElementText - Declaration'), 'Declaration')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/19_Declaration_Screen')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/28_AcceptDeclaration- Yes, I expressly agree to be contacted'), 
    0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/20_Agree_To_Declaration')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/29_ClickAgreeAndConfirm'), 0)

Mobile.delay(5)

//Details Confirmation
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/30_VerifyElementText_FinalDetails- Please confirm the details below'), 
    'Please confirm the details below')

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/21_Details_Confirmation')

Mobile.swipe(0, 600, 0, 0)

Mobile.takeScreenshot('Screenshots/003_CreateG1A/001_ApplyForG1A/22_Details_Confirmation_Scroll_Down')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/001_Apply_For_G1A/31_ClickOnConfirmButton'), 0)

Mobile.delay(5)

