import java.sql.*;
public class DMD 
{
 public static void main(String[] args) 
 {
  try
  {
	  Class.forName("org.postgresql.Driver");
	  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
	  DatabaseMetaData dmd1=con.getMetaData();
	  System.out.println("Database Name="+dmd1.getDatabaseProductName());
	  System.out.println("Database Version="+dmd1.getDatabaseProductVersion());
	  System.out.println("Driver Name="+dmd1.getDriverName());
	  System.out.println("User Name="+dmd1.getUserName());
	  
  }catch(Exception e)
  {
	  System.out.println(e);
  }
 }

}
