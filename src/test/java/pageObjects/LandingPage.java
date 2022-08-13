package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;

public class LandingPage extends BaseClass {
    public LandingPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);
            PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Investing']")
    private WebElement btnInvesting;

    @FindBy(xpath = "//a[text()='Pro Tools']")
    private WebElement btnProTools;

    @FindBy(xpath = "//a[text()='Academy']")
    private WebElement btnAcademy;

    @FindBy(xpath = "//a[text()='About Us']")
    private WebElement btnAboutUs;

    @FindBy(xpath = "//a[text()='Blog']")
    private WebElement btnBlog;

    @FindBy(xpath = "//a[text()='Help']")
    private WebElement btnHelp;

    @FindBy(xpath = "//a[text()='Sign Up']")
    private WebElement btnSignUp;

    @FindBy(xpath = "//a[text()='Log In']")
    private WebElement btnLogIn;

    @FindBy(xpath = "//img[@class='logo-big']")
    private WebElement imgLogo;

    @FindBy(xpath = "//div[@class='content-in']")
    private WebElement txaHeaderTitle;

    @FindBy(xpath = "//video[@id='video']")
    private WebElement vidAnimationLP;

    @FindBy(xpath = "/html[@class='fp-enabled']/body[@class='fp-viewing-0']/button[@class='intercom-launcher']")
    private WebElement btnSupport;


    public boolean landingPageIsDisplayed(){
        WaitUntilElementVisible(btnInvesting);
        btnInvesting.isDisplayed();
        WaitUntilElementVisible(btnProTools);
        btnProTools.isDisplayed();
        WaitUntilElementVisible(btnAcademy);
        btnAcademy.isDisplayed();
        WaitUntilElementVisible(btnAboutUs);
        btnAboutUs.isDisplayed();
        WaitUntilElementVisible(btnBlog);
        btnBlog.isDisplayed();
        WaitUntilElementVisible(btnHelp);
        btnHelp.isDisplayed();
        WaitUntilElementVisible(btnSignUp);
        btnSignUp.isDisplayed();
        WaitUntilElementVisible(btnLogIn);
        btnLogIn.isDisplayed();
        WaitUntilElementVisible(imgLogo);
        imgLogo.isDisplayed();
        WaitUntilElementVisible(txaHeaderTitle);
        txaHeaderTitle.isDisplayed();
        WaitUntilElementVisible(vidAnimationLP);
        vidAnimationLP.isDisplayed();
        WaitUntilElementVisible(btnSupport);
        btnSupport.isDisplayed();
        return true;
    }

    public void clickBtnLogin(){
        WaitUntilElementVisible(btnLogIn);
        btnLogIn.isEnabled();
        btnLogIn.click();
    }

}
