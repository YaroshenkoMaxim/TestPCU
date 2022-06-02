package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.WindowType;

import ua.price.desktop.pages.CatalogFirmHubberPage;

public class CatalogFirmHubberHelper extends BaseHelper {
	private CatalogFirmHubberPage page;
	private int click_type = 0;
	private String handle;
	
	public CatalogFirmHubberHelper(ApplicationManager app) {
		super(app);
		page = new CatalogFirmHubberPage();
	}
	
	public CatalogFirmHubberHelper openPage() {
		driver.get(baseUrl + CatalogFirmHubberPage.url);
		ensurePageLoaded();
		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		ensureVisabilityObjectLoaded(page.getElementForEnsurePageLoaded1());
		ensurePresenceObjectLoaded(page.getElementForEnsurePageLoaded2());
		//ensurePresenceObjectLoaded(page.getElementForEnsurePageLoaded3());
	}
	
	/*public CatalogFirmHubberHelper changeRegionTo(String region) {
		changeRegionTo(page.getHeader(), region);
		
		return this;
	}*/
	
	public CatalogFirmHubberHelper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public CatalogFirmHubberHelper closeAnonser() {
		closeAnonser(page.getAnonser());
		
		return this;
	}
	
	public CatalogFirmHubberHelper closeFoundMistakeAlert() {
		closeFoundMistakeAlert(page.getFoundMistakeAlert());
		
		return this;
	}
	
	public CatalogFirmHubberHelper clickHubber() {
		handle = driver.getWindowHandle();
		driver.findElement(page.getCatalogFirmHubberModelCard().getButtonBuy()).click();
		click_type = 9;
		
		return this;
	}
	
	public CatalogFirmHubberHelper closeHubberPopUp() {
		driver.findElement(page.getHubberPopUp().getCloseButton()).click();
		
		return this;
	}
	
	public CatalogFirmHubberHelper checkClickInTable() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		if (tabs.size() == 1)
			driver.switchTo().newWindow(WindowType.TAB);
		else 
			driver.switchTo().window(app.getFirmClicksPageHelper().getHandle());

		
		//isFirstClick = isFirstClick == false ? true : false;
		
		app.getFirmClicksPageHelper().openPage(79503).checkLastClickFirm79503(click_type);
		
		driver.switchTo().window(handle);
				
		return this;
	}
	
	/*public OutclickPage<CatalogFirm2533PageDesktopPriceUa> clickGoSiteCatalogFirm2533PageDesktopPriceUa() {
		CatalogFirm2533PageDesktopPriceUa page = app.getNavigationHelper().openCatalogFirm2533PageDesktopPriceUa();
		page.getHeader().changeRegionTo("��� ������");
		String button = page.getCatalogFirm2533ModelCardGoSite().getPathButtonBuy();
		driver.findElement(By.xpath(button)).click();
		
		return new OutclickPage<CatalogFirm2533PageDesktopPriceUa>(driver, page);
	}*/
}
