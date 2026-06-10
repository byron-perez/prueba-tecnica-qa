package starter.demoblaze.pageobjects;

import org.openqa.selenium.By;

public class HomePage {
    public static By productLink(String productName) {
        return By.linkText(productName);
    }
    public static final By CART_LINK = By.id("cartur");
}
