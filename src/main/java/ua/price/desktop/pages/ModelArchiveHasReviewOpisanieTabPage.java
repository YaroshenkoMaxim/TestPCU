package ua.price.desktop.pages;

import ua.price.desktop.objects.RateStar;

public class ModelArchiveHasReviewOpisanieTabPage extends PageBase {
	public static String url = "/nokia/nokia_5210/catc52m5.html";
	private static String canonicalAllUkraine = "No";
	private static String canonicalKiev = "/nokia/nokia_5210/catc52m5.html";
	
	private RateStar rateStar;
	
	public ModelArchiveHasReviewOpisanieTabPage() {
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
