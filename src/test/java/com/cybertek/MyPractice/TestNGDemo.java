package com.cybertek.MyPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGDemo {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }



    @BeforeMethod
    public void setup(){
        System.out.println("Before Method");
    }

    @Test (priority = 3)
    public void test1(){
        String word1 = "java";
        String word2 = "java";
        System.out.println("Test1");
        Assert.assertEquals(word1, word2);

    }
    @Test (priority = 2)
    public void test2(){
        String word1 = "javascript";
        String word2 = "javascript";
        System.out.println("Test2");
        Assert.assertEquals(word1, word2);

    }
    @Test (priority = 1)
    public void test3(){
          Assert.assertTrue(15>10);

    }


    @AfterMethod
    public void teardown(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");

    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
