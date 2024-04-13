package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DialogContent_Oguzhan extends ParentPage{

    @FindBy(id = "firstname")
    public WebElement firstname;
    @FindBy(xpath = "lastname")
    public WebElement lastname;
    @FindBy(xpath = "//ul[@class='header links']//li[3]")
    public WebElement email;
    @FindBy(xpath = "//ul[@class='header links']//li[3]")
    public WebElement password;
    @FindBy(xpath = "//ul[@class='header links']//li[3]")
    public WebElement confirmPassword;
    @FindBy(xpath = "//ul[@class='header links']//li[3]")
    public WebElement createAnAccountButton;

}
