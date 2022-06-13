package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.pages.ModelInSaleHasReviewPricesTabPage;

public class ModelInSaleHasReviewPricesTabHelper extends BaseHelper {
	private ModelInSaleHasReviewPricesTabPage page;
	private int click_type = 0;
	private String handle;
	
	public ModelInSaleHasReviewPricesTabHelper(ApplicationManager app) {
		super(app);
		page = new ModelInSaleHasReviewPricesTabPage();
	}
	
	public ModelInSaleHasReviewPricesTabHelper openPage() {
		driver.get(baseUrl + ModelInSaleHasReviewPricesTabPage.url);
		ensurePageLoaded();		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getRateStar().rateStar()));
	}
	
	public ModelInSaleHasReviewPricesTabHelper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public ModelInSaleHasReviewPricesTabHelper changeRegionToKyiv() {
		changeRegionTo(page.getHeader(), 1);
		
		return this;
	}
	
	public ModelInSaleHasReviewPricesTabHelper closeAnonser() {
		closeAnonser(page.getAnonser());
		
		return this;
	}
	
	public ModelInSaleHasReviewPricesTabHelper closeFoundMistakeAlert() {
		closeFoundMistakeAlert(page.getFoundMistakeAlert());
		
		return this;
	}
	
	public ModelInSaleHasReviewPricesTabHelper clickShowPhoneButton() {
		handle = driver.getWindowHandle();

		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(page.getPriceLineModelPage().pricelineDescription).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(page.getPriceLineModelPage().phoneButton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getPriceLineModelPage().phone));
		
		click_type = 6;
		
		return this;
	}
	
	public ModelInSaleHasReviewPricesTabHelper checkClickInTable() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		if (tabs.size() == 1)
			driver.switchTo().newWindow(WindowType.TAB);
		else 
			driver.switchTo().window(app.getFirmClicksPageHelper().getHandle());
		app.getFirmClicksPageHelper().openPage(2533).checkLastClickFirm2533(click_type);
		driver.switchTo().window(handle);
		
		return this;
	}

	public String getCanonicalAllUkraine() {
		return baseUrl + page.getCanonicalAllUkraine();
	}
	
	public String getCanonicalKiev() {
		return baseUrl + page.getCanonicalKiev();
	}
}
