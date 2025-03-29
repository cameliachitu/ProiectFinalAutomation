package locators;

import org.openqa.selenium.By;

public class CheckoutLocators {

    public static final By firstNameElement = By.id("first-name");
    public static final By lastNameElement = By.id("last-name");
    public static final By postalCodeElement = By.id("postal-code");


    public static final By productPriceElement = By.xpath("//div[@class='item_pricebar']");
    public static final By taxElement = By.xpath("//div[@class='summary_tax_label']");
    public static final By costTotalElement = By.xpath("//div[@class='summary_total_label']");
}
