package ua.price.mobile.pages;

import org.openqa.selenium.WebDriver;

import ua.price.mobile.objects.DefaultPopUp;
import ua.price.mobile.objects.Header;

public abstract class PageBase {
	protected WebDriver driver;
	
	private Header header;
	private DefaultPopUp defaultPopUp;
	
	public PageBase() {
		header = new Header();
		defaultPopUp = new DefaultPopUp();
	}
	
	public PageBase ensurePageLoaded() {
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front default-gray-popup']")));
		
		return this;
	}
	
	public Header getHeader() {
		return header;
	}
	
	public DefaultPopUp getDefaultPopUp() {
		return defaultPopUp;
	}
	
	/*
	private String getCanonicalCurrent() {
		String canonicalUrl;
		
		try {
			WebElement canonical = driver.findElement(By.xpath("//link[@rel='canonical']"));
			canonicalUrl = canonical.getAttribute("href");
		} catch (NoSuchElementException e) {
			canonicalUrl = "No";
		}
			
		return canonicalUrl;
	}
	
	protected <T> void compareCanonicals(HeaderDesktopPriceUa<T> header, String canonicalAllUkraine, String canonicalKiev) {
		header.changeRegionTo("Вся Украина");
		Assert.assertEquals(canonicalAllUkraine, getCanonicalCurrent());
		System.out.println("Вся Украина   " + getCanonicalCurrent());
		
		header.changeRegionTo("Киев");
		Assert.assertEquals(canonicalKiev, getCanonicalCurrent());
		System.out.println("Киев      " + getCanonicalCurrent());
	}
	
	private int getCardsCountCurrent(String cardXpath) {
		List<WebElement> cardsArray = driver.findElements(By.xpath(cardXpath));
		
		return cardsArray.size();
	}
	
	protected void compareCardsCount(int getCardsCount, String cardXpath) {
		Assert.assertEquals(getCardsCount, getCardsCountCurrent(cardXpath));
		System.out.println(getCardsCount + "       " + getCardsCountCurrent(cardXpath));
	}*/
}
