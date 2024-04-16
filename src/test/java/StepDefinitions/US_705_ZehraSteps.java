package StepDefinitions;

import Pages.DialogContent_Zehra;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class US_705_ZehraSteps {
    DialogContent_Zehra dc=new DialogContent_Zehra();
    @When("Click on random category from Tab Menu")
    public void clickOnRandomCategoryFromTabMenu() {
        dc.myClick(dc.womenTab);
        dc.myClick(dc.bottomsTab);
        dc.myClick(dc.shortsTab);
    }

    @Then("Add random item from the list to cart")
    public void addRandomItemFromTheListToCart() {
        int rndmSelection = (int) (Math.random() * dc.shortsSelection.size());
        WebElement shorts = dc.shortsSelection.get(rndmSelection);
        System.out.println(shorts.getText());
        dc.myClick(shorts);
    }

    @And("Delete the item from the cart")
    public void deleteTheItemFromTheCart() {
    }
}
