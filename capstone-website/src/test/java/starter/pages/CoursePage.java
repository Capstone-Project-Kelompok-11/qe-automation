package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CoursePage extends PageObject {
    private By allCourse() {
        return By.xpath("//p[@class='text-2xl']");
    }

    private By newCourseButton() {
        return By.xpath("//a[.='New Course']");
    }

    private By courseNameField() {
        return By.id("courseName");
    }

    private By createDescField() {
        return By.id("createDes");
    }

    private By coursePriceField() {
        return By.id("coursePrice");
    }

    private By levelCourseField() {
        return By.id("leveCourse");
    }

    private By levelCourseOpt() {
        return By.xpath("//*[@id=\"leveCourse\"]/option[3]");
    }

    private By courseCategoryField() {
        return By.xpath("//select[@name='courseCategory']");
    }

    private By courseCategoryOpt() {
        return By.xpath("//*[@id=\"root\"]/div/form/div[3]/div[3]/div/select");
    }

    private By uploadButton() {
        return By.xpath("//button[@class='justify-end ml-auto mr-10 bg-warning-10 hover:bg-warning-30 duration-500 text-black py-2 px-6 rounded-lg text-sm']");
    }

    @Step
    public void validateOnCoursePage() {
        $(allCourse()).isDisplayed();
    }

    @Step
    public void clickNewCourseButton() {
        $(newCourseButton()).click();
    }

    @Step
    public void inputCourseName(String courseName) {
        $(courseNameField()).type(courseName);
    }

    @Step
    public void inputCourseDesc(String courseDesc) {
        $(createDescField()).type(courseDesc);
    }

    @Step
    public void inputCoursePrice(String coursePrice) {
        $(coursePriceField()).type(coursePrice);
    }

    @Step
    public void clickLevelCourse() {
        $(levelCourseField()).click();
    }

    @Step
    public void chooseLevelCourse() {
        $(levelCourseOpt()).click();
    }

    @Step
    public void clickCategoryCourse() {
        $(courseCategoryField()).click();
    }

    @Step
    public void chooseCategoryCourse() {
        $(courseCategoryOpt()).click();
    }

    @Step
    public void clickUploadButton() {
        $(uploadButton()).click();
    }
}
