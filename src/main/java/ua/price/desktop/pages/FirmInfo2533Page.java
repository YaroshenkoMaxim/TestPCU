package ua.price.desktop.pages;

import ua.price.desktop.objects.Breadcrumbs;
import ua.price.desktop.objects.FirmInfoTabs;

public class FirmInfo2533Page extends PageBase {
	public static String url = "/firm2533.html";
	
	private Breadcrumbs breadcrumbs;
	private FirmInfoTabs firmInfoTab;
	
	public FirmInfo2533Page() {
		breadcrumbs = new Breadcrumbs();
		firmInfoTab = new FirmInfoTabs();
	}
	
	public Breadcrumbs getBreadcrumbs() {
		return breadcrumbs;
	}
	
	public FirmInfoTabs getFirmInfoTabs() {
		return firmInfoTab;
	}
}
