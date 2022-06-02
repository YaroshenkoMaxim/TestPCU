package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class HubberPopUp extends ObjectBase {
	public By getElementForEnsureObjectLoaded() {
		return By.id("js-dialog-order-product");
	}
	
	public By getCloseButton() {
		return By.xpath("//div[@class='ui-dialog-titlebar ui-corner-all ui-widget-header ui-helper-clearfix ui-draggable-handle']/span[@id='ui-id-5']/following::button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']");
	}
}
