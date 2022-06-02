package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class CatalogFirmHubberModelCard extends ObjectBase {
	public By getButtonBuy() {
		return By.xpath("//a[@class='js_outclick_popup_link btn btn-blue active-go']");
	}
}
