import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then




public class VerifyAllProductsandProductDetailsPage {
	@And("clicks on products button")
	public void clicks_on_products_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Products'))
	}

	@Then("user is on products page")
	public void user_is_on_products_page() {
		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - All Products/h2_All Products'), 'ALL PRODUCTS')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_CategoryWomenDress Tops Saree MenTshirt_451130'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Brands (6)Polo (5)HM (5)Madame (3)Mast _49c309'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_All ProductsAddedYour product has been _e90caf'), 0)
	}

	@And("clicks view product")
	public void clicks_view_product() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_View Product'))
	}

	@Then("product details are shown")
	public void product_details_are_shown() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/div_AddedYour product has been added to car_c29c8b'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/h2_Blue Top'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Category Women  Tops'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/span_Rs. 500'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Availability In Stock'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Condition New'), 0)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/p_Brand Polo'), 0)
	}
}
