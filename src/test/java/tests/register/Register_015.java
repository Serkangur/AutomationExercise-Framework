package tests.register;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

import static constants.ConstantsRegisterPage.firstName;
import static constants.ConstantsRegisterPage.passwordTextBox;

public class Register_015 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @Description("Tüm Alamları Boş Bırakarak Kayıt İşlemi")
    @Test
    public void register_001() {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();

        loginPage = new LoginPage(driver);
        loginPage.inputNameTextBox("Serkan");
        loginPage.inputSignUpRandomTextBox();//generate random mail
        loginPage.clickToSignUpButton();

        registerPage = new RegisterPage(driver);
        registerPage.clickToCreateButton();
        Assert.assertEquals("Lütfen bu alanı doldurun.", loginPage.getEmailValidationMessage(passwordTextBox));

    }
    }
