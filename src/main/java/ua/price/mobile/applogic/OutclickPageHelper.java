package ua.price.mobile.applogic;

import java.util.ArrayList;

import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.mobile.pages.OutclickPage;

public class OutclickPageHelper extends BaseHelper {
	private OutclickPage page;
	
	public OutclickPageHelper(ApplicationManager app) {
		super(app);
		page = new OutclickPage();
	}
	
	public void ensurePageLoaded() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getBody()));
	}
	
	public void closeMainGateTabAndSwitchToOldTab() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		if (tabs.size() > 1) {
			driver.switchTo().window(tabs.get(1));
			ensurePageLoaded();
			driver.close();
		    driver.switchTo().window(tabs.get(0));
		}
	}
}
