import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class AddReviewOnProduct {
	@When("user goes to the product they want to review")
	public void user_goes_to_the_product_they_want_to_review() {
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Automation Exercise - All Products/div_Rs. 500Blue TopAdd to cartRs. 500Blue T_abe546'), 0)
	}

	@And("clicks view product on product they want to review")
	public void clicks_view_product_on_product_they_want_to_review() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/a_View Product'))
	}

	@Given("user can write their review")
	public void user_can_write_their_review() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/a_Write Your Review'), 0)
	}

	@When("user writes their review")
	public void user_writes_their_review() {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/input_Write Your Review_name'), 'John Doe')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/input_Write Your Review_email'), 'johndoe@hotmal.com')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/textarea_Write Your Review_review'), 'This is a very nice product.')
	}

	@And("clicks the submit review button")
	public void clicks_the_submit_review_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Product Details/button_Submit'))
	}

	@Then("the review is submitted")
	public void the_review_is_submitted() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Automation Exercise - Product Details/div_Thank you for your review'),0)

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Product Details/span_Thank you for your review'),'Thank you for your review.')
	}
}
