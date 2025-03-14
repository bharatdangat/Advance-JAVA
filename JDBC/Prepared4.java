import java.sql.*;
public class Prepared4 
{
 public static void main(String[] args) 
 {
 try
 {
  Class.forName("org.postgresql.Driver");
  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
  String query="alter table employee add column detail text";
  PreparedStatement pst=con.prepareStatement(query);
  pst.execute();
  System.out.println("Updated Succ.....");
 }catch(Exception e)
 {
	 System.out.println(e);
 }
 }

}
