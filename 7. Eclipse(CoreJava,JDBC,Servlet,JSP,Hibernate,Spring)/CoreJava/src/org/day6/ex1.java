package org.day6;

import java.util.ArrayList;

public class ex1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(60);
		al.add(100);
		 al.add(90);
		 al.add(80);
		System.out.println(al);
		al.add(3,500);                 //100 will move next position
		System.out.println(al);
		al.remove(2);                //remove 60
		System.out.println(al);
		al.set(4,1000);              //replace 90 with 1000
		System.out.println(al);
		al.clear();              //replace 90 with 1000
		System.out.println(al);
	}

}
