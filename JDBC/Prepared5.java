import java.sql.*;
import java.util.Scanner;
public class Prepared5 
{
 public static void main(String[] args) 
 {
  try
  {
	  Scanner sc=new Scanner(System.in);
	  Class.forName("org.postgresql.Driver");
	  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
	  String query="update emp set ename=?,sal=? where eno=?";
	  PreparedStatement pst=con.prepareStatement(query);
	  System.out.println("Enter Emp No to Update Record-");
	  int eno=sc.nextInt();
	  System.out.println("Enter New Emp Name-");
	  String ename=sc.next();
	  System.out.println("Enter New Emp Sal-");
	  float sal=sc.nextFloat();
	  
	  pst.setString(1,ename);
	  pst.setFloat(2,sal);
	  pst.setInt(3,eno);
	  pst.executeUpdate();
	  System.out.println("Record Update Succ.......");
  }catch(Exception e)
  {
	  System.out.println(e);
  }
 }

}
