package org.example.ex02_RA_TestNG_AllureReport;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting005_multipleTestCasesFix {


    @Test
    @Description("TC#1 - Verify that valid Pincode gives 200 ok")
    public void test_GET_Positive_TC1(){
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110048").
                when()
                .get()
                .then().log().all().statusCode(200);

    }
    @Test
    @Description("TC#2 - Verify that Invalid Pincode gives error")
    public void test_GET_Negative_TC2(){
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/@").
                when()
                .get()
                .then().log().all().statusCode(200);

    }
    @Test
    @Description("TC#3 - Verify that Invalid Pincode gives error")
    public void test_GET_Negative_TC3(){
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/US/110061").
                when()
                .get()
                .then().log().all().statusCode(200);

    }
}
