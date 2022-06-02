package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.pages.CatalogFirm2533Page;

public class CatalogFirm2533Helper extends BaseHelper {
	private CatalogFirm2533Page page;
	private int click_type = 0;
	private String handle;
	
	public CatalogFirm2533Helper(ApplicationManager app) {
		super(app);
		page = new CatalogFirm2533Page();
	}
	
	public CatalogFirm2533Helper openPage() {
		driver.get(baseUrl + CatalogFirm2533Page.url);
		handle = driver.getWindowHandle();
		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getFilterPrice().getFilter()));
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getAdsBanner15().getBanner()));
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getHjRemoteVarsFrame().getFrame()));
	}
	
	/*public CatalogFirm2533Helper changeRegionTo(String region) {
		changeRegionTo(page.getHeader(), region);
		
		return this;
	}*/
	
	public CatalogFirm2533Helper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public CatalogFirm2533Helper closeAnonser() {
		closeAnonser(page.getAnonser());
		
		return this;
	}
	
	public CatalogFirm2533Helper closeFoundMistakeAlert() {
		closeFoundMistakeAlert(page.getFoundMistakeAlert());
		
		return this;
	}
	
	public CatalogFirm2533Helper clickGoSite() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		driver.findElement(page.getCatalogFirm2533ModelCardGoSite().getButtonBuy()).click(); 
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	
		for (String currentTab : tabs2)
			if (! tabs.contains(currentTab)) {
				driver.switchTo().window(currentTab);
				break;
			}
		
		app.getOutclickPageHelper().ensurePageLoaded();
		//ensurePageLoaded();
		
		driver.close();

		driver.switchTo().window(getHandle());
	    
		//app.getOutclickPageHelper().closeMainGateTabAndSwitchToOldTab();
		
		click_type = 1;
		
		return this;
	}
	
	public CatalogFirm2533Helper clickBid() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		driver.findElement(page.getCatalogFirm2533ModelCardBid().getButtonBuy()).click();
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		
		for (String currentTab : tabs2)
			if (! tabs.contains(currentTab)) {
				driver.switchTo().window(currentTab);
				break;
			}
		
		app.getOutclickPageHelper().ensurePageLoaded();
		
		driver.close();
	    driver.switchTo().window(getHandle());
		
		
		//app.getOutclickPageHelper().closeMainGateTabAndSwitchToOldTab();
	    
		click_type = 2;
		
		return this;
	}
	
	public FirmInfo2533Helper clickFirmInfo() {
		driver.findElement(page.getFirmInfoTabs().getFirmInfoTab()).click();
		
		app.getFirmInfo2533Helper().ensurePageLoaded();
				
		return app.getFirmInfo2533Helper();
	}
	
	public CatalogFirm2533Helper scrollToFirmInfo() {
		driver.findElement(page.getFirmInfoTabs().getFirmInfoTab()).sendKeys(Keys.UP);
		
		return this;
	}
	
	public CatalogFirm2533Helper closeOutclickPopUp() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getOutclickPopUpDesktopPriceUa().getElementForEnsureObjectLoaded()));
		driver.findElement(page.getOutclickPopUpDesktopPriceUa().getCloseButton()).click();
		
		return this;
	}
	
	public CatalogFirm2533Helper checkClickInTable() {
		//isFirstClick = isFirstClick == false ? true : false;
		
		//app.getApplicationManagerHelper().getApplicationManagerClicks().getFirmClicksPageHelper().openPage(2533).checkLastClickFirm2533(click_type);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		if (tabs.size() == 1)
			driver.switchTo().newWindow(WindowType.TAB);
		else 
			driver.switchTo().window(app.getFirmClicksPageHelper().getHandle());
		app.getFirmClicksPageHelper().openPage(2533).checkLastClickFirm2533(click_type);
		driver.switchTo().window(getHandle());
		//switchToOriginalTab();
		//switchToOtherTab();
		
		return this;
	}
	
	/*public OutclickPage<CatalogFirm2533PageDesktopPriceUa> clickGoSiteCatalogFirm2533PageDesktopPriceUa() {
		CatalogFirm2533PageDesktopPriceUa page = app.getNavigationHelper().openCatalogFirm2533PageDesktopPriceUa();
		page.getHeader().changeRegionTo("��� ������");
		String button = page.getCatalogFirm2533ModelCardGoSite().getPathButtonBuy();
		driver.findElement(By.xpath(button)).click();
		
		return new OutclickPage<CatalogFirm2533PageDesktopPriceUa>(driver, page);
	}*/
	
	public String getHandle() {
		return handle;
	}
}
