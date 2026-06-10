package starter.demoblaze.pageobjects;

import org.openqa.selenium.By;

public class CheckoutModal {
    public static final By NAME_INPUT = By.id("name");
    public static final By COUNTRY_INPUT = By.id("country");
    public static final By CITY_INPUT = By.id("city");
    public static final By CREDIT_CARD_INPUT = By.id("card");
    public static final By MONTH_INPUT = By.id("month");
    public static final By YEAR_INPUT = By.id("year");
    public static final By PURCHASE_BUTTON = By.xpath("//button[text()='Purchase']");
}
