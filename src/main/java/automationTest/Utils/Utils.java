package automationTest.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils extends BasePage {
    public static boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }
    public static void type(WebElement element,String text){
        element.sendKeys(text);
    }
    public static void selectListByText(WebElement element, String text){// list elements with VisibleText
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static void selectListByIndex(WebElement element, int index){ // List Elements with Index
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public static void selectListByValue(WebElement element, String value){ //List Elements With Value
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public static boolean isTextPresent(WebElement element, String text){
        return element.getText().contains(text);
    }
    public static boolean isElementPresent(WebElement element){
        return element.isDisplayed();
    }
    public static String getPageTitle(){
        return driver.getTitle();
    }
}
