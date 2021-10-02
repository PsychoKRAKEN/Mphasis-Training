package JDBCExample;
import java.sql.*;
import java.util.*;

public class Assignment2 {
	
	static void display() throws Exception
	{
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
	    Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select * from bank");   
        System.out.println("AccNo	Name	Balance");  
        while (rs.next()) 
        {  
            int n = rs.getInt("accno");  
            String name = rs.getString("name"); 
            int s = rs.getInt("balance");   
            System.out.println(n + "\t" + name + "\t" + s);   
        }  
        con.close();  
	}
	
	public static void main(String[] args) throws Exception{
		
		boolean n=true;
		Scanner ob=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
		while(n)
		{
			System.out.println("Enter your Choice");
			System.out.println("1.Deposite Amount \n2.Withdraw Amount\n3.Close Account\n4.Display\n5.Exit");
			int x=ob.nextInt();
			switch(x)
			{
			case 1:
				System.out.println("Enter Account Number");
				int emp=ob.nextInt();
				System.out.println("Enter Amount to Deposite");
				int deposite=ob.nextInt();
				
			    PreparedStatement s1=con.prepareStatement("update bank set balance=balance+? where accno=?");
			    
			    s1.setInt(1,deposite);
			    s1.setInt(2,emp);
				
			    s1.execute();
			    System.out.println(deposite+" Deposited to your Account");
			    display();
				break;
				
			case 2:
				System.out.println("Enter Account Number");
				int emp1=ob.nextInt();
				System.out.println("Enter Amount to Withdraw");
				int withdraw=ob.nextInt();
				
			    PreparedStatement s2=con.prepareStatement("update bank set balance=balance-? where accno=?");
			    
			    s2.setInt(1,withdraw);
			    s2.setInt(2,emp1);
				
			    s2.execute();
			    System.out.println(withdraw+" Withdrawed to your Account");
				display();
				break;
				
			case 3:
				System.out.println("Enter Account Number");
				int var4=ob.nextInt();
				PreparedStatement s5=con.prepareStatement("DELETE FROM mp192 WHERE accno=?");
				s5.setInt(1,var4);
				s5.execute();
			    System.out.println("Account Deleted");
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
