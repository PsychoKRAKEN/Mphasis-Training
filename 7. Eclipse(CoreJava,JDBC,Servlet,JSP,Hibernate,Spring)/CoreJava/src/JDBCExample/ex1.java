package JDBCExample;
import java.sql.*;


public class ex1 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");//loading the driver
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
	    Statement st=con.createStatement();
	    //st.execute("insert into mp192 values(111,'Avinash','Pune','15-Aug-1999',9875968589)");
	    //System.out.println("the row inserted successfully");
	    
	    //st.execute("update mp192 set address='Jhunjhunu' where name='Avinash'");
	    //System.out.println("the row updated successfully");
	    
	    //st.execute("delete mp192 where name='Avinash'");
	    //System.out.println("the row deleted successfully");
	     
        ResultSet rs = st.executeQuery("select * from mp192");   
        System.out.println("EmpNo	Name	Address	Phone No	Salary");  
        while (rs.next()) 
        {  
            int n = rs.getInt("empno");  
            String name = rs.getString("name"); 
            String address = rs.getString("address"); 
            long phoneno = rs.getLong("phoneno"); 
            int s = rs.getInt("salary");   
            System.out.println(n + "\t" + name + "\t" + address + "\t" + phoneno + "\t" + s);   
        }  
        System.out.println("</table>");  
        System.out.println("</html></body>");  
        con.close();  
      
	}
}
