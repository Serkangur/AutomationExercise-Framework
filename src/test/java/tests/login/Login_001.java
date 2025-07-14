package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Login_001 extends BaseTest {
    LoginPage loginPage;

    @Description("Doğru username ve password ile login testidir")
    @Test
    public void login_001() throws InterruptedException {
        loginPage = new LoginPage(driver);

        loginPage.inputUserName("Admin");
        loginPage.inputPassword("admin123");
        loginPage.clickLoginButton();


    }
}
