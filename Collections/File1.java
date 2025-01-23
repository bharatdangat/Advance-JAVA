import java.util.*;
import java.io.*;
public class File1
{
	public static void main(String[] args)throws Exception
	{
		Hashtable h1=new Hashtable();
		FileReader f1=new FileReader("abc.txt");
		BufferedReader b1=new BufferedReader(f1);
		String s1="";
		while((s1=b1.readLine())!=null)
		{
			String word[]=s1.split("\t");
			h1.put(word[0],word[1]);
		}
	 System.out.println(h1);	
	}
	}


