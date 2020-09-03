package com.wang.java;

public class Girl {
    private String name;
    private int age;

    public Girl(){

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }
    public int compare(Girl girl){
        return this.age-girl.age;
    }
}
