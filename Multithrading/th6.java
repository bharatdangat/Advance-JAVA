//2]using Runnable Interface....
//2)using object of thread class using refferwnce..... 
class A implements Runnable
{
  public void run()
  {
      for(int i=1;i<=5;i++)
      {
           System.out.println("Value1="+i);
      }
  }
}
class MDemo
{
 public static void main(String arg[])
 {
 A ob=new A();
 Thread th=new Thread(ob);
 th.start();
}
}
