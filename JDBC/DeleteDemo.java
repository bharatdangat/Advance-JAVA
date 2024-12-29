package ty25;
import java.sql.*;
import java.util.*;
public class DeleteDemo 
{
	public static void main(String[] args) throws Exception 
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		Statement st=con.createStatement();
		System.out.println("Enter Book Number to Delete Record-");
		int bno=sc.nextInt();
		int k=st.executeUpdate("delete from book where bno= "+ bno);
			System.out.println("Record Deleted");
		st.close();
		con.close();
		}catch(Exception e){}
		}

}
