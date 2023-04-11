import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.When

public class Delay {
	@When("user waits for page to load")
	public void user_waits_for_page_to_load() {
		WebUI.waitForPageLoad(4)
	}
}


