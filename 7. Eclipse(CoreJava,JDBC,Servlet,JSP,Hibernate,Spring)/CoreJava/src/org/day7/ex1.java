package org.day7;
import java.util.*;

public class ex1 {
	
	public static void main(String[] args) {
		
			Scanner obj=new Scanner(System.in);
		    System.out.println("enter the key and name");
		    int b=obj.nextInt();
		    String st=obj.next();
		    HashMap<Integer,String> hs=new HashMap<Integer,String>();
		    hs.put(1,"raj");
		    hs.put(2,"seetha");
		    hs.put(3,"reeta");
		    System.out.println(hs);
		    hs.put(4,"meetha");
		    hs.put(5,"venu");
		    hs.put(6,"pankaj");
		    hs.put(7,"raj");
		    hs.put(10,"lakshmi");
		    hs.put(10,"Venkatesh");
		    hs.put(b,st);
		    System.out.println(hs);
	}

}
