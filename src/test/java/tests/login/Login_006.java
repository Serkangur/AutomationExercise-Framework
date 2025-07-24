package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_006 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("E-posta Önde ve Arkada Boşluk ile Login")
    @Test
    public void login_006() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("  serkangur001@gmail.com  ");
        loginPage.inputPassword("123456789");
        loginPage.clickLoginButton();
        Assert.assertTrue("Trim yapılmadan giriş kabul edildi.",loginPage.getCurrentUrl().contains("login"));


    }
}
