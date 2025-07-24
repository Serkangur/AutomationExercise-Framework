package tests.login;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_009 extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    //Tarayıcı eklenecek eklenmedi!!!!
    @Description("Geçerli E-posta ve Şifre ile Login")
    @Test
    public void login_001() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();
        loginPage = new LoginPage(driver);

        loginPage.inputMail("serkangur001@gmail.com");
        loginPage.inputPassword("123456789");
        loginPage.clickLoginButton();


    }
}
