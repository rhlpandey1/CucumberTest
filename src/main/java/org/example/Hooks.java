package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before(order = 0)
    public void setUp(){
        System.out.println("This is the set up method 1");
    }
    @Before(order = 1)
    public void setUp1(){
        System.out.println("This is the set up method 2");
    }
    @After
    public void tearDown(){
        System.out.println("This is the tear down method");
    }
    //tagged hooks
    @After("@Second")
    public void tearDownAfterSecond(){
        System.out.println("This is the tear down method after second");
    }
}
