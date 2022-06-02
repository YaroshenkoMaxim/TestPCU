package ua.price.desktop.pages;

import org.openqa.selenium.By;

import ua.price.desktop.objects.CatalogFirmHubberModelCard;
import ua.price.desktop.objects.HubberPopUp;

public class CatalogFirmHubberPage extends PageBase {
	public static String url = "/firm79503p1.html";
	private CatalogFirmHubberModelCard cardHubber;
	private HubberPopUp hubberPopUp;
	
	public CatalogFirmHubberPage() {
		cardHubber = new CatalogFirmHubberModelCard();
		hubberPopUp = new HubberPopUp();
	}
	
	/*public CatalogFirmHubberPageDesktopPriceUa openPage() {
		driver.get(url);
		
		return this;
	}*/
	
	public By getElementForEnsurePageLoaded1() {
		return By.id("filter_price");
	}
	
	public By getElementForEnsurePageLoaded2() {
		return By.xpath("//div[@class='ads-banner ads-banner15']");
	}
	
	public By getElementForEnsurePageLoaded3() {
		return By.id("_hjRemoteVarsFrame");
	}
	
	public CatalogFirmHubberModelCard getCatalogFirmHubberModelCard() {
		return cardHubber;
	}
	
	public HubberPopUp getHubberPopUp() {
		return hubberPopUp;
	}
}
