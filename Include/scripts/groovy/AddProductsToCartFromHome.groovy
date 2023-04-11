import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.When

public class AddProductsToCartFromHome {

	@When("user adds products from homepage")
	public void user_adds_products_from_homepage() {
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_Add to cart'), 0)

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_Add to cart'))

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/button_Continue Shopping'))

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/Add to Cart 2'))

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/button_Continue Shopping'))
	}

	@And("user clicks cart button")
	public void user_clicks_cart_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Cart'))
	}
}
