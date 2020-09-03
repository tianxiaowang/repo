package com.Bank2.com;

public class Account {

    private double balance;
    public Account(double init_balace){
        this.balance=init_balace;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if(amt>0){
            balance+=amt;
            System.out.println("存钱成功");
        }else{
            System.out.println("存钱失败");
        }
    }
    public void withdrow(double amt){
        if (amt>0){
            balance-=amt;
            System.out.println("取钱成功");
        }else{
            System.out.println("取钱失败");
        }
    }


}

