package org.day4;
import java.lang.*;
import java.util.*;

abstract class Abstractexample1
{
	abstract void openAccount();
	abstract void deposite();
	abstract void applyCreditcard();
	abstract void applyDebitcard();

	void login()
	{
		System.out.println("this is login page");
	}
}

class Abstractexample extends Abstractexample1
{

	@Override      //redefining the method 
	void openAccount() 
	{
		
		System.out.println("this is openaccount");
	}

	@Override
	void deposite() {
		
		System.out.println("deposite");
	}

	@Override
	void applyCreditcard() {
	System.out.println("apply for credit card");
	}

	@Override
	void applyDebitcard() {
		System.out.println("apply for debit card");
	}
	
	public static void main(String[] args) {
		Abstractexample ob=new Abstractexample();
		ob.openAccount();
		ob.applyDebitcard();
		ob.applyCreditcard();
		ob.deposite();
		ob.login();
		
	}
}

