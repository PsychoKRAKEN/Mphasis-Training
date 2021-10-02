package org.day1;
import java.util.*;

public class Assignment1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name,roll no and std of student :");
		String s1=sc.nextLine();
		int roll=sc.nextInt();
		int std=sc.nextInt();
		
		System.out.println("Enter Marks in 3 subject :");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		int sum=m1+m2+m3;
		int avg=sum/3;
		
		System.out.print(s1+" of class "+std+" roll no "+roll);
		
		if(avg>=75)
		{
			System.out.print(" got First Division");
		}
		else if(avg<75 && avg>=60)
		{
			System.out.print(" got Second Division");
		}
		else if(avg<60 && avg>=45)
		{
			System.out.print(" got Third Division");
		}
		else
		{
			System.out.print(" is fail");
		}
		
	}

}
