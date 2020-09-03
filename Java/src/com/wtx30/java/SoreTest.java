package com.wtx30.java;

import java.util.Scanner;
import java.util.Vector;

public class SoreTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Vector v=new Vector();
        int maxScore=0;
        for(;;){
            System.out.println("请输入学生成绩（负数代表输入结束）");
            int score=scan.nextInt();
            if(score<0){
                break;
            }
            if(score>100){
                System.out.println("输入数据非法，请重新输入");
                continue;
            }

            v.addElement(score);
            if(maxScore<score) {
                maxScore=score;
            }
        }
        for (int i=0;i<v.size();i++){
            Object obj=v.elementAt(i);
            //int score=(int)obj;
            if (maxScore-(int)obj<=10){
                System.out.println("score"+(int)obj+"A");
            }else {
                System.out.println("B");
            }
        }
        Integer c1=51;
        System.out.println(c1.toString());
    }
}
