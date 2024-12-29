//write program to create atleast 5 tables in database(sql)  
//add column field in given table and drop given table  from db.
package ty25;
import java.sql.*;
import java.util.*;
public class TLC2 {
	public static void main(String[] args)throws Exception 
	{
		try
		{
	 Class.forName("org.postgresql.Driver");
	 Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	 Statement st=con.createStatement();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Table Name-");
	String tn=sc.next();
	System.out.println("Enter column Name-");
	String cn=sc.next();
	System.out.println("Enter Datatype-");
	String dt=sc.next();
	 st.executeUpdate("Alter table '"+tn+"' add column '"+cn+"'  '"+dt+"' ");
	 System.out.println("Column Added......");
	System.out.println("Enter Table Name To drop-");
	String tname=sc.next();
	st.executeUpdate("drop table '"+ tname+"'");
	System.out.println("Table Drop succ......");
		}catch(Exception e){}
		}

}
