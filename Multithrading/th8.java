//Synchronized Method.....
class A implements Runnable
{
synchronized public void run()
 {
     for(int i=1;i<=5;i++)
     {
         System.out.println("Value of A="+i);
     }
 }
}
class B implements Runnable
{
 synchronized public void run()
 {
     for(int i=1;i<=5;i++)
     {
         System.out.println("Value of B="+i);
     }
 }
 }
class C implements Runnable
{
 synchronized public void run()
 {
     for(int i=1;i<=5;i++)
     {
         System.out.println("Value of C="+i);
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
       Thread th1=new Thread(ob1);
       Thread th2=new Thread(ob2);
       Thread th3=new Thread(ob3);
       th1.start();
       th2.start();
       th3.start();     
   }
}



