import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class AddToCartFromRecommendedItems {
	@Given("user scrolls to recommended products")
	public void user_scrolls_to_recommended_products() {
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Automation Exercise/h2_recommended items'), 0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/h2_recommended items'), 'RECOMMENDED ITEMS')
	}

	@When("user adds a recommended item to cart")
	public void user_adds_a_recommended_item_to_cart() {
		WebUI.click(findTestObject('Object Repository/Recommended arrow btn'))

		WebUI.click(findTestObject('Object Repository/Recommended Cart btn'))
	}

	@Then("recommended products are added to cart")
	public void recommended_products_are_added_to_cart() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Blue TopWomen  TopsRs. 5001Rs. 500'), 0)
	}
}
