package ua.price.desktop.applogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import ua.price.util.Browser;
import ua.price.util.PropertyLoader;

//import applogic.common.ApplicationManagerHelper;

public class ApplicationManager {
	private String baseUrl;
	private WebDriver driver;
	private WebDriverWait wait;
	private String baseClicksUrl;
	
	//private ApplicationManagerHelper applicationManagerHelper;
	//private BaseHelperDesktopPriceUa baseHelper;
	private CatalogFirm2533Helper catalogFirm2533PageHelper;
	private FirmInfo2533Helper firmInfo2533Helper;
	private KNU5076Helper knu5076Helper;
	private SalesFirm2533Helper salesFirm2533Helper;
	private DiscountedFirm2533Helper discountedFirm2533Helper;
	private CatalogFirmHubberHelper catalogFirmHubberHelper;
	private ModelArchiveHasReviewOpisanieTabHelper modelArchiveHasReviewOpisanieTabHelper;
	private ModelArchiveHasReviewPricesTabHelper modelArchiveHasReviewPricesTabHelper;
	private ModelInSaleHasReviewOpisanieTabHelper modelInSaleHasReviewOpisanieTabHelper;
	private ModelInSaleHasReviewPricesTabHelper modelInSaleHasReviewPricesTabHelper;
	private ModelInSaleHasReviewOtziviTabHelper modelInSaleHasReviewOtziviTabHelper;
	private ModelInSaleHasSalePricesTabHelper modelInSaleHasSalePricesTabHelper;
	private OutclickHelper outclickHelper;
	
	private FirmClicksPageHelper firmClicksPageHelper;
	
	//public ApplicationManagerDesktopPriceUa(ApplicationManagerHelper applicationManagerHelper) {
	public ApplicationManager() {
		baseUrl = (new PropertyLoader()).loadProperty("url");
				
		//driver = new Browser().initDriver(BrowserName.CHROME_DESKTOP);//.initDriver(Browser.BrowserName.CHROME_DESKTOP);
		
		driver = new Browser().initDriver((new PropertyLoader()).loadProperty("browser"));
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		baseClicksUrl = (new PropertyLoader()).loadProperty("clicksUrl");
		
		//this.applicationManagerHelper = applicationManagerHelper;
		
		//baseHelper = new BaseHelperDesktopPriceUa(this);
		
		catalogFirm2533PageHelper = new CatalogFirm2533Helper(this);
		firmInfo2533Helper = new FirmInfo2533Helper(this);
		knu5076Helper = new KNU5076Helper(this);
		salesFirm2533Helper = new SalesFirm2533Helper(this);
		discountedFirm2533Helper = new DiscountedFirm2533Helper(this);
		catalogFirmHubberHelper = new CatalogFirmHubberHelper(this);
		modelArchiveHasReviewOpisanieTabHelper = new ModelArchiveHasReviewOpisanieTabHelper(this);
		modelArchiveHasReviewPricesTabHelper = new ModelArchiveHasReviewPricesTabHelper(this);
		modelInSaleHasReviewOpisanieTabHelper = new ModelInSaleHasReviewOpisanieTabHelper(this);
		modelInSaleHasReviewPricesTabHelper = new ModelInSaleHasReviewPricesTabHelper(this);
		modelInSaleHasReviewOtziviTabHelper = new ModelInSaleHasReviewOtziviTabHelper(this);
		modelInSaleHasSalePricesTabHelper = new ModelInSaleHasSalePricesTabHelper(this);
		outclickHelper = new OutclickHelper(this);
		
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
	
	/*public BaseHelperDesktopPriceUa getNavigationHelper() {
		return baseHelper;
	}*/
	
	/*protected ApplicationManagerHelper getApplicationManagerHelper() {
		return applicationManagerHelper;
	}*/
	
	public CatalogFirm2533Helper getCatalogFirm2533Helper() {
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
	
	public DiscountedFirm2533Helper getDiscountedFirm2533DesktopPriceUaHelper() {
		return discountedFirm2533Helper;
	}
	
	public CatalogFirmHubberHelper getCatalogFirmHubberHelper() {
		return catalogFirmHubberHelper;
	}
	
	public ModelArchiveHasReviewOpisanieTabHelper getModelArchiveHasReviewOpisanieTabHelper() {
		return modelArchiveHasReviewOpisanieTabHelper;
	}
	
	public ModelArchiveHasReviewPricesTabHelper getModelArchiveHasReviewPricesTabHelper() {
		return modelArchiveHasReviewPricesTabHelper;
	}
	
	public ModelInSaleHasReviewOpisanieTabHelper getModelInSaleHasReviewOpisanieTabHelper() {
		return modelInSaleHasReviewOpisanieTabHelper;
	}
	
	public ModelInSaleHasReviewPricesTabHelper getModelInSaleHasReviewPricesTabHelper() {
		return modelInSaleHasReviewPricesTabHelper;
	}
	
	public ModelInSaleHasReviewOtziviTabHelper getModelInSaleHasReviewOtziviTabHelper() {
		return modelInSaleHasReviewOtziviTabHelper;
	}
	
	public ModelInSaleHasSalePricesTabHelper getModelInSaleHasSalePricesTabHelper() {
		return modelInSaleHasSalePricesTabHelper;
	}
	
	public OutclickHelper getOutclickPageHelper() {
		return outclickHelper;
	}
	
	public FirmClicksPageHelper getFirmClicksPageHelper() {
		return firmClicksPageHelper;
	}
}