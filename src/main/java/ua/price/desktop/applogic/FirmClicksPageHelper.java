package ua.price.desktop.applogic;

import java.time.LocalDate;

import org.testng.Assert;

import ua.price.desktop.pages.FirmClicksPage;
import ua.price.util.Firm2533;
import ua.price.util.Firm79503;

public class FirmClicksPageHelper extends BaseHelper {
	private FirmClicksPage page;
	private int click_type = 0;
	private int click_id = 0;
	private int click_count_for_new_type = 0;
	private String handle;
	private int same_type_click_number = 0;
	
	public FirmClicksPageHelper(ApplicationManager app) {
		super(app);
		page = new FirmClicksPage();
	}
	
	public FirmClicksPageHelper openPage(int firm_id) {
		
		
		//int year = 2021;
		//int month = 02;
		//int day = 15;
		
		//System.out.println(LocalDate.now());
		
		//http://web5.release.price.ua/clicks.php?firm_id=2533&date=2021-02-15&offset=0&limit=100&model_id=0
		//?firm_id=2533&date=2021-02-15&offset=0&limit=10&model_id=0";
		//String getParameters = String.format("?firm_id=%d&date=%d-%02d-%d&offset=0&limit=100&model_id=0", firm_id, year, month, day);
		String getParameters = String.format("?firm_id=%d&date=%s&offset=0&limit=100&model_id=0", firm_id, LocalDate.now());
		
		driver.get(baseClicksUrl + FirmClicksPage.url + getParameters);
		handle = driver.getWindowHandle();
		System.out.println(this.getClass().getName() + "   " + driver.getWindowHandle());
		
		return this;
	}
	
	public void checkLastClickFirm2533(int click_type) {
		int click_id = Integer.parseInt(driver.findElement(page.getLastClickIdCell(1)).getText());
		double clickCostFromTable = Double.parseDouble(driver.findElement(page.getLastClickCostCell(1)).getText());
		int clickMonCalcFromTable = Integer.parseInt(driver.findElement(page.getLastClickMonCalcCell(1)).getText());
		double clickCostEtalon = 0.0;
		int clickMonCalcEtalon = 0;
		
		//click_count_for_new_type++;
		
		System.out.println("click_type: " + click_type + " this.click_type: " + this.click_type);
		
		switch (click_type) {
			case 1:
				clickCostEtalon = Firm2533.getGoSiteCost();
				break;
			case 2:
				clickCostEtalon = Firm2533.getBidCost();
				break;
			case 3:
				clickCostEtalon = Firm2533.getFirmInfoCost();
				break;
			case 4:
				clickCostEtalon = Firm2533.getContextCost();
				break;
			case 5:
				clickCostEtalon = Firm2533.getSaleCost();
				break;
			case 6:
				clickCostEtalon = Firm2533.getShowPhoneCost();
				break;
			case 8:
				clickCostEtalon = Firm2533.getDiscountedCost();
		}
		
		if (click_type != this.click_type)// && (click_count_for_new_type == 1))// || click_count_for_new_type == 2))
			clickMonCalcEtalon = 1;
			
		try {
			System.out.println(click_id + ">" + this.click_id);
			Assert.assertTrue(click_id > this.click_id);
			System.out.println(clickCostFromTable + "==" + clickCostEtalon);
			Assert.assertTrue(clickCostFromTable == clickCostEtalon);
			System.out.println(clickMonCalcFromTable + "==" + clickMonCalcEtalon);
			Assert.assertTrue(clickMonCalcFromTable == clickMonCalcEtalon);
			this.click_id = click_id;
			System.out.println(click_id + "   " + click_type + "   " + clickCostFromTable + " == " + clickCostEtalon + "   " + clickMonCalcFromTable);
		}
		catch (AssertionError e) {
			System.out.println("\nError!");
			System.out.println(click_id + "   " + click_type + "   " + clickCostFromTable + " == " + clickCostEtalon + "   " + clickMonCalcFromTable);
			openPage(2533).checkLastClickFirm2533(click_type);
		}
		
		//if (click_type != this.click_type)
			//click_count_for_new_type = 0;
		
		this.click_type = click_type;
	}
	
	public void checkLastClickFirm79503(int click_type) {
		int click_id = Integer.parseInt(driver.findElement(page.getLastClickIdCell(1)).getText());
		double clickCostFromTable = Double.parseDouble(driver.findElement(page.getLastClickCostCell(1)).getText());
		int clickMonCalcFromTable = Integer.parseInt(driver.findElement(page.getLastClickMonCalcCell(1)).getText());
		double clickCostEtalon = 0.0;
		int clickMonCalcEtalon = 0;
		
		
		
		switch (click_type) {
			case 9:
				clickCostEtalon = Firm79503.getHubberCost();
		}
		
		if (click_type != this.click_type) {
			clickMonCalcEtalon = 1;
			same_type_click_number = 1;
		}
		
		if (same_type_click_number == 1 || same_type_click_number == 2)
			clickMonCalcEtalon = 1;
				
		try {
			System.out.println(click_id + ">" + this.click_id);
			Assert.assertTrue(click_id > this.click_id);
			System.out.println(clickCostFromTable + "==" + clickCostEtalon);
			System.out.println(clickMonCalcFromTable + "==" + clickMonCalcEtalon);
			Assert.assertTrue(clickCostFromTable == clickCostEtalon);
			Assert.assertTrue(clickMonCalcFromTable == clickMonCalcEtalon);
			this.click_id = click_id;
			System.out.println(click_id + "   " + click_type + "   " + clickCostFromTable + " == " + clickCostEtalon + "   " + clickMonCalcFromTable);
		}
		catch (AssertionError e) {
			openPage(79503).checkLastClickFirm79503(click_type);
			System.out.println("\nError!");
			System.out.println(click_id + "   " + click_type + "   " + clickCostFromTable + " == " + clickCostEtalon + "   " + clickMonCalcFromTable);
		}
		
		this.click_type = click_type;
		
		same_type_click_number++;
	}	
	
	/*public void processClicks() {
		
		
		
		for (int clickNumber = 2; clickNumber > 0; clickNumber--) {
			int click_id = Integer.parseInt(driver.findElement(page.getLastClickIdCell(clickNumber)).getText());
			double clickCostFromTable = Double.parseDouble(driver.findElement(page.getLastClickCostCell(clickNumber)).getText());
			int clickMonCalcFromTable = Integer.parseInt(driver.findElement(page.getLastClickMonCalcCell(clickNumber)).getText());
			
			//System.out.println(click_id + "   " + click_type + "   " + clickCostFromTable + " == " + clickCostEtalon + "   " + clickMonCalcFromTable);
		}
	}*/
	
	public String getHandle() {
		return handle;
	}
}
