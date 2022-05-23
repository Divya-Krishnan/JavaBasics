class test
{
	test()
	{
		System.out.println("this is test const");
	}
	void addition()
	{
		System.out.println("methos");
	}
}
public class Addition {
public static void main(String[] args) {
	test objTest = new test();
	int a=20, b=30;
	System.out.println("Sum of 2 Nos : "+(a+b));
	objTest.addition();
	
}
}