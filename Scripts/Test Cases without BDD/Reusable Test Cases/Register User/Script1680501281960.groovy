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

WebUI.callTestCase(findTestCase('Test Cases without BDD/Reusable Test Cases/Verify Home Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Signup  Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/h2_New User Signup'), 
    'New User Signup!')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'Billy Bob')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/Sign up email input'), 'billybob@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Signup/b_Enter Account Information'), 'ENTER ACCOUNT INFORMATION')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Mr_title'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'), 
    '2000', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Date of Birth_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__first_name'), 'Billy')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__last_name'), 'Bob')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Company_company'), 'QAC')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
    '275 Sheppard Road West, PO Box 1033, QAC, Toronto, ON')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Address 2_address2'), '426 Kennedy Road, M4S 1R5, Toronto, ON')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'India', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'Canada', true)

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__state'), 'Ontario')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__city'), 'Toronto')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__zipcode'), 'M4S 1G5')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__mobile_number'), '416-223-4452')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Account Created/b_Account Created'), 'ACCOUNT CREATED!')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.click(findTestObject('ad_close_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/a_Logged in as Billy Bob'), 'Logged in as Billy Bob')

