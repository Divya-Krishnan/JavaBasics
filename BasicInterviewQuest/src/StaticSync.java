class Top
{
	static int count=0;
	static synchronized void method() throws InterruptedException
	{
		count++;
		System.out.println(count);
		Thread.sleep(4000);
		
	}
}
class ThreadClass extends Thread
{
	Top top;
	ThreadClass(Top top)
	{
		this.top=top;
	}
	public void run()
	{
		try {
			top.method();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class ThreadClass2 extends Thread
{
	Top top;
	ThreadClass2(Top top)
	{
		this.top=top;
	}
	public void run()
	{
		try {
			top.method();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class StaticSync {

	public static void main(String[] args) {
		Top obj=new Top();
		ThreadClass tc1=new ThreadClass(obj);
		ThreadClass2 tc2=new ThreadClass2(obj);
		tc1.start();
		tc2.start();
	}
}
