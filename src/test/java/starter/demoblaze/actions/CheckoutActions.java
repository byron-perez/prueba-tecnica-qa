package starter.demoblaze.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import starter.demoblaze.pageobjects.CheckoutModal;
import starter.demoblaze.pageobjects.ConfirmationModal;

public class CheckoutActions extends UIInteractions {

    @Step("Fill out the checkout form with valid data")
    public void fillOutCheckoutForm(String name, String country, String city, String card, String month, String year) {
        $(CheckoutModal.NAME_INPUT).sendKeys(name);
        $(CheckoutModal.COUNTRY_INPUT).sendKeys(country);
        $(CheckoutModal.CITY_INPUT).sendKeys(city);
        $(CheckoutModal.CREDIT_CARD_INPUT).sendKeys(card);
        $(CheckoutModal.MONTH_INPUT).sendKeys(month);
        $(CheckoutModal.YEAR_INPUT).sendKeys(year);
    }

    @Step("Confirm the purchase")
    public void confirmPurchase() {
        $(CheckoutModal.PURCHASE_BUTTON).click();
    }

    @Step("Finish the purchase by clicking OK on the confirmation modal")
    public void finishPurchase() {
        $(ConfirmationModal.OK_BUTTON).click();
    }
}
