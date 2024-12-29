import java.util.*;
class PrintingText extends Thread
{
  String msg;
  int n;
  PrintingText(String msg,int n)
  {
      this.msg=msg;
      this.n=n;
      start();
  }
  public void run()
  {
    try
    {
     for(int i=1;i<=n;i++)
     {
           sleep(1000);
          System.out.println(msg);
     }
     }catch(Exception e){}
  }
}
class MDemo
{
  public static void main(String arg[])
  {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter Message-");
      String msg=sc.nextLine();
      System.out.println("Enter Limit");
      int n=sc.nextInt();
      PrintingText ob=new PrintingText(msg,n);
  }
}
