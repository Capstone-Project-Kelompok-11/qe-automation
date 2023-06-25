package test.alta.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

    private AndroidDriver<MobileElement> driver;

    private By nextButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    }

    private By loginPage() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]");
    }

    private By signIn() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Sign In\"]");
    }

    private By viewAll() {
        return MobileBy.xpath("(//android.view.View[@content-desc=\"View All\"])[1]");
    }

    private By categoryAll() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"All\"]");
    }

    private By courseButton() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"My Course\n" +
                "Tab 2 of 4\"]");
    }

    private By firstCourse() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Life is Short hahcxzcz\n" +
                "4 / 5 Lesson\"]");
    }

    private By TakeQuiz() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Take Quiz\"]");
    }

    private By seeAllTheCourse() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Quiz\"]");
    }

    private By completeButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Complete\n" +
                "Tab 2 of 2\"]");
    }

    private By courseHistory() {
        return MobileBy.xpath("(//android.widget.ImageView[@content-desc=\"Basic Microsoft Word\n" +
                "Completed\n" +
                "Get Certificate\"])[1]");
    }

    private By getCertificate() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View");
    }

    private By rating() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[7]");
    }

    private By ratingField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    }

    private By submitField() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    }

    private By downloadButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Download\"]");
    }

    private By seeAllTheCourseThat() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Backend With Golang\n" +
                "0\n" +
                "Rp. 30.000\"]");
    }

    @Step
    public boolean userOnTheHomePage() {
        return waitUntilVisible(nextButton()).isDisplayed();
    }

    @Step
    public void userClickNextButton() {
        onClick(nextButton());
        onClick(nextButton());
        onClick(nextButton());
    }

    @Step
    public void userClickLoginPage() {
        onClick(loginPage());
    }

    @Step
    public void inputEmail(String email) {
        onClick(emailField());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onType(emailField(), email);
    }

    @Step
    public void inputPassword(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void userClickSignInButton() {
        scrollAndClick("Sign In");
    }

    private void scrollAndClick(String visibleText) {
        String uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"" + visibleText + "\").instance(0))";
        ((AndroidDriver<MobileElement>) getDriver()).findElementByAndroidUIAutomator(uiAutomator).click();
    }

    @Step("user click view all in popular course")
    public void userClickViewAllInPopularCourse() {
        onClick(viewAll());
    }

    @Step("user click category All")
    public void userClickCategoryAll() {
        onClick(categoryAll());
    }

    @Step("user see all the course that want to take")
    public boolean userSeeAllTheCourseThatWantToTake() {
        return waitUntilVisible(seeAllTheCourseThat()).isDisplayed();
    }

    @Step("user click my course button")
    public void userClickMyCourseButton() {
        onClick(courseButton());
    }

    @Step("user click any course")
    public void userClickAnyCourse() {
        AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>) getDriver();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new TouchAction(androidDriver)
                .tap(PointOption.point(565, 549))
                .perform();
    }

    @Step("user click Take a Quiz")
    public void userClickTakeAQuiz() {
        onClick(TakeQuiz());
    }

    @Step("user see all the quiz")
    public boolean userSeeAllTheQuiz() {
        return waitUntilVisible(seeAllTheCourse()).isDisplayed();
    }

    @Step("user click complete section")
    public void userClickCompleteSection() {
        onClick(completeButton());
    }

    @Step("user can see all the complete history")
    public boolean userCanSeeAllTheCompleteHistory() {
        return waitUntilVisible(courseHistory()).isDisplayed();
    }

    @Step("user click get certificate")
    public void userClickGetCertificate() {
        AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>) getDriver();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new TouchAction(androidDriver)
                .tap(PointOption.point(659, 941))
                .perform();
    }

    @Step("user give {int} star")
    public void userGiveStar(int star) {
        onClick(rating());
    }

    private void hideKeyboard() {
        ((AndroidDriver<MobileElement>) getDriver()).hideKeyboard();
    }

    @Step("user input {string} on review field")
    public void userInputOnReviewField(String review) {
        onClick(ratingField());
        onType(ratingField(), review);
        hideKeyboard();
    }

    @Step("user click on submit button")
    public void userClickOnSubmitButton() {
        onClick(submitField());
    }

    @Step("user click on download button")
    public void userClickOnDownloadButton() {
        onClick(downloadButton());
    }

}
