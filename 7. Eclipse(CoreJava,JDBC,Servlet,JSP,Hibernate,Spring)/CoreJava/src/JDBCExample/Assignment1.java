package JDBCExample;
import java.sql.*;
import java.util.*;

public class Assignment1 {
	
	static void display() throws Exception
	{
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
	    Statement st=con.createStatement();
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
        con.close();  
	}
	
	
	public static void main(String[] args) throws Exception{
		boolean n=true;
		Scanner ob=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");//loading the driver
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
		while(n)
		{
			System.out.println("Enter your Choice");
			System.out.println("1.Insert Row \n2.Update Row\n3.Delete Row\n4.Display\n5.Exit");
			int x=ob.nextInt();
			switch(x)
			{
			case 1:
				System.out.println("Enter Empno,Name,Address,Phone Number and salary");
				int empno=ob.nextInt();
				String name=ob.next();
				String address=ob.next();
				long no=ob.nextLong();
				long salary=ob.nextLong();
				
			    PreparedStatement s1=con.prepareStatement("insert into mp192 values(?,?,?,?,?)");
			    
			    s1.setInt(1,empno);
			    s1.setString(2,name); 
			    s1.setString(3,address);
			    s1.setLong(4,no);
			    s1.setLong(5,salary);
				
			    s1.execute();
			    System.out.println("Row Inserted");
			    display();
				break;
				
			case 2:
				System.out.println("Enter Field to update\n1.Name\n2.Address\n3.Salary\n");
				int p=ob.nextInt();
				System.out.println("Enter Employee Number");
				int emp=ob.nextInt();
				switch(p) 
				{
				case 1:
					System.out.println("Enter updated Employee Name");
					String var1=ob.next();
					PreparedStatement s2=con.prepareStatement("update mp192 set name=? where empno=?");
				    
				    s2.setString(1,var1); 
				    s2.setInt(2,emp);
				    s2.execute();
				    System.out.println("Row Updated ");
					break;
				case 2:
					System.out.println("Enter updated Employee Address");
					String var2=ob.next();
					PreparedStatement s3=con.prepareStatement("update mp192 set address=? where empno=?");
				    
				    s3.setString(1,var2); 
				    s3.setInt(2,emp);
				    s3.execute();
				    System.out.println("Row Updated ");
					break;
				case 3:
					System.out.println("Enter updated Employee Salary");
					int var3=ob.nextInt();
					PreparedStatement s4=con.prepareStatement("update mp192 set salary=? where empno=?");
				    
				    s4.setInt(1,var3); 
				    s4.setInt(2,emp);
				    s4.execute();
				    System.out.println("Row Updated ");
					break;
				
				default:
					System.out.println("Wrong Choice");
					break;	
				}
				display();
				break;
				
			case 3:
				System.out.println("Enter Employee Number");
				int var4=ob.nextInt();
				PreparedStatement s5=con.prepareStatement("DELETE FROM mp192 WHERE empno=?");
				s5.setInt(1,var4);
				s5.execute();
			    System.out.println("Row Deleted ");
			    display();
				break;
				
			case 4:
				display();
				break;
				
			case 5:
				n=false;
				break;
				
			default:
				System.out.println("Wrong Choice try Again");
				break;
			}
		}
		
		System.out.println("Exiting.................");
	}
}
