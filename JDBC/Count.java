//count no of records in table........
package ty25;
import java.sql.*;
public class Count
{
 public static void main(String[] args) throws Exception
 {
	int cnt=0;
    Class.forName("org.postgresql.Driver");
    Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from book");
    while(rs.next())
    {
    	 cnt++;
    }
    System.out.println("Total no of records="+cnt);
   
    rs.close();
    st.close();
    con.close();
 }
}

