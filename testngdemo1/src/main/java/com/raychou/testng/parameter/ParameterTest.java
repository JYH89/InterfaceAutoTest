package com.raychou.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    /**
     * 利用xml文件实现参数化
     * @param name
     * @param age
     */
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = "+name+", age = "+age);
    }
}
