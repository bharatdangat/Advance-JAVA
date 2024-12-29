package ty25;
import java.sql.*;
import java.util.*;
public class Prepared2 
{
	public static void main(String[] args) throws Exception
	{
      Class.forName("org.postgresql.Driver");
      Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
      PreparedStatement pst=con.prepareStatement("update student set name=?,per=? where rno=?");
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Roll Number to update Record-");
      int rno=sc.nextInt();
      System.out.println("Enter New Name");
      String name=sc.next();
      System.out.println("Enter New Per");
      float per=sc.nextFloat();
      
      pst.setString(1,name);
      pst.setFloat(2,per);
      pst.setInt(3,rno);
      
      pst.executeUpdate();
      System.out.println("Record Updated..........");
	}

}
