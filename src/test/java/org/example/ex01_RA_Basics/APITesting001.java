package org.example.ex01_RA_Basics;

import io.restassured.RestAssured;

public class APITesting001 {
    public static void main(String[] args) {

        //Full URL- https://api.zippopotam.us/IN/110061
        //Base URI - https://api.zippopotam.us
        //Base Path - /IN/110061
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110061").
                when()
                .get()
                .then().log().all().statusCode(200);

    }
}
