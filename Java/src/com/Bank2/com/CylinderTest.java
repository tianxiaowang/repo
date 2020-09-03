package com.Bank2.com;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.setRadius(2.1);
        c1.setLength(3.4);
        System.out.println(c1.findVolume());
    }
}
