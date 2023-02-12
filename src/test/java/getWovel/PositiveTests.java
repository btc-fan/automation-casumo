//package getWovel;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//
//import static org.hamcrest.Matchers.equalTo;
//
//public class PositiveTests {
//
//    @BeforeAll
//    public static void setUp() {
//        RestAssured.baseURI = "http://localhost:8080";
//    }
//
//    @ParameterizedTest
//    @CsvSource({
//            "aeiou, '', 200", // Only Vowels lowercase
//            "AEIOU, '', 200", // Only Vowels uppercase
//            "sasepisolusasepisolu,sspslsspsl, 200",  // Only lowercase
//            "SASEPISOLUSASEPISOLU, SSPSLSSPSL, 200", // Only uppercase
//            "sasepisolu sasepisolu,sspsl sspsl, 200",  // Only lowercase with space
//            "SAsasepisolu EPIsasepisoluOLU, Ssspsl PsspslL, 200", // Combined lowercase and uppercase
//            "@#%$aei@#o$32u,@#%$@#o$u, 200",  // TBD Only lowercase
////            "MAX_LENGTH , 'TBD', 200", // TODO find out what is max length
////            "MIN_LENGTH , 'TBD', 200", // TODO find out what is min length
//
//    })
//    public void testGetWithPositiveValues(String givenValue, String expectedValue, int expectedStatusCode) {
//        Response response = RestAssured.get("/" + givenValue);
//
//        response.then()
//                .statusCode(expectedStatusCode)
//                .body(equalTo(expectedValue));
//    }
//}
