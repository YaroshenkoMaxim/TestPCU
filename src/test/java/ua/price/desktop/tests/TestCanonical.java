package ua.price.desktop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCanonical extends TestBase {
	@Test
	public void testCanonical() {
		String canonicalCurrent = app.getModelInSaleHasReviewOpisanieTabHelper().openPage().changeRegionToAllUkraine().getCanonicalCurrent();//.changeRegionTo("Вся Україна").getCanonicalCurrent();
		String canonicalAllUkraine = app.getModelInSaleHasReviewOpisanieTabHelper().getCanonicalAllUkraine();
		Assert.assertEquals(canonicalAllUkraine, canonicalCurrent);
		System.out.println("Вся Украина   " + canonicalAllUkraine + "   " + canonicalCurrent);
		
		canonicalCurrent = app.getModelInSaleHasReviewOpisanieTabHelper().openPage().changeRegionToKyiv().getCanonicalCurrent();  //.changeRegionTo("Київ").getCanonicalCurrent();
		String canonicalKiev = app.getModelInSaleHasReviewOpisanieTabHelper().getCanonicalKiev();
		
		Assert.assertEquals(canonicalKiev, canonicalCurrent);
		System.out.println("Киев      " + canonicalKiev + "   " + canonicalCurrent);
		
		
		
		canonicalCurrent = app.getModelInSaleHasReviewPricesTabHelper().openPage().changeRegionToAllUkraine().getCanonicalCurrent();    //.changeRegionTo("Вся Україна").getCanonicalCurrent();
		canonicalAllUkraine = app.getModelInSaleHasReviewPricesTabHelper().getCanonicalAllUkraine();
		Assert.assertEquals(canonicalAllUkraine, canonicalCurrent);
		System.out.println("Вся Украина   " + canonicalAllUkraine + "   " + canonicalCurrent);
		
		canonicalCurrent = app.getModelInSaleHasReviewPricesTabHelper().changeRegionToKyiv().getCanonicalCurrent();     //.changeRegionTo("Київ").getCanonicalCurrent();
		canonicalKiev = app.getModelInSaleHasReviewPricesTabHelper().getCanonicalKiev();
		
		Assert.assertEquals(canonicalKiev, canonicalCurrent);
		System.out.println("Киев      " + canonicalKiev + "   " + canonicalCurrent);
		
		
		
		canonicalCurrent = app.getModelArchiveHasReviewOpisanieTabHelper().openPage().changeRegionToAllUkraine().getCanonicalCurrent();    //.changeRegionTo("Вся Україна").getCanonicalCurrent();
		canonicalAllUkraine = app.getModelArchiveHasReviewOpisanieTabHelper().getCanonicalAllUkraine();
		Assert.assertEquals(canonicalAllUkraine, canonicalCurrent);
		System.out.println("Вся Украина   " + canonicalAllUkraine + "   " + canonicalCurrent);
		
		canonicalCurrent = app.getModelArchiveHasReviewOpisanieTabHelper().changeRegionToKyiv().getCanonicalCurrent();     //.changeRegionTo("Київ").getCanonicalCurrent();
		canonicalKiev = app.getModelArchiveHasReviewOpisanieTabHelper().getCanonicalKiev();
		
		Assert.assertEquals(canonicalKiev, canonicalCurrent);
		System.out.println("Киев      " + canonicalKiev + "   " + canonicalCurrent);
		
		
		
		canonicalCurrent = app.getModelArchiveHasReviewPricesTabHelper().openPage().changeRegionToAllUkraine().getCanonicalCurrent();    //.changeRegionTo("Вся Україна").getCanonicalCurrent();
		canonicalAllUkraine = app.getModelArchiveHasReviewPricesTabHelper().getCanonicalAllUkraine();
		Assert.assertEquals(canonicalAllUkraine, canonicalCurrent);
		System.out.println("Вся Украина   " + canonicalAllUkraine + "   " + canonicalCurrent);
		
		canonicalCurrent = app.getModelArchiveHasReviewPricesTabHelper().changeRegionToKyiv().getCanonicalCurrent();   //.changeRegionTo("Київ").getCanonicalCurrent();
		canonicalKiev = app.getModelArchiveHasReviewPricesTabHelper().getCanonicalKiev();
		
		Assert.assertEquals(canonicalKiev, canonicalCurrent);
		System.out.println("Киев      " + canonicalKiev + "   " + canonicalCurrent);
		
		/*
		app.getNavigationHelper().openModelPageInSaleHasReviewOpisanieTabDesktopPriceUa().compareCanonicals();
		
		app.getNavigationHelper().openModelPageInSaleHasReviewPricesTabDesktopPriceUa().compareCanonicals();
		
		app.getNavigationHelper().openModelPageArchiveHasReviewOpisanieTabDesktopPriceUa().compareCanonicals();
		
		app.getNavigationHelper().openModelPageArchiveHasReviewPricesTabDesktopPriceUa().compareCanonicals();
		*/
	}
}
