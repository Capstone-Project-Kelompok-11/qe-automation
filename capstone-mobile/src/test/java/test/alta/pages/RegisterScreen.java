package test.alta.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {

    private By nextButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    }

    private By registerPage() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]");
    }

    private By fullnameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[1]");
    }

    private By usernameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]");
    }

    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[3]");
    }

    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[4]");
    }

    private By confirmPasswordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[5]");
    }

    @Step
    public void userClickRegisterPage() {
        onClick(nextButton());
        onClick(nextButton());
        onClick(nextButton());
        onClick(registerPage());
    }

    private void hideKeyboard() {
        ((AndroidDriver<MobileElement>) getDriver()).hideKeyboard();
    }

    @Step
    public void userInputOnFullnameField(String fullname) {
        onClick(fullnameField());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onType(fullnameField(), fullname);
        hideKeyboard();
    }

    @Step("user input {string} on username field")
    public void userInputOnUsernameField(String username) {
        onClick(usernameField());
        onType(usernameField(), username);
        hideKeyboard();
    }

    @Step
    public void inputEmailSignUp(String email) {
        onClick(emailField());
        onType(emailField(), email);
        hideKeyboard();
    }

    @Step
    public void inputPasswordSignup(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
        hideKeyboard();
    }

    @Step
    public void userInputOnConfirmpasswordField(String confirmpassword) {
        onClick(confirmPasswordField());
        onType(confirmPasswordField(), confirmpassword);
        hideKeyboard();
    }

    @Step
    public void userClickSignUpButton() {
        scrollAndClick("Sign Up");
    }

    private void scrollAndClick(String visibleText) {
        String uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"" + visibleText + "\").instance(0))";
        ((AndroidDriver<MobileElement>) getDriver()).findElementByAndroidUIAutomator(uiAutomator).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
