package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static locators.CheckoutLocators.*;

public class CheckoutPage {

    public WebDriver driver;
    public ElementHelper elementHelper;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void fillFirstNameElement(String firstNameValue) {
        elementHelper.fillLocator(firstNameElement, firstNameValue);
    }

    public void fillLastNameElement(String lastNameValue) {
        elementHelper.fillLocator(lastNameElement, lastNameValue);
    }

    public void postalCodeElement(String postalCodeValue) {
        elementHelper.fillLocator(postalCodeElement, postalCodeValue);
    }

    public void verifyCheckoutTotal() {

        // Extrage toate prețurile produselor
        List<WebElement> productPriceElements = driver.findElements(productPriceElement);
        double totalProductPrice = 0.0;

        for (WebElement priceElement : productPriceElements) {
            String priceText = priceElement.getText().replaceAll("[^0-9.]", "");
            totalProductPrice += Double.parseDouble(priceText);
        }

        // Extrage taxele
        String taxText = driver.findElement(taxElement).getText();
        double tax = Double.parseDouble(taxText.replaceAll("[^0-9.]", ""));

        // Calculează totalul așteptat
        double expectedTotal = totalProductPrice + tax;

        // Extrage totalul afișat pe pagină
        String displayedTotalText = driver.findElement(costTotalElement).getText();
        double displayedTotal = Double.parseDouble(displayedTotalText.replaceAll("[^0-9.]", ""));

        // Log pentru debugging
        LoggerUtility.infoTest("Extracted Product Prices Total: " + totalProductPrice);
        LoggerUtility.infoTest("Extracted Tax: " + tax);
        LoggerUtility.infoTest("Expected Total: " + expectedTotal);
        LoggerUtility.infoTest("Displayed Total: " + displayedTotal);

        // Compară totalul afișat cu totalul calculat
        if (Math.abs(displayedTotal - expectedTotal) > 0.01) {
            LoggerUtility.errorTest("Total cost mismatch! Expected: " + expectedTotal + ", but found: " + displayedTotal);
            Assert.fail("Total cost is incorrect! Expected: " + expectedTotal + ", but found: " + displayedTotal);
        } else {
            LoggerUtility.infoTest("The costs are correct");
        }
    }

}





