package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DialogContent_Oguzhan extends ParentPage{

    @FindBy(id = "firstname")
    public WebElement firstname;
    @FindBy(id = "lastname")
    public WebElement lastname;
    @FindBy(id = "email_address")
    public WebElement email;
    @FindBy(css = "[id='password']")
    public WebElement password;
    @FindBy(xpath = "//span[@id='password-strength-meter-label']")
    public WebElement passwordStrength;
    @FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement confirmPassword;
    @FindBy(css = "[title='Create an Account']")
    public WebElement createAnAccountButton;
    @FindBy(css = "[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement accountSuccessfuly;


}
