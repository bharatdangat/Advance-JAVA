//create 3 thread and set priority to thread........
class A implements Runnable
{
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
 public void run()
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
       
       System.out.println("Th1 prority="+th1.getPriority());
       System.out.println("Th2 prority="+th2.getPriority());
       System.out.println("Th3 prority="+th3.getPriority());
      th1.setPriority(7);
       th2.setPriority(Thread.NORM_PRIORITY);
       th3.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Th1 prority="+th1.getPriority());
       System.out.println("Th2 prority="+th2.getPriority());
       System.out.println("Th3 prority="+th3.getPriority());
      
       th1.start();
       th2.start();
       th3.start();     
   }
}



