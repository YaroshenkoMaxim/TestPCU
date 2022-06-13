package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.pages.FirmInfo2533Page;

public class FirmInfo2533Helper extends BaseHelper {
	private FirmInfo2533Page page;
	private int click_type = 3;
	
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
	
	public FirmInfo2533Helper ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getHeader().changeRegionLink()));
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getBreadcrumbs().breadcrumbs()));
		
		handle = driver.getWindowHandle();
		
		return this;
	}
	
	public FirmInfo2533Helper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public FirmInfo2533Helper clickFirmInfo() {
		driver.findElement(page.getFirmInfoTabs().getFirmInfoTab()).click();
		
		ensurePageLoaded();
		
		click_type = 3;
		
		return this;
	}
	
	public FirmInfo2533Helper checkClickInTable() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		if (tabs.size() == 1)
			driver.switchTo().newWindow(WindowType.TAB);
		else 
			driver.switchTo().window(app.getFirmClicksPageHelper().getHandle());
		
		app.getFirmClicksPageHelper().openPage(2533).checkLastClickFirm2533(click_type);
		
		driver.switchTo().window(getHandle());
		
		return this;
	}
	
	public String getHandle() {
		return handle;
	}
}
