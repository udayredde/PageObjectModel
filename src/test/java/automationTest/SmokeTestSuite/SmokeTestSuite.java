package automationTest.SmokeTestSuite;

import automationTest.Pages.AuthenticationPage;
import automationTest.Pages.CommonPage;
import automationTest.Pages.HomePage;
import automationTest.Pages.SignUpPage;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;

public class SmokeTestSuite extends BaseTest {
    //Test Data
    static String emailId = "udayredde453@gmail.com";
    static String title = "Mr";
    static String firstName = "Uday";
    static String date = "15";
    static String month = "8";
    static String year = "1985";
    static String stateName = "Indiana";
    HomePage homePage = new HomePage();
    CommonPage commonPage = new CommonPage();
    AuthenticationPage authenticationPage = new AuthenticationPage();
    SignUpPage signUpPage = new SignUpPage();
    @Test
    public void verifyUserWithIncorrectDetails1(){
        Assert.assertTrue(homePage.isUserOnHomePage());
        commonPage.goToAuthenticationPage();
        Assert.assertTrue(authenticationPage.isCreateAccountFormDisplayed());
        authenticationPage.enterEmail(emailId);
        authenticationPage.goToCreateFormPage();
        Assert.assertTrue(signUpPage.isSignUpFormDisplayed());
        signUpPage.selectGender(title);
        signUpPage.setFirstName(firstName);
        signUpPage.DOB(date,month,year);
        signUpPage.selectState(stateName);
        signUpPage.registerAccount();
    }
}
