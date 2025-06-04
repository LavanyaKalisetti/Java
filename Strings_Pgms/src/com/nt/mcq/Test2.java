package com.nt.mcq;

class Test2 extends Thread 
{
	static Thread tf, ts;

	public synchronized void run()
	{
		System.out.println(Thread.currentThread().getName()+"");
		ts.start();
	}

	public static void main(String[] args) 
	{
		tf = new Thread(new Test2(),"SCJP");
		ts = new Thread(new Test2(),"SCJWD");
		tf.start();
		
	}

}