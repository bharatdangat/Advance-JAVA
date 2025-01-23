//ListIterator.............
import java.util.*;
public class LIterator
{
	public static void main(String[] args) 
	{
	 ArrayList a1=new ArrayList();
	 a1.add("php");
	 a1.add("java");
	 a1.add("python");
	 a1.add("cpp");
	 System.out.println(a1);
	 
	 ListIterator l1=a1.listIterator();
	System.out.println("\nElements In Forward...");
	 while(l1.hasNext())
	 {
		 System.out.println(l1.next());
	 }
	 System.out.println("Elements In Backward...");
	 while(l1.hasPrevious())
	 {
		 System.out.println(l1.previous());	 
	 }
	 }
	}


