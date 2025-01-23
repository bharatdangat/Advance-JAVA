class thread extends Thread
{
 String name;
 int n;  //Declare global variable... 
	thread(String name,int n)
	{
     this.name=name;  //Assign local variable values to global variable values used for run method 
	 this.n=n;
	}
  @Override
	public void run() 
  {
	for(int i=1;i<=n;i++)
	{
		System.out.println(name);
	}
  }
}

public class Virus 
{
	public static void main(String[] args) 
	{
	 thread t1=new thread("COVID19",10);
	 thread t2=new thread("LOCKDOWN2020",20);
	 thread t3=new thread("VACCINATED2021",30);
	 t1.start();
	 t2.start();
	 t3.start();
	}
}
