
class Mymsg
{
  boolean flag=true;
  public synchronized void sender() throws InterruptedException
  {	
	 if(flag==false)
	 {
	  wait();
	 }
	 System.out.println("Message Sent...");
	 flag=false;
	 notify();
	 }
  public synchronized void reciver() throws InterruptedException
  {
	  if(flag==true)
	  {
		  wait();
	  }
	   System.out.println("Message Recive...");
	   flag=true;
	   notify();
	 
	}
}
class Thread1 extends Thread
{
	Mymsg m;
	Thread1(Mymsg m)
	{
	this.m=m;
	}
	public void run()
	{
	try
	{
	for(int i=0;i<5;i++)
	{
	 m.sender();
	 }
	
	}catch(Exception e){}
}
}
class Thread2 extends Thread
{
	Mymsg m;
	Thread2(Mymsg m)
	{
		this.m=m;
	}
	public void run() 
	{
		try
		{
		for(int i=0;i<5;i++)
	   {
	   m.reciver();
	   }
		}catch(Exception e){}
		}
	}


public class Msg 
{
	public static void main(String[] args) 
	{
	 Mymsg m=new Mymsg();
	 Thread1 t1=new Thread1(m);
	 Thread2 t2=new Thread2(m);
	 t1.start();
	 t2.start();
	 
	}


}

