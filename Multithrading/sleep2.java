//display a to z after 2 seconds 
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
      for(char i='A';i<='Z';i++)
      {
            sleep(2000);
           System.out.println("Value="+i);
      }
      }catch(Exception e){}
  }
}
class ThDemo1
{ 
 public static void main(String arg[])
 {
   A ob=new A();
 }
}
