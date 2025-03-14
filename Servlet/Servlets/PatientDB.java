import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/PatientDB")
public class PatientDB extends HttpServlet
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
	  String q="insert into patient values(?,?,?,?)";
	  PreparedStatement pst=con.prepareStatement(q);
	  
	  int pno=Integer.parseInt(req.getParameter("t1"));
	  String pname=req.getParameter("t2");
	  String padd=req.getParameter("t3");
	  String pdis=req.getParameter("t4");
	  pst.setInt(1,pno);
	  pst.setString(2,pname);
	  pst.setString(3,padd);
	  pst.setString(4,pdis);
	  pst.executeUpdate();
	  pw.println("<h1>Insert Successfully");
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }
	}
}