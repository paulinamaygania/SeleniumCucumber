package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.time.Duration;
import java.util.ArrayList;

public class LoginPageSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public LoginPageSteps(){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    @Given("Go to Stockbit URL")
    public void go_to_stockbit_url(){
        System.out.println("Open Stockbit Page successfully");
    }

    @When("Click on login page")
    public void click_on_login_page() {
        //driver.findElement(By.xpath("//a[@class='login-ldn']")).click();
        LandingPage landingPage = new LandingPage(driver, wait);
        landingPage.clickBtnLogin();
    }

    @Then("Verify login page is displayed properly")
    public void verify_login_page_is_displayed_properly(){
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.loginPageIsDisplayed();
    }

    @Then("User able to input username and password successfully")
    public void user_able_to_input_username_and_password_successfully() throws Exception{
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.inputUsername();
        loginPage.inputPassword();
    }

    @And ("Click on login button")
    public void click_on_login_button(){
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.clickLogin();
    }

    @Then("Login fail alert is displayed")
    public void login_fail_alert_is_displayed() throws Exception{
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.loginFailAlertIsDisplayed();
    }

    @And("Close browser")
    public void close_browser() {
        driver.quit();
    }
}
