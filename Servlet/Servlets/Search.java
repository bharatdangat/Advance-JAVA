import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;
@WebServlet("/Search")
public class Search extends GenericServlet
{
 public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
 {
	 PrintWriter pw=res.getWriter();
	 try
	 {
	 Class.forName("org.postgresql.Driver");
	 Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	 Statement st=con.createStatement();
	 String s1=req.getParameter("t1");
	 int bnum=Integer.parseInt(s1);
	 ResultSet rs=st.executeQuery("select * from book where bno="+bnum);
	if(rs.next())
	{
		pw.println("Book No-"+rs.getInt(1));
		pw.println("Book Name-"+rs.getString(2));
		pw.println("Bokk price-"+rs.getFloat(3));
	}
	 }catch(Exception e){}
}
}