package ua.price.mobile.pages;

import ua.price.mobile.objects.CatalogFirm2533ModelCardBid;
import ua.price.mobile.objects.CatalogFirm2533ModelCardGoSite;
import ua.price.mobile.objects.FilterPrice;
import ua.price.mobile.objects.FirmInfoTabs;
import ua.price.mobile.objects.HjRemoteVarsFrame;

public class CatalogFirm2533Page extends PageBase {
	public static String url = "/firm2533p1.html";
	private FilterPrice filterPrice;
	private HjRemoteVarsFrame hjRemoteVarsFrame;
	private CatalogFirm2533ModelCardGoSite cardGoSite;
	private CatalogFirm2533ModelCardBid cardBid;
	private FirmInfoTabs firmInfoTab;
		
	public CatalogFirm2533Page() {
		filterPrice = new FilterPrice(); 
		cardGoSite = new CatalogFirm2533ModelCardGoSite();
		cardBid = new CatalogFirm2533ModelCardBid();
		firmInfoTab = new FirmInfoTabs();
		hjRemoteVarsFrame = new HjRemoteVarsFrame();
	}
	
	public FilterPrice getFilterPrice() {
		return filterPrice;
	}
	
	public HjRemoteVarsFrame getHjRemoteVarsFrame() {
		return hjRemoteVarsFrame;
	}
	
	public CatalogFirm2533ModelCardGoSite getCatalogFirm2533ModelCardGoSite() {
		return cardGoSite;
	}
	
	public CatalogFirm2533ModelCardBid getCatalogFirm2533ModelCardBid() {
		return cardBid;
	}
	
	public FirmInfoTabs getFirmInfoTabs() {
		return firmInfoTab;
	}

	/*public CatalogFirm2533PageDesktopPriceUa openPage() {
		driver.get(url);
		
		return this;
	}
	
	public CatalogFirm2533PageDesktopPriceUa ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("filter_price")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ads-banner ads-banner15']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("_hjRemoteVarsFrame")));
		
		return this;
	}
	
	public OutclickPage<CatalogFirm2533PageDesktopPriceUa> clickGoSite() {
		//driver.findElement(By.xpath("//a[@title='Купить Бей-Беги. История английского футбола 9789662320121']")).click();
		//closeMainGateTabAndSwitchToOldTab();
		
		return new OutclickPage<CatalogFirm2533PageDesktopPriceUa>(driver, this);
	}
	
	public OutclickPage<CatalogFirm2533PageDesktopPriceUa> clickBid() {
		driver.findElement(By.xpath("//a[@title='Купить Шивананда Свами Новый взгляд на традиционную Йога-']")).click();
		//closeMainGateTabAndSwitchToOldTab();
		
		return new OutclickPage<CatalogFirm2533PageDesktopPriceUa>(driver, this);
	}
	
	public CatalogFirm2533PageDesktopPriceUa scrollToFirmInfo() {
		driver.findElement(By.xpath("//a[@data-content-div='firm-info']")).sendKeys(Keys.UP);
		
		return this;
	}
	
	public FirmInfo2533PageDesktopPriceUa clickFirmInfo() {
		driver.findElement(By.xpath("//a[@data-content-div='firm-info']")).click();
		
		return new FirmInfo2533PageDesktopPriceUa(driver);
	}
	
	public HeaderDesktopPriceUa<CatalogFirm2533PageDesktopPriceUa> getHeader() {
		return header;
	}
	
	public OutclickPopUpDesktopPriceUa<CatalogFirm2533PageDesktopPriceUa> getOutclickPopUp() {
		return new OutclickPopUpDesktopPriceUa<CatalogFirm2533PageDesktopPriceUa>(driver, this);
	}
	*/
}
