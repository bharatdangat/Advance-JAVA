//Accept  n itegers from user and store them in array list collection and display elements in reverse order..
import java.util.*;
public class Sort 
{
	public static void main(String[] args) 
	{
	ArrayList a1=new ArrayList();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Limit-");
	int n=sc.nextInt();
	System.out.println("Enter n numbers -");
	for(int i=0;i<n;i++)
	{
		int s1=sc.nextInt();
		a1.add(s1);
	}
	Collections.reverse(a1);  //Collections is a class.........
	System.out.println("Reverse Orrderd-"+a1);
	
	}
	}


