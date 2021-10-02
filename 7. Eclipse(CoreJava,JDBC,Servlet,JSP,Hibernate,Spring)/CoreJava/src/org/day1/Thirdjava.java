package org.day1;
import java.util.Scanner;

public class Thirdjava {
	
	public static void main(String[] args) {
		
		System.out.println("Enter 2 numbers");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greater then "+b);
		}
		else
		{
			System.out.println(b+" is greater then "+a);
		}
		
		
	}
	
	
}
