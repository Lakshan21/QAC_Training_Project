import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given




public class VerifySubscriptionInCartPage {

	@And("clicks on cart button")
	public void clicks_on_cart_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Cart'))
	}

	@Given("user is on cart page")
	public void user_is_on_cart_page() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_Shopping Cart'), 'Shopping Cart')
	}
}
