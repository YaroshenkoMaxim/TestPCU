package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class RateStar extends ObjectBase {
	public By rateStar() {
		return By.xpath("//div[@class='rate-star visible']");
	}
}
