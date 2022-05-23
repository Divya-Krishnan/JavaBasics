package org.arpit.java2blog;

class Top
{
	static void display()
	{
		System.out.println("Top static");
	}
	@SuppressWarnings("unused") void privateMeth()
	{
		System.out.println("top private Meth");
	}
}
class Bottom extends Top
{
	static void display()
	{
		System.out.println("Bottom static");
	}
	@SuppressWarnings("unused") void privateMeth()
	{
		System.out.println("Bottom private Meth");
	}
}
public class StatcMethOverriding {
public static void main(String[] args) {
	Top.display();
	Bottom.display();
	Top t=new Bottom();
	t.privateMeth();
			
}
}
