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
	
	/*public ModelInSaleHasReviewOtziviTabHelper changeRegionTo(String region) {
		changeRegionTo(page.getHeader(), region);
		
		return this;
	}*/
	
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
	
	/*
	public void addReviewDesktop() {
		driver.findElement(By.xpath("//a[@class='btn btn-orange comment-window-open']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("review_name")));
		driver.findElement(By.id("review_name")).sendKeys("Test Name");
		driver.findElement(By.id("review_email")).sendKeys("test07022001@yopmail.fr");
		driver.findElement(By.id("review_rating_5")).click();
		driver.findElement(By.id("review_text")).sendKeys("Test review desktop price.ua text");
		driver.findElement(By.id("review_positive_review")).sendKeys("Test positive review text");
		driver.findElement(By.id("review_negative_review")).sendKeys("Test negative review text");
		driver.findElement(By.xpath("//div[@class='form-line clearer-block']/a[@class='btn btn-orange comment-submit-form']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='success-submit active']/div[1]/div[1]")));
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='success-submit active']/div[1]/div[1]")).getText(), "Спасибо за отзыв!");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='success-submit active']/div[1]/div[2]")).getText(), "Ваш отзыв в ближайшее время появится на сайте.");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='success-submit active']/div[2]/div[1]/div")).getText(), "Зарегистрируйтесь, чтобы следить за реакциями на Ваши отзывы:");
	}
	
	public void addReviewTablet() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='slick-dots']")));
		driver.findElement(By.xpath("//a[@class='btn btn-orange comment-window-open']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("review_name")));
		driver.findElement(By.id("review_name")).sendKeys("Test Name");
		driver.findElement(By.id("review_email")).sendKeys("test07022001@yopmail.fr");
		driver.findElement(By.id("review_rating_5")).click();
		driver.findElement(By.id("review_text")).sendKeys("Test review tablet price.ua text");
		driver.findElement(By.id("review_positive_review")).sendKeys("Test positive review text");
		driver.findElement(By.id("review_negative_review")).sendKeys("Test negative review text");
		driver.findElement(By.xpath("//div[@class='form-line clearer-block']/a[@class='btn btn-orange comment-submit-form']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='success-submit active']/div/span")));
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='success-submit active']/div/span")).getAttribute("title"), "Спасибо за ваш отзыв\nОн будет опубликован чуть позже");
	}
	
	public void addReviewMobile() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='slick-dots']")));
		driver.findElement(By.xpath("//a[@class='btn btn-orange comment-window-open']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("review_name")));
		driver.findElement(By.id("review_name")).sendKeys("Test Name");
		driver.findElement(By.id("review_email")).sendKeys("test07022001@yopmail.fr");
		driver.findElement(By.id("review_rating_5")).click();
		driver.findElement(By.id("review_text")).sendKeys("Test review mobile price.ua text");
		driver.findElement(By.id("review_positive_review")).sendKeys("Test positive review text");
		driver.findElement(By.id("review_negative_review")).sendKeys("Test negative review text");
		driver.findElement(By.xpath("//div[@class='form-line form-line-for-btn clearer-block']/a[@class='btn btn-orange comment-submit-form']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='success-submit active']/div/span")));
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='success-submit active']/div/span")).getAttribute("title"), "Спасибо за ваш отзыв\nОн будет опубликован чуть позже");
	}
	*/
}
