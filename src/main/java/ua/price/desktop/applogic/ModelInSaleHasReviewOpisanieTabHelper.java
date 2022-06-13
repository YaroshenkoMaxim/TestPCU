package ua.price.desktop.applogic;

import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.pages.ModelInSaleHasReviewOpisanieTabPage;

public class ModelInSaleHasReviewOpisanieTabHelper extends BaseHelper {
	private ModelInSaleHasReviewOpisanieTabPage page;
	
	public ModelInSaleHasReviewOpisanieTabHelper(ApplicationManager app) {
		super(app);
		page = new ModelInSaleHasReviewOpisanieTabPage();
	}
	
	public ModelInSaleHasReviewOpisanieTabHelper openPage() {
		driver.get(baseUrl + ModelInSaleHasReviewOpisanieTabPage.url);
		ensurePageLoaded();		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getRateStar().rateStar()));
	}
	
	public ModelInSaleHasReviewOpisanieTabHelper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public ModelInSaleHasReviewOpisanieTabHelper changeRegionToKyiv() {
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
