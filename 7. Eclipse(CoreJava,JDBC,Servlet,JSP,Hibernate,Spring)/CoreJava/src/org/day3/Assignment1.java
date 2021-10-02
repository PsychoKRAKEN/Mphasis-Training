package org.day3;

public class Assignment1 {
	
	public static void main(String[] args) {
		Department CS = new Department("CS", 171, "A-Block");
        Department EE = new Department("EE", 122, "B-Block");
        
        Employee e1 = new Employee(101, "Nishchal Bhuria", 50000, "Software Developer", CS);  
        Employee e2 = new Employee(102, "Ajay Rao", 60000, "Assistant Software Developer", EE);  

        e1.displayEmpDetails("fullDetails");
        System.out.println("");
        e2.displayEmpDetails();

	}

}
