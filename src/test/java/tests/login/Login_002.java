package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class Login_002 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("Sadece E-posta Hesabı ile Login")
    @Test
    public void login_002() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("serkangur001@gmail.com");
        loginPage.clickLoginButton();
        Assert.assertTrue("You are not homepage",loginPage.getCurrentUrl().contains("login"));


    }
}
