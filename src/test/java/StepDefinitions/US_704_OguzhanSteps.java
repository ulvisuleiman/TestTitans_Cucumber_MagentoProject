package StepDefinitions;

import Pages.DialogContent_Oguzhan;
import Pages.LeftNav_Oguzhan;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_704_OguzhanSteps {

    LeftNav_Oguzhan ln=new LeftNav_Oguzhan();
    DialogContent_Oguzhan dc=new DialogContent_Oguzhan();
    @Given("Click on all buttons in the tab menu")
    public void clickOnAllButtonsInTheTabMenu(DataTable butonlar) {
        List<String> butonlarList=butonlar.asList(String.class);

        for (int i = 0; i < butonlarList.size(); i++) {
            WebElement webElement = dc.getWebelement(butonlarList.get(i));

        }



    }
}
