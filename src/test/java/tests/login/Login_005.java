package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_005 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("Boş Kullanıcı Alanı ile Login")
    @Test
    public void login_005() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);


        loginPage.clickLoginButton();
        Assert.assertTrue("Giris islemi basarili olmustur",loginPage.getCurrentUrl().contains("login"));


    }
}
