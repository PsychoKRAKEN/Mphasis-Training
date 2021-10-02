package JDBCExample;
import java.sql.*;
import java.util.*;

public class ex2 {
	public static void main(String[] args) throws Exception{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Empno,Name,Address,DOB and Phone Number");
		int empno=ob.nextInt();
		String name=ob.next();
		String address=ob.next();
		String dob=ob.next();
		long no=ob.nextLong();
		Class.forName("oracle.jdbc.driver.OracleDriver");//loading the driver
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
	    PreparedStatement st=con.prepareStatement("insert into mp192 values(?,?,?,?,?)");
	    
	    st.setInt(1,empno);
	    st.setString(2,name); 
	    st.setString(3,address);
	    st.setString(4,dob);
	    st.setLong(5,no);
		
	    st.execute();
	    System.out.println("row inserted ");
	}
}
