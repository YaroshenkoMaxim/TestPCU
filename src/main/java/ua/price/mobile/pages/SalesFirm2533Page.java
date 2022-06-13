package ua.price.mobile.pages;

import ua.price.mobile.objects.HjRemoteVarsFrame;
import ua.price.mobile.objects.SaleCard;

public class SalesFirm2533Page extends PageBase {
	public static String url = "/skidki.html?shop_id[0]=2533";
	
	private SaleCard saleCard;
	private HjRemoteVarsFrame hjRemoteVarsFrame;
	
	public SalesFirm2533Page() {
		saleCard = new SaleCard();
		hjRemoteVarsFrame = new HjRemoteVarsFrame();
	}
	
	/*public SalesFirm2533DesktopPriceUaPage ensurePageLoaded() {
		header.ensureObjectLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ads-banner ads-banner15']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("_hjRemoteVarsFrame")));
		
		return this;
	}*/
	
	public HjRemoteVarsFrame getHjRemoteVarsFrame() {
		return hjRemoteVarsFrame;
	}
	
	public SaleCard getSaleCard() {
		return saleCard;
	}
}
