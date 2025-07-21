package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_001 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("Doğru username ve password ile login testidir")
    @Test
    public void login_001() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("serkangur001@gmail.com");
        loginPage.inputPassword("123456789");
        loginPage.clickLoginButton();


    }
}
