package ua.price.desktop.pages;

import ua.price.desktop.objects.PriceLineHasSaleModelPage;
import ua.price.desktop.objects.RateStar;

public class ModelInSaleHasSalePricesTabPage extends PageBase {
	public static String url = "/drugie_chernoe_taro_78_kart_9785904844585/prices/3465523.html";
	
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
