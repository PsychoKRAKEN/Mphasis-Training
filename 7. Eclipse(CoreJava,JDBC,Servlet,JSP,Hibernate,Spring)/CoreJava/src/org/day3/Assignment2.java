package org.day3;

public class Assignment2 {
	public static void main(String[] args) {
		
		Insurance i1 = new Insurance(101,"Health",500000);
	    Bank c1 = new Bank(10110, 100000,"Avinash Sinha",i1);
	    Insurance i2 = new Insurance(102,"Life",10000000);
	    Bank c2 = new Bank(101122, 2000000,"Jhon Doe",i2);
	    c1.displayCustomerDetails();
	    c2.displayCustomerDetails();

	}
}
