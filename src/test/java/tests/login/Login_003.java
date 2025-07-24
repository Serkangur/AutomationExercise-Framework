package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_003 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("Dogru username ve password ile login testidir")
    @Test
    public void login_003() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("serkangur001@gmail.com");
        loginPage.inputPassword("yanlis_sifre");
        loginPage.clickLoginButton();
        Assert.assertEquals("Your email or password is incorrect!", loginPage.getTextErrorMessage(), "Hata mesajı beklenenden farklı!");



    }
}
