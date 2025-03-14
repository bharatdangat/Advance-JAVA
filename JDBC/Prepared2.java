//Update Record......
import java.sql.*;
public class Prepared2 
{
 public static void main(String[] args) 
 {
	 try
	 {
  Class.forName("org.postgresql.Driver");
  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
  String query="update employee set ename=?,salary=? where eno=?";
  PreparedStatement pst=con.prepareStatement(query);
  pst.setString(1,"aditya");
  pst.setFloat(2,1000);
  pst.setInt(3,101);
  pst.executeUpdate();
  System.out.println("Record Updated Succ........"); 
 }catch( Exception e)
	 {
	 System.out.println(e);
	 }
 }
}
