package ty25;
import java.sql.*;
public class InsertDemo 
{
 public static void main(String[] args)throws Exception 
 {
   Class.forName("org.postgresql.Driver");
   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
   Statement st=con.createStatement();
   int k=st.executeUpdate("insert into book values(101,'Java',340)");
   k=st.executeUpdate("insert into book values(121,"php",340)");
   if(k>=1)
	   System.out.println("Record Inserted.....");
   st.close();
   con.close();
   
 }
}
