package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ModulePage;

import java.time.Duration;

public class ModulePageSteps {

    WebDriver driver = Hooks.driver;
    WebDriverWait wait;

    public ModulePageSteps(){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    @Given("Go to Stockbit Academy page")
    public void go_to_stockbit_academy_page() {
        driver.get("https://academy.stockbit.com/");
    }

    @Given("Select first module")
    public void select_first_module() {
        ModulePage modulePage = new ModulePage(driver, wait);
        modulePage.selectModule();
    }

    @Given("Click explore modules icon")
    public void click_explore_modules_icon() {
        ModulePage modulePage = new ModulePage(driver, wait);
        modulePage.clickExploreModule();
    }

    @Given("Explore modules is displayed")
    public void explore_modules_is_displayed() throws Exception{
        ModulePage modulePage = new ModulePage(driver, wait);
        modulePage.exploreModuleIsDisplayed();
        Thread.sleep(2000);
    }

    @When("Click any other modules")
    public void click_any_other_modules() {
        ModulePage modulePage = new ModulePage(driver, wait);
        modulePage.changeModule();
    }

    @Then("Other module page should be displayed properly")
    public void other_module_page_should_be_displayed_properly() throws Exception{
        ModulePage modulePage = new ModulePage(driver, wait);
        modulePage.module2IsDisplayed();
        Thread.sleep(2000);
    }

    @Given("Click any chapter on module page")
    public void click_any_chapter_on_module_page() throws Exception{
        ModulePage modulePage = new ModulePage(driver, wait);
        modulePage.selectChapter();
        Thread.sleep(2000);
    }

    @When("Click next lesson on chapter page")
    public void click_next_lesson_on_chapter_page() throws Exception{
        ModulePage modulePage = new ModulePage(driver, wait);
        modulePage.clickNextLesson();
        Thread.sleep(2000);
    }

    @Then("User redirected to the next lesson")
    public void user_redirected_to_the_next_lesson() throws Exception{
        ModulePage modulePage = new ModulePage(driver, wait);
        modulePage.lesson1IsDisplayed();
        Thread.sleep(1000);
    }

}
