package automationTest.Pages;

import automationTest.Utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class CommonPage extends BasePage {

    @FindBy(css = ".login")
    WebElement signUpLink;
    public CommonPage(){
        PageFactory.initElements(driver,this);
    }
    public void goToAuthenticationPage(){
        signUpLink.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
