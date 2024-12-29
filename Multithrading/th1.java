//Create Thread-
//1]Using Thread Class
//1)start method within constructr.......

import java.lang.*;
class A extends Thread
{
 A()
 {
    start();  //After start automatically called run method and execute thread
 }
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
       System.out.println("Value="+i);
    }
  }
  }
  class ThDemo
  {
  public static void main(String arg[])
  {
    A ob=new A();
}
}
