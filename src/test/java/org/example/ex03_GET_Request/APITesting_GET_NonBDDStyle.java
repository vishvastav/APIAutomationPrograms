package org.example.ex03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_GET_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Description("Verify the GET Positive Request")
    @Test
    public void test_NonBDD_GET_Positive(){

        String picode = "560048";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + picode);

        response = r.when().log().all().get();


        vr = response.then().log().all().statusCode(200);

    }

    @Description("Verify the GET Negative Request")
    @Test
    public void test_NonBDD_GET_Negative(){

        String picode = "-1";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + picode);

        response = r.when().log().all().get();


        vr = response.then().log().all().statusCode(404);

    }





}
