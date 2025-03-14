//write servlet program to accept emp details from user and insert into DB
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;
@WebServlet("/Insert")

public class Insert extends GenericServlet
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
	 String name=req.getParameter("t2");
	 String s3=req.getParameter("t3");
	 int rno=Integer.parseInt(s1);
	 float per=Float.parseFloat(s3);
	st.executeUpdate("insert into emp values("+rno+",'"+name+"',"+per+")");
	 pw.println("Record Inserted succ Ho gaya he.......");	 
     }catch(Exception e){}
 }
}
