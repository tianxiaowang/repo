package com.Bank2.com;

public class Bank {
    private Customer[] customers;
    private int numberOfcustomers;

    public Bank(){
         customers=new Customer[10];
    }

    public void addCustomer(String f,String l){
        Customer cust=new Customer(f,l);
        customers[numberOfcustomers++]=cust;
    }

    public int getNumberOfcustomers(){
        return numberOfcustomers;
    }

    public Customer getcustomer(int index){
        if (index>=0&&index<customers.length){
            return customers[index];
        }
        return null;
    }
}
