package tests.register;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;


import static constants.ConstantsLoginPage.*;

public class Register_016 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;


    @Description("Geçersiz Email (birden fazla '@') ile Kayıt İşlemi  ")
    @Test
    public void register_016() {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();

        loginPage = new LoginPage(driver);
        loginPage.inputNameTextBox("Serkan");
        loginPage.inputSignUpTextBox("user@domain@domain.com");
        loginPage.clickToSignUpButton();
        Assert.assertEquals("Başında \"@\" bulunan kısımda \"@\" simgesi bulunmamalıdır.", loginPage.getEmailValidationMessage(signUpMailTextBox));



    }
}
