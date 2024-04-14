package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Mert extends ParentPage{
    public LeftNav_Mert() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy (xpath = "(//li[@class='authorization-link']/a)[2]")
    public WebElement SignInButton;

    @FindBy (xpath = "(//button[@id='send2']/span)[1]")
    public WebElement LoginButton;
}
