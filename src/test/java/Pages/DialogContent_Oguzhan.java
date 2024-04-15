package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Oguzhan extends ParentPage {

    public DialogContent_Oguzhan() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

//    ***************US-701****************
    @FindBy(id = "firstname")
    public WebElement firstname;
    @FindBy(id = "lastname")
    public WebElement lastname;
    @FindBy(id = "email_address")
    public WebElement email;
    @FindBy(css = "[id='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//span[@id='password-strength-meter-label']")
    public WebElement passwordStrength;
    @FindBy(css = "[title='Create an Account']>span")
    public WebElement createAnAccountButton;
    @FindBy(css = "[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement accountSuccessfuly;

    //    ***************US-704****************

    @FindBy(linkText = "What's New")
    public WebElement WhatsNew;
    @FindBy(css = "[class='ui-menu-icon ui-icon ui-icon-carat-1-e']+span")
    public WebElement woman;
    @FindBy(linkText = "Tops")
    public WebElement womanTops;
    @FindBy(css = "[id='ui-id-10']>span+span")
    public WebElement womanBottoms;
    @FindBy(xpath = "//a[@id='ui-id-11']/span")
    public WebElement womanJackets;
    @FindBy(linkText = "Hoodies & Sweatshirts")
    public WebElement womanHoodiesSweatshirts;
    @FindBy(css = "[id='ui-id-13']")
    public WebElement womanTees;
    @FindBy(xpath = "//a[@id='ui-id-14']")
    public WebElement womanBrasTanks;
    @FindBy(xpath = "//a[@id='ui-id-15'")
    public WebElement womanPants;
    @FindBy(xpath = "//a[@id='ui-id-16']")
    public WebElement womanShorts;







    public WebElement getWebelement(String element) {

        switch (element) {

            case "firstname":
                return this.firstname;
            case "lastname":
                return this.lastname;
            case "email":
                return this.email;
            case "password":
                return this.password;
            case "confirmPassword":
                return this.confirmPassword;
            case "createAnAccountButton":
                return this.createAnAccountButton;


        }
        return null;
    }


}
