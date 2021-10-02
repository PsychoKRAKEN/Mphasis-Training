package org.day5;

public class string {
	
	public static void main(String[] args) {
		
		String s1="Mphasis and Global soft";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,10));
		System.out.println(s1.startsWith("Mp"));
		System.out.println(s1.endsWith("ft"));
		System.out.println(s1.replace("soft","software"));
		String ss="Mphasis and Global soft,mumbai";
		System.out.println(ss);
	                  System.out.println("the length of string="+ss.length());
		System.out.println(ss.replace("mumbai","Bangalore"));
		char name[]=s1.toCharArray();//convert string to char array
		int leng=name.length;
		System.out.println("length of an array="+leng);
	                  for(int i=0;i<leng;i++)
		{
			System.out.println(name[i]);
		}
	                  
	    /*------------------------------------------------*/
	                int age=25;
	              	StringBuffer s=new StringBuffer(" She  is ");
	              	StringBuffer s11=new StringBuffer("Hello to HP ");
	              	System.out.println("string buffer="+s);
	              	System.out.println("s append="+s.append(age));
	              	System.out.println("s append="+s.append(" years old."));
	              	System.out.println("entire string="+s.toString());//convert object to string
	              	System.out.println("length="+s.length());
	              	System.out.println("capacity="+s.capacity());
	              	System.out.println("s11="+s11);
	              	System.out.println("charAt="+s11.charAt(1));
	              	s11.setCharAt(1,'i');
	              	s11.setLength(5);
	              	System.out.println("s11="+s11);
	              	System.out.println("set insert="+s11.insert(5,"welcome"));
	              	System.out.println("to delete="+s11.delete(5,6));
	              	System.out.println("to reverse="+s11.reverse());
	              	System.out.println(s11); 
	              	
	              	
	              	/*------------------------------------------------------------*/
	              	
	              	String s111="apple";
	        		String s222="apple";
	        		String s333=new String("apple");
	        		String s444=new String("apple");
	        		if(s111==s222) //hashcode or memory blocks are same new memory block will not be created.
	        			System.out.println("true");
	        		else
	        			System.out.println("false");
	        		
	        		if(s222==s333)
	        			System.out.println("true");
	        		else
	        			System.out.println("false");
	        		
	        		if(s333.equals(s444))//compare the string
	        			System.out.println("true");
	        		else
	        			System.out.println("false");
		
	}

}
