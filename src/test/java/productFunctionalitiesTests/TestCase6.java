package productFunctionalitiesTests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ProductsPage;
import pages.UserPage;
import sharedData.SharedData;

public class TestCase6 extends SharedData {

    @Test
    public void testMethod() {

        IndexPage indexPage = new IndexPage(driver);
        UserPage userPage = new UserPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        String userValue = "standard_user";
        String passwordValue = "secret_sauce";

        userPage.fillUser(userValue);
        userPage.fillPassword(passwordValue);
        userPage.loginUser();
        userPage.isErrorMessageDisplayed();

        productsPage.addToCartBackpack();
        productsPage.addToCartBikeLight();
        productsPage.addToCartBoltTshirt();
        productsPage.addToCartFleeceJacket();
        productsPage.addToCartOnesie();
        productsPage.addToCartRedTshirt();

        indexPage.enterOnShoppingCart();
        indexPage.enterOnContinueShoppingButton();

        productsPage.removeBackpack();
        productsPage.removeBikeLight();
        productsPage.removeBoltTshirt();
        productsPage.removeFleeceJacket();
        productsPage.removeOnesie();
        productsPage.removeRedTshirt();
    }
}
