//4)using object of Thread class using refference.....
class A extends Thread
{
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
      Thread th=new Thread(ob);
      th.start();
   }
 }

