import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/FirstCookie")
public class FirstCookie extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=res.getWriter();
		String s1=req.getParameter("t1");
		pw.println("<h1>Welcome "+s1);
		Cookie ck=new Cookie("uname",s1);//create cookie
	    //OR Cookie ck=new Cookie("uname","req.getParameter('t1')");
		res.addCookie(ck);//add cookie
	    
	    pw.println("<form method='post' action='SecondCookie'>");
	    pw.println("<input type='submit' value='Go'>");
	    pw.println("</form>");
	}
}
