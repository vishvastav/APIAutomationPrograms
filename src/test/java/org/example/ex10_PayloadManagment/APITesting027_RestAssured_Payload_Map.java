package org.example.ex10_PayloadManagment;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.codehaus.groovy.util.ListHashMap;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class APITesting027_RestAssured_Payload_Map {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingID;

    @Test
    public void test_POST() {

//        String payload_POST = "{\n" +
//                "    \"firstname\" : \"Parmod\",\n" +
//                "    \"lastname\" : \"Dutta\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";


        Map<String, Object> jsoBdyUsingMap = new ListHashMap<>();
        jsoBdyUsingMap.put("firstname","Pramod");
        jsoBdyUsingMap.put("lastname","Pramod");
        jsoBdyUsingMap.put("totalprice",123);
        jsoBdyUsingMap.put("depositpaid",false);

        Map<String,Object > bookingDatesMap = new LinkedHashMap<>();
        bookingDatesMap.put("checkin","2018-01-01");
        bookingDatesMap.put("checkout","2019-01-01");



        jsoBdyUsingMap.put("bookingdates",bookingDatesMap);
        jsoBdyUsingMap.put("additionalneeds","Breakfast");
        System.out.println(jsoBdyUsingMap);

    }


}
