package ty25;
import java.sql.*;
import java.util.*;
public class Prepared3
{
	public static void main(String[] args)throws Exception
	{
	 Class.forName("org.postgresql.Driver");
	 Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	 PreparedStatement pst=con.prepareStatement("delete from student where rno=?");
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Roll No to delete record.....");
	 int rno=sc.nextInt();
	 pst.setInt(1,rno);
	 pst.executeUpdate();
	 System.out.println("Record Deleted.......");
	 pst.close();
	 con.close();
	}
}
