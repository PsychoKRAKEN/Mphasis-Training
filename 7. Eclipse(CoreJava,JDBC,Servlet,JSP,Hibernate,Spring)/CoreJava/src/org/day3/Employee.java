package org.day3;

public class Employee extends Department {
	int empId;
    String empName;
    int empSalary;
    String empDesignation;

    Employee(int empId, String empName, int empSalary, String empDesignation, Department empDept) {

        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
        super.depLocation=empDept.depLocation;
        super.depName=empDept.depName;
        super.depNumber=empDept.depNumber;

    }

    Employee(){

    }

    public void displayEmpDetails() {
        System.out.println("Employee name: " + this.empName);
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Salary: " + this.empSalary);
        System.out.println("Employee Designation: " + this.empDesignation);
    }

    public void displayEmpDetails(String full) {
        if (full == "fullDetails") {
            this.displayEmpDetails();
            super.displayDeptDetails();
        } else {
            System.out.println("Invalid Arguement");
        }
    }


}
