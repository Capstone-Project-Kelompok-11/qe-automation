package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject  {

    private By nextButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    }

    private By loginPage(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By emailField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]");
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
        onType(emailField(), email);
    }

    @Step
    public void inputPassword(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
    }

}

