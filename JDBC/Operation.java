//perform operstion-CREATE ,ALTER,DROP TABLE.........
//(Note -perform operation on threee diff table.....)
package ty25;
import java.sql.*;
public class Operation 
{
	public static void main(String[] args)throws Exception 
	{
	 Class.forName("org.postgresql.Driver");
	 Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	 Statement st=con.createStatement();
	 int k=st.executeUpdate("create table emp(eno int,ename char(20),salary float)");
		 System.out.println("Table Created........");
	  st.executeUpdate("alter table book  drop column price");
		System.out.println("Table Altereed........");
	st.executeUpdate("drop table student");
		 System.out.println("Table Deleted ........");
	
	}

}
