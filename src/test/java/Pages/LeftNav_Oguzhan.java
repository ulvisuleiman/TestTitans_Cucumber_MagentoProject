package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Oguzhan extends ParentPage {

    public LeftNav_Oguzhan() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='header links']//li[3]")
    public WebElement registerButton;

    public WebElement getWebElement(String element) {

        switch (element) {

            case "registerButton":
                return this.registerButton;

        }
        return null;
    }


}
