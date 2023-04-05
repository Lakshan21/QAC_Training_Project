import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LoginUserSteps {
	@Given("user is on home page")
	public void user_is_on_home_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.automationexercise.com/')
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/h1_AutomationExercise'), 'AutomationExercise')
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebUI.click(findTestObject('Page_Automation Exercise/a_Signup  Login'))
		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Signup  Login/h2_Login to your account'), 'Login to your account')
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/Login email input'), 'johndoe@hotmail.com')
		WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup  Login/input_Login to your account_password'),
				'MHSUC33hkPmoriEBrWV97Q==')
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Login'))
	}

	@Then("user is navigated to the home page and logged in")
	public void user_is_navigated_to_the_home_page_and_logged_in() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/a_Logged in as John Doe'), 'Logged in as John Doe')
	}
}

