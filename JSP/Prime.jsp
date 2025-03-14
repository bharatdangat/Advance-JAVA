<%
int i;
 String s1=request.getParameter("t1");
 int n=Integer.parseInt(s1);
 for( i=2;i<=n;i++)
 {
   if(n%i==0)
   {
	   break;
   }
 }
   if(i==n)
   {
	   out.println("<h1>Number is Prime");
   }
   else
   {
	   out.println("<h1>Number is not Prime");
   }
 
%>