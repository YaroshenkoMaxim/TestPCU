package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class ContextKNU5076 extends ObjectBase {
	public By getElementForEnsureObjectLoaded() {
		return By.xpath("//div[@class='context-slider-wrap loaded']");
	}
	
	public By getContextNameLink() {
		return By.xpath("//a[@data-offer-id='7056']/div[@class='context-descr']");
	}
}
