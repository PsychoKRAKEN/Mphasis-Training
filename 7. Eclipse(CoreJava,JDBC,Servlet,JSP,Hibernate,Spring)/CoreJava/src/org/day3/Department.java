package org.day3;

public class Department {
	String depName;
    int depNumber;
    String depLocation;

    Department(String depName, int depNumber, String depLocation) {
        this.depName = depName;
        this.depNumber = depNumber;
        this.depLocation = depLocation;
    }
    Department(){
        
    }

    public void displayDeptDetails(){
        System.out.println("Department Name: "+this.depName);
        System.out.println("Department Number: "+this.depNumber);
        System.out.println("Department Location: "+this.depLocation);        
    }
}
