//ACCEPT RNO FROM USER AND SEARCH THE RECORD....
package ty25;
import java.sql.*;
import java.util.*;
public class Display2 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
       Class.forName("org.postgresql.Driver");
       Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
       Statement st=con.createStatement();
       System.out.println("Enter Roll No to search");
       int no=sc.nextInt();
       ResultSet rs=st.executeQuery("select * from student where rno="+no);
       if(rs.next())
       {
    	      System.out.println("Name="+rs.getString(2));
    	      System.out.println("Per="+rs.getFloat(3));
       }
       else
    	   System.out.println("Record Not Found........");
       }
	}


