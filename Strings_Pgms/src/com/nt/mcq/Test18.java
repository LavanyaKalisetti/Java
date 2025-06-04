package com.nt.mcq;

class MyThread extends Thread
{
	String myName;

	MyThread(String name)
	{
		myName = name;
	}

	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println(myName);
		}
	}
}
public class Test18{
	public static void main(String args[])
	{
		try
		{
			MyThread mt1 = new MyThread("mt1");
			MyThread mt2 = new MyThread("mt2");
			mt1.start();
			mt1.join();
			mt2.start();
		}
		catch(InterruptedException ex)
		{
		}
	}
}
