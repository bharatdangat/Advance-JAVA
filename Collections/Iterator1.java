import java.util.*;
public class Iterator1
{
	public static void main(String[] args) 
	{
	 ArrayList a1=new ArrayList();
	 a1.add("java");
	 a1.add("php");
	 a1.add("python");
	 a1.add("cpp");
	 
	 Iterator it=a1.iterator();
	 while(it.hasNext())
	 {
		 System.out.println("Elements-"+it.next());
	 }
	 }
	}


