package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.Faker;

import java.time.Duration;

import static constants.ConstantsRegisterPage.dayDropDown;


public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    //Finds and returns a WebElement if it exists in the DOM.
    public WebElement find(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //Retrieves the current page URL.
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    //Waits until the WebElement is clickable and then clicks on it using the provided locator.
    public  void clickToWebElement (By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    //Inputs the given text into a text field located by the provided locator.
    public void inputTextMethod(String input,By locator) {
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(input);
    }

    // Waits until the WebElement located by the given locator is visible on the page.
    public WebElement waitElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    // Retrieves the text from a WebElement.
    public String getTextMethod(By locator) {
        String text = waitElement(locator).getText();
        return text;
    }



    //Pauses execution for the specified time.
    public static void delay(int millisecond){
        try {
            Thread.sleep(millisecond);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static String generateRandomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public void selectDropDown(By locator,String value){
        Select selectDay = new Select(find(locator));
        selectDay.selectByVisibleText(value);
    }


    }



