package org.example.ex08_TestNGExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting019_TestNG_Parameter {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Demo 1 TC");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start Chrome Browser");
        }
        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Start firefox Browser");
        }




    }
}
