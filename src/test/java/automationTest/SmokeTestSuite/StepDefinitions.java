package automationTest.SmokeTestSuite;

import automationTest.Pages.AuthenticationPage;
import automationTest.Pages.CommonPage;
import automationTest.Pages.HomePage;
import automationTest.Utils.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDefinitions extends BasePage {
    //TestData
    public static String baseUrl = "http://automationpractice.com/index.php"; //url for Website
    //Instantiating the Webdriver variable and assign the webdriver object
    public static WebDriver driver;
    HomePage homePage= new HomePage();
    @Before
    public void startUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Given("^Is User on the Home page$")
    public void isUserOnHomePage(){
        //Assert.assertTrue(driver.findElement(By.cssSelector("#home-page-tabs")).isDisplayed());
        Assert.assertTrue(homePage.isUserOnHomePage());
    }
    @When("^User select signIn$")
    public void goToAuthenticationPage(){
        driver.findElement(By.cssSelector(".login")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Then("^User should be on Authentication page$")
    public void isCreateAccountFormDisplayed(){
        Assert.assertTrue(driver.findElement(By.cssSelector("#create-account_form")).isDisplayed());
    }
}