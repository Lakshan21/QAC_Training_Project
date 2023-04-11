import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class SearchProductsAndVerifyCartAfterLogin {
	@When("user searches for a product")
	public void user_searches_for_a_product() {
		WebUI.setText(findTestObject('Page_Automation Exercise - All Products/input_Contact us_search'), 'jeans')
	}

	@And("clicks search button")
	public void clicks_search_button() {
		WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_Contact us_submit_search'))
	}

	@Then("searched product results are shown")
	public void searched_product_results_are_shown() {
		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - All Products/h2_Searched Products'), 'SEARCHED PRODUCTS')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Searched ProductsAddedYour product has _16589b'), 0)
	}

	@Then("searched products are added to cart")
	public void searched_products_are_added_to_cart() {
		WebUI.click(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))

		WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_Continue Shopping'))

		WebUI.click(findTestObject('Jeans Cart 2'))

		WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_Continue Shopping'))

		WebUI.click(findTestObject('Jeans Cart 3'))

		WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_Continue Shopping'))
	}

	@Then("searched products are in cart")
	public void searched_products_are_in_cart() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Soft Stretch JeansMen  JeansRs. 7991Rs. 799'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Regular Fit Straight JeansMen  JeansRs. _634aec'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Grunt Blue Slim Fit JeansMen  JeansRs. 1_7d4141'), 0)
	}
}
