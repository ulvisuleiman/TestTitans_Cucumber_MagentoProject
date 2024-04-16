package StepDefinitions;

import Pages.DialogContent_Zehra;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
        dc.myJSClick(shorts);

    }

    @And("Select random size and color of the item and add to cart")
    public void selectRandomSizeAndColorOfTheItemAndAddToCart() {
        wait.until(ExpectedConditions.urlContains("short"));

        int rndmSizeSelection = (int) (Math.random() * dc.listboxSize.size());
        WebElement sizes = dc.listboxSize.get(rndmSizeSelection);
        System.out.println(sizes.getText());
        wait.until(ExpectedConditions.elementToBeClickable(sizes));
        dc.myJSClick(sizes);


        int rndmColorSelection = (int) (Math.random() * dc.listboxColor.size());
        WebElement colors = dc.listboxColor.get(rndmColorSelection);
        System.out.println(colors.getText());
        wait.until(ExpectedConditions.elementToBeClickable(colors));
        dc.myJSClick(colors);

        //wait.until(ExpectedConditions.elementToBeClickable(dc.qty));
        //actions.moveToElement(dc.qty).doubleClick().build().perform();

        //dc.myJSClick(dc.qty);
        //dc.qty.clear();
        //dc.qty.sendKeys("2");

        //actions.moveToElement(dc.qty).doubleClick(dc.qty).sendKeys("2").build().perform();
        //dc.myJSClick(dc.addToCart);
    }
    @And("Delete the item from the cart")
    public void deleteTheItemFromTheCart() {

    }



}
