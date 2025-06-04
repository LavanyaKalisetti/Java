package com.nt.mcq;

class Job extends Thread 
{
    private Integer number = 0;
    public void run() 
    {
       System.out.println(Thread.currentThread().getName());

        for (int i = 1; i < 1000000; i++) 
	{
            number++;
        }
    }
    public Integer getNumber() 
    {
        return number;
    }
}
public class Test13{
    public static void main(String[] args) 
     {
        Job thread = new Job();
        thread.start();
		try
		{
			thread.join();
		}
		catch (Exception e)
		{
		}
        System.out.println(thread.getNumber());
    }
}

