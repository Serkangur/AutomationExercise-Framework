package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static constants.ConstantsLoginPage.mailTextBox;

public class Login_011 extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @Description("Sadece Şifre ile Giriş")
    @Test
    public void login_011(){
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);


        loginPage.inputPassword("123456789");
        loginPage.clickLoginButton();
        Assert.assertEquals("Lütfen bu alanı doldurun.", loginPage.getEmailValidationMessage(mailTextBox));


    }
}
