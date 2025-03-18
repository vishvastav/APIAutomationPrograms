package org.example.ex07_DELETE_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting012_DELETE_NonBDDStyle {
    @Description("Verify the PUT Request for Restful Booker APIs")
    @Test
    public void test_put_non_bdd(){

        String token = "f18cd05d7614d7f";
        String bookingid = "111";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);


        Response response = requestSpecification.when().delete();

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(201);

    }
}
