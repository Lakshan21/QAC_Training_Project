import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class VerifyProductQuantityInCart {

	@When("user views a product")
	public void user_views_a_product() {
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Automation Exercise/a_View Product'), 0)

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_View Product'))

		WebUI.click(findTestObject('ad_close_btn'))
	}

	@And("adds a product of specific quantity to cart")
	public void adds_a_product_of_specific_quantity_to_cart() {
		WebUI.verifyElementPresent(findTestObject('Page_Automation Exercise - Product Details/div_AddedYour product has been added to car_c29c8b'), 0)

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/input_Quantity_quantity'), '4')

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Product Details/button_Add to cart'))
	}

	@Then("product is added to cart of correct quantity")
	public void product_is_added_to_cart_of_correct_quantity() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Blue TopWomen  TopsRs. 5004Rs. 2000'), 0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Blue Top'), 'Blue Top')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/button_4'), '4')
	}
}
