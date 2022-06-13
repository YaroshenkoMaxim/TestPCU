package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class Anonser extends ObjectBase {	
	public By closeButton() {
		return By.xpath("//button[@class='close announcement-acb']");
	}
}
