package StepDefinitions;

import Pages.DialogContent_Mert;
import Pages.LeftNav_Mert;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_707_MertSteps {
    DialogContent_Mert dcm=new DialogContent_Mert();
    LeftNav_Mert lfm=new LeftNav_Mert();
    @Given("Search for the jacket name as Taurus Elements Shell")
    public void searchForTheJacketNameAs() {
        Actions driverAction=new Actions(GWD.getDriver());
        driverAction.moveToElement(dcm.unitMen).build().perform();
        driverAction.moveToElement(dcm.unitTops).build().perform();
        dcm.wait.until(ExpectedConditions.elementToBeClickable(dcm.unitJackets));
        dcm.myJSClick(dcm.unitJackets);
        dcm.myClick(dcm.product);
    }

    @When("User must verify the Product")
    public void userMustVerifyTheProduct() {
        dcm.verifyContainsText(dcm.productName, "Taurus Elements Shell");
        dcm.verifyContainsText(dcm.productCode, "MJ09");
    }

    @Then("User must search for the product name as {string} in search box")
    public void userMustSearchForTheProductNameAsInSearchBox(String product) {
        lfm.myClick(lfm.logo);
        lfm.mySendKeys(dcm.searchBox,product);
        dcm.myClick(dcm.searchButton);
        dcm.verifyContainsText(dcm.verifyProduct,"Taurus Elements Shell");
    }

    @And("User must enter an invalid product code as {string} in search box")
    public void userMustEnterAnInvalidProductCodeAsInSearchBox(String code) {
        dcm.mySendKeys(dcm.searchBox,code);
        dcm.myClick(dcm.searchButton);
    }

    @And("User should see the error message")
    public void userShouldSeeTheErrorMessage() {
        dcm.verifyContainsText(dcm.errorMessageProduct, "Your search returned no results.");
    }
}
