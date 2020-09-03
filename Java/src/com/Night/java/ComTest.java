package com.Night.java;

public class ComTest {
    public static void main(String[] args) {
        ComparbleCircle c1=new ComparbleCircle(2.1);
        ComparbleCircle c2=new ComparbleCircle(3.6);
        int Value = c1.compareTo(c2);
        System.out.println(Value);
        
    }
}
