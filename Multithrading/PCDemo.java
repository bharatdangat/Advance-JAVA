 class MyDemo
{
  boolean flag=true;
  public synchronized void producer()throws InterruptedException
  {
	 if(flag==false)
	 {
		 wait();
	 }
	  System.out.println("Producer :-"+Thread.currentThread().getName()+"::");
      flag=false;
	  notify();
  }
  public synchronized void consumer()throws InterruptedException
  {
	  if(flag==true)
	  {
		  wait();
	  }
	  System.out.println("Consumer :-"+Thread.currentThread().getName()+"::");
      flag=true;
	  notify();
  }
}
class Threadp extends Thread
{
	MyDemo t;
	Threadp(MyDemo t)
	{
		this.t=t;
	}
	public void run() 
	{
	 for(int i=0;i<5;i++)
	 {
		try
		{
			t.producer();
		} catch (InterruptedException e) {
		} 
	 }
	}
}
class Threadq extends Thread
{
	MyDemo t;
	Threadq(MyDemo t)
	{
		this.t=t;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				t.consumer();
			} catch (InterruptedException e) {
			}
		}
	}
}
public class PCDemo 
{
	public static void main(String[] args)
	{
	 MyDemo t=new MyDemo();
	 Threadp t1=new Threadp(t);
	 Threadq t2=new Threadq(t);
	 t1.start();
	 t2.start();
	 }
}

