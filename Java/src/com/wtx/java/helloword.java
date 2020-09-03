package com.wtx.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class helloword {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int[] scores=new int[num];
        System.out.println("请输入"+num+"个学生成绩");
        for(int i=0;i<num;i++){
            scores[i]=scanner.nextInt();
        }
        int max=0;
        for (int i=0;i<num;i++){
            if(scores[i]>max){
                max=scores[i];
            }
        }
        char level;
        for(int i=0;i<num;i++){
            if (max-scores[i]<=10){
                level='A';
            }else if(max-scores[i]<=20){
                level='B';
            }else {
                level='C';
            }
            System.out.println(scores[i]+"Grade"+level);
        }

    }
}
