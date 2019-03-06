package com.raychou.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    /**
     * 超时时间测试
     * @throws InterruptedException
     */

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);
    }
}
