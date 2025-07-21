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
        Select selectDay = new Select(find(dayDropDown));
        selectDay.selectByVisibleText(day);
    }

}
