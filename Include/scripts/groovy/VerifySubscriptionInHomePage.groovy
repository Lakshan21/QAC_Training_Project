import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class VerifySubscriptionInHomePage {

	@Given("user has scrolled down to subscription")
	public void user_has_scrolled_down_to_subscription() {
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Automation Exercise/h2_Subscription'), 0)

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise/h2_Subscription'), 'SUBSCRIPTION')
	}

	@When("user enters email for subscription")
	public void user_enters_email_for_subscription() {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise/input_Subscription_susbscribe_email'), 'johndoe@hotmail.com')
	}

	@And("user clicks subscribe button")
	public void user_clicks_subscribe_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/button_Subscription_subscribe'))
	}

	@Then("user is subscribed")
	public void user_is_subscribed() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/div_You have been successfully subscribed'), 'You have been successfully subscribed!')
	}
}
