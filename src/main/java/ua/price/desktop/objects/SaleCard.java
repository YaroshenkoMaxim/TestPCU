package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class SaleCard extends ObjectBase {
	public By getToShopButton() {
		return By.xpath("//a[@class='btn btn-orange active-go']");
	}
	
	public By getShowPhoneButton() {
		return By.xpath("//span[@class='btn-show js--show-phone-number ga_sale_phone_firm_link']");
	}
	
	public By getPhone() {
		return By.xpath("//a[@data-otc='phone']");
	}
}
