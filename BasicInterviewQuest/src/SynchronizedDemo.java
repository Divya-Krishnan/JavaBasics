class Table{  
  
 /*void printTable(int n){  
   synchronized(this){//synchronized block  
     for(int i=1;i<=5;i++){  
      System.out.println(n*i);  
      try{  
       Thread.sleep(400);  
      }catch(Exception e){System.out.println(e);}  
     } 
   } 
 }//end of the method  */
	synchronized void meth1() throws InterruptedException
	{
		System.out.println("I am from meth1");
		Thread.sleep(1000);
	}
	void meth2()
	{
		System.out.println("i am from Meth 2");
	}
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
//t.printTable(5); 
	try {
		t.meth1();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
//t.printTable(100); 
	//t.meth2();  This will work because synchronized method is meth1 and here we try to access method2
	
	try {
		t.meth2();
		t.meth1();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}  
}  
  
public class SynchronizedDemo{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
}  
