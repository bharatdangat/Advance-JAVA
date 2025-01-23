 class Demo extends Thread
{
	 @Override
	public void run() 
	 {
		try
		{
	   for(int i=100;i>=1;i--)
	   {
		  System.out.println(i);
		  Demo.sleep(1000);
	   }
		}catch(InterruptedException e){}
	 }
}
public class TSleep2 
{
	public static void main(String[] args)  
	{
	 Demo t1=new Demo();
	 t1.start();
	}

}
