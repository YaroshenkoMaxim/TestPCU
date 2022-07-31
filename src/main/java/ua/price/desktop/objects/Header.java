package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class Header {
	public By getElementForEnsureObjectLoaded() {
		return changeRegionLink();
	}
	
	public By regionsDropdown() {
		return By.xpath("//div[@class='regions-dropdown']");
	}
	
	public By changeRegionLink() {
		return By.id("change-region-link");
	}
	
	public By findRegionLinkByName(String region) {
		return By.xpath("//a[text()='" + region + "']");
	}
	
	public By findRegionLinkById(int region) {
		return By.xpath("//a[@data='" + region + "']");
	}
}
