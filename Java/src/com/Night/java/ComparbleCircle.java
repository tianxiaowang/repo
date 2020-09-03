package com.Night.java;

public class ComparbleCircle extends Circle implements CompareObject{
    public ComparbleCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(Object o) {
        if(this==o){
            return 0;
        }
        if (o instanceof ComparbleCircle){
            ComparbleCircle c=(ComparbleCircle) o;
            if (this.getRadius()>c.getRadius()){
                return 1;
            }else if(this.getRadius()<c.getRadius()){
                return -1;
            }else{return 0;}
        }else{
            return -10;
        }
    }
}
