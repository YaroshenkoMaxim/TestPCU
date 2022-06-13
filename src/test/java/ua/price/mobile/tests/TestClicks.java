package ua.price.mobile.tests;

import org.testng.annotations.Test;

public class TestClicks extends TestBase {
	@Test
	public void testClickType() {
		app.getCatalogFirm2533PageHelper().openPage().changeRegionToAllUkraine()
										.clickGoSite().checkClickInTable()
										.clickGoSite().checkClickInTable();
	}
	
	@Test
	public void testClickType1() {
		app.getCatalogFirm2533PageHelper().openPage().changeRegionToAllUkraine()
										.clickGoSite().checkClickInTable()
										.clickGoSite().checkClickInTable();
	}
	
	@Test
	public void testClickType2() {
		app.getCatalogFirm2533PageHelper().openPage().changeRegionToAllUkraine()
										.srollToBid()
										.clickBid().checkClickInTable()
										.clickBid().checkClickInTable();
	}
	
	//@Test
	public void testClickType3() {
		app.getCatalogFirm2533PageHelper().openPage().changeRegionToAllUkraine()
										.scrollToFirmInfoTabs()
										.clickFirmInfo().checkClickInTable()
										.clickFirmInfo().checkClickInTable();
	}
	
	@Test
	public void testClickType4() {
		app.getKNU5076Helper().openPage().changeRegionToAllUkraine()
							.clickContextFirm2533().checkClickInTable()
							.clickContextFirm2533().checkClickInTable();	
	}
	
	@Test
	public void testClickType5() {
		app.getSalesFirm2533Helper().openPage()
									.clickToShopButton().checkClickInTable()
									.clickToShopButton().checkClickInTable();
		
	}
	
	@Test
	public void testClickType6() {
		app.getSalesFirm2533Helper().openPage()
									.clickShowPhoneButton().checkClickInTable();
		
	}
}
