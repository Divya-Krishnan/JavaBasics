package threadsAndSync;
class CalculationBlock
{
	  public void prod(int num) 
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
		
			public void prodBlock(int num) 
			{
				synchronized(this) {
				System.out.println("I am from Sync Block");
			
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

}

public  class SyncBlock {
public static void main(String[] args) {
	CalculationBlock calc=new CalculationBlock();
	Thread t1=new Thread()
	{
		public void run()
		{
			calc.prod(5);
			calc.prodBlock(10);
		}
	};
	Thread t2=new Thread()
	{
		public void run()
		{
			calc.prod(100);
			calc.prodBlock(1);
		}
	};
	t1.start();
	t2.start();
	
}
}
