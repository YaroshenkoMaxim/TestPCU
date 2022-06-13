package ua.price.mobile.objects;

import org.openqa.selenium.By;

public class FirmInfoTabs {
	public By getFirmInfoTab() {
		return By.xpath("//a[@data-content-div='firm-info']");
	}
}
