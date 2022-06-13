package ua.price.mobile.pages;

import ua.price.mobile.objects.CatalogFirm2533ModelCardBid;
import ua.price.mobile.objects.CatalogFirm2533ModelCardGoSite;
import ua.price.mobile.objects.FilterPrice;
import ua.price.mobile.objects.FirmInfoTabs;
import ua.price.mobile.objects.HjRemoteVarsFrame;

public class CatalogFirm2533Page extends PageBase {
	public static String url = "/firm2533p1.html";
	private FilterPrice filterPrice;
	private HjRemoteVarsFrame hjRemoteVarsFrame;
	private CatalogFirm2533ModelCardGoSite cardGoSite;
	private CatalogFirm2533ModelCardBid cardBid;
	private FirmInfoTabs firmInfoTab;
		
	public CatalogFirm2533Page() {
		filterPrice = new FilterPrice(); 
		cardGoSite = new CatalogFirm2533ModelCardGoSite();
		cardBid = new CatalogFirm2533ModelCardBid();
		firmInfoTab = new FirmInfoTabs();
		hjRemoteVarsFrame = new HjRemoteVarsFrame();
	}
	
	public FilterPrice getFilterPrice() {
		return filterPrice;
	}
	
	public HjRemoteVarsFrame getHjRemoteVarsFrame() {
		return hjRemoteVarsFrame;
	}
	
	public CatalogFirm2533ModelCardGoSite getCatalogFirm2533ModelCardGoSite() {
		return cardGoSite;
	}
	
	public CatalogFirm2533ModelCardBid getCatalogFirm2533ModelCardBid() {
		return cardBid;
	}
	
	public FirmInfoTabs getFirmInfoTabs() {
		return firmInfoTab;
	}
}
