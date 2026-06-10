package starter.demoblaze;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.demoblaze.actions.CartActions;
import starter.demoblaze.actions.CheckoutActions;
import starter.demoblaze.actions.NavigateActions;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenPurchasingProductsTest {

    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    NavigateActions navigate;
    CartActions cart;
    CheckoutActions checkout;

    @Test
    void userShouldBeAbleToPurchaseProductsSuccessfully() {
        // 1. Agregar dos productos al carrito
        navigate.toTheHomePage();
        cart.addProductToCart("Iphone 6 32gb");
        
        navigate.toTheHomePage();
        cart.addProductToCart("Sony vaio i7");

        // 2. Visualizar el carrito
        navigate.toTheCartPage();
        Serenity.reportThat("The cart should contain 2 items",
                () -> assertThat(cart.countItemsInCart()).isGreaterThanOrEqualTo(2));

        // 3. Completar el formulario de compra
        cart.initiateCheckout();
        checkout.fillOutCheckoutForm("Byron Perez", "Ecuador", "Quito", "1234567890123456", "12", "2025");

        // 4. Finalizar la compra
        checkout.confirmPurchase();
        checkout.finishPurchase();
    }
}
