package ua.price.desktop.pages;

import ua.price.desktop.objects.ContextKNU5076;

public class KNU5076Page extends PageBase {
	public static String url = "/catalog5076.html";
	private static int cardsCount = 40;
	
	private ContextKNU5076 context;
	
	public KNU5076Page() {
		context = new ContextKNU5076();
	}
	
	public ContextKNU5076 getContextKNU5076() {
		return context;
	}
	
	public int getCardsCount() {
		return cardsCount;
	}
}
