import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class create 
{
 public static void main(String[] args)throws Exception 
 {
  Class.forName("org.postgresql.Driver");
  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
  Statement st=con.createStatement();
  String query="create table emp(eno int,ename char(20),sal float)";
   st.execute(query);
   System.out.println("Create Succ....");
	
	 }

}
