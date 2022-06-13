package ua.price.desktop.objects;

import org.openqa.selenium.By;

public class PriceLineHasSaleModelPage extends ObjectBase {
	public By priceLinesTable = By.id("table-prices");
	public By saleIcon = By.xpath("//div[@class='sale-desc discount']/a[@data-offer-id='5831130566']");
	public By pricelineDescription = By.xpath("//div[@class='desc']/a[@data-offer-id='5831130566']");
	public By phoneButton = By.xpath("//div[@data-offer-id='5831130566']/div/div/span[@class='btn-show js--show-phone-number']");
	public By phone = By.xpath("//a[@class='btn-show js--show-phone-number']");
}
