package StepDefinitions;

import Pages.DialogContent_Zehra;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_705_ZehraSteps {
    DialogContent_Zehra dc=new DialogContent_Zehra();
    Actions actions=new Actions(GWD.getDriver());
    public WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(7));
    @When("Click on random category from Tab Menu")
    public void clickOnRandomCategoryFromTabMenu() {
        actions.moveToElement(dc.womenTab).build().perform();
        wait.until(ExpectedConditions.visibilityOf(dc.bottomsTab));
        actions.moveToElement(dc.bottomsTab).perform();
        //dc.myClick(dc.womenTab);
        //new Actions(GWD.getDriver()).moveToElement(dc.bottomsTab).build().perform();

        //dc.myClick(dc.bottomsTab);
        dc.myJSClick(dc.shortsTab);
    }

    @Then("Add random item from the list")
    public void addRandomItemFromTheListToCart() {
        int rndmSelection = (int) (Math.random() * dc.shortsSelection.size());
        WebElement shorts = dc.shortsSelection.get(rndmSelection);
        System.out.println(shorts.getText());
        dc.myClick(shorts);

    }

    @And("Select random size and color of the item and add to cart")
    public void selectRandomSizeAndColorOfTheItemAndAddToCart() {
        int rndmSizeSelection = (int) (Math.random() * dc.listboxSize.size());
        WebElement sizes = dc.listboxSize.get(rndmSizeSelection);
        System.out.println(sizes.getText());
        dc.myClick(sizes);

        int rndmColorSelection = (int) (Math.random() * dc.listboxColor.size());
        WebElement colors = dc.listboxColor.get(rndmColorSelection);
        System.out.println(colors.getText());
        dc.myClick(colors);

        dc.myClick(dc.addToCart);
    }
    @And("Delete the item from the cart")
    public void deleteTheItemFromTheCart() {

    }



}
