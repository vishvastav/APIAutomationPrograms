package org.example.ex01_RA_Basics;

import io.restassured.RestAssured;

public class APITesting002_MultipleTestCases {
    public static void main(String[] args) {

        String pincode = "110048";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110061").
                when()
                .get()
                .then().log().all().statusCode(200);

        pincode = "@";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110061").
                when()
                .get()
                .then().log().all().statusCode(200);

        pincode = "";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110061").
                when()
                .get()
                .then().log().all().statusCode(200);

        pincode = "110061";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/US/110061").
                when()
                .get()
                .then().log().all().statusCode(200);




    }
}
