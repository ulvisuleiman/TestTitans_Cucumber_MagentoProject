package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Asli extends ParentPage {


    public DialogContent_Asli() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    public WebElement sign;

    @FindBy(css = "[id='email']")
    public WebElement email;

    @FindBy(css = "[name='login[password]'][type='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@name='send'])[1]")
    public WebElement buttonSign2;
    @FindBy(xpath = "//span[text()='Sale']")
    public WebElement saleButton;


    @FindBy(xpath = "(//a[text()='Jackets'])[2]")
    public WebElement ceket;

    @FindBy(xpath = "//*[@id='maincontent']/div[3]/div[1]/div[4]/ol/li[1]/div/a/span/span/img")
    public WebElement favUrun1;

    @FindBy(xpath = "(//a[@class='action towishlist'])[1]")
    public WebElement wishList1;


    @FindBy(xpath = "//div[contains(text(), 'has been added to your Wish List')]")
    public WebElement favDogrulamaMsg;

    @FindBy(xpath = "//button[@class='action switch' and @type='button']\n")
    public WebElement dropD;

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement hesabim;

    @FindBy(xpath = "//a[text()='My Wish List']")
    public WebElement favorilerim;


    @FindBy(xpath = "//span[@class='toolbar-number']")
    public WebElement fav2;

    @FindBy(xpath = "//a[@title='Remove Item']")
    public WebElement silBtn;

    @FindBy(xpath = "(//div[contains(text(), 'Proteus Fitness Jackshirt has been removed from your Wish List.')]")
    public WebElement silindiMsg;


    public WebElement getWebelements(String element) {

        switch (element) {

            case "sign":
                return this.sign;
            case "email":
                return this.email;
            case "password":
                return this.password;
            case "buttonSign2":
                return this.buttonSign2;
            case "saleButton":
                return this.saleButton;
            case "ceket":
                return this.ceket;
            case "favUrun1":
                return  this.favUrun1;
            case "wishList1":
                return this.wishList1;
            case "favDogrulamaMsg":
                return this.favDogrulamaMsg;
            case "dropD":
                return this.dropD;
            case "hesabim":
                return this.hesabim;
            case "favorilerim":
                return this.favorilerim;
            case "fav2":
                return this.fav2;
            case "silBtn":
                return this.silBtn;
            case "silindiMsg":
                return this.silindiMsg;



        }
        return null;
    }

}