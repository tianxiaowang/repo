package com.Sub.java;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount c1=new CheckAccount(1122,20000,0.045,5000);
        c1.withdraw(5000);
        System.out.println("您的账户余额"+c1.getBalance());
        System.out.println("可透支额度"+c1.getOverdraftl());
        c1.withdraw(20000);
        System.out.println("您的账户余额"+c1.getBalance());
        System.out.println("可透支额度"+c1.getOverdraftl());
    }
}
