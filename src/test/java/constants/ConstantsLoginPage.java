package constants;

import org.openqa.selenium.By;

public class ConstantsLoginPage {
    public static By mailTextBox =By.name("email");
    public static By nameTextBox =By.name("name");
    public static By signUpMailTextBox=By.xpath("//input[@data-qa=\"signup-email\"]");
    public static By signUpButton= By.xpath("//button[@data-qa=\"signup-button\"]");
    public static By passwordTextBox= By.name("password");
    public static By submitButton = By.xpath("//button[@data-qa=\"login-button\"]");
    public static By errorTextPassword= By.xpath("//form//p[@style=\"color: red;\"]");
}
