package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.pages.ModelInSaleHasSalePricesTabPage;

public class ModelInSaleHasSalePricesTabHelper extends BaseHelper {
	private ModelInSaleHasSalePricesTabPage page;
	private int click_type = 0;
	private String handle;
	
	public ModelInSaleHasSalePricesTabHelper(ApplicationManager app) {
		super(app);
		page = new ModelInSaleHasSalePricesTabPage();
	}
	
	public ModelInSaleHasSalePricesTabHelper openPage() {
		driver.get(baseUrl + ModelInSaleHasSalePricesTabPage.url);
		ensurePageLoaded();		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getRateStar().rateStar()));
	}
	
	public ModelInSaleHasSalePricesTabHelper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public ModelInSaleHasSalePricesTabHelper closeAnonser() {
		closeAnonser(page.getAnonser());
		
		return this;
	}
	
	public ModelInSaleHasSalePricesTabHelper closeFoundMistakeAlert() {
		closeFoundMistakeAlert(page.getFoundMistakeAlert());
		
		return this;
	}
	
	public ModelInSaleHasSalePricesTabHelper clickShowPhoneButton() {
		handle = driver.getWindowHandle();

		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(page.getPriceLineHasSaleModelPage().pricelineDescription).sendKeys(Keys.DOWN);
		driver.findElement(page.getPriceLineHasSaleModelPage().pricelineDescription).sendKeys(Keys.DOWN);
		driver.findElement(page.getPriceLineHasSaleModelPage().phoneButton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getPriceLineHasSaleModelPage().phone));

		click_type = 6;
		
		return this;
	}
	
	public ModelInSaleHasSalePricesTabHelper checkClickInTable() {
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
