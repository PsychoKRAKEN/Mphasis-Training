package org.day5;

import java.util.HashSet;

public class arrayvscollection {
	
	public static void main(String[] args) 
	{	//difference between array and collection
		int a[]=new int[5];//the limit is 5 we can enter 5 elements.
		HashSet ts=new HashSet();//dynamically increase.
		Student1 obj1=new Student1(101,"sandip","bangalore");
		Student1 obj2=new Student1(102,"kiran","bangalore");
		ts.add(obj1);  //collection of object
		ts.add(obj2);
		System.out.println(ts);
	}

}
