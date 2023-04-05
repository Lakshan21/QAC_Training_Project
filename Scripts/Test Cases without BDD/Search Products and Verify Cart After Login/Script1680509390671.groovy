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

WebUI.click(findTestObject('Page_Automation Exercise/a_Products'))

WebUI.click(findTestObject('ad_close_btn'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - All Products/h2_All Products'), 'ALL PRODUCTS')

WebUI.setText(findTestObject('Page_Automation Exercise - All Products/input_Contact us_search'), 'jeans')

WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_Contact us_submit_search'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - All Products/h2_Searched Products'), 'SEARCHED PRODUCTS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Searched ProductsAddedYour product has _16589b'), 
    0)

WebUI.click(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))

WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_Continue Shopping'))

WebUI.click(findTestObject('Jeans Cart 2'))

WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_Continue Shopping'))

WebUI.click(findTestObject('Jeans Cart 3'))

WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_Cart'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_Shopping Cart'), 'Shopping Cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Soft Stretch JeansMen  JeansRs. 7991Rs. 799'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Regular Fit Straight JeansMen  JeansRs. _634aec'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Grunt Blue Slim Fit JeansMen  JeansRs. 1_7d4141'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Signup  Login'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/Login email input'), 'johndoe@hotmail.com')

WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup  Login/input_Login to your account_password'), 
    'MHSUC33hkPmoriEBrWV97Q==')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Login'))

WebUI.click(findTestObject('Page_Automation Exercise/a_Cart'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_Shopping Cart'), 'Shopping Cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Soft Stretch JeansMen  JeansRs. 7991Rs. 799'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Regular Fit Straight JeansMen  JeansRs. _634aec'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Grunt Blue Slim Fit JeansMen  JeansRs. 1_7d4141'), 
    0)

WebUI.closeBrowser()

