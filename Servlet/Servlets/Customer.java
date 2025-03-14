import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Customer")
public class Customer extends HttpServlet
{
 @Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
 {
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	try
	{
	 Class.forName("org.postgresql.Driver");
	 Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
	 Statement st=con.createStatement();
	 int pnum=Integer.parseInt(req.getParameter("t1"));
	 ResultSet rs=st.executeQuery("select * from patient where pno="+pnum);
	 pw.println("<table border=1>");
	 pw.println("<tr><th>Patient No</th><th>Patient Name</th><th>Paient Add</th><th>Patient Disease</th>");
	 if(rs.next())
	 {
       pw.println("<tr><td>"+rs.getInt(1)+"</td>");
       pw.println("<td>"+rs.getString(2)+"</td>");
       pw.println("<td>"+rs.getString(3)+"</td>");
       pw.println("<td>"+rs.getString(4)+"</td></tr>");
	 }
	 else
	 {
		 pw.println("<h1>Record Not Found");
	 }
	 pw.println("</table>");
	}catch(Exception e)
	{
		pw.println(e);
	}
 } 
}

