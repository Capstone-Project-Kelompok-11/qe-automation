package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By title() {
        return By.xpath("//h1[@class='font-bold text-3xl text-primary-70']");
    }

    private By courseButton() {
        return By.xpath("//h1[.='Course']");
    }

    @Step
    public void validateOnHomePage() {
        $(title()).waitUntilPresent();
    }

    @Step
    public void clickCourseButton() {
        $(courseButton()).click();
    }
}
