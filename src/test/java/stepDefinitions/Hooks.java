package stepDefinitions;

import utilities.PropertiesReader;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openBrowser() throws Exception {
        String chromeDriverPath = "/Users/paulinamaygania/Documents/Automation/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        PropertiesReader propertiesReader = new PropertiesReader();
        driver.get(propertiesReader.getValue("url"));
    }
}
