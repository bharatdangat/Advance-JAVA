//create  TreeSet and add some colors and print out
//(TreSet have in sorted order and duplicants not allowed )
import java.util.*;
public class Tree 
{
	public static  void main(String[] args) 
	{
	 TreeSet t1=new TreeSet();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter limit-");
     int n=sc.nextInt();
     System.out.println("Enter Colors Name-");
     for(int i=0;i<n;i++)
     {
    	 String s1=sc.next();
    	 t1.add(s1);
     }
     System.out.println("All Colors-"+t1);
     }
	}

