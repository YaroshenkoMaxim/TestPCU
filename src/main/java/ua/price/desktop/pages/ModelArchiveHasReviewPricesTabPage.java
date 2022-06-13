package ua.price.desktop.pages;

import ua.price.desktop.objects.RateStar;

public class ModelArchiveHasReviewPricesTabPage extends PageBase {
	public static String url = "/nokia_5210/prices/5.html";
	private static String canonicalAllUkraine = "No";
	private static String canonicalKiev = "No";
	
	private RateStar rateStar;
	
	public ModelArchiveHasReviewPricesTabPage() {
		rateStar = new RateStar();
	}
	
	public RateStar getRateStar() {
		return rateStar;
	}
	
	public String getCanonicalAllUkraine() {
		return canonicalAllUkraine;
	}
	
	public String getCanonicalKiev() {
		return canonicalKiev;
	}
}
