//Write program to accept username and greet the message according to syatem time..
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;  //USED FOR PRINWRITER CLASS,,,,,,
import java.util.*; //USED FOR DATE CLASS
@WebServlet("/Time")
public class Time extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
	 PrintWriter pw=res.getWriter();
	 String s1=req.getParameter("t1");
	 Date d1=new Date();
	 int hr=d1.getHours();
	 if(hr>=12&&hr<=17)
		 pw.println("Good Afternoon "+s1);
	 else if(hr>=18&&hr<=21)
		 pw.println("Good Evening  "+s1);
	 else if(hr>=22&&hr<=24)
		 pw.println("Good Night "+s1);
	 else
		 pw.println("Good Morning "+s1);
	 
	 pw.println("<br>Todays Date="+d1.getDate());
	 pw.println("<br>Year"+(d1.getYear()+1900));
	
	}
	}
