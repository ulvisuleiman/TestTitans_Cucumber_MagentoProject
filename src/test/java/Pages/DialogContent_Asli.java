package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Asli extends ParentPage {


    public DialogContent_Asli(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

        @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    public WebElement sign;

    @FindBy(css = "[name='login[username]']")
    public WebElement email;

    @FindBy(css = "[name='login[password]']")
        public WebElement password;

    @FindBy(xpath = "(//button[@name='send'])[1]")
    public WebElement buttonSign2;











}
