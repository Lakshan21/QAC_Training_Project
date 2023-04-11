import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class RegisterUser {
	@Given("user is on sign up page")
	public void user_is_on_sign_up_page() {

		WebUI.click(findTestObject('Page_Automation Exercise/a_Signup  Login'))

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/h2_New User Signup'), 'New User Signup!')
	}

	@When("user enters name and email")
	public void user_enters_name_and_email() {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'Billy Bob')

		WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/Sign up email input'), 'billybob@gmail.com')
	}

	@And("clicks on signup button")
	public void clicks_on_signup_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Signup'))
	}

	@Given("user is on account information page")
	public void user_is_on_account_information_page() {
		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Signup/b_Enter Account Information'), 'ENTER ACCOUNT INFORMATION')
	}

	@When("user enters account information")
	public void user_enters_account_information() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Mr_title'))

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__password'), 'iFGeFYmXIrUhQZHvW7P22w==')

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'),
				'21', true)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'),
				'8', true)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'),
				'2000', true)

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Date of Birth_newsletter'))

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Sign up for our newsletter_optin'))

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__first_name'), 'Billy')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__last_name'), 'Bob')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Company_company'), 'QAC')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'),
				'275 Sheppard Road West, PO Box 1033, QAC, Toronto, ON')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Address 2_address2'), '426 Kennedy Road, M4S 1R5, Toronto, ON')

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'),
				'India', true)

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'),
				'Canada', true)

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__state'), 'Ontario')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__city'), 'Toronto')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__zipcode'), 'M4S 1G5')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__mobile_number'), '416-223-4452')
	}

	@And("clicks on create account button")
	public void clicks_on_create_account_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/button_Create Account'))
	}


	@Then("user account is created")
	public void user_account_is_created_and_navigated_to_the_home_page() {
		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Account Created/b_Account Created'), 'ACCOUNT CREATED!')
	}
	@Then("registered user is logged in")
	public void registered_user_is_logged_in() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/a_Logged in as Billy Bob'), 'Logged in as Billy Bob')
	}
}

