package com.wang.java;

public class StudentTest {
    public static void main(String[] args) {

        student[] stus=new student[100];
        for (int i=0;i<stus.length;i++){
            stus[i]=new student();

        }
        for(int i=0;i<stus.length;i++){
            stus[i].number=i+1;
            stus[i].state=(int)(Math.random()*(6-1+1)+1);
            stus[i].score=(int)(Math.random()*(100-0+1)+1);
        }
        //for(int i=0;i<stus.length;i++) {
           // if (stus[i].state == 1) {
             //   System.out.println(stus[i].info());
           // }
      //  }
        StudentTest test=new StudentTest();
            test.sort(stus);

            for(int i=0;i<stus.length;i++) {
                System.out.println(stus[i].info());
        }
    }
    public void sort(student stus[]){
        for(int i=0;i<stus.length-1;i++) {
            for (int j = 0; j < stus.length - i - 1; j++) {
                if (stus[j].score < stus[j + 1].score) {
                    int Temp1, Temp2, Temp3;
                    Temp1 = stus[j].score;
                    stus[j].score = stus[j + 1].score;
                    stus[j + 1].score = Temp1;
                    Temp2 = stus[j].number;
                    stus[j].number = stus[j + 1].number;
                    stus[j + 1].number = Temp2;
                    Temp3 = stus[j].state;
                    stus[j].state = stus[j + 1].state;
                    stus[j + 1].state = Temp3;
                }
            }
        }

    }
}

class student{
    int number;
    int state;
    int score;

    public String info(){
        return "学号"+number + ",年纪" + state + ",成绩" + score;
    }
    }