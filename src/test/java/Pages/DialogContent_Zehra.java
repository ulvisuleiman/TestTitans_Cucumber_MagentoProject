package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent_Zehra extends ParentPage {
    public DialogContent_Zehra() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Women']")
    public WebElement womenTab;
    @FindBy(xpath = "(//*[text()='Bottoms'])[1]")
    public WebElement bottomsTab;
    @FindBy(xpath = "(//*[text()='Shorts'])[1]")
    public WebElement shortsTab;
    @FindBy(xpath = "//ol[@class='products list items product-items']/li")
    public List<WebElement> shortsSelection;
    @FindBy(css = "[role='listbox'] [class='swatch-option text']")
    public List<WebElement> listboxSize;

    @FindBy(css = "[class='swatch-attribute color'] [class='swatch-option color']")
    public List<WebElement> listboxColor;
    @FindBy(css = "[id='qty']")
    public WebElement qty;
    @FindBy(xpath = "//button[@title='Add to Cart']")
    public WebElement addToCart;
    @FindBy(css = "[class='counter-number']")
    public WebElement myCart;
    @FindBy(xpath = "//*[ contains( text(), 'You added' )  ]")
    public WebElement addedMsg;
    @FindBy(css = "[class='action delete']")
    public List<WebElement> deleteCart;
    @FindBy(css = "[class='action delete']")
    public WebElement trashcan;
    @FindBy(css = "[class='modal-footer']>button+button")
    public WebElement okButton;
    @FindBy(xpath = "//*[@id='minicart-content-wrapper']")
    public WebElement noItems;


}
