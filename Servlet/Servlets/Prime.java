//PRINT ALL PRIME NUMBERS BETWEEN 1 TO N IN RED COLOUR.......
import javax.servlet.*;
import java.io.*;
public class Prime extends GenericServlet
{
	 public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	 {
	 PrintWriter pw=res.getWriter();
     String s1=req.getParameter("t1");
     int n=Integer.parseInt(s1);
     int i;
     for(int num=1;num<=n;num++)
     {
    	 for( i=2;i<num;i++)
    	 {
    		 if(num%i==0)
    		    break;
    	 }
        if(i==n)
        {
        	pw.println("="+num);
        	pw.println("Prime numbers");
        }
     }
  
     }
	 }
