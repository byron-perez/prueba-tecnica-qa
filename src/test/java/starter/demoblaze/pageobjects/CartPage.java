package starter.demoblaze.pageobjects;

import org.openqa.selenium.By;

public class CartPage {
    public static final By CART_ITEMS = By.xpath("//tbody[@id='tbodyid']//tr");
    public static final By PLACE_ORDER_BUTTON = By.xpath("//button[text()='Place Order']");
}
