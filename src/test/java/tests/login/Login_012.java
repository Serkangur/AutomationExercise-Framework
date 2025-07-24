package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_012 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("E-posta Büyük Harf ile Giriş")
    @Test
    public void login_012() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("Serkangur001@gmail.com");
        loginPage.inputPassword("123456789");
        loginPage.clickLoginButton();
        Assert.assertEquals("Your email or password is incorrect!", loginPage.getTextErrorMessage(), "Hata mesajı beklenenden farklı!");


    }
}
