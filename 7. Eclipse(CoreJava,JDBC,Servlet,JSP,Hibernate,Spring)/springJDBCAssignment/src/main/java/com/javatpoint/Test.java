package com.javatpoint;

import java.util.List;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		
		
		boolean x=true;
		Scanner sc=new Scanner(System.in);
		
		while(x)
		{
			System.out.println("\n\n\nChoose anyone : ");
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.Show Table\n5.Exit");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Enter Employee ID Employee Name and Salary : ");
				int id1=sc.nextInt();
				String name1=sc.next();
				float salary1=sc.nextFloat();
				
				dao.saveEmployeeByPreparedStatement(new Employee(id1,name1,salary1));
				break;
			case 2:
				System.out.println("Enter updated salary and Employee ID : ");
				float salary2=sc.nextFloat();
				int id2=sc.nextInt();
				
				dao.updateEmployeeByPreparedStatement(salary2,id2);
				break;
			case 3:
				System.out.println("Enter Employee ID : ");
				int id3=sc.nextInt();
				
				dao.deleteEmployeeByPreparedStatement(id3);
				break;
			case 4:
				List<Employee> list=dao.getAllEmployeesRowMapper();
				for(Employee e:list)
					System.out.println(e);
				break;
			case 5:
				x=false;
				break;
				
			default:
				System.out.println("Wrong Choice,try Again!");
			}
			
		}
		
		
		
		
	}
}
