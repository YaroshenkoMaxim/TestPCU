package ua.price.mobile.objects;

import org.openqa.selenium.By;

public class CatalogFirm2533ModelCardGoSite {
	public By getButtonBuy() {
		return By.xpath("//div[@data-tracker-mid='3465832']/a/div/div/div/div[@class='model-name ga_model_name ga_card_simple_title']/span");
	}
	
	public By getCardName() {
		return By.xpath("//div[@data-tracker-mid='3465832']/a/div/div/div/div/span[@class='desc-title-wrap']");
	}
}
