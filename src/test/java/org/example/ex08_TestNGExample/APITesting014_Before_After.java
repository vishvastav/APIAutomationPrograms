package org.example.ex08_TestNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting014_Before_After {
    //PUT Request-
    //1. getToken
    //2. getBookingID
    //3. test_Put (Which will use abobe two methods)
    //4. closeAllThings

    @BeforeTest
    public void getToken(){}

    @BeforeTest
    public void getBookingID(){}


    @Test
    public  void test_PUT(){

        }

    @AfterTest
    public void closeAllThings(){}

}
