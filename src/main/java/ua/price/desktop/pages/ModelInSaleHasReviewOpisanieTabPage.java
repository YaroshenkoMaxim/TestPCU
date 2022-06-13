package ua.price.desktop.pages;

import ua.price.desktop.objects.AdsBanner9;
import ua.price.desktop.objects.ModelReviewPopUp;
import ua.price.desktop.objects.RateStar;

public class ModelInSaleHasReviewOpisanieTabPage extends PageBase {
	public static String url = "/apple/apple_iphone_xr_64gb/catc52m3586058.html";
	private static String canonicalAllUkraine = "No";
	private static String canonicalKiev = "No";
	
	private AdsBanner9 adsBanner9;
	private ModelReviewPopUp modelReviewPopUp; 
	private RateStar rateStar;
	
	public ModelInSaleHasReviewOpisanieTabPage() {
		adsBanner9 = new AdsBanner9();
		modelReviewPopUp = new ModelReviewPopUp();
		rateStar = new RateStar();
	}
	
	public AdsBanner9 getAdsBanner9() {
		return adsBanner9;
	}
	
	public RateStar getRateStar() {
		return rateStar;
	}
	
	public ModelReviewPopUp getModelReviewPopUp() {
		return modelReviewPopUp;
	}
	
	public String getCanonicalAllUkraine() {
		return canonicalAllUkraine;
	}
	
	public String getCanonicalKiev() {
		return canonicalKiev;
	}
}
