//2]using Runnable Interface....
//1)using object of thread class 
class A implements Runnable
{
  A()
  {
     Thread th=new Thread(this);
     th.start();
  }
  public void run()
  {
      for(int i=1;i<=5;i++)
      {
           System.out.println("Value="+i);
      }
  }
}
class MDemo
{
 public static void main(String arg[])
 {
 A ob=new A();
}
}
