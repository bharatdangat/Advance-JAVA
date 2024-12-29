//3)using object of Thread class.....
class A extends Thread
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
 class ThDemo
 {
   public static void main(String arg[])
   {
      A ob=new A();
   }
 }

