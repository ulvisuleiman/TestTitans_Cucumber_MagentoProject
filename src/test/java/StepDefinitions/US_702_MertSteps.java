package StepDefinitions;

import Pages.DialogContent_Mert;
import Pages.LeftNav_Mert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class US_702_MertSteps {
    LeftNav_Mert lfm = new LeftNav_Mert();
    DialogContent_Mert dcm = new DialogContent_Mert();

    @When("Click on the Sign In button")
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

    @Then("User should only fill in the e-mail section")
    public void userShouldOnlyFillInTheEMailSection() {
        dcm.mySendKeys(dcm.emailInput, "TestTitans2@example.com");
        dcm.myClick(lfm.LoginButton);
    }

    @And("User should receive password warning")
    public void userShouldReceivePasswordWarning() {
        lfm.verifyContainsText(dcm.passwordErrorMessage, "required field");
    }

    @Then("User should only fill in the password section")
    public void userShouldOnlyFillInThePasswordSection() {
        dcm.mySendKeys(dcm.passwordInput, "Passw0rd");
        dcm.myClick(lfm.LoginButton);
    }

    @And("User should receive e-mail warning")
    public void userShouldReceiveEMailWarning() {
        lfm.verifyContainsText(dcm.eMailErrorMessage, "required field");
    }

    @Then("User must enter wrong email and password")
    public void userMustEnterWrongEmailAndPassword() {
        dcm.mySendKeys(dcm.emailInput, "meeeer.t@gmail.com");
        dcm.mySendKeys(dcm.passwordInput, "12345");
        dcm.myClick(lfm.LoginButton);
    }

    @And("User should receive incorrect email and password warning")
    public void userShouldReceiveIncorrectEmailAndPasswordWarning() {
        lfm.verifyContainsText(dcm.emailAndPasswordError, "sign-in was incorrect");
    }

    @Then("Finally, user must login to the account")
    public void finallyUserMustLoginToTheAccount() throws IOException {
        String path = "src/test/java/ApachePOI/resource/UsernameAndPassword.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        String searchWord = "Username";
        String searchWord1 = "Password";

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(searchWord)) {

                for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    dcm.mySendKeys(dcm.emailInput, String.valueOf(sheet.getRow(0).getCell(1)));
                }

                if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(searchWord1)) {

                    for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                        dcm.mySendKeys(dcm.passwordInput, String.valueOf(sheet.getRow(1).getCell(1)));

                    }
                }
            } dcm.myClick(lfm.LoginButton);
        }
    }

    @And("User should see successful login message")
    public void userShouldSeeSuccessfulLoginMessage() {
        lfm.verifyContainsText(dcm.confirmLogin, "Welcome");
    }

    @Then("User should click on the Logout button")
    public void userShouldClickOnTheLogoutButton() {
        dcm.myClick(dcm.logoutClick);
        dcm.myClick(dcm.logoutButton);
        lfm.myClick(lfm.SignInButton);
    }

    @And("User should be able to see the Forgot my Password button")
    public void userShouldBeAbleToSeeTheForgotMyPasswordButton() {
        lfm.myClick(lfm.forgotMyPasswordButton);
    }
}
