package ty25;

import java.sql.*;
public class DBMD {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		DatabaseMetaData d=con.getMetaData();
		System.out.println("Database Name="+d.getDatabaseProductName());
		System.out.println("Database Version="+d.getDatabaseProductVersion());
		System.out.println("Database Driver Name="+d.getDriverName());
		System.out.println("Database Version="+d.getDriverVersion());
		System.out.println("Database User="+d.getUserName());
		
         ResultSet rs=d.getTables(null, null, null, new String[]{"TABLE"});
         System.out.println("\nAll Tabeles-");
         while(rs.next())
         {
        	 System.out.println(rs.getString("TABLE_NAME"));
         }
         }
	}


