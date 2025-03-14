import java.util.Random;

class Threada extends Thread
{
	Threada()
	{
	 start();
	}
	@Override
	public void run() 
	{
		int a[]=new int[100];
		Random r1=new Random();
		for(int i=0;i<10;i++)
		{
			a[i]=r1.nextInt(25);
			System.out.println(a[i]);
			if(a[i]%2==0)
			{
				t2.start();
			}
		}
			
	}
}

public class Operation 
{
 public static void main(String[] args) 
 {
  Threada t1=new Threada();
  Threada t2=new Threada();
  Threada t3=new Threada();
  }

}
