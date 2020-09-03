package com.Bank2.com;

public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.addCustomer("Jane","Smith");
        bank.getcustomer(0).setAccount(new Account(2000));
    }
}
