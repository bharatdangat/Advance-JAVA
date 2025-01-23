import java.util.*;
public class Link 
{
	public static void main(String[] args) 
	{
	LinkedList l1 = new LinkedList();
	l1.add("red");
	l1.add("blue");
	l1.add("yellow");
	l1.add("orange");
	System.out.println("First Linked List-"+l1);
	LinkedList l2=new LinkedList();
	l2.add("pink");
	l2.add("green");
	System.out.println("Second Linked List-"+l2);
	l1.addAll(2, l2);
	System.out.println("Final Linked List-"+l1);
	
	}
}
