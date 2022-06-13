package ua.price.desktop.pages;

import org.openqa.selenium.By;

import ua.price.desktop.objects.Anonser;
import ua.price.desktop.objects.FoundMistakeAlert;
import ua.price.desktop.objects.Header;


public abstract class PageBase {	
	private Header header;
	private Anonser anonser;
	private FoundMistakeAlert foundMistakeAlert;
	
	public PageBase() {
		header = new Header();
		anonser = new Anonser();
		foundMistakeAlert = new FoundMistakeAlert();
	}
	
	public By getDefaultPopUp() {
		return By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front default-gray-popup']");
	}
	
	public PageBase ensurePageLoaded() {		
		return this;
	}
	
	public Header getHeader() {
		return header;
	}
	
	public Anonser getAnonser() {
		return anonser;
	}
	
	public FoundMistakeAlert getFoundMistakeAlert() {
		return foundMistakeAlert;
	}
}
