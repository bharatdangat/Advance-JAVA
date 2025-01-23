//HashMap-
import java.util.*;
public class Hmap
{
	public static void main(String[] args) 
	{
	 HashMap hm=new HashMap();
	 hm.put("rno","101");
	 hm.put("name","om");
	 hm.put("per","90");
	 hm.put("add","Shrirampur");
	 hm.put("name","sai");
	hm.remove("add");
	 System.out.println(hm);
	 HashMap hm1=new HashMap(hm);
	 hm1.put("mh","maharashra");
	 System.out.println(hm1);
	System.out.println("Value="+hm1.get("name"));
	if(hm1.containsKey("name"))
		System.out.println("Found.......");
	if(hm1.containsValue("sai"))
		System.out.println("Found.......");
  System.out.println("Number of Elements="+hm1.size());
  if(hm1.isEmpty())
	  System.out.println("Map is Empty........");
  else
	 System.out.println("Map is Not Empty........");
  	  
	}

}
