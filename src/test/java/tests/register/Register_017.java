package tests.register;

import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static constants.ConstantsLoginPage.signUpMailTextBox;

public class Register_017 extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;


    @Description("Karakter Sınırını Aşan Email ile Kayıt İşlemi")
    @Test
    public void register_017() {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();

        loginPage = new LoginPage(driver);
        loginPage.inputNameTextBox("Serkan");
        loginPage.inputSignUpTextBox("randomro2ssaddddddddddddddddddduussuuuusuuuuuuuuuuuussdsdsuudsd3u@gmail.com");
        loginPage.clickToSignUpButton();
        Assert.assertEquals("Lütfen geçerli bir e-posta adresi gir.", loginPage.getEmailValidationMessage(signUpMailTextBox));



    }
}
