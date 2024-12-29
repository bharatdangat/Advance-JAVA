//ResultSetInterface-
//Display book table.......
package ty25;
import java.sql.*;
public class Display1
{
public static void main(String args[])throws Exception
{
	 Class.forName("org.postgresql.Driver");
	 Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	 Statement st=con.createStatement();
	 ResultSet rs=st.executeQuery("select * from book");
	 while(rs.next())
	 {
		  System.out.println("Book No-"+rs.getInt(1));
		  System.out.println("Book Name-"+rs.getString(2));
		  System.out.println("Book Price-"+rs.getFloat(3));
	 }
	 rs.close();
	 st.close();
	 con.close();
}
}

