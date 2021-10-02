package org.day6;
import java.util.*;

public class ex2 {
	
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
	   System.out.println(hs.isEmpty());//return boolean value(true)
	   System.out.println(hs.size());
	   
	   hs.add(10);    hs.add(30);    hs.add(40);    hs.add(80);    hs.add(100);     hs.add(10);
	   
	   System.out.println(hs);
	   System.out.println(hs.isEmpty());
	   System.out.println(hs.size());
	   System.out.println(hs.contains(30));
	   System.out.println(hs.contains(300));
	   
	   //To retrieve object by for each
	   for(Object obj:hs)
	   {
		   System.out.println(obj);
	   }
	     
	   hs.remove(100);
	   
	   System.out.println(hs);     hs.clear();System.out.println(hs);   System.out.println(hs.size());
		
	}

}
