//Stack.......
import java.util.*;
public class Demo3 
{
	public static void main(String[] args) 
	{
	 Stack s1=new Stack();
	 s1.add("php");
	 s1.add("java");
	 s1.add("python");
	 s1.add("cpp");
	 System.out.println(s1);
	 s1.push("js");
	 System.out.println(s1); 
	 s1.pop();
	 System.out.println(s1);
	s1.remove("cpp");
	 System.out.println(s1);
		
	}

}
