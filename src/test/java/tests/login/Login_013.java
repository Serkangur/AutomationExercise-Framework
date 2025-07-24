package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_013 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("Sistemde Olmayan Bir Hesap ile Giriş")
    @Test
    public void login_001() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("sistemdisi@gmail.com");
        loginPage.inputPassword("sistemdisi");
        loginPage.clickLoginButton();
        Assert.assertEquals("Your email or password is incorrect!", loginPage.getTextErrorMessage(), "Hata mesajı beklenenden farklı!");


    }
}
