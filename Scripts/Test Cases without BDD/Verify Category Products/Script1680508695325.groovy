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

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/h2_Category'), 'CATEGORY')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise/div_WomenDress Tops Saree MenTshirts Jeans _e0e1cf'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Tshirts Products/i_Women_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Dress'))

WebUI.click(findTestObject('ad_close_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Dress Products/h2_Women - Dress Products'), 
    'WOMEN - DRESS PRODUCTS')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Dress Products/i_Men_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Dress Products/a_Tshirts'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Tshirts Products/h2_Men - Tshirts Products'), 
    'MEN - TSHIRTS PRODUCTS')

WebUI.closeBrowser()

