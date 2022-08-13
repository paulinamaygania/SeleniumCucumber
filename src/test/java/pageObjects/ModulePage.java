package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;

import java.util.ArrayList;

public class ModulePage extends BaseClass {

    public ModulePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@class='sc-jibzCz blpDSz'])[1]")
    private WebElement ctrModule1;

    @FindBy(xpath = "//img[@src='/img/home.svg']")
    private WebElement btnExploreModules;

    @FindBy(xpath = "//h2[@class='sc-caiKgP sc-cBIgVh ebvCWj ivjxHm']")
    private WebElement txaExploreModules;

    @FindBy(xpath = "(//a[@class='sc-jibzCz blpDSz'])[2]")
    private WebElement ctrModule2;

    @FindBy(xpath = "//div[text()='Module 2']")
    private WebElement txaModule2Title;

    @FindBy(xpath = "(//div[@class='sc-dpAjic dlyzmz'])[1]")
    private WebElement txaChapter1;

    @FindBy(xpath = "//span[@class='m-pagination__nav m-pagination__nav--active']")
    private WebElement btnNextLesson;

    @FindBy(xpath = "(//span[@class='title'][text()='The Need to Invest'])[1]")
    private WebElement txaLesson1;

    public void selectModule(){
        WaitUntilElementVisible(ctrModule1);
        ctrModule1.isDisplayed();
        ctrModule1.click();
    }

    public void clickExploreModule(){
        WaitUntilElementVisible(btnExploreModules);
        btnExploreModules.isDisplayed();
        btnExploreModules.click();
    }

    public boolean exploreModuleIsDisplayed(){
        WaitUntilElementVisible(txaExploreModules);
        txaExploreModules.isDisplayed();
        return true;
    }

    public void changeModule(){
        WaitUntilElementVisible(ctrModule2);
        ctrModule2.isDisplayed();
        ctrModule2.click();
    }

    public boolean module2IsDisplayed(){
        WaitUntilElementVisible(txaModule2Title);
        txaModule2Title.isDisplayed();
        return true;
    }

    public void switchToNextTab(WebDriver driver){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void selectChapter(){
        WaitUntilElementVisible(txaChapter1);
        txaChapter1.isDisplayed();
        txaChapter1.click();
    }

    public void clickNextLesson(){
        WaitUntilElementVisible(btnNextLesson);
        btnNextLesson.isDisplayed();
        btnNextLesson.click();
    }

    public boolean lesson1IsDisplayed(){
        WaitUntilElementVisible(txaLesson1);
        txaLesson1.isDisplayed();
        return true;
    }


}
