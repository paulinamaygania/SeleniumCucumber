package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;
import utilities.PropertiesReader;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    PropertiesReader propertiesReader = new PropertiesReader();

    @FindBy(xpath = "//input[@id='password']")
    private WebElement tfPassword;

    @FindBy(xpath = "//button[@id='email-login-button']")
    private WebElement btnLogIn;

    @FindBy(xpath = "//button[@id='google-login-button']")
    private WebElement btnGoogle;

    @FindBy(xpath = "//button[@id='facebook-login-button']")
    private WebElement btnFacebook;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement tfUsername;

    @FindBy(xpath = "//p[@class='sc-crzoAE jcloeo']")
    private WebElement txaForgotPassword;

    @FindBy(xpath = "//p[@class='sc-crzoAE fPGNjl']")
    private WebElement txaSignUp;

    @FindBy(xpath = "//div[@class='alert-red']")
    private WebElement txaLoginFail;

    public boolean loginPageIsDisplayed(){
        WaitUntilElementVisible(tfPassword);
        tfPassword.isDisplayed();
        WaitUntilElementVisible(btnLogIn);
        btnLogIn.isDisplayed();
        WaitUntilElementVisible(btnGoogle);
        btnGoogle.isDisplayed();
        WaitUntilElementVisible(btnFacebook);
        btnFacebook.isDisplayed();
        WaitUntilElementVisible(tfUsername);
        tfUsername.isDisplayed();
        WaitUntilElementVisible(txaForgotPassword);
        txaForgotPassword.isDisplayed();
        WaitUntilElementVisible(txaSignUp);
        txaSignUp.isDisplayed();
        return true;
    }

    public void inputUsername() throws Exception{
        tfUsername.isEnabled();
        tfUsername.click();
        tfUsername.sendKeys(propertiesReader.getValue("username"));
        Thread.sleep(1000);
    }

    public void inputPassword() throws Exception{
        tfPassword.isEnabled();
        tfPassword.click();
        tfPassword.sendKeys(propertiesReader.getValue("password"));
        Thread.sleep(1000);
    }

    public void clickLogin(){
        btnLogIn.isEnabled();
        btnLogIn.click();
    }

    public boolean loginFailAlertIsDisplayed(){
        WaitUntilElementVisible(txaLoginFail);
        txaLoginFail.isDisplayed();
        return true;
    }

}
