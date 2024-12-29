//Accept  employee information and display.........
import javax.servlet.*;
import java.io.*;
public class Emp extends GenericServlet 
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		 PrintWriter pw=res.getWriter();
           String s1=req.getParameter("t1");
           String s2=req.getParameter("t2");
           String s3=req.getParameter("t3");
           int a1=Integer.parseInt(s1);
           Float a3=Float.parseFloat(s3);
           pw.println("<table border=1>");
           pw.println("<tr><th>Emp No");
           pw.println("<th>Emp Name");
           pw.println("<th>Emp Sal");
           pw.println("</tr>");
           pw.println("<tr><td  >"+a1);
           pw.println("<td>"+s2);
           pw.println("<td>"+a3);
           pw.println("</tr>");
             
      }
}
