class Model
{
	void disp1()
	{
		System.out.println("This is display1");
	}
	void disp2()
	{
		System.out.println("This is Disp2");
	}
}
class Access1
{
	Model m1;
	Access1(Model m1)
	{
		this.m1=m1;
	}
	void call1()
	{
		m1.disp1();
	}
}
class Access2
{
	Model m2;
	Access2(Model m2)
	{
		this.m2=m2;
	}
	void call2()
	{
		m2.disp1();
	}
	
}
public class WithoutSync {
public static void main(String[] args) {
	Model obj=new Model();
	Access1 a1=new Access1(obj);
	Access2 a2=new Access2(obj);
	a1.call1();
	a2.call2();
}
}
