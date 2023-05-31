package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {

    @Steps
    Authentication_Login post;

    @Given("user set endpoint for login")
    public void userSetEndpointForLogin() {
        post.userSetEndpointForLogin();
    }

    @When("user send POST HTTP request with valid data")
    public void userSendPOSTHTTPRequestWithValidData() {
        post.userSendPOSTHTTPRequestWithValidData();
    }

    @Then("user see status code 201")
    public void userSeeStatusCode() {
        post.userSeeStatusCode201();
    }

    @And("get valid data")
    public void getValidData() {
        post.getValidData();
    }

}
