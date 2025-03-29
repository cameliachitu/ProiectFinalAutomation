package locators;

import org.openqa.selenium.By;

public class IndexLocators {

    public static final By menuElement = By.id("react-burger-menu-btn");
    public static final By shoppingCartElement = By.xpath("//a[@class='shopping_cart_link']");
    public static final By inventoryItemNameElement = By.id("inventory_item_name");
    public static final By inventoryItemPriceElement = By.id("inventory_item_price");
    public static final By continueShoppingButton = By.id("continue-shopping");
    public static final By backToProductsButton = By.id("back-to-products");
    public static final By checkoutButton = By.id("checkout");
    public static final By continueCheckoutInformationButton = By.id("continue");
    public static final By finishCheckoutButton = By.id("finish");
    public static final By confirmationOrderElement = By.id("checkout_complete_container");

}
