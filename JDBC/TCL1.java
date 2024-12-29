//accept eno from user and delete the record.after deleting perform commit and rolloback operstion on DB
package ty25;
import java.sql.*;
import java.util.*;
public class TCL1 {
	public static void main(String[] args)throws Exception 
	{
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	con.setAutoCommit(true);
	Statement st=con.createStatement();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Emp No To Delete record......");
	int eno=sc.nextInt();
	st.executeUpdate("delete from emp where eno="+eno);
	System.out.println("Record Deleted...........");
	System.out.println("Are You Sure Yes/No");
	String s1=sc.next();
	if(s1.equals("yes"))
	{
		 con.commit();
		 System.out.println("Record Deleted Permanantly");
	}
	else
	{
		 con.rollback();
		 System.out.println("Record Rollback...........");
	}
	con.close();
	st.close();
	}
	}


