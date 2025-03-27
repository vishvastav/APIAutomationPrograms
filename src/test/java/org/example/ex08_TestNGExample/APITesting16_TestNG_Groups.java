package org.example.ex08_TestNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting16_TestNG_Groups {
    //sanity -2
    //reg-5
    //p1-2
    @Test(groups = {"sanity","reg"})
    public void test_sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"p1","reg"})
    public void test_RegRun(){
        System.out.println("Reg");
        //System.out.println("QA");
        Assert.assertTrue(false);
    }

    @Test(groups = {"p1","reg"})
    public void test_smokeRun(){
        System.out.println("Smoke");
        //System.out.println("QA");
        Assert.assertTrue(false);
    }
}
