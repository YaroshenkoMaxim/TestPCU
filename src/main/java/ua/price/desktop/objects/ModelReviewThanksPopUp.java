package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class ModelReviewThanksPopUp extends ObjectBase {
	//public String thanksTextString = "Спасибо за отзыв!";
	public String thanksTextString = "Дякуємо за відгук!";
	
	public By thanksText = By.xpath("//div[@class='success-submit active']/div[1]/div[1]");
	
	//public String waitReviewTextString = "Ваш отзыв в ближайшее время появится на сайте.";
	public String waitReviewTextString = "Ваш відгук найближчим часом з'явиться на сайті.";
	
	public By waitReviewText = By.xpath("//div[@class='success-submit active']/div[1]/div[2]");
	
	//public String registerTextString = "Зарегистрируйтесь, чтобы следить за реакциями на Ваши отзывы:";
	public String registerTextString = "Увійдіть, щоб стежити за реакціями на Ваші відгуки:";
	
	public By registerText = By.xpath("//div[@class='success-submit active']/div[2]/div[1]/div");
}
