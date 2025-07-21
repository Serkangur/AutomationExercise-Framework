package tests.register;

import base.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class Register_001 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @Description("Başarılı kullanıcı kaydı")
    @Test
    public void register_001() {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();

        loginPage = new LoginPage(driver);
        loginPage.inputNameTextBox("Serkan");
        loginPage.inputSignUpTextBox();//generate random mail
        loginPage.clickToSignUpButton();

        registerPage = new RegisterPage(driver);
        registerPage.clickToGenderRadioButton();
        registerPage.inputPasswordTextBox("123456789");







    }
}
