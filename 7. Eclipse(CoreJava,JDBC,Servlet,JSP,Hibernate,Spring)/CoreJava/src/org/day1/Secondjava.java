package org.day1;
import java.lang.*;
import java.util.*;

public class Secondjava {
	
	public static void main(String[] args) {
		
		System.out.println("Enter 5 numbers:");
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		
		int sum=(a+b+c+d+e);
		int avg=sum/5;
		
		System.out.print("Sum is : "+sum+" and average is : "+avg);
		
	}

}
