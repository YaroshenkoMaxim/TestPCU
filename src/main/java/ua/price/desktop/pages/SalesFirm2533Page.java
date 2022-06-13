package ua.price.desktop.pages;

import org.openqa.selenium.By;

import ua.price.desktop.objects.SaleCard;

public class SalesFirm2533Page extends PageBase {
	public static String url = "/skidki.html?shop_id[0]=2533";
	
	private SaleCard saleCard; 
	
	public SalesFirm2533Page() {
		saleCard = new SaleCard();
	}
	
	public By getElementForEnsurePageLoaded1() {
		return By.xpath("//div[@class='ads-banner ads-banner15']");
	}
	
	public By getElementForEnsurePageLoaded2() {
		return By.id("_hjRemoteVarsFrame");
	}
	
	public SaleCard getSaleCard() {
		return saleCard;
	}
}
