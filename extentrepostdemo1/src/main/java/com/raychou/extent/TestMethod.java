package com.raychou.extent;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod {
    @Test
    public void test1(){
        Assert.assertEquals(2,1);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("AAA","AAA");
    }
    @Test
    public void logdemo(){
        Reporter.log("这是我的日志");
        throw new RuntimeException();
    }
}
