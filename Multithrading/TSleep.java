public class TSleep extends Thread 
{
	 @Override
	public void run() 
	 {
		try
		{
	   for(int i=100;i>=1;i--)
	   {
		  System.out.println(i);
		 TSleep.sleep(2000);
	   }
		}catch(InterruptedException e){}
	 }
	public static void main(String[] args)  
	{
	 TSleep t1=new TSleep();
	 t1.start();
	}

}
