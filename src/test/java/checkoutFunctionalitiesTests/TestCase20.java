package checkoutFunctionalitiesTests;

import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.IndexPage;
import pages.ProductsPage;
import pages.UserPage;
import sharedData.SharedData;

public class TestCase20 extends SharedData {

    @Test
    public void testMethod() {

        UserPage userPage = new UserPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        IndexPage indexPage = new IndexPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        String userValue = "standard_user";
        String passwordValue = "secret_sauce";
        String firstNameValue = "@";
        String lastNameValue = "]";
        String postalCodeValue = "%$";

        userPage.fillUser(userValue);
        userPage.fillPassword(passwordValue);
        userPage.loginUser();
        userPage.isErrorMessageDisplayed();

        productsPage.addToCartBackpack();
        productsPage.addToCartFleeceJacket();

        indexPage.enterOnShoppingCart();
        indexPage.enterOnCheckoutButton();

        checkoutPage.fillFirstNameElement(firstNameValue);
        checkoutPage.fillLastNameElement(lastNameValue);
        checkoutPage.postalCodeElement(postalCodeValue);

        indexPage.enterOnContinueCheckoutInformationButton();

        userPage.isErrorMessageDisplayed();

    }
}
