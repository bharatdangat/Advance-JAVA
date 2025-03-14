import java.sql.*;
public class Prepared1  
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
		String query="delete from emp where eno=?";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1,102);
		
		pst.executeUpdate();
		System.out.println("Delete Succ.......");
	}

}
