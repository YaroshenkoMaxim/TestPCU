package ua.price.mobile.tests;

import org.testng.annotations.BeforeTest;

import ua.price.mobile.applogic.ApplicationManager;

public class TestBase {
	protected ApplicationManager app;
	
	@BeforeTest
	public void setUp() {
		app = new ApplicationManager();
	}
}
