package com.nt.mcq;

public class Test20
{
     public static void main(String[] args) 
      {
        new Test20().go();
      }
     public void go() 
     {
       Runnable r = new Runnable()
        {
          public void run() 
           {
            System.out.println("foo");
           }
        };
               Thread t = new Thread(r);
               t.start();
               t.run();
       }
 }