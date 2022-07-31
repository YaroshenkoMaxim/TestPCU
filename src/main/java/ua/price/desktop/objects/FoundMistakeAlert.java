package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class FoundMistakeAlert {	
	public By closeButton() {
		return By.xpath("//div[@class='found-mistake-alert__close']");
	}
}
