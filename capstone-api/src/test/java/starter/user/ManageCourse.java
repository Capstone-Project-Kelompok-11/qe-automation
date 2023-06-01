package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.hasKey;

public class ManageCourse {

    protected static String url = "https://skfw.net/api/v1/";

    @Step("user set endpoint for get course")
    public String userSetEndpointForGetCourse() {
        return url + "public/courses?page=1&size=10&search=&sort=ASC";
    }

    @Step("user send GET HTTP request")
    public void userSendGETHTTPRequest() {
        SerenityRest.given().get(userSetEndpointForGetCourse());
    }

    @Step("user see status code 200")
    public void userSeeStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("get all course show up")
    public void getAllCourseShowUp() {
        restAssuredThat(response -> response.body("$", hasKey("data")));
    }
}
