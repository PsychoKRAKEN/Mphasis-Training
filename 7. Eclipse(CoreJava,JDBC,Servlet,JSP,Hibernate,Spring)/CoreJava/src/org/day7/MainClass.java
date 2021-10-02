package org.day7;

public class MainClass extends Thread {
	public static void main(String[] args) 
	{
		Thread1 ob1=new Thread1();
		Thread2 ob2=new Thread2();
		Thread3 ob3=new Thread3();
		ob1.start();
		System.out.println(ob1.isAlive());
		ob2.start();
		System.out.println(ob2.isAlive());
		ob3.start();
		System.out.println(ob3.isAlive());
		
		try {
			sleep(11000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(ob1.isAlive());
		System.out.println(ob2.isAlive());
		System.out.println(ob3.isAlive());
		
		
		
		/*
		Thread1 ob4=new Thread1();
		Thread1 ob5=new Thread1();
		Thread1 ob6=new Thread1();
		ob4.start();
		ob5.start();
		ob6.start();
		*/
	}

}
