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
		return this;
	}
	
	public Header getHeader() {
		return header;
	}
	
	public DefaultPopUp getDefaultPopUp() {
		return defaultPopUp;
	}
}
