class A extends Thread
{
  public void run()
  {
  try
  {
     for(int i=1;i<=5;i++)
     {
          sleep(1000);
         System.out.println("Value="+i);
     }
  }catch(Exception e){}
  }
  }
  class ThDemo
  {
  public static void main(String arg[])
  {
    A ob =new A();
    ob.start();
  }
}
