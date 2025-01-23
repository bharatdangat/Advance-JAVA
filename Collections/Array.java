//accept n cities name and insert into array list and display and remove all elements..
import java.util.*;
public class Array 
{
		public static void main(String[] args)
		{
		ArrayList a1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit-");
		int n=sc.nextInt();
		System.out.println("Enter N cities name-");
		for(int i=0;i<n;i++)
		{
			String s1=sc.next();
			a1.add(s1);
		}
		System.out.println("All Cities-"+a1);
		a1.removeAll(a1);
		System.out.println("All Cities-"+a1);
		}
		}




