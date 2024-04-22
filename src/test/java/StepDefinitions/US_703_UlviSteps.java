package StepDefinitions;

import Pages.DialogContent_Ulvi;
import Pages.LeftNav_Ulvi;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class US_703_UlviSteps {
    LeftNav_Ulvi lnu = new LeftNav_Ulvi();
    DialogContent_Ulvi dcu = new DialogContent_Ulvi();

    @Given("Navigate to Magento Shopping Website")
    public void navigateToMagentoShoppingWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("User must login to the account")
    public void userMustLoginToTheAccount() throws IOException {
        lnu.myClick(lnu.SignInButton);
        dcu.mySendKeys(dcu.emailInput, "TestTitans2@example.com");
        dcu.mySendKeys(dcu.passwordInput, "Passw0rd");
        lnu.myClick(lnu.LoginButton);
    }

    @Then("User must click on My Account and Manage Address button")
    public void userMustClickOnManageAddressButton() {
        lnu.myClick(lnu.manageAccountBtn);
        lnu.myClick(lnu.myAccountBtn);
        lnu.myClick(lnu.manageAddressesBtn);

    }

    @Given("Click on Add New Address button")
    public void clickOnAddNewAddressButton() {
        dcu.myClick(dcu.addNewAddress);
    }

    @When("User should add new address")
    public void userShouldAddNewAddress(DataTable textBoxAndTexts) {
        List<List<String>> listTxtYazi = textBoxAndTexts.asLists(String.class);
//        dcu.stateMenu.selectByIndex(4);
//       dcu.countryMenu.selectByIndex(3);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElement = dcu.getWebElement(listTxtYazi.get(i).get(0));
            dcu.mySendKeys(txtBoxWebElement, listTxtYazi.get(i).get(1));
        }
//        Select countryMenu = new Select(dcu.countryIdInput);
//        countryMenu.selectByIndex(3);
//        Select stateMenu = new Select(dcu.stateInput);
//        stateMenu.selectByIndex(2);
        dcu.mySendKeys(dcu.stateInput, "Illinois");
        dcu.selectElement(dcu.countryIdInput);
    }

    @Then("User should mark one address as the default address")
    public void userShouldMarkOneAddressAsTheDefaultAddress() {
    }

    @And("User saves the changes")
    public void userSavesTheChanges() {
        lnu.myClick(lnu.saveAddressBtn);
    }
}


