import java.util.*;
public class LList 
{
 public static void main(String[] args) 
 {
 LinkedList l1=new LinkedList();

 l1.add(11);
 l1.add(34);
 l1.add(70);
 l1.addFirst(100);
 System.out.println(l1);
 l1.removeLast();
 System.out.println(l1);
 System.out.println("Size of linked list="+l1.size());
}

}
