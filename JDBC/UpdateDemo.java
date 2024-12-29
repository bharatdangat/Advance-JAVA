package ty25;
import java.sql.*;
import java.util.*;
public class UpdateDemo
{
	public static void main(String[] args)throws Exception 
	{
	Scanner sc=new Scanner(System.in);
     Class.forName("org.postgresql.Driver");
     Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
     Statement st=con.createStatement();
     System.out.println("Enter Roll No to update record");
     int rno=sc.nextInt();
     System.out.println("Enter New Name");
     String name=sc.next();
     System.out.println("Enter new Per");
     float per=sc.nextFloat();
     int k=st.executeUpdate("update  student set name='"+ name+"',per='"+per+"' where rno= "+rno);
     if(k>=1)
    	 System.out.println("Record Updated........");
     st.close();
     con.close();
	}

}
