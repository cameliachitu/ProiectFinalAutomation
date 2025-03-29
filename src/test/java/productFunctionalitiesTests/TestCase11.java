package productFunctionalitiesTests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ProductsPage;
import pages.UserPage;
import sharedData.SharedData;


public class TestCase11 extends SharedData {

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

        productsPage.addToCartFromProductPageBackPack();
        indexPage.backToProductsPage();

        productsPage.addToCartFromProductPageBikeLight();
        indexPage.backToProductsPage();

        productsPage.addToCartFromProductPageBoltTshirt();
        indexPage.backToProductsPage();

        productsPage.addToCartFromProductPageFleeceJacket();
        indexPage.backToProductsPage();

        productsPage.addToCartFromProductPageOnesie();
        indexPage.backToProductsPage();

        productsPage.addToCartFromProductPageRedTshirt();
    }
}
