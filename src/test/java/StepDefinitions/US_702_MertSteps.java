package StepDefinitions;

import Pages.DialogContent_Mert;
import Pages.LeftNav_Mert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_702_MertSteps {
    LeftNav_Mert lfm = new LeftNav_Mert();
    DialogContent_Mert dcm = new DialogContent_Mert();

    @When("Click on the sign In button")
    public void clickOnTheSignInButton() {
        lfm.myClick(lfm.SignInButton);
    }

    @Then("Log in without filling in username and password")
    public void logInWithoutFillingInUsernameAndPassword() {
        lfm.myClick(lfm.LoginButton);
    }

    @And("User should receive incorrect login warning")
    public void userShouldReceiveIncorrectLoginWarning() {
        lfm.verifyContainsText(dcm.errorMessage, "sign in with your email address");
    }

    @And("User should only fill in the e-mail section")
    public void userShouldOnlyFillInTheEMailSection() {
        dcm.mySendKeys(dcm.emailInput, "TestTitans2@example.com");
        dcm.myClick(lfm.LoginButton);
    }

    @And("User should receive password warning")
    public void userShouldReceivePasswordWarning() {
        lfm.verifyContainsText(dcm.passwordErrorMessage, "required field");
    }

    @And("User should only fill in the password section")
    public void userShouldOnlyFillInThePasswordSection() {
        dcm.mySendKeys(dcm.passwordInput, "Passw0rd");
        dcm.myClick(lfm.LoginButton);
    }

    @And("User should receive e-mail warning")
    public void userShouldReceiveEMailWarning() {
        lfm.verifyContainsText(dcm.eMailErrorMessage, "required field");
    }

    @And("User must enter wrong email and password")
    public void userMustEnterWrongEmailAndPassword() {
        dcm.mySendKeys(dcm.emailInput, "meeeer.t@gmail.com");
        dcm.mySendKeys(dcm.passwordInput, "12345");
        dcm.myClick(lfm.LoginButton);
    }

    @And("User should receive incorrect email and password warning")
    public void userShouldReceiveIncorrectEmailAndPasswordWarning() {
        lfm.verifyContainsText(dcm.emailAndPasswordError, "sign-in was incorrect");
    }
}
