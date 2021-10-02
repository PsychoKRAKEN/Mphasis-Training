package org.day5;
import java.util.*;

public class Assignment1 extends Thread
{
	public static void main(String[] args) throws Exception  
	{
		
		try {
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter your Salary");
			int salary=ob.nextInt();
			if(salary<=15000)
			{
				throw new Exception("Salary is to less to continue");
			}
			else
			{
				System.out.println("You are Eligible");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
		
	}
}

