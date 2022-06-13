package ua.price.mobile.pages;

import org.openqa.selenium.By;

public class OutclickPage {
	private String windowHandle;
	
	public By getBody() {
		return By.id("body");
	}
	
	public String getWindowHandle() {
		return windowHandle;
	}
	
	public void setWindowHandle(String windowHandle) {
		this.windowHandle = windowHandle;
	}
}
