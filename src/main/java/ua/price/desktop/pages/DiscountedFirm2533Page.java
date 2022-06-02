package ua.price.desktop.pages;

import org.openqa.selenium.By;

import ua.price.desktop.objects.SaleCard;

public class DiscountedFirm2533Page extends PageBase {
	public static String url = "/discounted.html?shop_id[0]=2533";
	
	private SaleCard discountedCard; 
	
	public DiscountedFirm2533Page() {
		discountedCard = new SaleCard();
	}
	
	/*public SalesFirm2533DesktopPriceUaPage ensurePageLoaded() {
		header.ensureObjectLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ads-banner ads-banner15']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("_hjRemoteVarsFrame")));
		
		return this;
	}*/
	
	public By getElementForEnsurePageLoaded1() {
		return By.xpath("//div[@class='ads-banner ads-banner15']");
	}
	
	public By getElementForEnsurePageLoaded2() {
		return By.id("_hjRemoteVarsFrame");
	}
	
	public SaleCard getDiscountedCard() {
		return discountedCard;
	}
}
