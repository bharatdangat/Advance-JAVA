import javax.servlet.*;
import java.io.*;
public class MY extends GenericServlet 
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		 PrintWriter pw=res.getWriter();
           pw.println("Hi"); 
	}
}
