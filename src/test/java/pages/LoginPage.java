package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUserName(String userName) {
        inputTextMethod(userName,usernameTextBox);
    }

    public void inputPassword(String password) {
        inputTextMethod(password,passwordTextBox);
    }

    public void clickLoginButton() {
        clickToWebElement(submitButton);
    }
}
