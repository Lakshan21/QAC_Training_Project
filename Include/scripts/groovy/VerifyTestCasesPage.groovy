import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then




public class VerifyTestCasesPage {

	@And("clicks on test cases button")
	public void clicks_on_test_cases_button() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Test Cases'))
	}

	@Then("user is on test cases page")
	public void user_is_on_test_cases_page() {
		WebUI.verifyElementText(findTestObject('Page_Automation Practice Website for UI Tes_a19d73/b_Test Cases'), 'TEST CASES')
	}
}
