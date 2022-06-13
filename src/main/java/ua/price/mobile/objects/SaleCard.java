package ua.price.mobile.objects;

import org.openqa.selenium.By;

public class SaleCard {
	public By getToShopButton() {
		return By.xpath("//a[@class='btn btn-orange active-go']");
	}
	
	public By getShowPhoneButton() {
		return By.xpath("//a[@class='btn-call js--call-phone-number']");
	}
}
