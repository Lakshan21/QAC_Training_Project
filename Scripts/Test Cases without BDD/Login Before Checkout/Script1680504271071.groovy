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

WebUI.callTestCase(findTestCase('Test Cases without BDD/Reusable Test Cases/Login User'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases without BDD/Reusable Test Cases/Add Products to Cart fom home'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/h2_Address Details'), 'Address Details')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/h3_Your delivery address'), 
    'YOUR DELIVERY ADDRESS')

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_Mr. John Doe'), 'Mr. John Doe')

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_RBC'), 'RBC')

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_434 Yonge Street, PO Box 1223, RBC, Toronto, ON'), 
    '434 Yonge Street, PO Box 1223, RBC, Toronto, ON')

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_323 Dundas West, M4R 7G3, Toronto, ON'), 
    '323 Dundas West, M4R 7G3, Toronto, ON')

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_Toronto OntarioM4S 1G7'), 'Toronto Ontario M4S 1G7')

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_Canada'), 'Canada')

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_416-123-3321'), '416-123-3321')

WebUI.setText(findTestObject('Page_Automation Exercise - Checkout/textarea_If you would like to add a comment_a4f199'), 
    'Place Order')

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/a_Place Order'))

WebUI.click(findTestObject('ad_close_btn'))

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 'John Doe')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Card Number_card_number'), '12123')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_CVC_cvc'), '124')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Expiration_expiry_month'), '06')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Expiration_expiry_year'), '2024')

WebUI.click(findTestObject('Page_Automation Exercise - Payment/button_Pay and Confirm Order'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Order Placed/b_Order Placed'), 'ORDER PLACED!')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.closeBrowser()

