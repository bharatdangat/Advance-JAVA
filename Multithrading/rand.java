//display all integers between 1 to 100 randomly after 2 seconds.......
import java.util.*;
class A extends Thread
{
 A()
 {
    start();
 }
 public void run()
 {
   try
   {
      while(true)
      {
            sleep(2000);
           Random r1=new Random();
           int n=r1.nextInt(100);
           System.out.println("Value="+n);
      }
   }catch(Exception e){}
 }
}
class ThDemo
{
 public static void main(String arg[])
 {
 A ob =new A();
}
}
