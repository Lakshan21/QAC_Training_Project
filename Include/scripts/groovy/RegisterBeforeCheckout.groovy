import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

import cucumber.api.java.en.Given

public class RegisterBeforeCheckout {
	@Given("user is registered")
	public void user_is_registered() {
		CucumberKW.runFeatureFile('Include/features/RegisterUser.feature')
	}
}
