package locators;

import org.openqa.selenium.By;

public class ProductsLocators {

    public static final By cartButtonBackpack = By.id("add-to-cart-sauce-labs-backpack");
    public static final By cartButtonBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    public static final By cartButtonBoltTshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public static final By cartButtonFleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    public static final By cartButtonOnesie = By.id("add-to-cart-sauce-labs-onesie");
    public static final By cartButtonRedTshirt = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public static final By removeButtonBackpack = By.id("remove-sauce-labs-backpack");
    public static final By removeButtonBikeLight = By.id("remove-sauce-labs-bike-light");
    public static final By removeButtonBoltTshirt = By.id("remove-sauce-labs-bolt-t-shirt");
    public static final By removeButtonFleeceJacket = By.id("remove-sauce-labs-fleece-jacket");
    public static final By removeButtonOnesie = By.id("remove-sauce-labs-onesie");
    public static final By removeButtonRedTshirt = By.id("remove-test.allthethings()-t-shirt-(red)");

    public static final By sortOptionsList = By.xpath("//select[@class='product_sort_container']/option");
    public static final By sortOptionsButton = By.xpath("//select[@class='product_sort_container']");

    public static final By backpackProduct = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
    public static final By bikelightProduct = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");
    public static final By boltTshirtProduct = By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']");
    public static final By fleeceJacketProduct = By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']");
    public static final By onesieProduct = By.xpath("//div[normalize-space()='Sauce Labs Onesie']");
    public static final By redTshirtProduct = By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']");

    public static final By addToCartFromProduct = By.id("add-to-cart");

    public static final By itemProductOnCart = By.xpath("//div[@class='inventory_item_name']");
}

