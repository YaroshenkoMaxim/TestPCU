package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.objects.OutclickPopUp;
import ua.price.desktop.pages.DiscountedFirm2533Page;

public class DiscountedFirm2533Helper extends BaseHelper {
	private DiscountedFirm2533Page page;
	private int click_type = 0;
	private String handle;
	
	public DiscountedFirm2533Helper(ApplicationManager app) {
		super(app);
		page = new DiscountedFirm2533Page();
	}
	
	public DiscountedFirm2533Helper openPage() {
		driver.get(baseUrl + DiscountedFirm2533Page.url);
		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getElementForEnsurePageLoaded1()));
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getElementForEnsurePageLoaded2()));
	}
	
	public DiscountedFirm2533Helper openNewTab() {
		openNewTab();
		return this;
	}
	
	public DiscountedFirm2533Helper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public DiscountedFirm2533Helper clickToShopButton() {
		handle = driver.getWindowHandle();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		driver.findElement(page.getDiscountedCard().getToShopButton()).click();
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		
		for (String currentTab : tabs2)
			if (! tabs.contains(currentTab)) {
				driver.switchTo().window(currentTab);
				break;
			}
		
		app.getOutclickPageHelper().ensurePageLoaded();
		
		driver.close();

		driver.switchTo().window(handle);

		click_type = 8;
		
		return this;
	}
	
	public DiscountedFirm2533Helper closeOutclickPopUp() {
		OutclickPopUp outclickPopUpDesktopPriceUa = new OutclickPopUp();
		wait.until(ExpectedConditions.visibilityOfElementLocated(outclickPopUpDesktopPriceUa.getElementForEnsureObjectLoaded()));
		driver.findElement(outclickPopUpDesktopPriceUa.getCloseButton()).click();
		
		return this;
	}
	
	public DiscountedFirm2533Helper checkClickInTable() {
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
