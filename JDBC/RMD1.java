import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class RMD1
{	
 public static void main(String[] args)throws Exception 
 {
  Class.forName("org.postgresql.Driver");
  Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
  Statement st=con.createStatement();
  String query="select * from emp";
  ResultSet rs=st.executeQuery(query);
  ResultSetMetaData rmd1=rs.getMetaData();
  System.out.println("Total No of Columns="+rmd1.getColumnCount());
  System.out.println("First Column="+rmd1.getColumnName(1));
  System.out.println("Second Column="+rmd1.getColumnName(2));
  System.out.println("Table Name"+rmd1.getTableName(1));
  System.out.println("Size of first Column"+rmd1.getColumnDisplaySize(1));
  System.out.println("Total No of Columns="+rmd1.getColumnCount());
  System.out.println("Class Name-"+rmd1.getClass());
	 }

}
