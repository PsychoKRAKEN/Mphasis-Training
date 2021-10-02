package org.day7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class bankaccount
{
	String bankName;
    int accountNumber;
    int balance;
    public void takeBankAccount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Bank name: ");
        this.bankName = scan.nextLine();
        System.out.print("Enter account number: ");
        this.accountNumber = scan.nextInt();
        System.out.print("Enter balance: ");
        this.balance = scan.nextInt();
    }
    @Override
    public String toString() {
        return "Bank Account Details:\nAccountNumber: " + accountNumber + "\nAccount Balance: " + balance
                + "\nBank Name: " + bankName;
    }

	
}

class address
{
	String addressLine;
    String city;
    String state;
    String country;
    int pinCode;
    public void takeAddress() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter address line: ");
        this.addressLine = scan.nextLine();
        System.out.print("Enter city: ");
        this.city = scan.nextLine();
        System.out.print("Enter state: ");
        this.state = scan.nextLine();
        System.out.print("Enter country: ");
        this.country = scan.nextLine();
        System.out.print("Enter pincode: ");
        this.pinCode = scan.nextInt();
    }
    @Override
    public String toString() {
        return "Address:\n" + addressLine + ",\n" + city + "," + state + ",\n" + country + ", PIN: " + pinCode;
    }
}

class EmployeeData {
	
	String employeeName;
    int employeeID;
    String employeeDOB;
    address employeeAddress = new address();
    bankaccount bankAccount = new bankaccount();
    public void takeEmployeeDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nCreating new employee: ");
        System.out.print("Enter Employee Name: ");
        this.employeeName = scan.nextLine();
        System.out.print("Enter Date of Birth(dd-mm-yyyy): ");
        this.employeeDOB = scan.nextLine();
        System.out.print("Enter employee ID: ");
        this.employeeID = scan.nextInt();
        System.out.println("Taking address details: ");
        employeeAddress.takeAddress();
        System.out.println("Taking bank account details: ");
        bankAccount.takeBankAccount();
        System.out.println("Employee created...");
    }
    @Override
    public String toString() {
        return "Employee ID: " + employeeID + "\nEmployee Name: " + employeeName + "\nEmployee DOB: " + employeeDOB
                + "\n\nEmployee " + employeeAddress + "\n\nEmployee " + bankAccount;
    }
}

public  class Assignment2 {
	public static void main(String[] args) 
	{
		HashMap<Integer, EmployeeData> company = new HashMap<Integer, EmployeeData>();
        int choice;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1.Add Employee");
            System.out.println("2.Display Employee");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    EmployeeData employee = new EmployeeData();
                    employee.takeEmployeeDetails();
                    company.put(employee.employeeID, employee);
                    System.out.println("Employee added to company\n");
                    break;
                case 2:
                    System.out.print("Enter employee ID: ");
                    int id = scan.nextInt();
                    for (Map.Entry<Integer, EmployeeData> emp : company.entrySet()) {
                        if (emp.getKey() == id) {
                            System.out.println(emp.getValue());
                        }
                    }
                    break;
                default:
                    System.out.println("Enter correct choice..");
                    break;
            }
        }
	}
}
