class A
{
	public int method1()
	{
		System.out.println("Public meth");
		return this.m2();
		
	}
	private int m2()
	{
		System.out.println("m2");
		return 0;
		
	}
}
public class returnThis {
public static void main(String[] args) {
	A a=new A();
	a.method1();
	
}
}
