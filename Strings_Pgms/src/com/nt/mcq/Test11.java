package com.nt.mcq;

class A implements Runnable 
{
  @Override  
  public void run() 
  {
     System.out.print(Thread.currentThread().getName());
  }  
}  
class B implements Runnable
{
   @Override 
  public void run() 
  {  
    new A().run();  
    new Thread(new A(),"T2").run();  
    new Thread(new A(),"T3").start();  
   }
}  
public class Test11{  
  public static void main (String[] args) 
  {  
    new Thread(new B(),"T1").start();  
  }
}
