package ua.price.desktop.pages;

import ua.price.desktop.objects.ModelReviewAddButton;
import ua.price.desktop.objects.ModelReviewPopUp;
import ua.price.desktop.objects.ModelReviewThanksPopUp;
import ua.price.desktop.objects.PriceLineModelPage;

public class ModelInSaleHasReviewOtziviTabPage extends PageBase {
	public static String url = "/sony_xperia_z5/otzivi/1067379.html";

	private ModelReviewPopUp modelReviewPopUp;
	private ModelReviewThanksPopUp modelReviewThanksPopUp;
	private ModelReviewAddButton addModelReviewButton;
	private PriceLineModelPage priceLineModelPage;
	
	public ModelInSaleHasReviewOtziviTabPage() {
		modelReviewPopUp = new ModelReviewPopUp();
		modelReviewThanksPopUp = new ModelReviewThanksPopUp();
		addModelReviewButton = new ModelReviewAddButton();
		priceLineModelPage = new PriceLineModelPage();
	}
	
	public ModelReviewPopUp getModelReviewPopUp() {
		return modelReviewPopUp;
	}
	
	public ModelReviewThanksPopUp getMModelReviewThanksPopUp() {
		return modelReviewThanksPopUp;
	}
	
	public ModelReviewAddButton getAddModelReviewButton() {
		return addModelReviewButton;
	}
	
	public PriceLineModelPage getPriceLinesModelPage() {
		return priceLineModelPage;
	}
}
