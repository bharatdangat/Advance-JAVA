//scrollable                         and                  updatable resultset.......
//ResultSet.TYPE_FORWARD_ONLY
//ResultSet.TYPE_SCROLL_SENSITIVE;
 // ResultSet.TYPE_SCROLL_INSENSITIVE;
    //updatable
//ResultSet.CONCUR_READ_ONLY;
  // ResultSet.CONCUR_UPDATABLE;
		
package ty25;
import java.sql.*;
import java.util.*;
public class SUResultSet
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from student");
      rs.next();
		System.out.println("First Roll No="+rs.getInt(1));
		System.out.println("Firsr  Name="+rs.getString(2));
		System.out.println("First Per="+rs.getFloat(3));
		rs.last();
		System.out.println("Last Roll No="+rs.getInt(1));
		System.out.println("Last  Name="+rs.getString(2));
		System.out.println("Last Per="+rs.getFloat(3));
		rs.previous();
		System.out.println("Second Last Roll No="+rs.getInt(1));
		System.out.println("Second Last  Name="+rs.getString(2));
		System.out.println("Second Last Per="+rs.getFloat(3)); 
	}

}
