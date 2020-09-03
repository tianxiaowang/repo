package com.Bank.java;

public class Test {
    public static void main(String[] args) {
        Customer crus=new Customer("Jane","Smith");
        Account acct=new Account(1000,2000,0.0123);
        crus.setAccount(acct);
    }
}
