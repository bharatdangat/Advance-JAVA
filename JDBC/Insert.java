import java.sql.*;
public class Insert 
{
 public static void main(String[] args)throws Exception 
 {
  Class.forName("org.postgresql.Driver");
  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
  Statement st=con.createStatement();
  String query="insert into student values(1,'om',90)";
   st.executeUpdate(query);
   System.out.println("Insert Succ....");
	
	 }

}
