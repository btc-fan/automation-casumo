package getWovel;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.equalTo;

public class NegativeTests {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "http://localhost:8080";
    }

    @ParameterizedTest
    @CsvSource({
            "TPLKMBNV, 'TPLKMBNV', 200", // Only Consonant uppercase
            "tplkmnv, 'tplkmnv', 200", // Only Consonant lowercase
            "' ', ' ', 200", // One space
            "'' , '', 200", // Empty
            "MORE_THAN_MAX_LENGTH , 'TBD', 200", // TODO find out what is max length
            "LESS_THAN_MIN_LENGTH , 'TBD', 200", // TODO find out what is min length


    })
    public void testGetWithPositiveValues(String givenValue, String expectedValue, int expectedStatusCode) {
        Response response = RestAssured.get("/" + givenValue);

        response.then()
                .statusCode(expectedStatusCode)
                .body(equalTo(expectedValue));
    }


//
//    @Test
//    public void negativeEmptyChar() {
//        Response response = RestAssured.get("/gsas");
//        response.then()
//                .statusCode(200)
//                .body(equalTo("ss"));
//    }
//
//    @Test
//    public void negativeAboveMaxLength_200() {
//        Response response = RestAssured.get("/gsas");
//        response.then()
//                .statusCode(200)
//                .body(equalTo("ss"));
//    }

//    @Test
//    public void negativeBelowMinLength_200() {
//        Response response = RestAssured.get("/gsas");
//        response.then()
//                .statusCode(200)
//                .body(equalTo("ss"));
//    }


}
