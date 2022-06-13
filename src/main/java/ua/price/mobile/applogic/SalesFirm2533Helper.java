package ua.price.mobile.applogic;

import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.mobile.pages.SalesFirm2533Page;

public class SalesFirm2533Helper extends BaseHelper {
	private SalesFirm2533Page page;
	private int click_type = 0;
	
	public SalesFirm2533Helper(ApplicationManager app) {
		super(app);
		page = new SalesFirm2533Page();
	}
	
	public SalesFirm2533Helper openPage() {
		driver.get(baseUrl + SalesFirm2533Page.url);
		ensurePageLoaded();
		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getHjRemoteVarsFrame().getHjRemoteVarsFrame()));
	}
	
	public SalesFirm2533Helper changeRegionTo(String region) {
		changeRegionTo(page.getHeader(), region);
		
		return this;
	}
	
	public SalesFirm2533Helper clickToShopButton() {
		driver.findElement(page.getSaleCard().getToShopButton()).click();
		app.getOutclickPageHelper().closeMainGateTabAndSwitchToOldTab();
		click_type = 5;
		
		return this;
	}
	
	public SalesFirm2533Helper clickShowPhoneButton() {
		driver.findElement(page.getSaleCard().getShowPhoneButton()).click();
		click_type = 6;
		
		return this;
	}
	
	public SalesFirm2533Helper checkClickInTable() {
		app.getFirmClicksPageHelper().openPage(2533).checkLastClickFirm2533(click_type);
		
		return this;
	}
}
