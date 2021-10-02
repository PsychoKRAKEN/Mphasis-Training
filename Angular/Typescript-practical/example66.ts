class Employee {
    public FirstName:string;
    public LastName:string;
    public Designation:string;
    public Print(){
        console.log(`${this.FirstName} ${this.LastName} - ${this.Designation}`);
    }
}
class Developer extends Employee {
    public Print(){
        super.FirstName = "Raj";
        super.LastName = "Kumar";
        super.Designation = "Developer";
        super.Print();
    }
}
class Admin extends Employee {
    public Print(){
        super.FirstName = "Kiran";
        super.LastName = "Kumar";
        super.Designation = "Admin";
        super.Print();
    }
}
class Manager extends Employee {
    public Print(){
        super.FirstName = "Tom";
        super.LastName = "Hanks";
        super.Designation = "Manager";
        super.Print();
    }
}
let employees:Employee[] = new Array();
employees[0]= new Developer();
employees[1]= new Admin();
employees[2] = new Manager();
for(var emp of employees)
 {
    emp.Print();
}
