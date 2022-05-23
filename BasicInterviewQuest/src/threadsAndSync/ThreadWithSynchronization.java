package threadsAndSync;

class Math{  
synchronized void printTable(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class Thread1 extends Thread{  
Math t;  
Thread1(Math t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class Thread2 extends Thread{  
Math t;  
Thread2(Math t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class ThreadWithSynchronization{  
public static void main(String args[]){  
Math obj = new Math();//only one object  
Thread1 t1=new Thread1(obj);  
Thread2 t2=new Thread2(obj);  
t1.start();  
t2.start();  
}  
}  
 