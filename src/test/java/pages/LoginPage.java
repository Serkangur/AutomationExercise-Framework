package pages;

import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
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

    public String getTextErrorMessage() {
        return getTextMethod(errorTextPassword);
    }

    public String getEmailValidationMessage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript(
                "return arguments[0].validationMessage;", find(mailTextBox)
        );
    }
}
