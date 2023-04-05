import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class RegisterUserWithExistingEmail {

	@When("user enters a name and existing email")
	public void user_enters_a_name_and_existing_email() {
		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'John Doe')

		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/Sign up email input'), 'johndoe@hotmail.com')
	}

	@Then("user receives an email already exists message")
	public void user_receives_an_email_already_exists_message() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/p_Email Address already exist'),
				'Email Address already exist!')

		WebUI.closeBrowser()
	}
}
