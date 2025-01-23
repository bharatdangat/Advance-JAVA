//ArrayList
import java.util.*;
public class Demo1
{
	public static void main(String[] args) 
	{
	ArrayList a1=new ArrayList();
	a1.add("100");
	a1.add(200);
	a1.add("php");
	a1.add("java");
	a1.add(2,"300");
	System.out.println(a1);
	a1.remove("100");
	System.out.println(a1);
  // a1.removeAll(a1);
   System.out.println(a1);
   if(a1.contains("php"))
	   System.out.println("Found....");
   else
	    System.out.println("Not Found......");
     System.out.println("Second position elememt -"+a1.get(2));
     if(a1.isEmpty())
    	 System.out.println("List is Empty...");
     else
    	 System.out.println("List is not Empty......");
     ArrayList a2=new ArrayList();
     a2.add("DBMS");
     a2.add("RDBMS");
     a2.add("JDBC");
     a2.add("HTML");
     System.out.println(a2);
     a1.addAll(a2);
     System.out.println(a1);
     if(a1.containsAll(a2))
    	 System.out.println("a2 collection is found in a1");
     if(a1.equals(a2))
         System.out.println("Equals.....");
     else
    	 System.out.println("Not Equals....");
	}
}
