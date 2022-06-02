package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class DefaultPopUp {
	public By defaultPopUp() {
		return By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front default-gray-popup']");
	}
}
