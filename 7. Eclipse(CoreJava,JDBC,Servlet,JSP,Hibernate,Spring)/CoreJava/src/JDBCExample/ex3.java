package JDBCExample;
import java.sql.*;
import java.util.*;

public class ex3 {
	public static void main(String[] args) throws Exception{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Field to update\n1.Name\n2.Address\n3.DOB\n");
		int n=ob.nextInt();
		String s="";
		if(n==1)
			s="name";
		else if(n==2)
			s="address";
		else if(n==3)
			s="dob";
		else
			System.out.println("Wrong Input");
		
		System.out.println("Enter "+s+" :");
		String s1=ob.next();
		
		System.out.println("Enter Emp Number");
		int x=ob.nextInt();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");//loading the driver
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
	    PreparedStatement st=con.prepareStatement("update mp192 set ?=? where empno=?");
	    
	    st.setString(1,s); 
	    st.setString(2,s1); 
	    st.setInt(3,x); 
		
	    st.execute();
	    System.out.println("row updated ");
	}
}
