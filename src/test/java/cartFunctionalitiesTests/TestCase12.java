package cartFunctionalitiesTests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ProductsPage;
import pages.UserPage;
import sharedData.SharedData;

public class TestCase12 extends SharedData {

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
        productsPage.removeBackpack();
        indexPage.enterOnContinueShoppingButton();

        productsPage.addToCartBikeLight();
        indexPage.enterOnShoppingCart();
        productsPage.removeBikeLight();
        indexPage.enterOnContinueShoppingButton();

        productsPage.addToCartBoltTshirt();
        indexPage.enterOnShoppingCart();
        productsPage.removeBoltTshirt();
        indexPage.enterOnContinueShoppingButton();

        productsPage.addToCartFleeceJacket();
        indexPage.enterOnShoppingCart();
        productsPage.removeFleeceJacket();
        indexPage.enterOnContinueShoppingButton();

        productsPage.addToCartOnesie();
        indexPage.enterOnShoppingCart();
        productsPage.removeOnesie();
        indexPage.enterOnContinueShoppingButton();

        productsPage.addToCartRedTshirt();
        indexPage.enterOnShoppingCart();
        productsPage.removeRedTshirt();
    }
}
