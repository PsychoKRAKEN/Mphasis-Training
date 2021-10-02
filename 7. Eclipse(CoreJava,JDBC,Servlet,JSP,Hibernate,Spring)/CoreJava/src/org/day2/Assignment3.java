package org.day2;
import  java.util.*;
import java.lang.*;



public class Assignment3 {
	
	private int accno,pin;
	private String name,pass;
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public static void main(String[] args) {
		
		Assignment3 ob=new Assignment3();
		ob.setAccno(1234);
		ob.setName("Akash");
		ob.setPin(7676);
		ob.setPass("akash123");
		System.out.println("the accno is "+ob.getAccno());
		System.out.println("the name is "+ob.getName());
		System.out.println("the pin is "+ob.getPin());
		System.out.println("the password is "+ob.getPass());
		
	}
	
	

}
