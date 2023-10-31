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

'Application Launched\r\n'
Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/01_VerifyElementText-UserIsOnDashboard- Quick Actions'), 
    'Quick Actions')

'Dashboard Screenshot Taken'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/01_UserIsOnDashboard')

Mobile.takeScreenshot()

'Clicked on Apply button present on the footer right corner'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/02_Tap_On_ApplyButton_FooterRightCorner'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/03_VerifyElementText-UserIsOnApplyScreen'), 
    'Apply')

'Screenshot for the Apply Page is taken'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/02_UserIsOnApplyScreen')

'User taps on the Global 1 account'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/04_ClickOn_GlobalAccessAccount-i'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/05_VerifyElementText_UserIsOnGlobalAccessAccount-i'), 
    'Global Access Account-i')

'Screenshot for the G1A Apply Now page is taken'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/03_UserInside_GlobalOneAccount')

Mobile.takeScreenshot()

'User Clicked on Apply Now'
Mobile.tap(findTestObject('003_Create_G1A/Steps/06_TapOnApplyNowButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/07_VerifyElementText_UserIsOn_Enter your password_Screen'), 
    'Enter your password')

'Screenshot for Password Screen is taken\r\n'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/04_EnterPasswordScreen')

Mobile.takeScreenshot()

'Keyboard hidden'
Mobile.hideKeyboard()

Mobile.delay(3)

'Password is provided in the password field'
Mobile.setText(findTestObject('003_Create_G1A/Steps/08_SetText_PasswordEntered'), 'Pass@135', 0)

'Screenshot aftre entering the password is taken'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/05_PasswordEntered')

Mobile.takeScreenshot()

'User clicks on the continue button after entering the password'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/09_Tap_OnContinueButton'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/10_UserNavigatedTo - Step 1 of 4'), 'Step 1 of 4')

'Screenshot for the Step 1 of Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/06_UserOnStep_1of4')

Mobile.takeScreenshot()

'User scrolls to the city field'
Mobile.scrollToText('City')

Mobile.delay(2)

'City is set to Kuala Lumpur'
Mobile.setText(findTestObject('Object Repository/003_Create_G1A/Steps/11_SetText_City_KualaLumpur'), 'Kuala Lumpur', 0)

'Screenshot of Step 1 before navigating to Step 2'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/07_Step1_ScreenShot')

Mobile.takeScreenshot()

'User taps on Step 1 Next button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/12_ClickStep1_Next'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/13_UserNavigatedTo - Step 2 of 4'), 'Step 2 of 4')

'Screenshot upon navigating to Step 2 of Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/08_UserNavigatedToStep2')

Mobile.takeScreenshot()

'User CLicks on Next button on Step 2 '
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/14_ClickStep2_Next'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/15_UserNavigatedTo - Step 3 of 4'), 'Step 3 of 4')

'Screenshot upon navigating to Step 3 of Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/08.1_UserNavigatedToStep2')

Mobile.takeScreenshot()

'User taps on state dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/16_StateDropdown'), 0)

Mobile.delay(2)

'Screenshot is taken for state dropdown'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/09_StateDropdown')

Mobile.takeScreenshot()

'User taps on done after selecting the state'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/17_StateSelection- Done'), 0)

Mobile.delay(2)

'user taps on district dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/18_DistrictDropdown'), 0)

Mobile.delay(2)

'Screenshot for the district dropdown elements'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/10_DistrictDropdown')

Mobile.takeScreenshot()

'User selects Kuala Lumpur as district from the dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/19_TapOn - Kuala Lumpur - fromDropdown'), 0)

Mobile.delay(2)

'Screenshot for selecting Kuala Lumpur as district from the dropdown'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/11_SelectKualaLumpurFromDistrictDropdown')

Mobile.takeScreenshot()

'User taps on done after seleting the district from the dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/20_DistrictSelection - Done'), 0)

Mobile.delay(2)

'User taps on the branch dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/21_BranchDropdown'), 0)

Mobile.delay(2)

'screenshot for the branch dropdown value is captured'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/12_BranchDropdown')

Mobile.takeScreenshot()

'User taps on Done button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/22_BranchSelection - Done'), 0)

Mobile.delay(2)

'Screenshot for Step 3 before navigating to Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/13_Step3Screenshot')

Mobile.takeScreenshot()

'User taps on Next to navigate to the Step 4 of the application'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/23_ClickStep3_Next'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/34_UserNavigatedTo- Step 4 of 4'), 'Step 4 of 4')

'Screenshot of the screen upon navigating to Step 4'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/14_UserIsOn_Step_4')

Mobile.takeScreenshot()

'User taps on Next to navigate to the debit card delivery details'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/35_ClickStep4_Next'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/36_UserNavigatedTo- Debit Card Delivery Details'), 
    'Debit Card Delivery Details')

'Screenshot after navigating to the debit card delivery details screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/15_UserIsOn_DebitCardDeliveryScreen')

Mobile.takeScreenshot()

'User scrolls the screen down to get to the terms and conditions'
Mobile.swipe(0, 300, 0, 0)

Mobile.delay(2)

'Screenshot after scrolling down on the terms and conditions'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/16_ScrollTo_Terms_and_Conditions')

Mobile.takeScreenshot()

'User selects the radio button as an acceptance to terms and conditions'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/37_SelectTandC_RadioButton- I have read and agree Terms  Conditions'), 
    0)

Mobile.delay(2)

'Screenshot of the screen before proceeding to the declaration screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/17_AgreeTo_Terms_and_Conditions')

Mobile.takeScreenshot()

'User taps on next button to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/38_ClickNextOnDeliveryScreen'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/39_UserNavigatedTo - Declaration - Screen'), 
    'Declaration')

'Screenshot after navigating to the declarations creen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/18_User_On_Declaration_Screen')

Mobile.takeScreenshot()

'User taps on the agree radio button in the declaration screen'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/40_TapOn - Yes, I expressly agree to be contacted'), 0)

Mobile.delay(2)

'Screenshot of declaration screen before navigating to the details confirmation screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/19_Selected_Yes_InDeclarationScreen')

Mobile.takeScreenshot()

'User taps on Agree and Continue button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/41_TapOn_AgreeAndConfirm'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/42_UserNavigatesTo_DetailsConfirmationScreen - Please confirm the details below'), 
    'Please confirm the details below')

'Screenshot after User gets navigated to the details confirmation screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/20_UserRedirectedToFinalConfirmationScreen')

Mobile.takeScreenshot()

'User Swipe screen to Aditional Details screen'
Mobile.swipe(0, 400, 0, 0)

Mobile.delay(2)

'Screenshot after the sceen is scrolled'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/20_UserRedirectedToFinalConfirmationScreen')

Mobile.takeScreenshot()

'User Clicked Edit on User details screen'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/43_ClickEdit_On_AdditionalDetailsScreen'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/47_UserIsOn- Please fill in your preferred branchdetails'), 
    'Please fill in your preferred branch\ndetails')

'Screenshot after user gets navigated to user details screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/21_UserIsOnBranchDetailsScreen')

Mobile.takeScreenshot()

'User taps on Branch dropdown screen'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/44_TapOnBranchDropdown'), 0)

Mobile.delay(2)

'Screenshot for the branch dropdown list '
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/21_UserIsOnBranchDetailsScreen')

Mobile.takeScreenshot()

'User selects the branch Wisma'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/45_SelectDifferentValueFromDropdown - Wisma Genting2'), 
    0)

Mobile.delay(2)

'Screenshot after user selects Wisma branch'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/22_SelectDifferentBranch_Wisma_Genting2')

Mobile.takeScreenshot()

'Tap on done aftetr user selects Wisma branch'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/46_TapOnDone'), 0)

Mobile.delay(2)

'Screenshot after selecting the branch'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/23_TheNewBranchIs_Selected')

Mobile.takeScreenshot()

'User clicks on confirmation button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/48_ClickOnConfirmButtionFrom_AdditionalDetailScreen'), 
    0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/49_UserNavigatedBackTo - ConfirmationScreen'), 
    'Confirmation')

'Screenshot after User navigated to Confirmation screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/24_USerNavigatedToConfirm_Screen')

Mobile.takeScreenshot()

'User taps on edit button for Employment details screen'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/50_ClickOnEmploymentDetailsEdit'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/51_userNavigatedToEmploymentDetailsScreen- Please fill in your employment details'), 
    'Please fill in your employment details')

'Screenshot after navigating to employment details screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/25_USerNavigatedToEmployee_Details_EditScreen')

Mobile.takeScreenshot()

'User set the employer name to The Test '
Mobile.setText(findTestObject('Object Repository/003_Create_G1A/Steps/52_EmployerNameSetToTheTest'), 'TheTest', 0)

'User Tap on Accounting dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/53_ClickOnAccountingDropdown'), 0)

Mobile.delay(2)

'The dropdown value occurs'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/26_AccountingDropdownValuesVisible')

Mobile.takeScreenshot()

'User scrolls the list to view Travel Guides'
Mobile.scrollToText('Visual Artists')

Mobile.delay(15)

'Screenshot for the list after scroll'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/27_Screen_Getting_Scrolled')

Mobile.takeScreenshot()

'User taps on Travel guide'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/54_SelectTravel - Travel Guides'), 0)

Mobile.delay(2)

'Screenshot after user selects Travel guide'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/28_TravelGuiode_Selected')

Mobile.takeScreenshot()

'User enters employer\'s name as test employer'
Mobile.setText(findTestObject('Object Repository/003_Create_G1A/Steps/55_EnterTestEmployerName'), 'Test Employer Name', 
    0)

Mobile.delay(2)

'Screenshot after entering employer\'s name'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/29_EmployerName_TextSet')

Mobile.takeScreenshot()

'User taps on sector dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/56_TapOnSectorDropdown'), 0)

Mobile.delay(2)

'Screenshot after sector dropdown appears\r\n'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/30_SectorDropdownAppears')

Mobile.takeScreenshot()

'user selectes auto part business from dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/57_SelectAuto_PartBusinessfromDropdown - Auto Parts Business'), 
    0)

Mobile.delay(2)

'Screenshot after use5r selects sector'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/31_AutoPartsBusiness_Selected')

Mobile.takeScreenshot()

'user taps on employment type dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/58_ClickOnEmploymentTypeDropdown'), 0)

Mobile.delay(2)

'screenshot after employment type dropdown value appears'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/32_EmploymentDropdownValueVisible')

Mobile.takeScreenshot()

'user scrolls to till self empyed is visible'
Mobile.scrollToText('Self-Employed')

Mobile.delay(2)

'Screenshot of the self employed value in the dropdown'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/32_EmploymentDropdownValueVisible')

Mobile.takeScreenshot()

'user taps on done after selecting self employed'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/59_TapOnDoneFor_Self-Employed'), 0)

Mobile.delay(2)

'Screenshot of screen after employment type is selected'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/32_SelfEmployed_Selected')

Mobile.takeScreenshot()

'user taps on monthly income dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/60_TapOnMonthlyIncomeDropdown'), 0)

Mobile.delay(2)

'Screenshot of monthly income dropdown values'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/33_MonthlyIncome_Dropdown')

Mobile.takeScreenshot()

'User scrolls uptill RM 40,000 TO RM 49,999'
Mobile.scrollToText('RM 40,000 TO RM 49,999')

Mobile.delay(3)

'Screenshot after scrolling uptill the monthly income'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/33_MonthlyIncome_ScrolledTo_10To49_Selected')

Mobile.takeScreenshot()

'user taps on the monthly income value'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/61_TapDoneAfterSelectingMonthlyIncome'), 0)

Mobile.delay(2)

'Screenshot after selecting the monthly income'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/34_MonthlyIncome_10To49_Selected')

Mobile.takeScreenshot()

'user scrolls the screen to fetch the next fields'
Mobile.swipe(0, 350, 0, 0)

Mobile.delay(2)

'User taps on source of income dropdown'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/62_TapOnSourceOfIncomeDropdown'), 0)

Mobile.delay(2)

'Screenshot when the source of income list appears'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/34_SourceOfIncome')

Mobile.takeScreenshot()

'user selects Malaysia'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/63_TapDoneForMalaysia'), 0)

Mobile.delay(2)

'Screenshot after user selects Malaysia'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/35_Malaysia_Selected')

Mobile.takeScreenshot()

'User taps on confirm button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/64_ClickOnConfirmButton'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/65_UserLandedOnConfirmationScreen'), 'Confirmation')

'User navigated to confirmation screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/36_UserNavigated_toConfirmPage')

Mobile.takeScreenshot()

'user taps on edit for card delivery address'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/66_TapEditForDeliveryCardAddress'), 0)

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/67_UserLandedOnCardDeliveryAddressPage- Debit Card Delivery Details'), 
    'Debit Card Delivery Details')

'Screenshot after user navigated to card delivery details'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/36_UserNavigated_to_DeliveryAddressPage')

Mobile.takeScreenshot()

Mobile.delay(2)

'user clears the pre populated text'
Mobile.clearText(findTestObject('003_Create_G1A/Steps/68_ClearTextFrom_AddressLine1'), 0)

Mobile.delay(2)

'Screenshot after wiping of the text'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/37_DeliveryAddressCleared')

Mobile.takeScreenshot()

'user sets the Address line 1 of the address'
Mobile.setText(findTestObject('Object Repository/003_Create_G1A/Steps/69_SetTextForAddress Line 1'), 'TestAddress Line One', 
    0)

Mobile.delay(2)

'Screenshot after entering the address line 1 '
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/38_DeliveryAddressEntered')

Mobile.takeScreenshot()

'user taps next after editing the address'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/70_TapOnNextAfterAddressEdit'), 0)

Mobile.delay(2)

'Screenshot after user navigates to the confirmation page'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/39_UserNavigatedToConfirmationScreen')

Mobile.takeScreenshot()

'user scrolls to Personal Details section'
Mobile.scrollToText('Personal Details')

Mobile.delay(2)

'Screenshot after Personal Details section is visible'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/40_UserScrolledToPersonalDetails')

Mobile.takeScreenshot()

'user taps edit for editing the personal details'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/71_TapOnEditForPersonalDetails'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/72_UserNavigatedToStep1- Global Access Account-i Application'), 
    'Global Access Account-i Application')

'Screenshot after user navigates to personal detail page'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/41_UserNavigatedToPersonalDetailsScreen')

Mobile.takeScreenshot()

/*
 * Mobile.clearText(findTestObject('Object
 * Repository/003_Create_G1A/Steps/73_ClearMobileNumber'), 0)
 * 
 * Mobile.setText(findTestObject('Object
 * Repository/003_Create_G1A/Steps/74_EnterOnly_4_DigitValue'), '9876', 0)
 * 
 * Mobile.verifyElementText(findTestObject('Object
 * Repository/003_Create_G1A/Steps/75_ErrorForMobileNumber- Mobile number should
 * contain at least 10 digits'), 'Mobile number should contain at least 10
 * digits.')
 * 
 * Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\
 * screenshot2025052032221611372.png') Mobile.takeScreenshot()
 * 
 * Mobile.clearText(findTestObject('Object
 * Repository/003_Create_G1A/Steps/76_ClearMobileNumberAgain'), 0)
 * 
 * Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\
 * screenshot3390354864838650813.png') Mobile.takeScreenshot()
 * 
 * Mobile.setText(findTestObject('Object
 * Repository/003_Create_G1A/Steps/77_EnterInvalid10DigitMobileNumber'),
 * '9876543210', 0)
 * 
 * Mobile.verifyElementText(findTestObject('Object
 * Repository/003_Create_G1A/Steps/78_ErrorForInvalidMobileNumber- The mobile
 * number you entered is invalid'), 'The mobile number you entered is invalid.')
 * 
 * Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\
 * screenshot6799651832108050929.png') Mobile.takeScreenshot()
 * 
 * Mobile.clearText(findTestObject('Object
 * Repository/003_Create_G1A/Steps/79_ClearMobileNumberField'), 0)
 * 
 * Mobile.setText(findTestObject('Object
 * Repository/003_Create_G1A/Steps/android.widget.EditText - e.g 17 205 6789'),
 * '6026901125', 0)
 */
'User taps on confirm button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/80_ClickOnConfirm'), 0)

Mobile.delay(2)

'Screenshot after user navigates back to the confirmation screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/42_UserNavigatedToConfirmationSCreen')

Mobile.takeScreenshot()

'user taps on final confirmation button'
Mobile.tap(findTestObject('Object Repository/003_Create_G1A/Steps/81_ClickOnFinalConfirmationPage'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/Steps/android.widget.TextView - Transfer from'), 
    'Transfer from')

'Screenshot after user navigated to amount Screen'
Mobile.takeScreenshot('Screenshots/005_G1A_Form_Edit/43_UserNavigatedToAmountTransferScreen')

Mobile.takeScreenshot()

