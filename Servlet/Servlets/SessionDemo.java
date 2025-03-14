import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	HttpSession hs=req.getSession();
	hs.setAttribute("Roll No","1");
	hs.setAttribute("Name","Om");
	hs.setAttribute("Per","89");
	String s1=(String)hs.getAttribute("Roll No");
	String s2=(String)hs.getAttribute("Name");
	String s3=(String)hs.getAttribute("Per");
	
	pw.println("<h1>Value1="+s1);
	pw.println("<h1>Value2="+s2);
	pw.println("<h1>Value3="+s3);
	}
}