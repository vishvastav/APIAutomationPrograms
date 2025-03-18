package org.example.ex03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting007_GET_BDDSTyle {

    @Test
    @Description("TC#1 - Verify that valid Pincode gives 200 ok")
    public void test_GET_Req_Positive_TC1(){
        String pin_code = "388620";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code).
                when()
                .get()
                .then().log().all().statusCode(200);

    }
    @Test
    @Description("TC#2 - Verify that Invalid Pincode gives error")
    public void test_GET_Req_Negative_TC2(){
        String pin_code = "@";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code).
                when()
                .get()
                .then().log().all().statusCode(200);

    }


}
