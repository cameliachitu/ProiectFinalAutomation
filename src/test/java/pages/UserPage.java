package pages;

import helpMethods.ElementHelper;
import locators.UserLocators;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static locators.UserLocators.*;

public class UserPage {

    public WebDriver driver;
    public ElementHelper elementHelper;

    public UserPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void fillUser(String userValue){
        elementHelper.fillLocator(userElement, userValue);
        LoggerUtility.infoTest("The user fills the user field");
    }

    public void fillPassword(String passwordValue){
        elementHelper.fillLocator(passwordElement, passwordValue);
        LoggerUtility.infoTest("The user fills the password field");
    }

    public void loginUser(){
        elementHelper.clickJSLocator(UserLocators.loginElement);
        LoggerUtility.infoTest("The user clicks on the login button");
    }

    public void logoutUser(){
        elementHelper.clickJSLocator(UserLocators.logoutElement);
        LoggerUtility.infoTest("The user clicks on the logout button");
    }

    public void isErrorMessageDisplayed() {
        try {
            WebElement errorMessageElement = driver.findElement(errorElement);
            if (errorMessageElement.isDisplayed()) {
                String errorMessage = errorMessageElement.getText();
                LoggerUtility.infoTest("Error message detected on the page: " + errorMessage);
            }
        } catch (NoSuchElementException e) {
            LoggerUtility.infoTest("There is no error message on the page");
        }

}
}


