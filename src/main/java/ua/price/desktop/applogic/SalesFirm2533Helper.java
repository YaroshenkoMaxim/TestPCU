package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.pages.SalesFirm2533Page;

public class SalesFirm2533Helper extends BaseHelper {
	private SalesFirm2533Page page;
	private int click_type = 0;
	private String handle;
	
	public SalesFirm2533Helper(ApplicationManager app) {
		super(app);
		page = new SalesFirm2533Page();
	}
	
	public SalesFirm2533Helper openPage() {
		driver.get(baseUrl + SalesFirm2533Page.url);
		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getElementForEnsurePageLoaded1()));
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getElementForEnsurePageLoaded2()));
	}
	
	public SalesFirm2533Helper openNewTab() {
		openNewTab();
		return this;
	}
	
	public SalesFirm2533Helper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public SalesFirm2533Helper closeAnonser() {
		closeAnonser(page.getAnonser());
		
		return this;
	}
	
	public SalesFirm2533Helper closeFoundMistakeAlert() {
		closeFoundMistakeAlert(page.getFoundMistakeAlert());
		
		return this;
	}
	
	public SalesFirm2533Helper clickToShopButton() {
		handle = driver.getWindowHandle();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
;
		driver.findElement(page.getSaleCard().getToShopButton()).click();
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		
		for (String currentTab : tabs2)
			if (! tabs.contains(currentTab)) {
				driver.switchTo().window(currentTab);
				break;
			}
		
		app.getOutclickPageHelper().ensurePageLoaded();
		
		driver.close();

		driver.switchTo().window(handle);
		
		click_type = 5;
		
		return this;
	}
	
	public SalesFirm2533Helper clickShowPhoneButton() {
		handle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//h1")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(page.getSaleCard().getShowPhoneButton()).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getSaleCard().getPhone()));
		click_type = 6;
		
		return this;
	}
	
	public SalesFirm2533Helper checkClickInTable() {
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
