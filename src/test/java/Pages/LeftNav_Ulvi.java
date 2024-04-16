package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Ulvi extends ParentPage{
    public LeftNav_Ulvi(){PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy (xpath = "(//li[@class='authorization-link']/a)[1]")
    public WebElement SignInButton;

    @FindBy(xpath = "(//button[@id='send2']/span)[1]")
    public WebElement LoginButton;

    @FindBy(xpath = "(//*[@data-action='customer-menu-toggle'])[1]")
    public WebElement manageAccountBtn;

    @FindBy(xpath = "(//*[text()='My Account'])[1]")
    public WebElement myAccountBtn;

    @FindBy(xpath = "//*[text()='Manage Addresses']")
    public WebElement manageAddressesBtn;

    @FindBy(xpath = "//*@data-action='save-address']")
    public WebElement saveAddressBtn;
}
