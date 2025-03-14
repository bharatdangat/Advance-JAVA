import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class TCL3 
{
 public static void main(String[] args) 
 {
  try
  {
	  Scanner sc=new Scanner(System.in);
	  Class.forName("org.postgresql.Driver");
	  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
	  con.setAutoCommit(false);
	  String query="update emp set sal=? where eno=?";
	  PreparedStatement pst=con.prepareStatement(query);
	  pst.setFloat(1,1000);
	  pst.setInt(2,104);
	  pst.executeUpdate();
	  System.out.println("Update Successfully.....");
	  System.out.println("Are You sure to Update Record 1-Yes 2-No");
	  int ch=sc.nextInt();
	  if(ch==1)
	  {
		  con.commit();
	  }
	  else
	  {
		  con.rollback();
	  }
	  
  }catch(Exception e)
  {
	  System.out.println(e);
  }
 }

}
