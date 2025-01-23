//create hash table (not hashmap)will maintain mobile number and student name 
//Display the contact list.........
import java.util.*;
public class HTable
{
	public static void main(String[] args) 
	{
	Hashtable ht=new Hashtable();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Limit-");
	 int n=sc.nextInt();
	 System.out.println("Enter Moble number and Student Name-");
	 for(int i=0;i<n;i++)
	 {
		 String no=sc.next();
		 String name=sc.next();
		 ht.put(no,name);
	 }
	// System.out.println("Contact List="+ht);
	Enumeration e1=ht.keys();  //Return the key ...
	while(e1.hasMoreElements())
	{
		Object key=e1.nextElement();
		//get(key) Return the value of key....
		System.out.println(ht.get(key)+"="+key);  
	}
	
	}
	}


