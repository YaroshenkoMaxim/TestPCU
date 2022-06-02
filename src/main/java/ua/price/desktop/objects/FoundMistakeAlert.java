package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class FoundMistakeAlert extends ObjectBase {	
	public By closeButton() {
		return By.xpath("//div[@class='found-mistake-alert__close']");
	}
	
	/*
	public T closeOutclickPopUp() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-dialog-titlebar ui-corner-all ui-widget-header ui-helper-clearfix ui-draggable-handle']/button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")));
		driver.findElement(By.xpath("//div[@class='ui-dialog-titlebar ui-corner-all ui-widget-header ui-helper-clearfix ui-draggable-handle']/button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")).click();
		
		return page;
	}*/
}
