package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.objects.OutclickPopUp;
import ua.price.desktop.pages.KNU5076Page;

public class KNU5076Helper extends BaseHelper {
	private KNU5076Page page;
	private int click_type = 4;
	//private boolean isFirstClick = false;
	private String handle;
	
	public KNU5076Helper(ApplicationManager app) {
		super(app);
		page = new KNU5076Page();
	}
	
	public KNU5076Helper openPage() {
		driver.get(baseUrl + KNU5076Page.url);
		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
	}
	
	/*public KNU5076Helper changeRegionTo(String region) {
		changeRegionTo(page.getHeader(), region);
		
		return this;
	}*/
	
	public KNU5076Helper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public KNU5076Helper closeAnonser() {
		closeAnonser(page.getAnonser());
		
		return this;
	}
	
	public KNU5076Helper closeFoundMistakeAlert() {
		closeFoundMistakeAlert(page.getFoundMistakeAlert());
		
		return this;
	}
	
	public KNU5076Helper clickContextFirm2533() {
		handle = driver.getWindowHandle();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getContextKNU5076().getContextNameLink()));
		driver.findElement(page.getContextKNU5076().getContextNameLink()).click();
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		
		for (String currentTab : tabs2)
			if (! tabs.contains(currentTab)) {
				driver.switchTo().window(currentTab);
				break;
			}
		
		app.getOutclickPageHelper().ensurePageLoaded();
		
		//app.getOutclickPageHelper().closeMainGateTabAndSwitchToOldTab();
		
		driver.close();
		driver.switchTo().window(getHandle());
		
		click_type = 4;
		
		return this;
	}
	
	public KNU5076Helper closeOutclickPopUp() {
		OutclickPopUp outclickPopUpDesktopPriceUa = new OutclickPopUp();
		ensureVisabilityObjectLoaded(outclickPopUpDesktopPriceUa.getElementForEnsureObjectLoaded());
		driver.findElement(outclickPopUpDesktopPriceUa.getCloseButton()).click();
		
		return this;
	}
	
	public KNU5076Helper checkClickInTable() {
		//isFirstClick = isFirstClick == false ? true : false;
		
		//app.getApplicationManagerHelper().getApplicationManagerClicks().getFirmClicksPageHelper().openPage(2533).checkLastClickFirm2533(click_type);
		
		handle = driver.getWindowHandle();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		if (tabs.size() == 1)
			driver.switchTo().newWindow(WindowType.TAB);
		else 
			driver.switchTo().window(app.getFirmClicksPageHelper().getHandle());
		
		app.getFirmClicksPageHelper().openPage(2533).checkLastClickFirm2533(click_type);
		
		driver.switchTo().window(getHandle());
		
		return this;
	}
	
	/*
	public int getCardsCount() {
		return cardsCount;
	}
	
	public void compareCardsCount() {
		super.compareCardsCount(getCardsCount(), "//div[starts-with(@class,'product-block type2')]");
	}*/
	
	public String getHandle() {
		return handle;
	}
}
