	package org.arpit.java2blog;
 class A {
	
	
	    void m1()
	    {
	        System.out.println("In m1 Inheritance1");
	    }
	}
	class B extends A
	{
	    void m1()
	    {
	        System.out.println("In m1 B");
	    }
	    void m2()
	    {
	        System.out.println("In m2 B");
	    }
	}
	 public class Inheritance1 { 
	 
	    public static void main(String[] args) {
	        A a=new B();
	       // a.m2();
	    }
	}

