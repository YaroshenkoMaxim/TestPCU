package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.pages.OutclickPage;

public class OutclickHelper extends BaseHelper {
	private OutclickPage page;
	
	public OutclickHelper(ApplicationManager app) {
		super(app);
		page = new OutclickPage();
		page.setWindowHandle(driver.getWindowHandle());
	}
	
	public OutclickHelper ensurePageLoaded() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getBody()));
		
		return this;
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
