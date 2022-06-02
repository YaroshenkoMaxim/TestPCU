package ua.price.desktop.pages;

import ua.price.desktop.objects.AdsBanner15;
import ua.price.desktop.objects.CatalogFirm2533ModelCardBid;
import ua.price.desktop.objects.CatalogFirm2533ModelCardGoSite;
import ua.price.desktop.objects.FilterPrice;
import ua.price.desktop.objects.FirmInfoTabs;
import ua.price.desktop.objects.HjRemoteVarsFrame;
import ua.price.desktop.objects.OutclickPopUp;

public class CatalogFirm2533Page extends PageBase {
	public static String url = "/firm2533p1.html";
	
	private CatalogFirm2533ModelCardGoSite cardGoSite;
	private CatalogFirm2533ModelCardBid cardBid;
	private FirmInfoTabs firmInfoTab;
	private OutclickPopUp outclickPopUpDesktopPriceUa;
	
	public CatalogFirm2533Page() {
		cardGoSite = new CatalogFirm2533ModelCardGoSite();
		cardBid = new CatalogFirm2533ModelCardBid();
		firmInfoTab = new FirmInfoTabs();
		outclickPopUpDesktopPriceUa = new OutclickPopUp();
		
		//header = new HeaderDesktopPriceUa<CatalogFirm2533PageDesktopPriceUa>(driver, this);
	}
	
	public FilterPrice getFilterPrice() {
		return getFilterPrice();
	}
	
	public AdsBanner15 getAdsBanner15() {
		return getAdsBanner15();
	}
	
	public HjRemoteVarsFrame getHjRemoteVarsFrame() {
		return getHjRemoteVarsFrame();
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
	
	public OutclickPopUp getOutclickPopUpDesktopPriceUa() {
		return outclickPopUpDesktopPriceUa;
	}
}
