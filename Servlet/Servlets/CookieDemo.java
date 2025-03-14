import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
 @WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
	
	 res.setContentType("text/html");
	 PrintWriter pw=res.getWriter();
	 Cookie ck1=new Cookie("RBNB","BCS");
	 Cookie ck2=new Cookie("CDJ","BCA");
	 Cookie ck3=new Cookie("JTS","BSC");
	 res.addCookie(ck1);
	 res.addCookie(ck2);
	 res.addCookie(ck3);
	 Cookie ck[]=req.getCookies();
	 for(int i=0;i<ck.length;i++)
	 {
		 pw.println("<h1>Cookie Name-"+ck[i].getName());
		 pw.println("<h1>Cookie Value-"+ck[i].getValue());
		 pw.println("<h1>Cookie Class-"+ck[i].getClass());
		 pw.println("<h1>Cookie Path-"+ck[i].getPath());
	 }
	
	}
}