package ua.price.desktop.applogic;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import ua.price.desktop.pages.ModelInSaleHasReviewOtziviTabPage;

public class ModelInSaleHasReviewOtziviTabHelper extends BaseHelper {
	private ModelInSaleHasReviewOtziviTabPage page;
	
	public ModelInSaleHasReviewOtziviTabHelper(ApplicationManager app) {
		super(app);
		page = new ModelInSaleHasReviewOtziviTabPage();
	}
	
	public ModelInSaleHasReviewOtziviTabHelper openPage() {
		driver.get(baseUrl + ModelInSaleHasReviewOtziviTabPage.url);
		ensurePageLoaded();		
		return this;
	}
	
	public void ensurePageLoaded() {
		ensurePageLoaded(page);
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getPriceLinesModelPage().priceLinesTable));
	}
	
	public ModelInSaleHasReviewOtziviTabHelper changeRegionToAllUkraine() {
		changeRegionTo(page.getHeader(), 0);
		
		return this;
	}
	
	public void addReview() {
		driver.findElement(page.getAddModelReviewButton().addModelReviewButton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getModelReviewPopUp().getReviewNameField()));
		driver.findElement(page.getModelReviewPopUp().getReviewNameField()).sendKeys(page.getModelReviewPopUp().nameText);
		driver.findElement(page.getModelReviewPopUp().getEmailField()).sendKeys(page.getModelReviewPopUp().emailText);
		driver.findElement(page.getModelReviewPopUp().getRating5()).click();
		driver.findElement(page.getModelReviewPopUp().getReviewTextField()).sendKeys(page.getModelReviewPopUp().reviewText);
		driver.findElement(page.getModelReviewPopUp().getReviewPositivewField()).sendKeys(page.getModelReviewPopUp().positiveText);
		driver.findElement(page.getModelReviewPopUp().getReviewNegativeField()).sendKeys(page.getModelReviewPopUp().negativeText);
		driver.findElement(page.getModelReviewPopUp().getSendButton()).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(page.getMModelReviewThanksPopUp().thanksText));
		Assert.assertEquals(driver.findElement(page.getMModelReviewThanksPopUp().thanksText).getText(), page.getMModelReviewThanksPopUp().thanksTextString);
		Assert.assertEquals(driver.findElement(page.getMModelReviewThanksPopUp().waitReviewText).getText(), page.getMModelReviewThanksPopUp().waitReviewTextString);
		Assert.assertEquals(driver.findElement(page.getMModelReviewThanksPopUp().registerText).getText(), page.getMModelReviewThanksPopUp().registerTextString);
	}
}
