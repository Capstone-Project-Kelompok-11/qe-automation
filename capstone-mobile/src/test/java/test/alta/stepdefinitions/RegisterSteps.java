package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.LoginScreen;
import test.alta.pages.RegisterScreen;

public class RegisterSteps {

    @Steps
    RegisterScreen registerSteps;

    @Steps
    LoginScreen loginScreen;

    @And("user click signup page")
    public void userClickSignUpPage() {
        registerSteps.userClickRegisterPage();
    }

    @When("user input {string} on fullname field")
    public void userInputOnFullnameField(String fullname) {
        registerSteps.userInputOnFullnameField(fullname);
    }

    @And("user input {string} on username field")
    public void userInputOnUsernameField(String username) {
        registerSteps.userInputOnUsernameField(username);
    }

    @And("user input {string} on email signup field")
    public void userInputOnEmailSignupField(String email) {
        registerSteps.inputEmailSignUp(email);
    }

    @And("user input {string} on password signup field")
    public void userInputOnPasswordSignupField(String password) {
        registerSteps.inputPasswordSignup(password);
    }

    @And("user input {string} on confirmpassword field")
    public void userInputOnConfirmpasswordField(String confirmpassword) {
        registerSteps.userInputOnConfirmpasswordField(confirmpassword);
    }

    @Then("user click sign up button")
    public void userClickSignUpButton() {
        registerSteps.userClickSignUpButton();
    }
}
