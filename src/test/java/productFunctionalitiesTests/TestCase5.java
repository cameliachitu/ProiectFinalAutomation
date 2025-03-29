package productFunctionalitiesTests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.UserPage;
import sharedData.SharedData;

public class TestCase5 extends SharedData {

    @Test
    public void testMethod(){

        UserPage userPage = new UserPage(driver);
        IndexPage indexPage = new IndexPage(driver);

        String userValue = "standard_user";
        String passwordValue = "secret_sauce";

        userPage.fillUser(userValue);
        userPage.fillPassword(passwordValue);
        userPage.loginUser();
        userPage.isErrorMessageDisplayed();

        indexPage.verifyProductsAreDisplayed();
    }
}

