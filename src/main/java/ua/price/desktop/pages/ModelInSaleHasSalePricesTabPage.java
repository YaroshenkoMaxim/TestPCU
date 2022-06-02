package ua.price.desktop.pages;

import ua.price.desktop.objects.PriceLineHasSaleModelPage;
import ua.price.desktop.objects.RateStar;

public class ModelInSaleHasSalePricesTabPage extends PageBase {
	public static String url = "/drugie_bej-begi_istorija_anglijskogo_futbola_9789662320121/skidki/3465832.html";
	
	private RateStar rateStar;
	private PriceLineHasSaleModelPage priceLineHasSaleModelPage;
	
	public ModelInSaleHasSalePricesTabPage() {
		rateStar = new RateStar();
		priceLineHasSaleModelPage = new PriceLineHasSaleModelPage(); 
	}
	
	public RateStar getRateStar() {
		return rateStar;
	}
	
	public PriceLineHasSaleModelPage getPriceLineHasSaleModelPage() {
		return priceLineHasSaleModelPage;
	}
}
