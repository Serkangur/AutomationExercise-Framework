package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {
    String email = generateRandomEmail();

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputMail(String userName) {
        inputTextMethod(userName,mailTextBox);
    }

    public void inputPassword(String password) {
        inputTextMethod(password,passwordTextBox);
    }

    public void clickLoginButton() {
        clickToWebElement(submitButton);
    }

    public void inputNameTextBox(String name){
        inputTextMethod(name,nameTextBox);
    }

    public void inputSignUpTextBox(){
        inputTextMethod(email,signUpMailTextBox);
    }

    public void clickToSignUpButton(){
        clickToWebElement(signUpButton);
    }
}
