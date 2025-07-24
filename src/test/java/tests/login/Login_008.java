package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_008 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("Geçersiz E-posta ve Şifre ile Login")
    @Test
    public void login_008() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("randommail@gmail.com");
        loginPage.inputPassword("random123");
        loginPage.clickLoginButton();
        Assert.assertEquals("Your email or password is incorrect!", loginPage.getTextErrorMessage(), "Hata mesajı beklenenden farklı!");


    }
}
