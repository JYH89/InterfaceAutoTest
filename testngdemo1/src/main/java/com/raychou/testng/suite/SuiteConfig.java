package com.raychou.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by RayChou on 2019-3-6.
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println ("beforeSuit正在执行");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println ("afterSuit正在执行");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println ("beforeTest正在执行");
    }

    @AfterTest
    public void afterTest(){
        System.out.println ("afterTest正在执行");
    }
}
