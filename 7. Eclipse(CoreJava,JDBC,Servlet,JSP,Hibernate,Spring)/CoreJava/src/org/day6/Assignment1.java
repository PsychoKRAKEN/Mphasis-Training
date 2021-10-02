package org.day6;

import java.util.*;

class employee
{
	int empno,salary;
	String name,des;
	
	employee(String n,int emp,int sal,String d)
	{
		name=n;
		empno=emp;
		salary=sal;
		des=d;
	}

	@Override
	public String toString() {
		return "employee [empno=" + empno + ", salary=" + salary + ", name=" + name + ", des=" + des + "]";
	}
	
}

public class Assignment1{

	public static void main(String[] args) {
		
		ArrayList<employee> a=new ArrayList<employee>();
		
		employee e1=new employee("Nishchal",171,50000,"SE");
		employee e2=new employee("Ajay",172,60000,"ASE");
		
		a.add(e1);
		a.add(e2);
		System.out.println(a);
	}

}
