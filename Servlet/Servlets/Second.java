import javax.servlet.*;
import java.io.*;
public class Second extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		pw.println("Welcome to Java.Good Morning.....");
	}
}