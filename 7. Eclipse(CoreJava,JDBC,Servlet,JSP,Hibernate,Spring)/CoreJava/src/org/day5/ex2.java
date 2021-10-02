package org.day5;

import java.util.*;
public class ex2 
{
public static void main(String[] args) 
{
	try
	{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter 2 nos");
	int a=ob.nextInt();
	int b=ob.nextInt();
	int c=a/b;
	System.out.println("the result is "+c);
	}
		catch(ArithmeticException x)//only ArithmeticException
	{
		System.out.println("the errorr is "+x);
	}
	catch(InputMismatchException x)//only InputMismatchException
	{
		System.out.println("the erroor is "+x);
	}
	catch(Exception x) //handle all type of error
	{
		System.out.println("the error is "+x);
	}
	System.out.println("this is end of the program");
}
}