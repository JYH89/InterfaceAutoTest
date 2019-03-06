package com.raychou.testng;

import org.testng.annotations.*;

/**
 * Created by RayChou on 2019-3-6.
 */
public class BasicAnnotation {
    /**
     * 最基本的testng的注解，用于标记方法是测试的一部分
     */
    @Test
    public void testCace1(){
        System.out.println ("testCase1正在执行");
    }

    @Test
    public void testCace2(){
        System.out.println ("testCase2正在执行");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println ("BeforeMethod在testCase1前执行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println ("afterMethod在testCase1前执行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println ("beforClass在类最前执行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println ("afterClass在类最后执行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println ("beforeSuite在beforeClass前执行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println ("afterSuite在afterSuite后执行");
    }

}
