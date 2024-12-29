//Display column name,datatype and size use ResultSetmetaData...
package ty25;
import java.sql.*;
public class MetaData 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		ResultSetMetaData rsm=rs.getMetaData();
	    int cols=rsm.getColumnCount();
	    for(int i=1;i<=cols;i++)
	   {
	   System.out.println("Column Name-"+rsm.getColumnName(i));  	
	   System.out.println("Column Datatype-"+rsm.getColumnTypeName(i));  	
	   System.out.println("Column Size-"+rsm.getColumnDisplaySize(i));  	
	   
	   }
	    
	    rs.close();
	    st.close();
	    con.close();
	    }
	}

