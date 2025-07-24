package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_004 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("Gecerli Sifre ve Yanlıs E-posta ile Login")
    @Test
    public void login_004() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("yanlismail@gmail.com");
        loginPage.inputPassword("123456789");
        loginPage.clickLoginButton();
        Assert.assertEquals("Your email or password is incorrect!", loginPage.getTextErrorMessage(), "Hata mesajı beklenenden farklı!");


    }
}
