package com.wtx.java;

public class PersonClass {
    public static void main(String[] args) {
    Person p1=new Person();
    p1.name="Kobe";
    p1.IsMale=true;
    p1.talk("chinese");
    int[] arr=new int[]{1,2};
    p1.sort(arr);
        System.out.println(arr[0]);
    }
}

 class Person{
    String name;
    int year;
    Boolean IsMale;

    public void talk(String language){
        System.out.println("语言："+language);
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sort(int[] a){
        a[0]=a[1];
    }
 }