//Accept  employee information and display.........
import javax.servlet.*;
import java.io.*;
class Emp2 extends GenericServlet 
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		
		 PrintWriter pw=res.getWriter();
           String s1=req.getParameter("t1");
           String s2=req.getParameter("t2");
           String s3=req.getParameter("t3");
           int a1=Integer.parseInt(s1);
           Float a3=Float.parseFloat(s3);
           pw.println("Employee Information");
           pw.println("Emp No-"+a1 );
           pw.println("Emp Name-"+s2 );
           pw.println("Emp No-"+a3 ); 
	}
}
