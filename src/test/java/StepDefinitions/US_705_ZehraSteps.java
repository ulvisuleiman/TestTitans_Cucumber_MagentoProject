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
    DialogContent_Zehra dc = new DialogContent_Zehra();
    Actions actions = new Actions(GWD.getDriver());
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(7));

    @When("Click on random category from Tab Menu")
    public void clickOnRandomCategoryFromTabMenu() {
        actions.moveToElement(dc.womenTab).build().perform();
        wait.until(ExpectedConditions.visibilityOf(dc.bottomsTab));
        actions.moveToElement(dc.bottomsTab).perform();

        dc.myJSClick(dc.shortsTab);
    }

    @Then("Add random item from the list")
    public void addRandomItemFromTheListToCart() {
        int rndmSelection = (int) (Math.random() * dc.shortsSelection.size());
        String shorts = dc.shortsSelection.get(rndmSelection).getText();
        dc.shortsSelection.get(rndmSelection).click();

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

        actions.moveToElement(dc.qty).doubleClick().build().perform();
        dc.qty.clear();
        dc.qty.sendKeys("2");

        dc.myJSClick(dc.addToCart);
        wait.until(ExpectedConditions.elementToBeClickable(dc.myCart));
    }

    @And("Delete the item from the cart")
    public void deleteTheItemFromTheCart() {
        dc.myJSClick(dc.myCart);

        if (dc.deleteCart.size() > 2) {
            int trashButton = (int) (Math.random() * dc.deleteCart.size());
            String trash = dc.deleteCart.get(trashButton).getText();
            dc.deleteCart.get(trashButton).click();
            Assert.assertTrue(trash.isBlank());
        } else
            dc.myClick(dc.myCart);
        dc.myClick(dc.trashcan);


        dc.myClick(dc.okButton);

    }


    @And("Once deleting one item empty cart message should be seen")
    public void ifDeletingOneItemEmptyCartMessageShouldBeSeen() {
        Assert.assertTrue(dc.noItems.isDisplayed());
    }
}
