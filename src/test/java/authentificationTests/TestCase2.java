package authentificationTests;

import org.testng.annotations.Test;
import pages.UserPage;
import sharedData.SharedData;

public class TestCase2 extends SharedData {

    @Test
    public void testMethod() {

        UserPage userPage = new UserPage(driver);

        String userValue = "user";
        String passwordValue = "";

        userPage.fillUser(userValue);
        userPage.fillPassword(passwordValue);
        userPage.loginUser();
        userPage.isErrorMessageDisplayed();

    }
}
