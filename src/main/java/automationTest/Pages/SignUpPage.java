package automationTest.Pages;

import automationTest.Utils.BasePage;
import automationTest.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {
    @FindBy(css = "#account-creation_form")
    WebElement signUpForm;
    @FindBy(css = "#id_gender1")
    WebElement gender1;
    @FindBy(css="#id_gender2")
    WebElement gender2;
    @FindBy(css = "#customer_firstname")
    WebElement customerFirstName;
    @FindBy(css = "#days")
    WebElement dobDate;
    @FindBy(css = "#months")
    WebElement dobMonth;
    @FindBy(css = "#years")
    WebElement dobYear;
    @FindBy(css = "#id_state")
    WebElement state;
    @FindBy(css = "#submitAccount")
    WebElement registerButton;
    public SignUpPage(){
        PageFactory.initElements(driver,this);
    }
    public boolean isSignUpFormDisplayed(){
        return signUpForm.isDisplayed();
    }
    public void selectGender(String title){
        if(title == "Mr"){
            gender1.click();
        }
        else if(title == "Mrs"){
            gender2.click();
        }
    }
    public void setFirstName(String firstName){
        Utils.type(customerFirstName,firstName);
    }
    public void DOB(String date,String month, String year){
        Utils.selectListByValue(dobDate,date);
        Utils.selectListByValue(dobMonth,month);
        Utils.selectListByValue(dobYear,year);
    }
    public void selectState(String stateName){
        Utils.selectListByText(state,stateName);
    }
    public void registerAccount(){
        registerButton.click();
    }
}
