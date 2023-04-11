import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class ScrollUpWithArrow {

	@And("user clicks arrow button to scroll up")
	public void user_clicks_arrow_button_to_scroll_up() {
		WebUI.click(findTestObject('Scroll up button'))
	}

	@Then("user is scrolled up")
	public void user_is_scrolled_up() {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/h2_Full-Fledged practice website for Automa_49aaf4'), 'Full-Fledged practice website for Automation Engineers')
	}

	@When("user scrolls up")
	public void user_scrolls_up() {
		WebUI.scrollToElement(findTestObject('Page_Automation Exercise/h2_Full-Fledged practice website for Automa_49aaf4'), 0)
	}
}

