package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Mert extends ParentPage{
    public LeftNav_Mert() {PageFactory.initElements(GWD.getDriver(),this);}
}
