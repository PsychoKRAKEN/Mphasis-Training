package org.day4;
import java.lang.*;
import java.util.*;

interface employee
{
	
	
	void input();
	
	void display();
	
}

interface department
{
	
	void inputdep();
	
	void displaydep();
}

public class Assignment1 implements employee,department{
	
	int empno,depno;
	String name,dep,address;
	
	@Override 
	public void input()
	{
		System.out.println("Enter Employee Number , Name and Address : ");
		Scanner sc=new Scanner(System.in);
		empno=sc.nextInt();
		name=sc.next();
		address=sc.next();
		
		
	}
	
	@Override 
	public void display()
	{
		System.out.println("Employee Number : "+empno);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Address : "+address);
	}
	
	@Override 
	public void inputdep()
	{
		System.out.println("Enter Department Number and Department Name : ");
		Scanner sc=new Scanner(System.in);
		depno=sc.nextInt();
		dep=sc.next();
		
	}
	
	@Override 
	public void displaydep()
	{
		System.out.println("Department Number : "+depno);
		System.out.println("Department Name : "+dep);
		System.out.println("Department Address : "+address);
	}
	
	public static void main(String[] args) {
		
		Assignment1 ob=new Assignment1();
		ob.input();
		ob.inputdep();
		ob.display();
		ob.displaydep();
	}

}

