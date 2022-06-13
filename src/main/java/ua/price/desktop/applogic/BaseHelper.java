package ua.price.desktop.applogic;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ua.price.desktop.objects.Anonser;
import ua.price.desktop.objects.FoundMistakeAlert;
import ua.price.desktop.objects.Header;
import ua.price.desktop.pages.PageBase;

public class BaseHelper {
	public String[] regionNames = {
			"Вся Україна"
			
	};
	
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
	
	/*protected BaseHelper changeRegionTo(Header header, String region) {
		//ensureObjectLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(header.getElementForEnsureObjectLoaded()));
		wait.until(ExpectedConditions.presenceOfElementLocated(header.regionsDropdown()));
		
		if (! driver.findElement(header.changeRegionLink()).getAttribute("title").equals(region)) {
			clickElement(header.changeRegionLink());
			clickElement(header.findRegionLinkByName(region));
			wait.until(ExpectedConditions.visibilityOfElementLocated(header.changeRegionLink()));
			//Assert.assertEquals(regionNames[0], driver.findElement(header.changeRegionLink()).getAttribute("title"));
		}
		
		return this;
	}*/

	protected BaseHelper changeRegionTo(Header header, int region) {
		//ensureObjectLoaded();
		wait.until(ExpectedConditions.presenceOfElementLocated(header.getElementForEnsureObjectLoaded()));
		wait.until(ExpectedConditions.presenceOfElementLocated(header.regionsDropdown()));
		
		//if (! driver.findElement(header.changeRegionLink()).getAttribute("title").equals(region)) {
		if (driver.findElements(By.xpath("//a[@data='" + region + "']")).size() != 0) {
			driver.findElement(header.changeRegionLink()).click();
			driver.findElement(header.findRegionLinkById(region)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(header.changeRegionLink()));
			//Assert.assertEquals(regionNames[region], driver.findElement(header.changeRegionLink()).getAttribute("title"));
		}
		
		return this;
	}
	
	protected BaseHelper closeAnonser(Anonser anonser) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(anonser.closeButton()));
		driver.findElement(anonser.closeButton()).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(anonser.getCloseButton()));
		//anonser.getCloseButton().click();
		
		return this;
	}
	
	protected BaseHelper closeFoundMistakeAlert(FoundMistakeAlert foundMistakeAlert) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(foundMistakeAlert.closeButton()));
		driver.findElement(foundMistakeAlert.closeButton()).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(anonser.getCloseButton()));
		//anonser.getCloseButton().click();
		
		return this;
	}
	
	protected void ensurePageLoaded(PageBase page) {
		ensurePresenceObjectLoaded(page.getDefaultPopUp());
	}
	
	protected void ensurePresenceObjectLoaded(By element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}
	
	protected void ensureVisabilityObjectLoaded(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
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
