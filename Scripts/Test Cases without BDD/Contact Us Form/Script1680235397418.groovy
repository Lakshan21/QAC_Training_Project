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

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Contact us'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Contact Us/h2_Get In Touch'), 'GET IN TOUCH')

WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Get In Touch_name'), 'John Doe')

WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Get In Touch_email'), 'johndoe@hotmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/input_Get In Touch_subject'), 'T-shirt Adding to Cart not working')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/textarea_Get In Touch_message'), 'Adding a t-shirt to my cart does not work. It does not get added to my cart.')

WebUI.uploadFile(findTestObject('Page_Automation Exercise - Contact Us/UploadFilebutton'), 'C:\\Users\\lganeshalingam\\OneDrive - QA Consultants\\Desktop\\Contact Us Form Test.txt')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/div_Success Your details have been submitte_fc584e'), 
    'Success! Your details have been submitted successfully.')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/span_Home'))

WebUI.click(findTestObject('ad_close_btn'))

WebUI.verifyElementText(findTestObject('Page_Automation Exercise/h1_AutomationExercise'), 'AutomationExercise')

WebUI.closeBrowser()

