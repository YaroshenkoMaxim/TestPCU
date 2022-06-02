package ua.price.util;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	private WebDriver driver;
	
	private final String PATH_TO_CHROMEDRIVER = "C:\\Users\\Максим\\Selenium\\ChromeDriver\\chromedriver.exe";
	private final String PATH_TO_GECKODRIVER = "C:\\Users\\Максим\\Selenium\\GeckoDriver\\geckodriver.exe";
	public enum BrowserName {CHROME_DESKTOP, CHROME_TABLET, CHROME_MOBILE, FIREFOX_DESKTOP};
	
	public WebDriver initDriver(BrowserName browser) {
		switch (browser) {
			case CHROME_DESKTOP:
				System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case CHROME_TABLET:
				Map<String, String> mobileEmulation = new HashMap<>();
				mobileEmulation.put("deviceName", "iPad");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
				System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
				driver = new ChromeDriver(chromeOptions);
				break;
			case CHROME_MOBILE:
				Map<String, String> mobileEmulation2 = new HashMap<>();
				mobileEmulation2.put("deviceName", "iPhone X");
				ChromeOptions chromeOptions2 = new ChromeOptions();
				chromeOptions2.setExperimentalOption("mobileEmulation", mobileEmulation2);
				System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
				driver = new ChromeDriver(chromeOptions2);
				break;
			case FIREFOX_DESKTOP:
				System.setProperty("webdriver.gecko.driver", PATH_TO_GECKODRIVER);
				driver = new FirefoxDriver();
		}
		
		return driver;
	}
}