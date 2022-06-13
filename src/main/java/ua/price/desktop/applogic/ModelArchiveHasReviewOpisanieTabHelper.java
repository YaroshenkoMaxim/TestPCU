package ua.price.desktop.applogic;

import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.price.desktop.pages.ModelArchiveHasReviewOpisanieTabPage;

public class ModelArchiveHasReviewOpisanieTabHelper extends BaseHelper {
	private ModelArchiveHasReviewOpisanieTabPage page;
	
	public ModelArchiveHasReviewOpisanieTabHelper(ApplicationManager app) {
		super(app);
		page = new ModelArchiveHasReviewOpisanieTabPage();
	}
	
	public ModelArchiveHasReviewOpisanieTabHelper openPage() {
		driver.get(baseUrl + ModelArchiveHasReviewOpisanieTabPage.url);
		ensurePageLoaded();		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getRateStar().rateStar()));
	}
	
	public ModelArchiveHasReviewOpisanieTabHelper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public ModelArchiveHasReviewOpisanieTabHelper changeRegionToKyiv() {
		changeRegionTo(page.getHeader(), 1);
		
		return this;
	}

	public String getCanonicalAllUkraine() {
		return page.getCanonicalAllUkraine();
	}
	
	public String getCanonicalKiev() {
		return baseUrl + page.getCanonicalKiev();
	}
}
