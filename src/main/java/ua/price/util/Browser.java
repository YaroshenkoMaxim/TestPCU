package ua.price.util;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	private WebDriver driver;
	
	private final String PATH_TO_CHROMEDRIVER = System.getProperty("user.dir") + (new PropertyLoader()).loadProperty("chromedriver");
	private final String PATH_TO_GECKODRIVER = System.getProperty("user.dir") + (new PropertyLoader()).loadProperty("geckodriver");
	public enum BrowserName {CHROME_DESKTOP, CHROME_TABLET, CHROME_MOBILE, FIREFOX_DESKTOP};
	
	public WebDriver initDriver(String browser) {
		switch (browser) {
			case "chrome_desktop":
				System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case "chrome_tablet":
				Map<String, String> mobileEmulation = new HashMap<>();
				mobileEmulation.put("deviceName", "iPad");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
				System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
				driver = new ChromeDriver(chromeOptions);
				break;
			case "chrome_mobile":
				Map<String, String> mobileEmulation2 = new HashMap<>();
				mobileEmulation2.put("deviceName", "iPhone X");
				ChromeOptions chromeOptions2 = new ChromeOptions();
				chromeOptions2.setExperimentalOption("mobileEmulation", mobileEmulation2);
				System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
				driver = new ChromeDriver(chromeOptions2);
				break;
			case "firefox_desktop":
				System.setProperty("webdriver.gecko.driver", PATH_TO_GECKODRIVER);
				driver = new FirefoxDriver();
		}
		
		return driver;
	}
}
