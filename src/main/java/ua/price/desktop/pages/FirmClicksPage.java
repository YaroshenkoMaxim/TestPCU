package ua.price.desktop.pages;

import org.openqa.selenium.By;

public class FirmClicksPage extends PageBase {
	public static String url = "/clicks.php";
		
	public By getLastClickIdCell(int clickNumber) {
		return By.xpath("//tr[" + (clickNumber + 1) + "]/td[1]");
	}
	
	public By getLastClickIpCell(int clickNumber) {
		return By.xpath("//tr[" + (clickNumber + 1) + "]/td[4]");
	}
	
	public By getLastClickTypeIdCell(int clickNumber) {
		return By.xpath("//tr[" + (clickNumber + 1) + "]/td[5]");
	}
	
	public By getLastClickCostCell(int clickNumber) {
		return By.xpath("//tr[" + (clickNumber + 1) + "]/td[6]");
	}
	
	public By getLastClickMonCalcCell(int clickNumber) {
		return By.xpath("//tr[" + (clickNumber + 1) + "]/td[10]");
	}
}
