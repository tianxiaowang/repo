package com.wang.java;

public class PassObject {
    public static void main(String[] args) {
        Circle c1=new Circle();
        PassObject p1=new PassObject();
        p1.printAreas(c1,9);
        System.out.println(c1.radius);
    }

    public void printAreas(Circle c,int time){

        System.out.println("Radius\tAreas");
        for (int i=1;i<=time;i++){
            c.radius=i;
            System.out.println("Radius"+c.radius+"Areas"+c.findArea());
        }
    }
}
