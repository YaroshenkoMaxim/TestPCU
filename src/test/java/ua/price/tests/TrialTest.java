package ua.price.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrialTest {
	@BeforeMethod
	public void testprep() {
		System.out.println("Before tests.");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1.");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2.");
	}
	
	
	
	/*Properties property;
	FileInputStream fs;
	
	WebDriver driver;
	
	@Test
	public void test() throws IOException {
		
		
		
		
		//System.out.println("Test OK!!!");
		
		//fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\application.properties");
		property = new Properties();
		//property.load(fs);
		property.load(TrialTest.class.getResourceAsStream("/application.properties"));
		//System.out.println(property.getProperty("browser"));
		
		String baseUrl = property.getProperty("url");
		String browser = property.getProperty("browser");
		
		System.out.println(baseUrl);
		System.out.println(browser);
		
		/*String baseUrl = PropertyLoader.loadProperty("url");
		String browser = PropertyLoader.loadProperty("browser");
		
		System.out.println(baseUrl);
		System.out.println(browser);


		
		switch(browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Максим\\Selenium\\ChromeDriver\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Максим\\Selenium\\GeckoDriver\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
		}
		
		driver.get(baseUrl);
		
	}
}

class PropertyLoader {

	private static final String PROP_FILE = "/application.properties";

	public static String loadProperty(String name) {
		Properties props = new Properties();
		try {
			props.load(PropertyLoader.class.getResourceAsStream(PROP_FILE));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = "";

		if (name != null) {
			value = props.getProperty(name);
		}
		return value;
	}*/
}