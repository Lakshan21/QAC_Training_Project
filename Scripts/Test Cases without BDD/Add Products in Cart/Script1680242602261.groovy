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

WebUI.scrollToElement(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'), 0)

WebUI.click(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Continue Shopping'))

WebUI.click(findTestObject('Page_Automation Exercise - All Products/Add to Cart 2'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/u_View Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_Shopping Cart'), 'Shopping Cart')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Blue TopWomen  TopsRs. 5001Rs. 500'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Men TshirtMen  TshirtsRs. 4001Rs. 400'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 500'), 'Rs. 500')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/button_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 500'), 'Rs. 500')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 400'), 'Rs. 400')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/button_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 400'), 'Rs. 400')

WebUI.closeBrowser()

