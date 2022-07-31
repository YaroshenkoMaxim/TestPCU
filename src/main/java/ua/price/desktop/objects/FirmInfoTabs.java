package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class FirmInfoTabs {
	public By getFirmInfoTab() {
		return By.xpath("//a[@data-content-div='firm-info']");
	}
}
