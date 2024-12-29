package ty25;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; //1)import  sql ackage;
import java.util.*; 
public class InsertDemo2 
{
public static void main(String[] args) throws Exception
{
	    Scanner sc=new Scanner(System.in);
		Class.forName("org.postgresql.Driver"); //2)load and register Driver
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root"); //3)create connection
		Statement st=con.createStatement(); //4)create ststement
		 System.out.println("Enter Roll No-");
		    int rno=sc.nextInt();
		    System.out.println("Enter  Name-");
		    String name=sc.next();
		    System.out.println("Enter Address-");
		3  String add=sc.next();
		int k=st.executeUpdate("insert into student values("+rno+",'"+name+"','"+add+"')");//5)execute Query
		if(k>=1)
			System.out.println("Record Inserted......");
		st.close();
		con.close();
}

}
