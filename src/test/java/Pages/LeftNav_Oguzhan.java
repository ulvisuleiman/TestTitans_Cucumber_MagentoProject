package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftNav_Oguzhan extends ParentPage {

    @FindBy(xpath = "//ul[@class='header links']//li[3]")
    public WebElement registerButton;

    public  WebElement getWebelement(String element){

        switch (element){

            case "registerButton": return this.registerButton;


        }
        return  null;
    }



}
