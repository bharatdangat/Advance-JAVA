import java.sql.*;
public class ResultSet_2
{

	public static void main(String[] args) 
	{
	 try
	 {
		 Class.forName("org.postgresql.Driver");
		 Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
		 Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		 //Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		 
		 String query="select * from employee";
		 ResultSet rs=st.executeQuery(query);
		 if(rs.last())
		 {
			 System.out.println("\nLast Record-");
			 System.out.println("Emp No-"+rs.getInt("eno"));
			 System.out.println("Emp Name-"+rs.getString("ename"));
			 System.out.println("Emp Salary-"+rs.getString("salary"));
		 	 
		 }
		 if(rs.previous())
		 {
			 System.out.println("\nSecond Last Record-");
			 System.out.println("Emp No-"+rs.getInt("eno"));
			 System.out.println("Emp Name-"+rs.getString("ename"));
			 System.out.println("Emp Salary-"+rs.getString("salary"));
		 	 
		 }
	 
		 if(rs.first())
		 {
			 System.out.println("\nFirst Record-");
			 System.out.println("Emp No-"+rs.getInt("eno"));
			 System.out.println("Emp Name-"+rs.getString("ename"));
			 System.out.println("Emp Salary-"+rs.getString("salary"));
		 	 
		 }
	 
		 
	 
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }
	}

}
