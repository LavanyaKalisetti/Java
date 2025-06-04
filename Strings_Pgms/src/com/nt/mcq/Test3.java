package com.nt.mcq;

public class Test3 implements Runnable
{
  public void run() 
  {
	 try
	 {
           System.out.println("run.");
           throw new RuntimeException("Problem");
		
	 }
	 catch (Exception e)
	 {
		 System.out.println("Handled");
	 }
 
  }
 public static void main(String[] args) 
 {
      Thread t = new Thread(new Test3());
      t.start();
      System.out.println("End of method.");
 }
}