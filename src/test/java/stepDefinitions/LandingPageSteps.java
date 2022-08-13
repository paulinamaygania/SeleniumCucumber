package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LandingPage;

import java.time.Duration;

public class LandingPageSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public LandingPageSteps()  {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    @Given("Go to Stockbit page")
    public void go_to_stockbit_page(){
        System.out.println("Open Stockbit Page successfully");
    }

    @Then("Landing page shown properly")
    public void landing_page_shown_properly() throws InterruptedException{
        LandingPage landingPage = new LandingPage(driver, wait);
        landingPage.landingPageIsDisplayed();
        Thread.sleep(1000);
    }

    @Then("Close chrome browser")
    public void close_chrome_browser() {
        driver.quit();
    }
}
