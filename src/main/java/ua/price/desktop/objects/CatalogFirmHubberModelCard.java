package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class CatalogFirmHubberModelCard {
	public By getButtonBuy() {
		return By.xpath("//a[@class='js_outclick_popup_link btn btn-blue active-go']");
	}
}
