package ua.price.mobile.objects;

import org.openqa.selenium.By;

public class ContextKNU5076 {
	public final By contextSlider = By.xpath("//div[@class='context-slider-wrap force-mobile-style loaded']");
	
	public final By contextName = By.xpath("//div[contains(@class,'slick-active')]/div/div[@class='context-descr']/div[text()='���-����. ������� �������.']");
	
	public final By contextButton = By.xpath("//div[contains(@class,'slick-active')]/div/div[@class='context-descr']/div[text()='���-����. ������� �������.']/following::a[1]");
	
	/*
	public By contextSlider() {
		return By.xpath("//div[@class='context-slider-wrap force-mobile-style loaded']");
	}
	
	public By getContextName() {
		return By.xpath("//div[contains(@class,'slick-active')]/div/div[@class='context-descr']/div[text()='���-����. ������� �������.']");
	}
	
	public By getContextButton() {
		return By.xpath("//div[contains(@class,'slick-active')]/div/div[@class='context-descr']/div[text()='���-����. ������� �������.']/following::a[1]");
	}
	*/
}