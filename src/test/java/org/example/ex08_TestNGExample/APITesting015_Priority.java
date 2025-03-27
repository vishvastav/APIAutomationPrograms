package org.example.ex08_TestNGExample;

import org.testng.annotations.Test;

public class APITesting015_Priority {
    //PUT Request-
    //1. getToken
    //2. getBookingID
    //3. test_Put (Which will use abobe two methods)
    //4. closeAllThings

    @Test (priority = 4)
    public void t1(){
        System.out.println("1");
    }

    @Test (priority = 3)
    public void t2(){
        System.out.println("2");
    }
    @Test (priority = 2)
    public void t3(){
        System.out.println("3");
    }
    @Test (priority = 1)
    public void t4(){
        System.out.println("4");
    }

}
