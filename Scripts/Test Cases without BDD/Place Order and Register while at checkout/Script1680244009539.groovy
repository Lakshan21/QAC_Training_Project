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

WebUI.callTestCase(findTestCase('Test Cases without BDD/Reusable Test Cases/Add Products to Cart fom home'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.callTestCase(findTestCase('Test Cases without BDD/Reusable Test Cases/Register User from checkout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/h2_Address Details'), 'Address Details')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/h3_Your delivery address'), 
    'YOUR DELIVERY ADDRESS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_Mr. Billy Bob'), 'Mr. Billy Bob')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_QAC'), 'QAC')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_275 Sheppard Road West, PO Box 1033, QAC_e66005'), 
    '275 Sheppard Road West, PO Box 1033, QAC, Toronto, ON')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_426 Kennedy Road, M4S 1R5, Toronto, ON'), 
    '426 Kennedy Road, M4S 1R5, Toronto, ON')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_Toronto OntarioM4S 1G5'), 
    'Toronto Ontario M4S 1G5')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_Canada'), 'Canada')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_416-223-4452'), '416-223-4452')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/textarea_If you would like to add a comment_a4f199'), 
    'Place Order')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Place Order'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 'Billy Bob')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Card Number_card_number'), '123243')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_CVC_cvc'), '211')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Expiration_expiry_month'), '08')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Expiration_expiry_year'), '2025')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Payment/button_Pay and Confirm Order'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Order Placed/b_Order Placed'), 'ORDER PLACED!')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Order Placed/a_Delete Account'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Deleted'), 
    'ACCOUNT DELETED!')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.closeBrowser()

