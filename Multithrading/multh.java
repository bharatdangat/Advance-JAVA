//MultiThreading
class A extends Thread
{
  public void run()
  {
      for(int i=1;i<=5;i++)
      {
        System.out.println("Value of A="+i);
      }
  }
}
class B extends Thread
{
  public void run()
  {
      for(int i=1;i<=5;i++)
      {
        System.out.println("Value of B="+i);
      }
  }
}
class C extends Thread
{
  public void run()
  {
      for(int i=1;i<=5;i++)
      {
        System.out.println("Value of C="+i);
      }
  }
}
class D extends Thread
{
  public void run()
  {
      for(int i=1;i<=5;i++)
      {
        System.out.println("Value of D="+i);
      }
  }
}
class ThDemo
{
 public static void main(String arg[])
 {
  A ob1=new A();
  B ob2=new B();
   C ob3=new C();
   D ob4=new D();
  ob1.start();
  ob2.start();
  ob3.start();
  ob4.start();
}
}
