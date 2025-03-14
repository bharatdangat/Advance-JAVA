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
class Threada extends Thread
{
	MyDemo t;
	Threada(MyDemo t)
	{
		this.t=t;
	}
	public void run() 
	{
		try
		{
			int i=0;
			while(i>0)
			{
			t.producer();
			i++;
			}
		} catch (InterruptedException e) {
	 }
	}
}
class Threadb extends Thread
{
	MyDemo t;
	Threadb(MyDemo t)
	{
		this.t=t;
	}
	public void run()
	{
			try {
				int i=0;
				while(i>0)
				{
				t.consumer();
				i++;
				}
			} catch (InterruptedException e) {
			
		}
	}
}
public class PCDemo2
{
	public static void main(String[] args)
	{
	 MyDemo t=new MyDemo();
	 Threada t1=new Threada(t);
	 Threadb t2=new Threadb(t);
	 t1.start();
	 t2.start();
	 }
}

