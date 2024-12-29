//write java program to accept teacher(id,name,sub) store into database 
//and display.......
//
package ty25;

import java.sql.*;
import java.util.*;
public class Teacher
{
	public static void main(String[] args)throws Exception
	{
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
	Statement st=con.createStatement();
	st.executeUpdate("insert into teacher values("+tid+",'"+tname+"','"+tsub+"')");
	System.out.println("Record Insert Succc.........");
    ResultSet rs=st.executeQuery("select * from teacher");
	while(rs.next())
	{
		System.out.println("Teacher id="+rs.getInt(1));
		System.out.println("Teacher name="+rs.getString(2));
		System.out.println("Teacher sub="+rs.getString(3));
			}
		}catch(Exception e){}
		}
	}


