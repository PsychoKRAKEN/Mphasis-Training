package org.day6;
import java.util.*;

class crew
{
	String name;
	crew()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		name=sc.next();
		
	}
	
	@Override
	public String toString() {
		return "crew [name=" + name + "]";
	}
	
	
}

class adult
{
	String name;
	int tc;
	adult()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name and ticket Number: ");
		name=sc.next();
		tc=sc.nextInt();
		
	}
	@Override
	public String toString() {
		return "adult [name=" + name + ", tc=" + tc + "]";
	}
	
}

class children
{
	String name;
	int tc;
	children()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name and ticket Number: ");
		name=sc.next();
		tc=sc.nextInt();
		
	}
	@Override
	public String toString() {
		return "children [name=" + name + ", tc=" + tc + "]";
	}
	
}

public class Assignment2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		int x=1;
		while(x==1)
		{
			System.out.println("Select option : ");
			System.out.println("1. Crew Member ");
			System.out.println("2. Adult above 10 year ");
			System.out.println("3. Children Below 10 years ");
			int n=sc.nextInt();
			switch(n) {
			  case 1:
			    crew obj1=new crew();
			    ll.add(obj1);
			    break;
			  case 2:
				adult obj2=new adult();
				ll.add(obj2);
			    break;
			  case 3:
				children obj3=new children();
				ll.add(obj3);
				break;
			  default:
			    System.out.println("Wrong Choice Try Again");
			}
			
			System.out.println("Do you want to add more passengers(Type 1 for YES and 0 for NO) :");
			x=sc.nextInt();
		}
		
		System.out.println(ll);
		
		ListIterator ii=ll.listIterator();
		
		while(ii.hasNext())
		   {
		     System.out.println(ii.next());
		}
		
	}

}