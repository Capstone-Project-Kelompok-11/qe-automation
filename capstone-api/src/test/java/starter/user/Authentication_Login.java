package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class Authentication_Login {

    protected static String url = "https://skfw.net/api/v1/";

    @Step("user set endpoint for login")
    public String userSetEndpointForLogin() {
        return url + "users/login";
    }

    @Step("user send POST HTTP request with valid data")
    public void userSendPOSTHTTPRequestWithValidData() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "testinggg1");
        requestBody.put("email", "testinggg1@gmail.com");
        requestBody.put("password", "Testing123!@@#");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(userSetEndpointForLogin());
    }

    @Step("user see status code 201")
    public void userSeeStatusCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("get valid data")
    public void getValidData() {
        restAssuredThat(response -> response.body("$", hasKey("data")));
    }

}
