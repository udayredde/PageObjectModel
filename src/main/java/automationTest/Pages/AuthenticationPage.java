package automationTest.Pages;

import automationTest.Utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class AuthenticationPage extends BasePage {
    @FindBy(css = "#create-account_form")
    WebElement createAccountForm;
    @FindBy(css = "#email_create")
    WebElement emailField;
    @FindBy(css = "#SubmitCreate")
    WebElement submitButton;

    public AuthenticationPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isCreateAccountFormDisplayed() {
        return createAccountForm.isDisplayed();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void goToCreateFormPage() {
        submitButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}
