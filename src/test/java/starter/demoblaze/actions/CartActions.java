package starter.demoblaze.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import starter.demoblaze.pageobjects.CartPage;
import starter.demoblaze.pageobjects.HomePage;
import starter.demoblaze.pageobjects.ProductPage;

import java.time.Duration;

public class CartActions extends UIInteractions {

    @Step("Add product '{0}' to the cart")
    public void addProductToCart(String productName) {
        $(HomePage.productLink(productName)).click();
        $(ProductPage.ADD_TO_CART_BUTTON).click();
        
        waitFor(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();
    }

    @Step("Count the number of items in the cart")
    public int countItemsInCart() {
        waitFor(ExpectedConditions.numberOfElementsToBeMoreThan(CartPage.CART_ITEMS, 1));
        return findAll(CartPage.CART_ITEMS).size();
    }
    
    @Step("Initiate checkout process")
    public void initiateCheckout() {
        $(CartPage.PLACE_ORDER_BUTTON).click();
    }
}
