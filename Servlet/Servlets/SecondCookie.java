import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.net.CookieStore;
@WebServlet("/SecondCookie")
public class SecondCookie extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=res.getWriter();
		Cookie ck[]=req.getCookies();//retrive cookies values
		String s2=ck[0].getValue();
		pw.println("<h1>Hello "+s2);
	}
}