package ua.price.desktop.pages;

import ua.price.desktop.objects.Breadcrumbs;
import ua.price.desktop.objects.FirmInfoTabs;

public class FirmInfo2533Page extends PageBase {
	public static String url = "/firm2533.html";
	
	private Breadcrumbs breadcrumbs;
	private FirmInfoTabs firmInfoTab;
	
	public FirmInfo2533Page() {
		breadcrumbs = new Breadcrumbs();
		firmInfoTab = new FirmInfoTabs();
	}
	
	/*public By getElementForEnsurePageLoaded1() {
		//return getHeader().getElementForEnsureObjectLoaded();
		return getHeader().changeRegionLink();
	}
	
	public By getElementForEnsurePageLoaded2() {
		return By.id("page-breadcrumbs");
	}*/
	
	public Breadcrumbs getBreadcrumbs() {
		return breadcrumbs;
	}
	
	public FirmInfoTabs getFirmInfoTabs() {
		return firmInfoTab;
	}
	
	//public FirmInfo2533PageDesktopPriceUa clickFirmInfo() {
		//driver.findElement(By.xpath("//a[@data-content-div='firm-info']")).click();
		
		//return new FirmInfo2533PageDesktopPriceUa(driver);
	//}
}
