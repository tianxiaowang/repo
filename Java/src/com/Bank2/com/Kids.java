package com.Bank2.com;

public class Kids extends ManKind{
    private int yearOld;

    public Kids(int yearOld){
        this.yearOld=yearOld;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }
    public void printAge(){
        System.out.println("I am"+yearOld+"years old");
    }
}
