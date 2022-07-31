package ua.price.desktop.objects;

import java.time.LocalDate;

import org.openqa.selenium.By;

public class ModelReviewPopUp {
	public String nameText= "Test Name";
	
	public By getReviewNameField() {
		return By.id("review_name");
	}
	
	public String emailText = String.format("test%d%02d%02d@yopmail.fr", LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
	
	public By getEmailField() {
		return By.id("review_email");
	}
	
	public By getRating5() {
		return By.id("review_rating_5");
	}
	
	public String reviewText = "Test review text"; 
	
	public By getReviewTextField() {
		return By.id("review_text");
	}
	
	public String positiveText = "Test positive review text";
	
	public By getReviewPositivewField() {
		return By.id("review_positive_review");
	}
	
	public String negativeText = "Test negative review text";
	
	public By getReviewNegativeField() {
		return By.id("review_negative_review");
	}
	
	public By getSendButton() {
		return By.xpath("//div[@class='form-line clearer-block']/a[@class='btn btn-orange comment-submit-form']");
	}
}
