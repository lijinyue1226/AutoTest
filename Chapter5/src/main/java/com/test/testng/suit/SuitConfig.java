package com.test.testng.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit运行啦");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit 运行啦");
    }
}
