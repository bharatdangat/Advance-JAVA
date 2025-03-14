import java.sql.*;
public class ResultSet_1 
{
  public static void main(String[] args)throws Exception
  {
	  Class.forName("org.postgresql.Driver");
	  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
	  Statement st=con.createStatement();
	  String query="select * from employee";
	  ResultSet rs=st.executeQuery(query);
	  while(rs.next())
	  {
		  System.out.println("Emp No-"+rs.getInt("eno"));
		  System.out.println("Emp Name-"+rs.getString("ename"));
		  System.out.println("Emp Salary-"+rs.getFloat(3));
	  }
	}

}
