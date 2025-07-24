package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_007 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @Description("E-posta Adresine Özel Karakterler Yazarak Login")
    @Test
    public void login_007() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("☐☐☐serkangur001@gmail.com");
        loginPage.inputPassword("123456789");
        loginPage.clickLoginButton();
        Assert.assertEquals("Başında \"@\" bulunan kısımda \"☐\" simgesi bulunmamalıdır.", loginPage.getEmailValidationMessage());
    }
}
