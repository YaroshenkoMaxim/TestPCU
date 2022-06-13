package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getElementForEnsurePageLoaded1()));
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getElementForEnsurePageLoaded2()));
	}
	
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
		
		app.getFirmClicksPageHelper().openPage(79503).checkLastClickFirm79503(click_type);
		
		driver.switchTo().window(handle);
				
		return this;
	}
}
