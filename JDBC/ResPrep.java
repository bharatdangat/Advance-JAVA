//write java program to accept teacher(id,name,sub) store into database 
//and display.......
//#########********we  use  Resultset and prepared statement at time ...............
package ty25;
import java.sql.*;
import java.util.*;
public class ResPrep {
	public static void main(String[] args) {
						try
				{
			 Class.forName("org.postgresql.Driver");
			 Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			 Scanner sc=new Scanner(System.in);
			System.out.println("Enter Tid");
			int tid=sc.nextInt();
			System.out.println("Enter TName");
			String tname=sc.next();
			System.out.println("Enter Subject");
			String tsub=sc.next();
			PreparedStatement pst=con.prepareStatement("insert into teacher values(?,?,?)");
			pst.setInt(1,tid);
			pst.setString(2,tname);
			pst.setString(3,tsub);
			pst.executeUpdate();
			System.out.println("Record Insert Succc.........");
		    ResultSet rs=pst.executeQuery("select * from teacher");
			while(rs.next())
			{
				System.out.println("Teacher id="+rs.getInt(1));
				System.out.println("Teacher name="+rs.getString(2));
				System.out.println("Teacher sub="+rs.getString(3));
					}
				}catch(Exception e){}
				}
			}





