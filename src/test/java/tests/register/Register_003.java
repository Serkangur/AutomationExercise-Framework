package tests.register;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

import static constants.ConstantsLoginPage.*;

public class Register_003 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @Description("Yanlış EMail Formatı ile Kayıt İşlemi ")
    @Test
    public void register_003() {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();

        loginPage = new LoginPage(driver);
        loginPage.inputNameTextBox("Serkan");
        loginPage.inputSignUpTextBox("serkaan@g");
        loginPage.clickToSignUpButton();
        Assert.assertEquals("Email formatı yanlış girilmiştir.", loginPage.getEmailValidationMessage(mailTextBox));



    }
}
