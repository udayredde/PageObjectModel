package automationTest.SmokeTestSuite;


import automationTest.Utils.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest extends BasePage {
    @BeforeClass
    public static void openBrowser(){ //open Url
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
   /* @AfterClass
    public static void closeUrl(){
        driver.close();
    }*/
}
