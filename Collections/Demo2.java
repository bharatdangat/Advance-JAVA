//LinkedList
import java.util.*;
public class Demo2 
{
	public static void main(String[] args) 
	{
	 LinkedList l1=new LinkedList();
	 l1.add(11);
	 l1.add(43);
	 l1.add(87);
	 l1.add(26);
	 l1.add(12);
	 System.out.println(l1);
	 l1.addFirst(21);
	 l1.addLast(90);
	 System.out.println(l1);
	 System.out.println("First Element-"+l1.getFirst());
	 System.out.println("Last Element-"+l1.getLast());
	 System.out.println("Index of 43="+l1.indexOf(43));
	l1.poll();
	 System.out.println(l1);
	l1.pop();
	System.out.println(l1);
	l1.push("kj");
	System.out.println(l1);
	}

}
