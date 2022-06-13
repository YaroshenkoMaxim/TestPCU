package ua.price.mobile.applogic;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.mobile.pages.FirmInfo2533Page;

public class FirmInfo2533Helper extends BaseHelper {
	private FirmInfo2533Page page;
	private int click_type = 3;
	//private boolean isFirstClick = false;
	private String handle;
	
	public FirmInfo2533Helper(ApplicationManager app) {
		super(app);
		page = new FirmInfo2533Page();
	}
	
	public FirmInfo2533Helper openPage() {
		driver.get(baseUrl + FirmInfo2533Page.url);
		
		handle = driver.getWindowHandle();
		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getHeader().changeRegionLink()));
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getBreadcrumbs().breadcrumbs()));
		
		handle = driver.getWindowHandle();
	}
	
	public FirmInfo2533Helper openNewTab() {
		openNewTab();
		return this;
	}
	
	public FirmInfo2533Helper changeRegionTo(String region) {
		changeRegionTo(page.getHeader(), region);
		
		return this;
	}
	
	public FirmInfo2533Helper clickFirmInfo() {
		driver.findElement(page.getFirmInfoTabs().getFirmInfoTab()).sendKeys(Keys.UP);
		driver.findElement(page.getFirmInfoTabs().getFirmInfoTab()).sendKeys(Keys.UP);
		driver.findElement(page.getFirmInfoTabs().getFirmInfoTab()).click();
		ensurePageLoaded();
		click_type = 3;
		
		return this;
	}
	
	public FirmInfo2533Helper checkClickInTable() {
		//isFirstClick = isFirstClick == false ? true : false;
		
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
