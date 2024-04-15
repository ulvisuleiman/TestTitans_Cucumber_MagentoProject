package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Mert extends ParentPage{
    public DialogContent_Mert() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy (css = "[id='email-error']")
    public WebElement errorMessage;

    @FindBy (css = "[name='login[username]']")
    public WebElement emailInput;

    @FindBy (css = "[id='pass-error']")
    public WebElement passwordErrorMessage;

    @FindBy (css = "[name='login[password]']")
    public WebElement passwordInput;

    @FindBy (xpath = "//div[@for='email']")
    public WebElement eMailErrorMessage;

    @FindBy (css = "[data-ui-id='message-error']>div")
    public WebElement emailAndPasswordError;

    @FindBy (xpath = "(//span[@class='logged-in'])[1]")
    public WebElement confirmLogin;

    @FindBy (xpath = "(//button[@data-action='customer-menu-toggle'])[1]")
    public WebElement logoutClick;

    @FindBy (xpath = "(//li[@class='authorization-link'])[1]/a")
    public WebElement logoutButton;
}
