package threadsAndSync;
class Table1  
{     
 synchronized  static void printTable1(int n){    
   for(int i=1;i<=10;i++){    
     System.out.println(n*i);    
     try{    
       Thread.sleep(400);    
     }catch(Exception e){}    
   }    
 }    
}    
class MyThreadOne extends Thread{    
public void run(){    
Table1.printTable1(1);    
}    
}    
class MyThreadTwo extends Thread{    
public void run(){    
Table1.printTable1(10);    
}    
}    
class MyThread3 extends Thread{    
public void run(){    
Table1.printTable1(100);    
}    
}    
class MyThread4 extends Thread{    
public void run(){    
Table1.printTable1(1000);    
}    
}    
public class staticSync{    
public static void main(String t[]){    
MyThreadOne t1=new MyThreadOne();    
MyThreadTwo t2=new MyThreadTwo();    
MyThread3 t3=new MyThread3();    
MyThread4 t4=new MyThread4();    
t1.start();    
t2.start();    
t3.start();    
t4.start();    
}    
}    

