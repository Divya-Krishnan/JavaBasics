package org.arpit.java2blog;

class Parent
{
	//To avoid overriding method use final keyword
	void meth1()
	{
		System.out.println("I am from Parent Class");
	}
}
class Child extends Parent
{
	void meth1()
	{
		//To call parent method use super keyword even it is overridden
		//super.meth1();
		System.out.println("i am from child meth1");
	}
	void meth2()
	{
		System.out.println("i am from child meth2");
	}
}
public class TestInheritance {
public static void main(String[] args) {
	Child child=new Child();
	child.meth1();
	child.meth2();
	
	//Calls child method because parent is overridden by child class method 
	Parent parent=new Child();
	parent.meth1();
	
	//eventhough we assingn child object to parents reference , we can able to call only methods present in Parent, not child.
	//So below line causes Error
	
	//parent.meth2();
}
}
