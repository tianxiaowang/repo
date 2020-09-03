package com.wang.java;

public class PersonYear {
    public static void main(String[] args) {
        Year y1 = new Year();

        int temp;
        temp = y1.getYears();
        System.out.println(temp);
        Year y2=new Year(18,"Tom");
    }
}
class Year{
    private int years;
    private String name;

    public Year(){
        years=18;
    }
    public Year(int i,String j){
        years=i;
        name=j;
    }

    public void setYears(int i){
        if(i>=1&&i<=120){
            years=i;
        }else {
            System.out.println("错误");
        };

    }
    public int getYears(){
        return years;
    }
}