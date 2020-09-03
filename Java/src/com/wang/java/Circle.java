package com.wang.java;

class Circle {
    double radius;

    public double findArea(){

        return Math.PI * radius * radius;
    }
    public  void setRadius(double r){
         radius=r;
    }
    public double getRadius(){
        return radius;
    }
}