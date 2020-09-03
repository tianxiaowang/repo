package com.Bank2.com;

public class Cylinder extends Circle{

    private double length;

    public Cylinder(){
        this.length=1.0;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
        return findArea()*length;
    }
}
