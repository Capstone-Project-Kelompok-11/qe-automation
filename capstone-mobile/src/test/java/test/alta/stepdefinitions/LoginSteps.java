package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.alta.pages.LoginScreen;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    @Steps
    LoginScreen loginScreen;

    @Given("user on the home page")
    public void userOnTheHomePage() {
        loginScreen.userOnTheHomePage();
    }

    @And("user click next button")
    public void userClickNextButton() {
        loginScreen.userClickNextButton();
    }

    @And("user click login page")
    public void userClickLoginPage() {
        loginScreen.userClickLoginPage();
    }

    @When("user input {string} on email field")
    public void inputEmail(String email){
        loginScreen.inputEmail(email);
    }

    @And("user input {string} on password field")
    public void inputPassword(String password){
        loginScreen.inputPassword(password);
    }

    @Then("user click sign in button")
    public void userClickSignInButton() {
        loginScreen.userClickSignInButton();
    }

    @And("user click view all in popular course")
    public void userClickViewAllInPopularCourse() {
        loginScreen.userClickViewAllInPopularCourse();
    }

    @And("user click category All")
    public void userClickCategoryAll() {
        loginScreen.userClickCategoryAll();
    }

    @Then("user see all the course that want to take")
    public void userSeeAllTheCourseThatWantToTake() {
        loginScreen.userSeeAllTheCourseThatWantToTake();
    }

    @And("user click my course button")
    public void userClickMyCourseButton() {
        loginScreen.userClickMyCourseButton();
    }

    @And("user click any course")
    public void userClickAnyCourse() {
        loginScreen.userClickAnyCourse();
    }

    @When("user click Take a Quiz")
    public void userClickTakeAQuiz() {
        loginScreen.userClickTakeAQuiz();
    }

    @Then("user see all the quiz")
    public void userSeeAllTheQuiz() {
        loginScreen.userSeeAllTheQuiz();
    }

    @And("user click complete section")
    public void userClickCompleteSection() {
        loginScreen.userClickCompleteSection();
    }

    @Then("user can see all the complete history")
    public void userCanSeeAllTheCompleteHistory() {
        loginScreen.userCanSeeAllTheCompleteHistory();
    }

    @When("user click get certificate")
    public void userClickGetCertificate() {
        loginScreen.userClickGetCertificate();
    }

    @And("user give {int} star")
    public void userGiveStar(int star) {
        loginScreen.userGiveStar(star);
    }

    @And("user input {string} on review field")
    public void userInputOnReviewField(String review) {
        loginScreen.userInputOnReviewField(review);
    }

    @Then("user click on submit button")
    public void userClickOnSubmitButton() {
        loginScreen.userClickOnSubmitButton();
    }

    @Then("user click on download button")
    public void userClickOnDownloadButton() {
        loginScreen.userClickOnDownloadButton();
    }
}
