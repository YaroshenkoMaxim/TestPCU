package ua.price.desktop.applogic;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ua.price.desktop.objects.Anonser;
import ua.price.desktop.objects.FoundMistakeAlert;
import ua.price.desktop.objects.Header;
import ua.price.desktop.pages.PageBase;

public class BaseHelper {	
	public ApplicationManager app;
	public WebDriver driver;
	public WebDriverWait wait;
	public String baseUrl;
	public String baseClicksUrl;
	
	public String newTab;
	
	public BaseHelper(ApplicationManager app) {
		this.app = app;
		driver = app.getDriver();
		wait = app.getWait();
		baseUrl = app.getBaseUrl();
		baseClicksUrl = app.getBaseClicksUrl();
		
	}

	protected BaseHelper changeRegionTo(Header header, int region) {
		wait.until(ExpectedConditions.presenceOfElementLocated(header.getElementForEnsureObjectLoaded()));
		wait.until(ExpectedConditions.presenceOfElementLocated(header.regionsDropdown()));
		
		if (driver.findElements(By.xpath("//a[@data='" + region + "']")).size() != 0) {
			driver.findElement(header.changeRegionLink()).click();
			driver.findElement(header.findRegionLinkById(region)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(header.changeRegionLink()));
		}
		
		return this;
	}
	
	protected BaseHelper closeAnonser(Anonser anonser) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(anonser.closeButton()));
		driver.findElement(anonser.closeButton()).click();
		
		return this;
	}
	
	protected BaseHelper closeFoundMistakeAlert(FoundMistakeAlert foundMistakeAlert) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(foundMistakeAlert.closeButton()));
		driver.findElement(foundMistakeAlert.closeButton()).click();
		
		return this;
	}
	
	protected void ensurePageLoaded(PageBase page) {
		wait.until(ExpectedConditions.presenceOfElementLocated(page.getDefaultPopUp()));
	}
	
	public String getCanonicalCurrent() {
		String canonicalUrl;
		
		try {
			WebElement canonical = driver.findElement(By.xpath("//link[@rel='canonical']"));
			canonicalUrl = canonical.getAttribute("href");
		} catch (NoSuchElementException e) {
			canonicalUrl = "No";
		}
			
		return canonicalUrl;
	}
}
