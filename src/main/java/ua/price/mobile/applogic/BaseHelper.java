package ua.price.mobile.applogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		wait.until(ExpectedConditions.presenceOfElementLocated(header.changeRegionLink()));
		wait.until(ExpectedConditions.presenceOfElementLocated(header.burger()));
		
		if (driver.findElements(By.xpath("//a[@data='" + region + "']")).size() != 0) {
			driver.findElement(header.burger()).click();
			driver.findElement(header.changeRegionLink()).click();
			driver.findElement(header.findRegionLinkById(region)).click();
		}
		
		return this;
	}
	
	protected void ensurePageLoaded(PageBase page) {
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getDefaultPopUp().defaultPopUp()));
	}
}
