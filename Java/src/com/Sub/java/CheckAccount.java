package com.Sub.java;

public class CheckAccount extends Account{


    private double overdraftl;
   public CheckAccount(int id,double balance,double annuuallnterestRate,double overdraftl){
       super(id, balance, annuuallnterestRate);
       this.overdraftl=overdraftl;
   }
    public double getOverdraftl() {
        return overdraftl;
    }

    public void setOverdraftl(double overdraftl) {
        this.overdraftl = overdraftl;
    }
    public void withdraw(double amount){
       if (getBalance()>=amount){
       super.withdraw(amount);
       }else if(overdraftl>=amount-getBalance()){
           overdraftl-=(amount-getBalance());
           setBalance(0);
       }else {
           System.out.println("超过可透支限额");
       }
   }


}
