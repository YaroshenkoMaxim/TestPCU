package ua.price.tests;

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
		//.closeAnonser()
		//.closeFoundMistakeAlert()
		.clickShowPhoneButton().checkClickInTable();
		app.getModelInSaleHasSalePricesTabHelper().openPage()
										.clickShowPhoneButton().checkClickInTable();
	}
	
	/*@Test
	public void testClickType8() {
		app.getDiscountedFirm2533DesktopPriceUaHelper().openPage()
										.clickToShopButton().checkClickInTable()
										.clickToShopButton().checkClickInTable();
	*/
	
	@Test
	public void testClickType9() {
		app.getCatalogFirmHubberHelper().openPage()
		//.closeAnonser()
		//.closeFoundMistakeAlert()
		.clickHubber().closeHubberPopUp().checkClickInTable()
		.openPage().clickHubber().closeHubberPopUp().checkClickInTable()
		.openPage().clickHubber().closeHubberPopUp().checkClickInTable();
	}
	
	//@Test
	public void testClicksDesktopPriceUa() {
		//app.getCatalogFirm2533Helper().openPage().changeRegionTo("��� ������")
		app.getCatalogFirm2533Helper().openPage().changeRegionToAllUkraine()
										.closeAnonser()
										.closeFoundMistakeAlert()
										.clickGoSite().closeOutclickPopUp().checkClickInTable()
										.clickGoSite().closeOutclickPopUp().checkClickInTable()
										.clickBid().closeOutclickPopUp().checkClickInTable()
										.clickBid().closeOutclickPopUp().checkClickInTable()
										.scrollToFirmInfo()
										.clickFirmInfo().checkClickInTable()
										.clickFirmInfo().checkClickInTable();
		
		//app.getKNU5076Helper().openPage().changeRegionTo("��� ������")
		app.getKNU5076Helper().openPage().changeRegionToAllUkraine()
										.clickContextFirm2533().closeOutclickPopUp().checkClickInTable()
										.clickContextFirm2533().closeOutclickPopUp().checkClickInTable();
		/*
		app.getSalesFirm2533DesktopPriceUaHelper().openPage()
										.clickToShopButton().checkClickInTable()
										.clickToShopButton().checkClickInTable()
										.clickShowPhoneButton().checkClickInTable();
		app.getSalesFirm2533DesktopPriceUaHelper().openPage()
										.clickShowPhoneButton().checkClickInTable();
			
		app.getDiscountedFirm2533DesktopPriceUaHelper().openPage()
										.clickToShopButton().checkClickInTable()
										.clickToShopButton().checkClickInTable();
		
		app.getCatalogFirmHubberDesktopPriceUaHelper().openPage()
										.clickHubber().closeHubberPopUp().checkClickInTable()
										.openPage().clickHubber().closeHubberPopUp().checkClickInTable();*/
		
		/*app.getNavigationHelper().openCatalogFirm2533PageDesktopPriceUa()
								.getHeader().changeRegionTo("��� �������")
								.clickGoSite().closeMainGateTabAndSwitchToOldTab().getOutclickPopUp().closeOutclickPopUp()
								.clickGoSite().closeMainGateTabAndSwitchToOldTab().getOutclickPopUp().closeOutclickPopUp()
								.clickBid().closeMainGateTabAndSwitchToOldTab().getOutclickPopUp().closeOutclickPopUp()
								.clickBid().closeMainGateTabAndSwitchToOldTab().getOutclickPopUp().closeOutclickPopUp()
								.scrollToFirmInfo().clickFirmInfo().ensurePageLoaded()
								.clickFirmInfo().ensurePageLoaded();
		
		app.getNavigationHelper().openKNU5076DesktopPriceUa()
								.getHeader().changeRegionTo("��� �������")
								.getContext().clickContextFirm2533().closeMainGateTabAndSwitchToOldTab().getOutclickPopUp().closeOutclickPopUp()
								.getContext().clickContextFirm2533().closeMainGateTabAndSwitchToOldTab().getOutclickPopUp().closeOutclickPopUp();
		
		app.getNavigationHelper().openSalesFirm2533PageDesktopPriceUa()
								.getSaleCard().clickToShopButton().closeMainGateTabAndSwitchToOldTab()
								.getSaleCard().clickToShopButton().closeMainGateTabAndSwitchToOldTab()
								.getSaleCard().clickShowPhoneButton();
		app.getNavigationHelper().openSalesFirm2533PageDesktopPriceUa()
								.getSaleCard().clickShowPhoneButton();
		
		app.getNavigationHelper().openDiscountedFirm2533PageDesktopPriceUa()
								.getDiscountedCard().clickToShopButton().closeMainGateTabAndSwitchToOldTab()
								.getDiscountedCard().clickToShopButton().closeMainGateTabAndSwitchToOldTab();
		
		app.getNavigationHelper().openCatalogFirmHubberPageDesktopPriceUa()
								.clickHubber().closeHubberPopUp();	
		app.getNavigationHelper().openCatalogFirmHubberPageDesktopPriceUa()
								.clickHubber().closeHubberPopUp();*/
	}
}
