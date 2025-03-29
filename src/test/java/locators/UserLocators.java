package locators;

import org.openqa.selenium.By;

public class UserLocators {

    public static final By userElement = By.id("user-name");
    public static final By passwordElement = By.id("password");
    public static final By errorElement = By.xpath("//h3[@data-test='error']");
    public static final By loginElement = By.id("login-button");
    public static final By logoutElement = By.id("logout_sidebar_link");
}
