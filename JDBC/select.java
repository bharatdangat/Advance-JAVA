import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class select 
{
	
 public static void main(String[] args)throws Exception 
 {
  Class.forName("org.postgresql.Driver");
  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
  Statement st=con.createStatement();
  String query="select ename from emp where eno=101";
  ResultSet rs=st.executeQuery(query);
  while(rs.next())
  {
	  System.out.println("Name of student="+rs.getString(1));  
  }
	 }

}
