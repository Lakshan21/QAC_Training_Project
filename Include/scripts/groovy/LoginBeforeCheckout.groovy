import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.When


public class LoginBeforeCheckout {
	@When("logged in user verifies address details")
	public void logged_in_user_verifies_address_details() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/h2_Address Details'), 'Address Details')

		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise - Checkout/h3_Your delivery address'), 'YOUR DELIVERY ADDRESS')

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_Mr. John Doe'), 'Mr. John Doe')

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_RBC'), 'RBC')

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_434 Yonge Street, PO Box 1223, RBC, Toronto, ON'), '434 Yonge Street, PO Box 1223, RBC, Toronto, ON')

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_323 Dundas West, M4R 7G3, Toronto, ON'),'323 Dundas West, M4R 7G3, Toronto, ON')

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_Toronto OntarioM4S 1G7'), 'Toronto Ontario M4S 1G7')

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_Canada'), 'Canada')

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Checkout/li_416-123-3321'), '416-123-3321')
	}

	@When("logged in user enters card details")
	public void logged_in_user_enters_card_details() {
		WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 'John Doe')

		WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Card Number_card_number'), '12123')

		WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_CVC_cvc'), '124')

		WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Expiration_expiry_month'), '06')

		WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Expiration_expiry_year'), '2024')
	}

	@And ("closes ad")
	public void closes_ad() {
		WebUI.click(findTestObject('ad_close_btn'))
	}
}
