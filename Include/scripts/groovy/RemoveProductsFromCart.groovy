import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then


public class RemoveProductsFromCart {
	@And("user removes a product")
	public void user_removes_a_product() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Men Tshirt_cart_quantity_delete'))
	}

	@Then("product is removed")
	public void product_is_removed() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Automation Exercise - Checkout/tr_Men TshirtMen  TshirtsRs. 4001Rs. 400'),0)
	}
}
