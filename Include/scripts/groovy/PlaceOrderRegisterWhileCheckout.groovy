import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class PlaceOrderRegisterWhileCheckout {
	@And("clicks proceed to checkout button")
	public void clicks_proceed_to_checkout_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))
	}

	@And("clicks register button")
	public void clicks_register_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/u_Register  Login'))
	}

	@When("user verifies address details")
	public void user_verifies_address_details() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/h2_Address Details'), 'Address Details')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/h3_Your delivery address'),'YOUR DELIVERY ADDRESS')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_Mr. Billy Bob'), 'Mr. Billy Bob')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_QAC'), 'QAC')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_275 Sheppard Road West, PO Box 1033, QAC_e66005'),'275 Sheppard Road West, PO Box 1033, QAC, Toronto, ON')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_426 Kennedy Road, M4S 1R5, Toronto, ON'),'426 Kennedy Road, M4S 1R5, Toronto, ON')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_Toronto OntarioM4S 1G5'),'Toronto Ontario M4S 1G5')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_Canada'), 'Canada')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/li_416-223-4452'), '416-223-4452')
	}

	@When("user adds a comment")
	public void user_adds_a_comment() {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/textarea_If you would like to add a comment_a4f199'), 'Place Order')
	}

	@And("user clicks on place order")
	public void user_clicks_on_place_order() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Place Order'))
	}

	@When("user enters card details")
	public void user_enters_card_details() {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 'Billy Bob')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Card Number_card_number'), '123243')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_CVC_cvc'), '211')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Expiration_expiry_month'), '08')

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Payment/input_Expiration_expiry_year'), '2025')
	}

	@And("clicks pay and confirm")
	public void clicks_pay_and_confirm() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Payment/button_Pay and Confirm Order'))
	}

	@Then("order is placed")
	public void order_is_placed() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Order Placed/b_Order Placed'), 'ORDER PLACED!')
	}

	@And("user clicks continue")
	public void user_clicks_continue() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Account Created/a_Continue'))
	}

	@And("clicks delete account")
	public void clicks_delete_account() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Order Placed/a_Delete Account'))
	}

	@Then("account is deleted")
	public void account_is_deleted() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Account Created/b_Account Deleted'), 'ACCOUNT DELETED!')
	}
}
