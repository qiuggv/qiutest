package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectsvqc {

        ProjectsvqcDelegate projectsvqcDelegate = new ProjectsvqcDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectsvqcDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}