//prepared statement-paasing values at runtime using placeholder(?)
package ty25;
import java.sql.*;
public class Prepare 
{
	public static void main(String[] args)throws Exception
	{
	 Class.forName("org.postgresql.Driver");
	 Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	 PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
	 
	 pst.setInt(1,101);
	 pst.setString(2,"vicky");
	 pst.setFloat(3,89);
     
	 pst.executeUpdate();
	 System.out.println("Record Inserted...");
	}

}
