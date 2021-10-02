package org.day2;
import java.lang.*;
import java.util.*;

class employee
{
	String name;
	int empno;
	String address;
	int salary;
	
	employee()
	{
		
		System.out.println("Enter Employee Name , Employee Number , Salary and Address  : ");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		empno=sc.nextInt();
		salary=sc.nextInt();
		address=sc.next();
		
	}
	
	void display()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Number : "+empno);
		System.out.println("Employee Address : "+address);
		System.out.println("Employee Salary : "+salary);
	}
	
}

public class Assignment1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no of Employee : ");
		
		int n=sc.nextInt();
		System.out.println("");
		
		employee[] emp=new employee[n];
		
		for(int i=0;i<n;i++)
		{
			emp[i]=new employee();
		}
		
		System.out.println("Employee Data");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("");
			System.out.println("---------------------------------------------");
			System.out.println("");
			System.out.println("Employee "+(i+1));
			emp[i].display();
		}
	}
}
