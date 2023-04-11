import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.When

public class CheckForAd {
	@When("user checks for ad")
	public void user_checks_for_ad() {
		String currentUrl=WebUI.getUrl()
		if(currentUrl.contains('#google_vignette'))
		WebUI.back()
		WebUI.delay(2)
		WebUI.forward()
	}
}