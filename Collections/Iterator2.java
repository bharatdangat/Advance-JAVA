//Accept n numbers from user in ArrayList and display only even numbers using Iterator..... 
import java.util.*;
public class Iterator2
{
	public static void main(String[] args) 
	{
	 ArrayList a1=new ArrayList();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Limit-");
	 int n=sc.nextInt();
	 System.out.println("Enter n numbers-");
	 for(int i=0;i<n;i++)
	 {
		 int num=sc.nextInt();
		 a1.add(num);
	 }
	Iterator it=a1.iterator();
	while(it.hasNext())
	{
		//it.next() return Object hence store in Object datatype..
		Object ob=it.next();
		String s1=ob.toString();  //convert into string
		int num=Integer.parseInt(s1);
		if(num%2==0)
			System.out.println(num);
	}	 
	}
	}


