import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LogoutUser {

	@Given("user is logged in")
	public void user_is_logged_in() {
		CucumberKW.runFeatureFile('Include/features/LoginUser.feature')
	}

	@And("clicks on logout button")
	public void clicks_on_logout_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Logout'))
	}

	@Then("user is navigated to the login page and logged out")
	public void user_is_navigated_to_the_login_page_and_logged_out() {
		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Signup  Login/h2_Login to your account'), 'Login to your account')

		WebUI.closeBrowser()
	}
}
