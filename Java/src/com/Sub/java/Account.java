package com.Sub.java;

public class Account {

    private int id;
    private double balance;
    private double annuuallnterestRate;

    public Account(int id,double balance,double annuuallnterestRate){
        this.id=id;
        this.balance=balance;
        this.annuuallnterestRate=annuuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuuallnterestRate() {
        return annuuallnterestRate;
    }

    public void setAnnuuallnterestRate(double annuuallnterestRate) {
        this.annuuallnterestRate = annuuallnterestRate;
    }
    public double getMonthlyInterest(){
        return annuuallnterestRate/12;
    }
    public void withdraw(double amount){
        if(balance>amount){
            balance-=amount;
            return;
        }
        System.out.println("余额不足");
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
}
