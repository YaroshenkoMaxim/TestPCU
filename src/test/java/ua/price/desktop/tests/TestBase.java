package ua.price.desktop.tests;

import org.testng.annotations.BeforeTest;

import ua.price.desktop.applogic.ApplicationManager;

public class TestBase {
	protected ApplicationManager app;
	
	@BeforeTest
	public void setUp() {
		app = new ApplicationManager();//.getApplicationManager();
	}
}
