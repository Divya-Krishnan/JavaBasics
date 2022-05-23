package threadsAndSync;

class Calculation
{
	 synchronized public void prod(int num) 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*num);
			try {
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
	}
}
}
public  class SyncWithAnonymousClass {
public static void main(String[] args) {
	Calculation calc=new Calculation();
	Thread t1=new Thread()
	{
		public void run()
		{
			calc.prod(5);
		}
	};
	Thread t2=new Thread()
	{
		public void run()
		{
			calc.prod(100);
		}
	};
	t1.start();
	t2.start();
	
}
}
