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

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/003_PaymentGateway/01_User_Is_On_OTP_toBeSent_Screen - One Time Password'), 
    'One Time Password')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6064374859314749860.png')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/003_PaymentGateway/02_User_Clicks_On_Confirm_Button'), 0)

Mobile.delay(10)

Mobile.verifyElementText(findTestObject('Object Repository/003_Create_G1A/003_PaymentGateway/03_User_Requested_To_Enter - One Time Password'), 
    'One Time Password')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4800604609867073040.png')

Mobile.delay(10)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7320965860333898565.png')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/003_PaymentGateway/04_Click_On_Confirm_OTP_Button'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5081406937769737137.png')

Mobile.tap(findTestObject('Object Repository/003_Create_G1A/003_PaymentGateway/05_Click_On_Done'), 0)

