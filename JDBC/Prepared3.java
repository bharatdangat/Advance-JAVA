import java.sql.*;
public class Prepared3 
{
  public static void main(String[] args)throws Exception 
  {
	  try
	  {
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
	String query="delete from employee where ename=?";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setString(1,"aditya");
	pst.executeUpdate();
	System.out.println("Record Deleted..");
	  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
	  }

}
