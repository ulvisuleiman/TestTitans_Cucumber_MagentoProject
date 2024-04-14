package StepDefinitions;

import Pages.DialogContent_Mert;
import Pages.LeftNav_Mert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_702_MertSteps {
    LeftNav_Mert lfm=new LeftNav_Mert();
    DialogContent_Mert dcm=new DialogContent_Mert();
    @When("Click on the Sign In button")
    public void clickOnTheSignInButton() {
        lfm.myClick(lfm.SignInButton);
    }

    @Then("Log in without filling in username and password")
    public void logInWithoutFillingInUsernameAndPassword() {
        lfm.myClick(lfm.LoginButton);
    }
}
