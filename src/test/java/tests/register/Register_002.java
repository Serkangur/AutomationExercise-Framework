package tests.register;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class Register_002 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;


    @Description("Aynı E-posta Adresi ile Kayıt İşlemi")
    @Test
    public void register_002() {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();

        loginPage = new LoginPage(driver);
        loginPage.inputNameTextBox("Serkan");
        loginPage.inputSignUpTextBox("serkangur001@gmail.com");//generate random mail
        loginPage.clickToSignUpButton();
        Assert.assertEquals("Email Address already exist!",loginPage.getTextErrorMessageMail(),"Hata mesajı beklenenden farklı!");

    }
}
