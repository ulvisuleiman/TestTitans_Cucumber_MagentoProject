package StepDefinitions;

import Pages.DialogContent_Oguzhan;
import Pages.LeftNav_Oguzhan;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_701_OguzhanSteps {

    LeftNav_Oguzhan ln = new LeftNav_Oguzhan();
    DialogContent_Oguzhan dc = new DialogContent_Oguzhan();

    @Given("Navigate to Magento Website")
    public void navigateToMagentoWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Click on the register button")
    public void clickOnTheRegisterButton(DataTable leftNavButton) {
        List<String> LeftNavButtonList = leftNavButton.asList(String.class);

        for (int i = 0; i < LeftNavButtonList.size(); i++) {
            WebElement webElement = ln.getWebElement(LeftNavButtonList.get(i));
            ln.myClick(webElement);
        }

    }

    @Then("fill in user information")
    public void fillInUserInformation(DataTable accountText) {
        List<List<String>> AccountTextList = accountText.asLists(String.class);

        for (int i = 0; i < AccountTextList.size(); i++) {
            WebElement webElement = dc.getWebelement(AccountTextList.get(i).get(0));
            dc.mySendKeys(webElement, AccountTextList.get(i).get(2));

        }
    }

    @And("Password strength control")
    public void passwordStrengthControl() {
        dc.verifyContainsText(dc.passwordStrength, "Medium");
    }

    @And("Click on the Create an Account button")
    public void clickOnTheCreateAnAccountButton(DataTable createButton) {
        List<String> CreateButtonList = createButton.asList(String.class);

        for (int i = 0; i < CreateButtonList.size(); i++) {
            WebElement webElement = dc.getWebelement(CreateButtonList.get(i));
            dc.myClick(webElement);
        }

    }

    @And("User should be register successfullied")
    public void userShouldBeRegisterSuccessfullied() {
        dc.verifyContainsText(dc.accountSuccessfuly, "Thank you for registering with Main Website Store.");
    }


}
