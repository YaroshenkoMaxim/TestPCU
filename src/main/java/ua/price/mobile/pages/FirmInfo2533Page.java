package ua.price.mobile.pages;

import org.openqa.selenium.By;

import ua.price.mobile.objects.Breadcrumbs;
import ua.price.mobile.objects.FirmInfoTabs;

public class FirmInfo2533Page extends PageBase {
	public static String url = "/firm2533.html";
	
	private FirmInfoTabs firmInfoTab;
	private Breadcrumbs breadcrumbs;
	
	public FirmInfo2533Page() {
		firmInfoTab = new FirmInfoTabs();
		breadcrumbs = new Breadcrumbs();
	}
	
	public By getElementForEnsurePageLoaded1() {
		return getHeader().getElementForEnsureObjectLoaded();
	}
	
	public By getElementForEnsurePageLoaded2() {
		return By.id("page-breadcrumbs");
	}
	
	public FirmInfoTabs getFirmInfoTabs() {
		return firmInfoTab;
	}
	
	public Breadcrumbs getBreadcrumbs() {
		return breadcrumbs;
	}
	
	//public FirmInfo2533PageDesktopPriceUa clickFirmInfo() {
		//driver.findElement(By.xpath("//a[@data-content-div='firm-info']")).click();
		
		//return new FirmInfo2533PageDesktopPriceUa(driver);
	//}
}
