import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class ViewAndCartBrandProducts {
	@Given("user can see Brands")
	public void user_can_see_Brands() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_Brands'), 'BRANDS')
	}

	@And("user clicks polo brand products")
	public void user_clicks_polo_brand_products() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_(6)Polo'))
	}

	@Then("polo brand products are visible")
	public void polo_brand_products_are_visible() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Polo Products/h2_Brand - Polo Products'), 'BRAND - POLO PRODUCTS')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Polo Products/div_Brand - Polo ProductsAddedYour product _119a54'), 0)
	}

	@When("user clicks HM brand products")
	public void user_clicks_HM_brand_products() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Polo Products/a_(5)HM'))
	}

	@Then("HM brand products are visible")
	public void hm_brand_products_are_visible() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - HM Products/h2_Brand - HM Products'), 'BRAND - H&M PRODUCTS')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - HM Products/div_Brand - HM ProductsAddedYour product ha_976d75'), 0)
	}
}
