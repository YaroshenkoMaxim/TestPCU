package ua.price.desktop.tests;

import org.testng.annotations.Test;

public class TestClicks extends TestBase {
	@Test
	public void testClickType1() {
		app.getCatalogFirm2533Helper().openPage().changeRegionToAllUkraine()
									.closeAnonser()
									.closeFoundMistakeAlert()
									.clickGoSite().closeOutclickPopUp().checkClickInTable()
									.clickGoSite().closeOutclickPopUp().checkClickInTable();
	}
	
	@Test
	public void testClickType2() {
		app.getCatalogFirm2533Helper().openPage().changeRegionToAllUkraine()
									.closeAnonser()
									.clickBid().closeOutclickPopUp().checkClickInTable()
									.clickBid().closeOutclickPopUp().checkClickInTable();
	}
	
	@Test
	public void testClickType3() {
		app.getCatalogFirm2533Helper().openPage().changeRegionToAllUkraine()
									.clickFirmInfo().checkClickInTable()
									.clickFirmInfo().checkClickInTable();
	}

	@Test
	public void testClickType4() {
		app.getKNU5076Helper().openPage().changeRegionToAllUkraine()
							.clickContextFirm2533().closeOutclickPopUp().checkClickInTable()
							.clickContextFirm2533().closeOutclickPopUp().checkClickInTable();
	}
	
	@Test
	public void testClickType6() {
		app.getModelInSaleHasReviewPricesTabHelper().openPage()
												.clickShowPhoneButton().checkClickInTable();
		app.getModelInSaleHasReviewPricesTabHelper().openPage()
												.clickShowPhoneButton().checkClickInTable();
	}
	
	@Test
	public void testClickType8() {
		app.getDiscountedFirm2533DesktopPriceUaHelper().openPage()
													.clickToShopButton().checkClickInTable()
													.clickToShopButton().checkClickInTable();
	}
	
	@Test
	public void testClickType9() {
		app.getCatalogFirmHubberHelper().openPage()
										.clickHubber().closeHubberPopUp().checkClickInTable()
										.openPage().clickHubber().closeHubberPopUp().checkClickInTable()
										.openPage().clickHubber().closeHubberPopUp().checkClickInTable();
	}
}
