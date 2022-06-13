package ua.price.mobile.objects;

import org.openqa.selenium.By;

public class Header {
	public By getElementForEnsureObjectLoaded() {
		return changeRegionLink();
	}
	
	public By burger() {
		return By.id("js-header-menu-toggle");
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
