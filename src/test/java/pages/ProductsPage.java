package pages;

import helpMethods.ElementHelper;
import locators.ProductsLocators;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static locators.ProductsLocators.*;

public class ProductsPage {

    public WebDriver driver;
    public ElementHelper elementHelper;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void addToCartBackpack(){
        elementHelper.clickJSLocator(ProductsLocators.cartButtonBackpack);
        LoggerUtility.infoTest("The user adds the Backpack product to shopping cart");
    }
    public void addToCartBikeLight(){
        elementHelper.clickJSLocator(ProductsLocators.cartButtonBikeLight);
        LoggerUtility.infoTest("The user adds the BikeLight product to shopping cart");
    }
    public void addToCartBoltTshirt(){
        elementHelper.clickJSLocator(ProductsLocators.cartButtonBoltTshirt);
        LoggerUtility.infoTest("The user adds the Bolt T-shirt product to shopping cart");
    }
    public void addToCartFleeceJacket(){
        elementHelper.clickJSLocator(ProductsLocators.cartButtonFleeceJacket);
        LoggerUtility.infoTest("The user adds the Fleece Jacket product to shopping cart");
    }
    public void addToCartOnesie(){
        elementHelper.clickJSLocator(ProductsLocators.cartButtonOnesie);
        LoggerUtility.infoTest("The user adds the Onesie product to shopping cart");
    }
    public void addToCartRedTshirt(){
        elementHelper.clickJSLocator(ProductsLocators.cartButtonRedTshirt);
        LoggerUtility.infoTest("The user adds the Red T-shirt product to shopping cart");
    }

    public void removeBackpack(){
        elementHelper.clickJSLocator(ProductsLocators.removeButtonBackpack);
        LoggerUtility.infoTest("The user removes the Backpack product from shopping cart");
    }
    public void removeBikeLight(){
        elementHelper.clickJSLocator(ProductsLocators.removeButtonBikeLight);
        LoggerUtility.infoTest("The user removes the BikeLight product from shopping cart");
    }
    public void removeBoltTshirt(){
        elementHelper.clickJSLocator(ProductsLocators.removeButtonBoltTshirt);
        LoggerUtility.infoTest("The user removes the Bolt T-shirt product from shopping cart");
    }
    public void removeFleeceJacket(){
        elementHelper.clickJSLocator(ProductsLocators.removeButtonFleeceJacket);
        LoggerUtility.infoTest("The user removes the Fleece Jacket product from shopping cart");
    }
    public void removeOnesie(){
        elementHelper.clickJSLocator(ProductsLocators.removeButtonOnesie);
        LoggerUtility.infoTest("The user removes the Onesie product from shopping cart");
    }
    public void removeRedTshirt(){
        elementHelper.clickJSLocator(ProductsLocators.removeButtonRedTshirt);
        LoggerUtility.infoTest("The user removes the Red T-shirt product from shopping cart");
    }

    public void enterOnSortOptionsButton(){
        elementHelper.clickJSLocator(ProductsLocators.sortOptionsButton);
        LoggerUtility.infoTest("The user clicks on the Sort Options List Button");
    }

    public void selectSortOptionsList(String optionsValue){
        List<WebElement> sortOptionsList = driver.findElements(ProductsLocators.sortOptionsList);
        if (optionsValue.equals("Name (A to Z)")) {
            elementHelper.clickJSLocator(sortOptionsList.get(0));
            LoggerUtility.infoTest("The products are sorted A to Z");
        }
        if (optionsValue.equals("Name (Z to A)")) {
            elementHelper.clickJSLocator(sortOptionsList.get(1));
            LoggerUtility.infoTest("The products are sorted Z to A");
        }
        if (optionsValue.equals("Price (low to high)")) {
            elementHelper.clickJSLocator(sortOptionsList.get(2));
            LoggerUtility.infoTest("The products are sorted by price low to high");
        }
        if (optionsValue.equals("Price (high to low)")) {
            elementHelper.clickJSLocator(sortOptionsList.get(3));
            LoggerUtility.infoTest("The products are sorted by price high to low");
        }
    }

    public void addToCartFromProductPageBackPack(){
        elementHelper.clickJSLocator(backpackProduct);
        elementHelper.clickLocator(addToCartFromProduct);
        LoggerUtility.infoTest("The user adds to shopping cart the Backpack product from page product");
    }

    public void addToCartFromProductPageBikeLight(){
        elementHelper.clickJSLocator(bikelightProduct);
        elementHelper.clickLocator(addToCartFromProduct);
        LoggerUtility.infoTest("The user adds to shopping cart the Bike Light product from page product");
    }

    public void addToCartFromProductPageBoltTshirt(){
        elementHelper.clickJSLocator(boltTshirtProduct);
        elementHelper.clickLocator(addToCartFromProduct);
        LoggerUtility.infoTest("The user adds to shopping cart the Bolt T-shirt product from page product");
    }

    public void addToCartFromProductPageFleeceJacket(){
        elementHelper.clickJSLocator(fleeceJacketProduct);
        elementHelper.clickLocator(addToCartFromProduct);
        LoggerUtility.infoTest("The user adds to shopping cart the Fleece Jacket product from page product");
    }

    public void addToCartFromProductPageOnesie(){
        elementHelper.clickJSLocator(onesieProduct);
        elementHelper.clickLocator(addToCartFromProduct);
        LoggerUtility.infoTest("The user adds to shopping cart the Onesie product from page product");
    }

    public void addToCartFromProductPageRedTshirt(){
        elementHelper.clickJSLocator(redTshirtProduct);
        elementHelper.clickLocator(addToCartFromProduct);
        LoggerUtility.infoTest("The user adds to shopping cart the Red T-shirt product from page product");
    }

    public void enterOnProductPageFromCart(){
        elementHelper.clickJSLocator(itemProductOnCart);
        LoggerUtility.infoTest("The user accesses the product page by clicking the product name in the cart");
    }
}
