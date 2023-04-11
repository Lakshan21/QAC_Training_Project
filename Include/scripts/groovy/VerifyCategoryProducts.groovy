import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class VerifyCategoryProducts {
	@Given("category products is visible on home page")
	public void category_products_is_visible_on_home_page() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/h2_Category'), 'CATEGORY')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise/div_WomenDress Tops Saree MenTshirts Jeans _e0e1cf'), 0)
	}

	@When("user clicks dress category under women category")
	public void user_clicks_dress_category_under_women_category() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Tshirts Products/i_Women_fa fa-plus'))

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Dress'))
	}

	@Then("women dress products are visible")
	public void women_dress_products_are_visible() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Dress Products/h2_Women - Dress Products'), 'WOMEN - DRESS PRODUCTS')
	}

	@When("user clicks t-shirts category under men category")
	public void user_clicks_t_shirts_category_under_men_category() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Dress Products/i_Men_fa fa-plus'))

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Dress Products/a_Tshirts'))
	}

	@Then("men t-shirt products are visible")
	public void men_t_shirt_products_are_visible() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Tshirts Products/h2_Men - Tshirts Products'), 'MEN - TSHIRTS PRODUCTS')
	}
}
