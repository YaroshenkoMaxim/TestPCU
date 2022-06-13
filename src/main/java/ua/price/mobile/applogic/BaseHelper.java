package ua.price.mobile.applogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ua.price.mobile.objects.Header;
import ua.price.mobile.pages.PageBase;

public class BaseHelper {
	public ApplicationManager app;
	public WebDriver driver;
	public WebDriverWait wait;
	public String baseUrl;
	public String baseClicksUrl;
	
	public BaseHelper(ApplicationManager app) {
		this.app = app;
		driver = app.getDriver();
		wait = app.getWait();
		baseUrl = app.getBaseUrl();
		baseClicksUrl = app.getBaseClicksUrl();
	}
	
	protected BaseHelper changeRegionTo(Header header, String region) {
		wait.until(ExpectedConditions.presenceOfElementLocated(header.changeRegionLink()));
		wait.until(ExpectedConditions.presenceOfElementLocated(header.burger()));
		
		if (! driver.findElement(header.changeRegionLink()).getAttribute("title").equals(region)) {
			driver.findElement(header.burger()).click();
			driver.findElement(header.changeRegionLink()).click();
			driver.findElement(header.findRegionLinkByName(region)).click();
		}
		else {
			//Close pop-up region
			Actions action = new Actions(driver);
			action.moveByOffset(340, 100).click().build().perform();
			action.moveByOffset(-340, -100).perform();
		}
		
		return this;
	}
	
	protected BaseHelper changeRegionTo(Header header, int region) {
		//ensureObjectLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(header.changeRegionLink()));
		wait.until(ExpectedConditions.presenceOfElementLocated(header.burger()));
		
		//if (! driver.findElement(header.changeRegionLink()).getAttribute("title").equals(region)) {
		if (driver.findElements(By.xpath("//a[@data='" + region + "']")).size() != 0) {
			driver.findElement(header.burger()).click();
			driver.findElement(header.changeRegionLink()).click();
			driver.findElement(header.findRegionLinkById(region)).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(header.changeRegionLink()));
			//Assert.assertEquals(regionNames[region], driver.findElement(header.changeRegionLink()).getAttribute("title"));
		}
		/*else {
			//Close pop-up region
			Actions action = new Actions(driver);
			action.moveByOffset(340, 100).click().build().perform();
			action.moveByOffset(-340, -100).perform();
		}*/
		
		return this;
	}
	
	protected void ensurePageLoaded(PageBase page) {
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getDefaultPopUp().defaultPopUp()));
	}
	
	protected void ensurePresenceObjectLoaded(By element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}
	
	protected void ensureVisabilityObjectLoaded(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	protected void clickElement(By element) {
		driver.findElement(element).click(); 
	}
	
	public void switchToOtherTab() {
		driver.switchTo().window(driver.getWindowHandle());
		//Window(Driver.WindowHandles[1]);

	}
	
	/*public KNU5076DesktopPriceUa openKNU5076DesktopPriceUa() {
		return new KNU5076DesktopPriceUa(driver).openPage().ensurePageLoaded();
	}
	
	public FirmInfo2533PageDesktopPriceUa openFirmInfo2533PageDesktopPriceUa() {
		return new FirmInfo2533PageDesktopPriceUa(driver).openPage().ensurePageLoaded();
	}
	
	public CatalogFirm2533PageDesktopPriceUa openCatalogFirm2533PageDesktopPriceUa() {
		return new CatalogFirm2533PageDesktopPriceUa(driver).openPage().ensurePageLoaded();
	}
	
	public SalesFirm2533PageDesktopPriceUa openSalesFirm2533PageDesktopPriceUa() {
		return new SalesFirm2533PageDesktopPriceUa(driver).openPage().ensurePageLoaded();
	}
	
	public DiscountedFirm2533PageDesktopPriceUa openDiscountedFirm2533PageDesktopPriceUa() {
		return new DiscountedFirm2533PageDesktopPriceUa(driver).openPage().ensurePageLoaded();
	}
	
	public CatalogFirmHubberPageDesktopPriceUa openCatalogFirmHubberPageDesktopPriceUa() {
		return new CatalogFirmHubberPageDesktopPriceUa(driver).openPage().ensurePageLoaded();
	}	
	
	public ModelPageArchiveHasReviewOpisanieTabDesktopPriceUa openModelPageArchiveHasReviewOpisanieTabDesktopPriceUa() {
		return new ModelPageArchiveHasReviewOpisanieTabDesktopPriceUa(driver).openPage().ensurePageLoaded();
	}
	
	public ModelPageArchiveHasReviewPricesTabDesktopPriceUa openModelPageArchiveHasReviewPricesTabDesktopPriceUa() {
		return new ModelPageArchiveHasReviewPricesTabDesktopPriceUa(driver).openPage().ensurePageLoaded();
	}
	
	public ModelPageInSaleHasReviewOpisanieTabDesktopPriceUa openModelPageInSaleHasReviewOpisanieTabDesktopPriceUa() {
		return new ModelPageInSaleHasReviewOpisanieTabDesktopPriceUa(driver).openPage().ensurePageLoaded();
	}
	
	public ModelPageInSaleHasReviewOtziviTabPriceUa openModelPageInSaleHasReviewOtziviTabPriceUa() {
		return new ModelPageInSaleHasReviewOtziviTabPriceUa(driver).openPage().ensurePageLoaded();
	}
	
	public ModelPageInSaleHasReviewPricesTabDesktopPriceUa openModelPageInSaleHasReviewPricesTabDesktopPriceUa() {
		return new ModelPageInSaleHasReviewPricesTabDesktopPriceUa(driver).openPage().ensurePageLoaded();
	}*/
}
