package org.day5;
import java.lang.*;
import java.util.*;

public class ex1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Error is "+e);
		}
		System.out.println("Program End");
		
	}

}
