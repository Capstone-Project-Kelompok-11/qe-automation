package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By signInButton() {
        return By.xpath("//a[.='Sign In']");
    }

    private By emailField() {
        return By.id("email");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginButton() {
        return By.xpath("//button[@class='bg-blue-500 text-white mt-6 py-2 px-4 rounded-lg w-full']");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public void validateOnLoginPage() {
        $(signInButton()).isDisplayed();
    }

    @Step
    public void clickSignInButton() {
        $(signInButton()).click();
    }

    @Step
    public void inputEmail(String username) {
        $(emailField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }
}
