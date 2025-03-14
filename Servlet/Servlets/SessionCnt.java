import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@ WebServlet("/SessionCnt")
public class SessionCnt extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		HttpSession hs=req.getSession();
		String s1=(String)hs.getAttribute("cnt1");
		if(s1==null)
		{
			pw.println("Welcome to First Time");
			hs.setAttribute("cnt1","1");
		}
		else
		{
			int n=Integer.parseInt(s1);
			n++;
			hs.setAttribute("cnt1",""+n);
			//OR hs.setAttribute("cnt1",Integer.parseInt(s1));
			pw.println("VisitCount="+n);
		}
	}
}
