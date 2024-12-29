package ty25;
import java.sql.*;
public class Demo  {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		   Class.forName("org.postgresql.Driver");
		   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		   Statement st=con.createStatement();
		   int k=st.executeUpdate("insert into book values(105,'physics',390)");
		   if(k>=1)
			   System.out.println("Record Inserted.....");
		   st.close();
		   con.close();
		   

	}

}
