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

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Products'))

WebUI.click(findTestObject('ad_close_btn'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - All Products/h2_All Products'), 'ALL PRODUCTS')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_CategoryWomenDress Tops Saree MenTshirt_451130'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Brands (6)Polo (5)HM (5)Madame (3)Mast _49c309'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_All ProductsAddedYour product has been _e90caf'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_View Product'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/div_AddedYour product has been added to car_c29c8b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/h2_Blue Top'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Category Women  Tops'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/span_Rs. 500'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Availability In Stock'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Condition New'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Brand Polo'), 
    0)

WebUI.closeBrowser()

