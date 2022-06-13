package ua.price.mobile.applogic;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.mobile.pages.CatalogFirm2533Page;;

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
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getFilterPrice().getFilterPrice()));
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getHjRemoteVarsFrame().getHjRemoteVarsFrame()));
	}
	
	public CatalogFirm2533Helper openNewTab() {
		openNewTab();
		return this;
	}
	
	public CatalogFirm2533Helper changeRegionTo(String region) {
		changeRegionTo(page.getHeader(), region);
		
		return this;
	}
	
	public CatalogFirm2533Helper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public CatalogFirm2533Helper clickGoSite() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		driver.findElement(By.xpath("//a[@class='prefix by-popular']")).sendKeys(Keys.DOWN);
		driver.findElement(page.getCatalogFirm2533ModelCardGoSite().getCardName()).click();;
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	
		for (String currentTab : tabs2)
			if (! tabs.contains(currentTab)) {
				driver.switchTo().window(currentTab);
				break;
			}
		app.getOutclickPageHelper().ensurePageLoaded();
		
		driver.close();

		driver.switchTo().window(handle);

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
	    driver.switchTo().window(handle);
		click_type = 2;
		
		return this;
	}
	
	public CatalogFirm2533Helper srollToBid() {
		driver.findElement(By.xpath("//a[@class='prefix by-popular']")).sendKeys(Keys.PAGE_DOWN);
		
		return this;
	}
	
	public FirmInfo2533Helper clickFirmInfo() {
		driver.findElement(page.getFirmInfoTabs().getFirmInfoTab()).click();
		app.getFirmInfo2533Helper().ensurePageLoaded();
		
		return app.getFirmInfo2533Helper();
	}
	
	public CatalogFirm2533Helper scrollToFirmInfoTabs() {
		driver.findElement(page.getFirmInfoTabs().getFirmInfoTab()).sendKeys(Keys.UP);
		driver.findElement(page.getFirmInfoTabs().getFirmInfoTab()).sendKeys(Keys.UP);
		
		return this;
	}
	
	public CatalogFirm2533Helper checkClickInTable() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		if (tabs.size() == 1)
			driver.switchTo().newWindow(WindowType.TAB);
		else 
			driver.switchTo().window(app.getFirmClicksPageHelper().getHandle());
		app.getFirmClicksPageHelper().openPage(2533).checkLastClickFirm2533(click_type);
		driver.switchTo().window(handle);
		
		return this;
	}
}
