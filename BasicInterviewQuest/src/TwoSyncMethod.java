
class function
{
	synchronized void printOne() throws InterruptedException
	{
		System.out.println("This is One");
		//Thread.sleep(5000);
	}
	synchronized void printTwo()
	{
		System.out.println("This is Two");
	}
}
class Thread1 extends Thread
{
	
		function f1;
		Thread1(function f1)
		{
			this.f1=f1;
		}
		public void run()
		{	
		try {
			f1.printOne();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
class Thread2 extends Thread
{
	function f2;
	Thread2(function f2)
	{
		this.f2=f2;
	}
	public void run()
	{
		f2.printTwo();
	}
}
public class TwoSyncMethod {
public static void main(String[] args) {
	
	function obj=new function();

	Thread1 t1=new Thread1(obj);
	Thread2 t2=new Thread2(obj);
	
	t1.start();
	t2.start();
}
}
