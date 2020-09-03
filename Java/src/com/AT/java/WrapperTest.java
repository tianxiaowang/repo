package com.AT.java;

import org.junit.Test;

public class WrapperTest {
    //基本数据类型-->包装类，调用包装类的构造器
    @Test
    public void test1(){
        int num1=20;
        Integer in1=new Integer(num1);
        System.out.println(in1.toString());

    }
}
