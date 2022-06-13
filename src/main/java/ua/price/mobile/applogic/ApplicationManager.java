package ua.price.mobile.applogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import ua.price.util.Browser;
import ua.price.util.PropertyLoader;

public class ApplicationManager {
	private String baseUrl;
	private WebDriver driver;
	private WebDriverWait wait;
	private String baseClicksUrl;

	private CatalogFirm2533Helper catalogFirm2533PageHelper;
	private FirmInfo2533Helper firmInfo2533Helper;
	private KNU5076Helper knu5076Helper;
	private SalesFirm2533Helper salesFirm2533Helper;
	private OutclickPageHelper outclickPageHelper; 
	private FirmClicksPageHelper firmClicksPageHelper;
	
	public ApplicationManager() {	
		baseUrl = (new PropertyLoader()).loadProperty("url");		
		driver = new Browser().initDriver((new PropertyLoader()).loadProperty("browser"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
		baseClicksUrl = (new PropertyLoader()).loadProperty("clicksUrl");
		
		catalogFirm2533PageHelper = new CatalogFirm2533Helper(this);
		firmInfo2533Helper = new FirmInfo2533Helper(this);
		knu5076Helper = new KNU5076Helper(this);
		salesFirm2533Helper = new SalesFirm2533Helper(this);
		outclickPageHelper = new OutclickPageHelper(this);
		firmClicksPageHelper = new FirmClicksPageHelper(this);
	}
	
	protected String getBaseUrl() {
		return baseUrl;
	}
	
	protected WebDriver getDriver() {
		return driver;
	}
	
	protected WebDriverWait getWait() {
		return wait;
	}
	
	protected String getBaseClicksUrl() {
		return baseClicksUrl;
	}
	
	public CatalogFirm2533Helper getCatalogFirm2533PageHelper() {
		return catalogFirm2533PageHelper;
	}
	
	public FirmInfo2533Helper getFirmInfo2533Helper() {
		return firmInfo2533Helper;
	}
	
	public KNU5076Helper getKNU5076Helper() {
		return knu5076Helper;
	}
	
	public SalesFirm2533Helper getSalesFirm2533Helper() {
		return salesFirm2533Helper;
	}
		
	public OutclickPageHelper getOutclickPageHelper() {
		return outclickPageHelper;
	}
	
	public FirmClicksPageHelper getFirmClicksPageHelper() {
		return firmClicksPageHelper;
	}
}