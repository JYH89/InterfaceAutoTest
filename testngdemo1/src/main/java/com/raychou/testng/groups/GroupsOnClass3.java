package com.raychou.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher(){
        System.out.println("GroupsOnClass3中的teacher运行");
    }
}
