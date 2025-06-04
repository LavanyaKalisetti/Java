package com.nt.mcq;

public class Test12 extends Thread 
{
  
static String name="Sreyan";
public static void main(String args[]) 
{
    Test t = new Test();
    t.nameTest(name);
    System.out.print(" " + name);
}

public void Test(String name) 
{
    start();
    System.out.print(" method");
}

public void run() 
{
     System.out.print(" run");
}
}
