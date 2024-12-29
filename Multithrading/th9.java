//Synchronized block.....
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
         System.out.println("Value of A="+i);
     }
 }
}
class B implements Runnable
{
B()
{
 Thread th=new Thread(this);
 th.start();
}
  public void run()
 {
     for(int i=1;i<=5;i++)
     {
         System.out.println("Value of B="+i);
     }
 }
 }
class C implements Runnable
{
C()
{
  Thread th=new Thread(this);
  th.start();
}
  public void run()
 {
     for(int i=1;i<=5;i++)
     {
         System.out.println("Value of C="+i);
     }
 
 synchronized(this)
 {
   for(int i=1;i<=5;i++)
   {
      System.out.println("Value of CC="+i);
   }
 }
}
}
class MDemo
{
   public static void main(String arg[])
   {
       A ob1=new A();
       B ob2=new B();
       C ob3=new C();
     }
}



