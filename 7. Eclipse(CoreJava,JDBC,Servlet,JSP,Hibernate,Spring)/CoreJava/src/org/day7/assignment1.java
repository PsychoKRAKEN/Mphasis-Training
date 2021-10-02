package org.day7;
import java.util.*;

class book
{
	int id;
	String name,author,publisher;
	int quantity;
	
	public book(int id,String name,String author,String publisher,int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	
	
}

public class assignment1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,book> hs=new HashMap<Integer,book>();
		
		book obj1=new book(171,"abc","nishchal","xyz",50);
		book obj2=new book(171,"def","nishchal","uvw",10);
		book obj3=new book(171,"ghi","nishchal","rst",20);
		book obj4=new book(171,"jkl","nishchal","opq",30);
		book obj5=new book(171,"mno","nishchal","lmn",40);
		book obj6=new book(171,"pqr","nishchal","ijk",60);
		book obj7=new book(171,"stu","nishchal","fgh",70);
		book obj8=new book(171,"vwx","nishchal","cde",80);
		book obj9=new book(171,"yza","nishchal","zab",90);
		book obj10=new book(171,"bcd","nishchal","wxy",150);
		
		hs.put(0,obj1);
		hs.put(1,obj2);
		hs.put(2,obj3);
		hs.put(3,obj4);
		hs.put(4,obj5);
		hs.put(5,obj6);
		hs.put(6,obj7);
		hs.put(7,obj8);
		hs.put(8,obj9);
		hs.put(9,obj10);
		
		System.out.println("Enter Book Number (0-9): ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(HashMap.Entry<Integer, book> entry:hs.entrySet())
	     {    
	         if(n==entry.getKey())  
	         {
	        	 System.out.println("Book Details : "+entry.getValue());
	         } 
	     }
	}
}
