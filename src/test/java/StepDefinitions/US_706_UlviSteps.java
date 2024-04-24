package StepDefinitions;

import Pages.DialogContent_Ulvi;
import Pages.LeftNav_Ulvi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_706_UlviSteps {
    LeftNav_Ulvi lnu = new LeftNav_Ulvi();
    DialogContent_Ulvi dcu = new DialogContent_Ulvi();

    @Given("User selects a product from the items")
    public void userSelectsAProductFromTheItems() {
        lnu.myClick(lnu.product);
        lnu.myClick(lnu.sizeOfProduct);
        lnu.myClick(lnu.colorOfProduct);
    }

    @When("User adds the product to the cart and completes the order")
    public void userAddsTheProductToTheCartAndCompletesTheOrder() {
        lnu.myClick(lnu.addToCart);
        lnu.myClick(lnu.myCart);
        lnu.myClick(lnu.proceedToCheckout);
        lnu.myClick(lnu.nextBtn);
        lnu.myClick(lnu.placeOrder);
    }

    @Then("User should see successful payment message")
    public void userShouldSeeSuccessfulPaymentMessage() {
        dcu.verifyContainsText(dcu.thanksMessage, "thank");
    }
}

