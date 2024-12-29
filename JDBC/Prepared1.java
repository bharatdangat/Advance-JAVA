//Insert  5 Records in student table take from user.........
package ty25;
import java.sql.*;
import java.util.*;
public class Prepared1{
	public static void main(String[] args) throws Exception{
	  Class.forName("org.postgresql.Driver");
	  Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	 PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
	 Scanner sc=new Scanner(System.in);
	 for(int i=1;i<=2;i++)
	 {System.out.println("Enter Roll No");
		 int rno=sc.nextInt();
		 System.out.println("Enter Name");
		 String name=sc.next();
		 System.out.println("Enter per");
		 int per=sc.nextInt();	 
	 pst.setInt(1,rno);
	 pst.setString(2,name);
	 pst.setFloat(3,per);
	 pst.executeUpdate();
	 System.out.println("Record Insert Succ.........");
	 }
	 pst.close();
	 con.close();
	 }
}
