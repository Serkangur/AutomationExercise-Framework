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

    @Description("Geçerli Bilgiler ile Kayıt İşlemi")
    @Test
    public void register_001() {
        homePage = new HomePage(driver);
        homePage.clickToLoginPage();

        loginPage = new LoginPage(driver);
        loginPage.inputNameTextBox("Serkan");
        loginPage.inputSignUpRandomTextBox();//generate random mail
        loginPage.clickToSignUpButton();

        registerPage = new RegisterPage(driver);
        registerPage.clickToGenderRadioButton();
        registerPage.inputPasswordTextBox("123456789");
        registerPage.selectDayDropDown("5");
        registerPage.selectMonthDropDown("August");
        registerPage.selectYearDropDown("2000");
        registerPage.clickToNewsletter();
        registerPage.clickToOptin();
        registerPage.inputFirstName("Serkan");
        registerPage.inputLastName("Gür");
        registerPage.inputCompany("Insider");
        registerPage.inputAdress("Newyork");
        registerPage.selectCountryDropDown("United States");
        registerPage.inputState("Newyork");
        registerPage.inputCity("Newyork");
        registerPage.inputZipCode("07008");
        registerPage.inputPhone("05315644526");
        registerPage.clickToCreateButton();









    }
}
