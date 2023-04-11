import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class SearchProducts {

	@When("user searches a product")
	public void user_searches_a_product() {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - All Products/input_Contact us_search'), 'Winter Top')
	}

	@And("user clicks search button")
	public void user_clicks_search_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Contact us_submit_search'))
	}

	@Then("searched products are displayed")
	public void searched_products_are_displayed() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - All Products/h2_Searched Products'), 'SEARCHED PRODUCTS')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Searched ProductsAddedYour product has _786331'),  0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Rs. 600Winter TopAdd to cartRs. 600Wint_78c90e'),  0)
	}
}


