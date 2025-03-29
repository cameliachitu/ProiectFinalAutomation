package cartFunctionalitiesTests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ProductsPage;
import pages.UserPage;
import sharedData.SharedData;

public class TestCase15 extends SharedData {

    @Test
    public void testMethod() {

        UserPage userPage = new UserPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        IndexPage indexPage = new IndexPage(driver);

        String userValue = "standard_user";
        String passwordValue = "secret_sauce";

        userPage.fillUser(userValue);
        userPage.fillPassword(passwordValue);
        userPage.loginUser();
        userPage.isErrorMessageDisplayed();

        productsPage.addToCartBackpack();

        indexPage.enterOnShoppingCart();
        indexPage.enterOnContinueShoppingButton();
    }
}
