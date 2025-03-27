package org.example.ex09_Assertions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.requestSpecification;
import static org.assertj.core.api.Assertions.*;

public class APITesting026_TestNG_AssertJ_Assertions {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingID;
    @Test
    public void test_POST() {

        String payload_POST = "{\n" +
                "    \"firstname\" : \"Parmod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload_POST).log().all();

        Response response = requestSpecification.when().post();

        //Get Variable response to perform validation
        validatableResponse = response.then().log().all();

        //Rest Assuered
        validatableResponse.statusCode(200);
        validatableResponse.body("booking.firstname", Matchers.equalTo("Parmod"));
        validatableResponse.body("booking.lastname",Matchers.equalTo("Dutta"));
        validatableResponse.body("booking.depositpaid",Matchers.equalTo(true));
        validatableResponse.body("bookingid",Matchers.notNullValue());


        bookingID = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        Assert.assertNotNull(bookingID);
        Assert.assertEquals(firstname,"Pramod");
        Assert.assertEquals(lastname,"Dutta");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(firstname,"Jim");
        softAssert.assertAll();

        //AssertJ
        assertThat(bookingID).isNotNull().isNotZero().isPositive();
        assertThat(firstname).isEqualTo("Pramod").isNotEmpty().isNotBlank();


    }


}
