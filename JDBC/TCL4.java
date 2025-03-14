import java.sql.*; 
import java.util.*;
public class TCL4
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
	  pst.setFloat(1,4000);
	  pst.setInt(2,101);
	  pst.executeUpdate();
	  pst.setFloat(1,5000);
	  pst.setInt(2,102);
	  pst.executeUpdate();
	  Savepoint s1=con.setSavepoint("A");
	  pst.setFloat(1,8000);
	  pst.setInt(2,103);
	  pst.executeUpdate();
	  Statement st=con.createStatement();
	  ResultSet rs=st.executeQuery("select * from emp");  
	  while(rs.next())
	  {
		int no=rs.getInt(1);
		Float sal=rs.getFloat(3);
		System.out.println(no+"="+sal);
		if(sal<3000)
		{
			con.rollback(s1);
		}
	  }
	  System.out.println("Update Successfully.....");
      con.commit();
  }catch(Exception e)
  {
	  System.out.println(e);
  }
 }

}
