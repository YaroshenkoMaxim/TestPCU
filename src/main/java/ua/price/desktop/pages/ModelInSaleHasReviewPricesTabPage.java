package ua.price.desktop.pages;

import ua.price.desktop.objects.PriceLineModelPage;
import ua.price.desktop.objects.RateStar;

public class ModelInSaleHasReviewPricesTabPage extends PageBase {
	public static String url = "/drugie_bej-begi_istorija_anglijskogo_futbola_9789662320121/prices/3465832.html";
	private static String canonicalAllUkraine = "/drugie/drugie_bej-begi_istorija_anglijskogo_futbola_9789662320121/catc5076m3465832.html"; // All Ukraine
	private static String canonicalKiev = "/drugie/drugie_bej-begi_istorija_anglijskogo_futbola_9789662320121/catc5076m3465832.html"; // All Ukraine
	
	private RateStar rateStar;
	private PriceLineModelPage priceLineModelPage;
	
	public ModelInSaleHasReviewPricesTabPage() {
		rateStar = new RateStar();
		priceLineModelPage = new PriceLineModelPage();
	}

	public RateStar getRateStar() {
		return rateStar;
	}
	
	public PriceLineModelPage getPriceLineModelPage() {
		return priceLineModelPage;
	}
	
	public String getCanonicalAllUkraine() {
		return canonicalAllUkraine;
	}
	
	public String getCanonicalKiev() {
		return canonicalKiev;
	}
}
