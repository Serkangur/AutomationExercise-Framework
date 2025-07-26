package constants;

import org.openqa.selenium.By;

public class ConstantsRegisterPage {
    public static By genderRadioButtonMale = By.id("id_gender1");
    public static By passwordTextBox = By.id("password");
    public static By dayDropDown = By.name("days");
    public static By monthDropDown = By.name("months");
    public static By yearDropDown = By.name("years");
    public static By newsletter = By.id("newsletter");
    public static By optin =By.id("optin");
    public static By firstName = By.id("first_name");
    public static By lastName = By.id("last_name");
    public static By company = By.id("company");
    public static By adress = By.id("address1");
    public static By countryDropDown = By.name("country");
    public static By state = By.id("state");
    public static By city = By.id("city");
    public static By zipCode = By.id("zipcode");
    public static By mobilePhone = By.id("mobile_number");
    public static By createButton = By.cssSelector("[data-qa='create-account']");

}
