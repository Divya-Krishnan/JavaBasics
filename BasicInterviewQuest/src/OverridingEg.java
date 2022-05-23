class Base
{
	public void disp()
	{
		System.out.println("Base");
	}
}
class sub1 extends Base
{
	public void disp()
	{
		System.out.println("sub1");
	}
}
public class OverridingEg {
public static void main(String[] args) {
	sub1 o1=new sub1();
	
	o1.disp();
	Base b=new sub1();
	b.disp();
	
	Base b2=new Base();
	b2.disp();
}
}
