package com.wang.java;

public class Person {
    String name;
    int age;
    int sex;

    public void study(){

    }
    public void showAge(){
        System.out.println("age="+age);
    }
    public int addAge(int i){
        age+=i;
        return age;
    }
}
