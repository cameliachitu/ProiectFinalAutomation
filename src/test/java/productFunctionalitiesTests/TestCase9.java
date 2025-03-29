package productFunctionalitiesTests;

import org.testng.annotations.Test;
import pages.ProductsPage;
import pages.UserPage;
import sharedData.SharedData;

public class TestCase9 extends SharedData {

    @Test
    public void testMethod() {

        UserPage userPage = new UserPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        String userValue = "standard_user";
        String passwordValue = "secret_sauce";
        String optionsValue = "Name (A to Z)";

        userPage.fillUser(userValue);
        userPage.fillPassword(passwordValue);
        userPage.loginUser();
        userPage.isErrorMessageDisplayed();

        productsPage.enterOnSortOptionsButton();
        productsPage.selectSortOptionsList(optionsValue);
    }
}
