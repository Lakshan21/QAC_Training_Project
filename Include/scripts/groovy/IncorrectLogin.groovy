import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class IncorrectLogin {

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/Login email input'), 'steve@gmail.com')
		WebUI.setEncryptedText(findTestObject('Page_Automation Exercise - Signup  Login/input_Login to your account_password'), 'qeJ0sjJnwEs=')
	}

	@And("clicks on login button and tries to login")
	public void clicks_on_login_button_and_tries_to_login() {
		WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Login'))
	}

	@Then("user is shown an error message")
	public void user_is_shown_an_error_message_and_browser_is_closed() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/p_Your email or password is incorrect'),
				'Your email or password is incorrect!')
		WebUI.closeBrowser()
	}

	@Then("browser is closed")
	public void browser_is_closed() {
		WebUI.closeBrowser()
	}
}

