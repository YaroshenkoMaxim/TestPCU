package ua.price.desktop.applogic;

import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.pages.ModelArchiveHasReviewPricesTabPage;

public class ModelArchiveHasReviewPricesTabHelper extends BaseHelper {
	private ModelArchiveHasReviewPricesTabPage page;
	
	public ModelArchiveHasReviewPricesTabHelper(ApplicationManager app) {
		super(app);
		page = new ModelArchiveHasReviewPricesTabPage();
	}
	
	public ModelArchiveHasReviewPricesTabHelper openPage() {
		driver.get(baseUrl + ModelArchiveHasReviewPricesTabPage.url);
		ensurePageLoaded();		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getRateStar().rateStar()));
	}
	
	/*public ModelArchiveHasReviewPricesTabHelper changeRegionTo(String region) {
		changeRegionTo(page.getHeader(), region);
		
		return this;
	}*/
	
	public ModelArchiveHasReviewPricesTabHelper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public ModelArchiveHasReviewPricesTabHelper changeRegionToKyiv() {
		changeRegionTo(page.getHeader(), 1);
		
		return this;
	}


	public String getCanonicalAllUkraine() {
		return page.getCanonicalAllUkraine();
	}
	
	public String getCanonicalKiev() {
		return page.getCanonicalKiev();
	}
}
