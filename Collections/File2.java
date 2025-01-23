//Read text File specified by first command line argument. into list 
//program can display cmd line 
//1)Insert Line 2)Delete Line 3)Append Line 4)Modify Line 5)Save 6)Exit
//save the content at the end..

//Hint-First read data from file and add into list and perform operstion on list and save 
//data into file and display..
import java.util.*;
import java.io.*;
public class File2 
{
	public static void main(String[] args)throws IOException
	{
	 int ch=0;
	 Scanner sc=new Scanner(System.in);
	 ArrayList<String> a1=new ArrayList<String>();
	 FileReader f1=new FileReader(args[0]);
	 BufferedReader b1=new BufferedReader(f1);
	 String s1="";
	//extract list from file...
	 while((s1=b1.readLine())!=null)
	 {
	  a1.add(s1);
	 } 
	 do
	 {
	System.out.println("1-Insert \n2-Delete \n3-Append \n4-Modify \n5-Save");
	 System.out.println("Enter your choice-");
	 ch=sc.nextInt();
	 sc.nextLine();
	 switch(ch)
	 {
	 case 1:
		 System.out.println("Enter Line to insert-");
		 String line1=sc.nextLine();
		 a1.add(line1);
		 break;
	 case 2:
		 System.out.println("Enter Line Number to delete-");
		 int n1=sc.nextInt();
		 if(n1<a1.size())
		 {
		  a1.remove(n1-1);
		  System.out.println("Line Deleted Succ.......");
		 }
		 else
		 {
		 System.out.println("Enter Valid Line Number-");
		 }
	     break;
	 case 3:
		   System.out.println("Enter Line to Append-");
		   String line2=sc.nextLine();
		   a1.add(line2);
		   break;
	 case 4:
		   System.out.println("Enter line  to modify");
		   String line3=sc.nextLine();
		   System.out.println("Enter Line No to Modify-");
		   int n2=sc.nextInt();
		   if(n2<a1.size())
		   {
			a1.set(n2-1,line3);
			System.out.println("Line Modifird succ.....");
		   }
		   else
		   {
			 System.out.println("Enter Valid Line Number");
		   }
		   break;
	 case 5:
		  //Add list after operation performed into file...
	     FileWriter f2=new FileWriter(args[0]);
	     BufferedWriter b2=new BufferedWriter(f2);
	     for(String w:a1)
	     {
	    	 b2.write(w);
	    	 b2.newLine();
	     }
	     System.out.println("File Saved Succ..........");
	   
	     b2.close();
	     break;
	     
	 }
	 }while(ch<6);
	}
}
