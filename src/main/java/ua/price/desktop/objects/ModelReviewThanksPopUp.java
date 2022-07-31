package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class ModelReviewThanksPopUp {
	public String thanksTextString = "";
	
	public By thanksText = By.xpath("//div[@class='success-submit active']/div[1]/div[1]");
	
	public String waitReviewTextString = "";
	
	public By waitReviewText = By.xpath("//div[@class='success-submit active']/div[1]/div[2]");
	
	public String registerTextString = "";
	
	public By registerText = By.xpath("//div[@class='success-submit active']/div[2]/div[1]/div");
}
