import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class ContactUs {
	@Given("user is on contact us page")
	public void user_is_on_contact_us_page() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Contact us'))

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Contact Us/h2_Get In Touch'), 'GET IN TOUCH')
	}

	@When("user fills out contact us details")
	public void user_fills_out_contact_us_details() {
		WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Get In Touch_name'), 'John Doe')

		WebUI.setText(findTestObject('Page_Automation Exercise - Contact Us/input_Get In Touch_email'), 'johndoe@hotmail.com')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/input_Get In Touch_subject'), 'T-shirt Adding to Cart not working')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/textarea_Get In Touch_message'), 'Adding a t-shirt to my cart does not work. It does not get added to my cart.')

		WebUI.uploadFile(findTestObject('Page_Automation Exercise - Contact Us/UploadFilebutton'), 'C:\\Users\\lganeshalingam\\OneDrive - QA Consultants\\Desktop\\Contact Us Form Test.txt')
	}

	@And("clicks on submit button")
	public void clicks_on_submit_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))
	}

	@Then("user is given a success message and navigates to home page")
	public void user_is_given_a_success_message_and_navigates_to_home_page() {
		WebUI.acceptAlert()

		WebUI.delay(2)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/div_Success Your details have been submitte_fc584e'), 'Success! Your details have been submitted successfully.')

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Contact Us/span_Home'))

		WebUI.click(findTestObject('ad_close_btn'))

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise/h1_AutomationExercise'), 'AutomationExercise')
	}
}
