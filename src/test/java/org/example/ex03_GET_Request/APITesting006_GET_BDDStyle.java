package org.example.ex03_GET_Request;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting006_GET_BDDStyle {


    @Test
    public  void test_BDD_GET(){
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110061").
                when()
                .get()
                .then().log().all().statusCode(200);

    }
}
