package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static constants.ConstantsHomePage.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickToLoginPage(){
        clickToWebElement(loginPageButton);
    }

    public WebElement isOnHomePage(){
        return find(logoutButton);
    }

}
