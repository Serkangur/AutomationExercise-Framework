package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    protected String base_url = "https://automationexercise.com/";


    @BeforeSuite
    public void cleanAllureResults() throws IOException {
        FileUtils.deleteDirectory(new File("allure-results"));
    }


    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(base_url);




    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}