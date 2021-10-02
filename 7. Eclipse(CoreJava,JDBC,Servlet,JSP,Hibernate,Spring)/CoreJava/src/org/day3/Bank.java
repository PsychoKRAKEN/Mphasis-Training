package org.day3;

public class Bank {
	int accNo;
    int balance;
    String name;
    Insurance insurance;

    Bank(int accNo, int balance, String name, Insurance insurance) {
        this.accNo = accNo;
        this.balance = balance;
        this.name = name;
        this.insurance = insurance;
    }
    Bank(){
        
    }
    
    public void displayCustomerDetails() {
        System.out.println("Customer Name: "+name);
        System.out.println("Account Number: "+accNo);
        System.out.println("Account Balance: "+balance);
    }
}
