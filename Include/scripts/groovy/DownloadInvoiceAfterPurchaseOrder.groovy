import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then




public class DownloadInvoiceAfterPurchaseOrder {
	@And ("user clicks download invoice")
	public void user_clicks_download_invoice() {
		WebUI.click(findTestObject('Page_Automation Exercise - Order Placed/a_Download Invoice'))
	}


	@Then ("wait for invoice to download")
	public void wait_for_invoice_to_download() {
		WebUI.delay(5)
	}


	@Then ("invoice is downloaded")
	public void invoice_is_downloaded() {
		File downloadFolder = new File ("C:\\Users\\lganeshalingam\\Downloads")
		List namesOfFiles = Arrays.asList(downloadFolder.list())
		if (namesOfFiles.contains("invoice.txt")) {
			println "File downloaded"
		}
		else {
			println "Failure"
		}
	}
}
