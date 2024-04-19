package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Mert extends ParentPage{
    public DialogContent_Mert() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy (css = "[class='field note']")
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

    @FindBy (xpath = "//span[text()='Men']")
    public WebElement unitMen;

    @FindBy (xpath = "(//span[text()='Tops'])[2]")
    public WebElement unitTops;

    @FindBy (xpath = "(//span[text()='Jackets'])[2]")
    public WebElement unitJackets;

    @FindBy (xpath = "(//div[@class='product details product-item-details'])[6]//a[1]")
    public WebElement product;
}
