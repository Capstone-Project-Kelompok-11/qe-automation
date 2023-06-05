package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CoursePage;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class CreateCourseStep {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    CoursePage coursePage;

    @Given("I am on the login page to create course")
    public void onLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I login to create course")
    public void loginToCreateCourse() {
        loginPage.clickSignInButton();
        loginPage.inputEmail("test@mail.com");
        loginPage.inputPassword("password");
        loginPage.clickLoginButton();
    }

    @And("I am on the home page to create course")
    public void onHomePage() {
        homePage.validateOnHomePage();
    }

    @And("I click course to create course")
    public void clickCourseToCreate() {
        homePage.clickCourseButton();
        coursePage.validateOnCoursePage();
    }

    @And("I click on new course button")
    public void clickNewCourse() {
        coursePage.clickNewCourseButton();
    }

    @And("I fill the course data form")
    public void fillCourseData() {
        coursePage.inputCourseName("test 123");
        coursePage.inputCourseDesc("asdasdasd");
        coursePage.inputCoursePrice("2500000");
        coursePage.clickLevelCourse();
        coursePage.chooseLevelCourse();
        coursePage.clickCategoryCourse();
        coursePage.chooseCategoryCourse();
    }

    @Then("I click upload")
    public void clickUploadToCreate() {
        coursePage.clickUploadButton();
    }
}
