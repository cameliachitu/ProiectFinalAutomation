package sharedData;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    public WebDriver driver;
    public String nameTest;


    @BeforeMethod
    public void prepareEnvironment() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        nameTest = this.getClass().getSimpleName();
        LoggerUtility.startTest(nameTest);
        LoggerUtility.infoTest("The user accesses the site 'saucedemo.com' ");
    }

    @AfterMethod
    public void clearEnvironment() {
        driver.quit();

        nameTest = this.getClass().getSimpleName();
        LoggerUtility.finishTest(nameTest);
    }


}