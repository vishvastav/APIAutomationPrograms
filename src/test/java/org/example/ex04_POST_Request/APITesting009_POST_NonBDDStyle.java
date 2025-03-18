package org.example.ex04_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_POST_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Description("Verify the POST Req Positive")
    @Test
    public void test_POST_NonBDDStyle(){
        //URL,Method,Payload,body,Headers
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        System.out.println("-------Part 1--------");
        // Part 1 Pre Conditinon Preparing request
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);

        System.out.println("-------Part 2--------");
        //Making HTTP Request Part 2

        response = r.when().log().all().post();

        System.out.println("-------Part 3--------");
        //Verificatin part 3
        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
