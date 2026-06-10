package starter.demoblaze.api;

import io.restassured.http.ContentType;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.rest.SerenityRest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.UUID;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(SerenityJUnit5Extension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class WhenTestingAuthApiTest {

    private static final String SIGNUP_URL = "https://api.demoblaze.com/signup";
    private static final String LOGIN_URL = "https://api.demoblaze.com/login";

    private static final String UNIQUE_USER = "testuser_" + UUID.randomUUID().toString().substring(0, 8);
    private static final String PASSWORD = "password123";

    private String createPayload(String username, String password) {
        return "{\n  \"username\": \"" + username + "\",\n  \"password\": \"" + password + "\"\n}";
    }

    @Test
    @Order(1)
    void shouldCreateNewUserSuccessfully() {
        String payload = createPayload(UNIQUE_USER, PASSWORD);

        String responseBody = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(SIGNUP_URL)
                .then()
                .statusCode(200)
                .extract().body().asString();
                
        org.assertj.core.api.Assertions.assertThat(responseBody.replace("\"", "").trim())
            .withFailMessage("El cuerpo de la respuesta fue: [%s]", responseBody)
            .isEmpty();
    }

    @Test
    @Order(2)
    void shouldFailWhenCreatingExistingUser() {
        String payload = createPayload(UNIQUE_USER, PASSWORD);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(SIGNUP_URL)
                .then()
                .statusCode(200)
                .body("errorMessage", equalTo("This user already exist."));
    }

    @Test
    @Order(3)
    void shouldLoginSuccessfullyWithCorrectCredentials() {
        String payload = createPayload(UNIQUE_USER, PASSWORD);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(LOGIN_URL)
                .then()
                .statusCode(200)
                .body(containsString("Auth_token:"));
    }

    @Test
    @Order(4)
    void shouldFailLoginWithIncorrectCredentials() {
        String payload = createPayload(UNIQUE_USER, "wrong_password");

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(LOGIN_URL)
                .then()
                .statusCode(200)
                .body("errorMessage", equalTo("Wrong password."));
    }
}
