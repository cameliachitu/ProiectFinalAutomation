package pages;

import helpMethods.ElementHelper;
import locators.IndexLocators;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static locators.IndexLocators.*;


public class IndexPage {

    public WebDriver driver;
    public ElementHelper elementHelper;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void enterOnMenuElement() {
        elementHelper.clickJSLocator(IndexLocators.menuElement);
        LoggerUtility.infoTest("The user clicks on shopping page's menu");
    }

    public void verifyProductsAreDisplayed() {
        List<WebElement> products = driver.findElements(By.className("inventory_item"));

        Assert.assertFalse(products.isEmpty(), "!!!!! No products found on the page!!!!!");

        By inventoryItemNameElement = By.className("inventory_item_name");
        By inventoryItemPriceElement = By.className("inventory_item_price");

        for (WebElement product : products) {

            boolean hasTitle = !product.findElements(inventoryItemNameElement).isEmpty();
            boolean hasPrice = !product.findElements(inventoryItemPriceElement).isEmpty();

            if (hasTitle && hasPrice) {
                LoggerUtility.infoTest("The product has a title and a price");
            } else {
                if (!hasTitle) {
                    LoggerUtility.infoTest("!!!!!The product has no title!!!!!");
                }
                if (!hasPrice) {
                    LoggerUtility.infoTest("!!!!!The product has no price!!!!!");
                }
            }
        }
    }

    public void enterOnContinueShoppingButton(){
        elementHelper.clickJSLocator(continueShoppingButton);
        LoggerUtility.infoTest("The user clicks on 'Continue Shopping' button and returns to the main product page");
    }

    public void enterOnShoppingCart(){
        elementHelper.clickJSLocator(IndexLocators.shoppingCartElement);
        LoggerUtility.infoTest("The user clicks on 'Shopping Cart' Button");
        LoggerUtility.infoTest("The user can see the products in the cart");
    }

    public void backToProductsPage(){
        elementHelper.clickLocator(IndexLocators.backToProductsButton);
        LoggerUtility.infoTest("The user clicks on 'Back to products' Button");
    }

    public void enterOnCheckoutButton(){
        elementHelper.clickJSLocator(checkoutButton);
        LoggerUtility.infoTest("The user clicks on 'Checkout' button");
    }

    public void enterOnContinueCheckoutInformationButton(){
        elementHelper.clickJSLocator(continueCheckoutInformationButton);
        LoggerUtility.infoTest("The user clicks on 'Continue' button");
    }

    public void verifyOrder(){
        elementHelper.clickJSLocator(finishCheckoutButton);
        Assert.assertTrue(driver.findElement(confirmationOrderElement).isDisplayed(), "Confirmation message not displayed!");

        LoggerUtility.infoTest("Order completed successfully!");
    }
}
