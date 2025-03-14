import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/FirstSession")
public class FirstSession extends HttpServlet
{
  @Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
  {
	 String name=req.getParameter("t1");
	PrintWriter pw=res.getWriter();
	 pw.print("<h1>Welcome "+name);  
	HttpSession hs=req.getSession(); //create session
	hs.setAttribute("uname",name);  //set (Attribute)values
	
	pw.println("<form method='post' action='SecondSession'>");
    pw.println("<input type='submit' value='Go'>");
    pw.println("</form>");
	
  }	
}
