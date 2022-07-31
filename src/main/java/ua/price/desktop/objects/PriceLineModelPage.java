package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class PriceLineModelPage {
	public By priceLinesTable = By.id("table-prices");
	public By pricelineDescription = By.xpath("//div[@class='desc']/a[@data-offer-id='5831130564']");
	public By phoneButton = By.xpath("//div[@data-offer-id='5831130564']/div/div/span[@class='btn-show js--show-phone-number']");
	public By phone = By.xpath("//a[@class='btn-show js--show-phone-number']");
}
