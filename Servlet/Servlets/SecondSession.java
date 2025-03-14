import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/SecondSession")
public class SecondSession extends HttpServlet
{
  @Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
  {
	 PrintWriter pw=res.getWriter();
	 HttpSession hs=req.getSession();
	 
	 String s1=(String)hs.getAttribute("uname");
	 pw.println("<h1>Hello "+s1);
	
  }	
}
