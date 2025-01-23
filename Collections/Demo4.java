//TreeSet-elements stre in sorted order and duplicates store only once..
import java.util.*;
public class Demo4
{
	public static void main(String[] args) 
	{
    TreeSet t1=new TreeSet();
    t1.add(13);
    t1.add(93);
    t1.add(53);
    t1.add(23);
    t1.add(73);
    t1.add(73);
    System.out.println(t1);
    t1.remove(13);
    System.out.println(t1);
   System.out.println("First Element-"+t1.first());
  
  
	}

}
