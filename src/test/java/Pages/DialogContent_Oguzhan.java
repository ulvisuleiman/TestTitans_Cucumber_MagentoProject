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
    @FindBy(xpath = "//span[text()='Women']")
    public WebElement woman;
    @FindBy(linkText = "Tops")
    public WebElement tops;
    @FindBy(linkText = "Bottoms")
    public WebElement bottoms;
    @FindBy(linkText = "Jackets")
    public WebElement jackets;
    @FindBy(linkText = "Hoodies & Sweatshirts")
    public WebElement hoodiesSweatshirts;
    @FindBy(linkText = "Tees")
    public WebElement tees;
    @FindBy(linkText = "Bras & Tanks")
    public WebElement brasTanks;
    @FindBy(linkText = "Pants")
    public WebElement pants;
    @FindBy(linkText = "Shorts")
    public WebElement shorts;
    @FindBy(xpath = "//span[text()='Men']")
    public WebElement men;
    @FindBy(linkText = "Tanks")
    public WebElement tanks;
    @FindBy(xpath = "//span[text()='Gear']")
    public WebElement gear;
    @FindBy(linkText = "Bags")
    public WebElement bags;
    @FindBy(linkText = "Fitness Equipment")
    public WebElement fitnessEquipment;
    @FindBy(linkText = "Watches")
    public WebElement watches;
    @FindBy(xpath = "//span[text()='Training']")
    public WebElement training;
    @FindBy(linkText = "Video Download")
    public WebElement videoDownload;
    @FindBy(xpath = "//span[text()='Sale']")
    public WebElement sale;


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
            case "WhatsNew":
                return this.WhatsNew;
            case "woman":
                return this.woman;
            case "tops":
                return this.tops;
            case "bottoms":
                return this.bottoms;
            case "jackets":
                return this.jackets;
            case "hoodiesSweatshirts":
                return this.hoodiesSweatshirts;
            case "tees":
                return this.tees;
            case "brasTanks":
                return this.brasTanks;
            case "pants":
                return this.pants;
            case "shorts":
                return this.shorts;
            case "men":
                return this.men;
            case "tanks":
                return this.tanks;
            case "gear":
                return this.gear;
            case "bags":
                return this.bags;
            case "fitnessEquipment":
                return this.fitnessEquipment;
            case "watches":
                return this.watches;
            case "training":
                return this.training;
            case "videoDownload":
                return this.videoDownload;
            case "sale":
                return this.sale;


        }
        return null;
    }


}
