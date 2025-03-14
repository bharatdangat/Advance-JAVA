//Reverese No-
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/Reverse")
public class Reverse extends HttpServlet 
{
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
 {
   PrintWriter pw=res.getWriter();
   int no=Integer.parseInt(req.getParameter("t1"));
   int s=0;
   while(no>0)
   {
	   int d=no%10;
	   s=s*10+d;
	   no=no/10;
   }
   pw.println("<h1>Reverse No-"+s);
 }
}

