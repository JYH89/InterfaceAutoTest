package com.raychou.testng;

import org.testng.annotations.Test;

public class ExpectException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个异常测试");
        throw new RuntimeException();
    }
}
