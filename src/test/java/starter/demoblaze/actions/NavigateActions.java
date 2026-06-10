package starter.demoblaze.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import starter.demoblaze.pageobjects.HomePage;

public class NavigateActions extends UIInteractions {

    @Step("Navigate to Demoblaze home page")
    public void toTheHomePage() {
        openUrl("https://www.demoblaze.com/");
    }

    @Step("Navigate to the Cart page")
    public void toTheCartPage() {
        $(HomePage.CART_LINK).click();
    }
}
