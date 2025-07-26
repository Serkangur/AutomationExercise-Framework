package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static constants.ConstantsRegisterPage.*;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void clickToGenderRadioButton(){
        clickToWebElement(genderRadioButtonMale);
    }

    public void inputPasswordTextBox(String password){
        inputTextMethod(password,passwordTextBox);
    }

    public void selectDayDropDown(String day){
        selectDropDown(dayDropDown,day);
    }

    public void selectMonthDropDown(String month){
        selectDropDown(monthDropDown,month);
    }

    public void selectYearDropDown(String year){
        selectDropDown(yearDropDown,year);
    }

    public void clickToNewsletter(){
        clickToWebElement(newsletter);
    }

    public void clickToOptin(){
        clickToWebElement(optin);
    }

    public void inputFirstName(String text){
        inputTextMethod(text,firstName);
    }

    public void inputLastName(String text){
        inputTextMethod(text,lastName);
    }
    public void inputCompany(String text){
        inputTextMethod(text,company);
    }

    public void inputAdress(String text){
        inputTextMethod(text,adress);
    }

    public void selectCountryDropDown(String country){
        selectDropDown(countryDropDown,country);
    }

    public void inputState(String text){
        inputTextMethod(text,state);
    }

    public void inputCity(String text){
        inputTextMethod(text,city);
    }
    public void inputZipCode(String text){
        inputTextMethod(text,zipCode);
    }
    public void inputPhone(String text){
        inputTextMethod(text,mobilePhone);
    }

    public void clickToCreateButton(){
        clickToWebElement(createButton);
    }


}
