import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class AddProductsToCart {

	@When("user adds products to cart")
	public void user_adds_products_to_cart() {
		WebUI.scrollToElement(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'), 0)

		WebUI.click(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Continue Shopping'))

		WebUI.click(findTestObject('Page_Automation Exercise - All Products/Add to Cart 2'))
	}

	@And("clicks view cart button")
	public void clicks_view_cart_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/u_View Cart'))
	}

	@Then("products are added to cart")
	public void products_are_added_to_cart() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Blue TopWomen  TopsRs. 5001Rs. 500'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Men TshirtMen  TshirtsRs. 4001Rs. 400'), 0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 500'), 'Rs. 500')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/button_1'), '1')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 500'), 'Rs. 500')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 400'), 'Rs. 400')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/button_1'), '1')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/p_Rs. 400'), 'Rs. 400')
	}
}
