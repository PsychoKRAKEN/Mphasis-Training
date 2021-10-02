

public class student {
	private String name,address,grade;
	private int rollno;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
 
  
public void displayInfo(){  
	System.out.println("Data showen is using get");
    System.out.println("Hello: "+name+"\nRoll Number "+rollno+"\nAddress "+address+"\nGrade "+grade+"\n");  
}  






public student() 
{
	System.out.println("default constructor");
}  

public student(String name,int rollno, String address,String grade) 
{   
	this.name = name;
	this.rollno=rollno;
	this.address=address;
	this.grade=grade;
}  
void show()
{  
	System.out.println("Data showen is using constructor");
    System.out.println("Hello: "+name+"\nRoll Number "+rollno+"\nAddress "+address+"\nGrade "+grade+"\n");  
 
}

}
